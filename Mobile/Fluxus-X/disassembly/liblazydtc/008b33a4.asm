; FUN_008b33a4 @ 008b33a4
008b33a4	cmp x0,#0x0
008b33a8	cset w8,ne
008b33ac	cmp x0,x1
008b33b0	b.eq 0x008b33d0
008b33b4	cbz x0,0x008b33d0
008b33b8	ldr x0,[x0, #0x20]
008b33bc	cmp x0,#0x0
008b33c0	cset w8,ne
008b33c4	cmp x0,x1
008b33c8	b.eq 0x008b33d0
008b33cc	cbnz x0,0x008b33b8
008b33d0	mov w0,w8
008b33d4	ret
