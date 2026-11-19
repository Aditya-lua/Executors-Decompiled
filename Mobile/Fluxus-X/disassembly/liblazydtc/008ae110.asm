; FUN_008ae110 @ 008ae110
008ae110	cmp x1,x0
008ae114	b.eq 0x008ae138
008ae118	ldrb w0,[x1, #0x3]
008ae11c	cbz w0,0x008ae140
008ae120	cmp w0,#0x1
008ae124	b.eq 0x008ae170
008ae128	cmp w0,#0x6
008ae12c	b.ne 0x008ae158
008ae130	mov w0,#0x2
008ae134	ret
008ae138	mov w0,wzr
008ae13c	ret
008ae140	ldr x8,[x1, #0x50]
008ae144	ldr x9,[x1, #0x20]
008ae148	cmp x8,x9
008ae14c	b.eq 0x008ae160
008ae150	mov w0,#0x2
008ae154	ret
008ae158	mov w0,#0x4
008ae15c	ret
008ae160	ldp x8,x9,[x1, #0x68]
008ae164	cmp x8,x9
008ae168	mov w8,#0x3
008ae16c	csinc w0,w8,wzr,eq
008ae170	ret
