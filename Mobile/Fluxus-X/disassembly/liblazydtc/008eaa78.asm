; cpr::CurlHolder::CurlHolder @ 008eaa78
008eaa78	stp x20,x19,[sp, #-0x20]!
008eaa7c	stp x29,x30,[sp, #0x10]
008eaa80	add x29,sp,#0x10
008eaa84	mov w2,#0x120
008eaa88	mov w1,wzr
008eaa8c	mov x19,x0
008eaa90	bl 0x00c301c0
008eaa94	adrp x20,0xcb4000
008eaa98	ldr x20,[x20, #0xc98]
008eaa9c	ldarb w8,[x20]
008eaaa0	tbz w8,#0x0,0x008eaad4
008eaaa4	adrp x0,0xcb4000
008eaaa8	ldr x0,[x0, #0xca0]
008eaaac	bl 0x00c2ff10
008eaab0	bl 0x00c31000
008eaab4	str x0,[x19]
008eaab8	ldarb w8,[x20]
008eaabc	tbz w8,#0x0,0x008eab10
008eaac0	adrp x0,0xcb4000
008eaac4	ldr x0,[x0, #0xca0]
008eaac8	ldp x29,x30,[sp, #0x10]
008eaacc	ldp x20,x19,[sp], #0x20
008eaad0	b 0x00c2ff20
008eaad4	adrp x0,0xcb4000
008eaad8	ldr x0,[x0, #0xc98]
008eaadc	bl 0x00c2fe90
008eaae0	cbz w0,0x008eaaa4
008eaae4	adrp x0,0xcb4000
008eaae8	adrp x1,0xcb4000
008eaaec	ldr x0,[x0, #0x958]
008eaaf0	ldr x1,[x1, #0xca0]
008eaaf4	adrp x2,0xc48000
008eaaf8	add x2,x2,#0x880
008eaafc	bl 0x00c2fe70
008eab00	adrp x0,0xcb4000
008eab04	ldr x0,[x0, #0xc98]
008eab08	bl 0x00c2fea0
008eab0c	b 0x008eaaa4
008eab10	adrp x0,0xcb4000
008eab14	ldr x0,[x0, #0xc98]
008eab18	bl 0x00c2fe90
008eab1c	cbz w0,0x008eaac0
008eab20	adrp x0,0xcb4000
008eab24	adrp x1,0xcb4000
008eab28	ldr x0,[x0, #0x958]
008eab2c	ldr x1,[x1, #0xca0]
008eab30	adrp x2,0xc48000
008eab34	add x2,x2,#0x880
008eab38	bl 0x00c2fe70
008eab3c	adrp x0,0xcb4000
008eab40	ldr x0,[x0, #0xc98]
008eab44	bl 0x00c2fea0
008eab48	b 0x008eaac0
