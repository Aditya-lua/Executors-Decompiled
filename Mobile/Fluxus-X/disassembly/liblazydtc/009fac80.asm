; BIO_ADDR_rawmake @ 009fac80
009fac80	str x21,[sp, #-0x30]!
009fac84	stp x20,x19,[sp, #0x10]
009fac88	mov x19,x2
009fac8c	cmp w1,#0xa
009fac90	mov x20,x0
009fac94	stp x29,x30,[sp, #0x20]
009fac98	add x29,sp,#0x20
009fac9c	b.eq 0x009facf0
009faca0	cmp w1,#0x2
009faca4	b.eq 0x009fad20
009faca8	cmp w1,#0x1
009facac	mov w21,wzr
009facb0	b.ne 0x009fad4c
009facb4	add x8,x3,#0x1
009facb8	cmp x8,#0x6c
009facbc	mov w21,wzr
009facc0	b.hi 0x009fad4c
009facc4	mov w2,#0x6e
009facc8	mov x0,x20
009faccc	mov w1,wzr
009facd0	bl 0x00c301c0
009facd4	mov w21,#0x1
009facd8	strh w21,[x20], #0x2
009facdc	mov w2,#0x6b
009face0	mov x0,x20
009face4	mov x1,x19
009face8	bl 0x00c30ba0
009facec	b 0x009fad4c
009facf0	cmp x3,#0x10
009facf4	mov w21,wzr
009facf8	b.ne 0x009fad4c
009facfc	mov w8,#0xa
009fad00	stur xzr,[x20, #0xc]
009fad04	stur xzr,[x20, #0x4]
009fad08	stur xzr,[x20, #0x14]
009fad0c	strh w4,[x20, #0x2]
009fad10	strh w8,[x20]
009fad14	ldr q0,[x19]
009fad18	stur q0,[x20, #0x8]
009fad1c	b 0x009fad48
009fad20	cmp x3,#0x4
009fad24	mov w21,wzr
009fad28	b.ne 0x009fad4c
009fad2c	mov w8,#0x2
009fad30	str wzr,[x20, #0xc]
009fad34	stur xzr,[x20, #0x4]
009fad38	strh w4,[x20, #0x2]
009fad3c	strh w8,[x20]
009fad40	ldr w8,[x19]
009fad44	str w8,[x20, #0x4]
009fad48	mov w21,#0x1
009fad4c	ldp x29,x30,[sp, #0x20]
009fad50	ldp x20,x19,[sp, #0x10]
009fad54	mov w0,w21
009fad58	ldr x21,[sp], #0x30
009fad5c	ret
