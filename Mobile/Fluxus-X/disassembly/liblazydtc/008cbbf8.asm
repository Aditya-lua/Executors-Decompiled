; FUN_008cbbf8 @ 008cbbf8
008cbbf8	stp x29,x30,[sp, #-0x30]!
008cbbfc	stp x22,x21,[sp, #0x10]
008cbc00	stp x20,x19,[sp, #0x20]
008cbc04	mov x29,sp
008cbc08	ldr w8,[x1, #0xc]
008cbc0c	ldr w9,[x2, #0xc]
008cbc10	mov x19,x2
008cbc14	mov x20,x1
008cbc18	mov x21,x0
008cbc1c	cmp w8,w9
008cbc20	b.ne 0x008cbdb4
008cbc24	cmp w8,#0x5
008cbc28	b.eq 0x008cbc48
008cbc2c	cmp w8,#0x3
008cbc30	b.ne 0x008cbc98
008cbc34	ldr d0,[x20]
008cbc38	ldr d1,[x19]
008cbc3c	fcmp d0,d1
008cbc40	cset w0,ls
008cbc44	b 0x008cbda4
008cbc48	ldr x8,[x20]
008cbc4c	ldr x9,[x19]
008cbc50	cmp x8,x9
008cbc54	b.eq 0x008cbd88
008cbc58	mov x0,x8
008cbc5c	mov x1,x9
008cbc60	ldrb w10,[x0, #0x18]!
008cbc64	ldrb w11,[x1, #0x18]!
008cbc68	subs w10,w10,w11
008cbc6c	b.ne 0x008cbd8c
008cbc70	ldr w8,[x8, #0x14]
008cbc74	ldr w9,[x9, #0x14]
008cbc78	cmp w8,w9
008cbc7c	csel w2,w8,w9,cc
008cbc80	cset w8,hi
008cbc84	csinv w19,w8,wzr,cs
008cbc88	bl 0x00c300b0
008cbc8c	cmp w0,#0x0
008cbc90	csel w10,w19,w0,eq
008cbc94	b 0x008cbd8c
008cbc98	mov x0,x21
008cbc9c	mov x1,x20
008cbca0	mov w2,#0x11
008cbca4	bl 0x008be028
008cbca8	ldr w8,[x0, #0xc]
008cbcac	cbz w8,0x008cbd10
008cbcb0	mov x22,x0
008cbcb4	mov x0,x21
008cbcb8	mov x1,x19
008cbcbc	mov w2,#0x11
008cbcc0	bl 0x008be028
008cbcc4	mov x1,x0
008cbcc8	mov x0,x22
008cbccc	bl 0x008b9214
008cbcd0	cbz w0,0x008cbd10
008cbcd4	ldr x1,[x21, #0x68]
008cbcd8	mov x0,x21
008cbcdc	mov x2,x22
008cbce0	mov x3,x20
008cbce4	mov x4,x19
008cbce8	bl 0x008cb070
008cbcec	ldr x8,[x21, #0x68]
008cbcf0	ldr w9,[x8, #0xc]
008cbcf4	cbz w9,0x008cbda0
008cbcf8	cmp w9,#0x1
008cbcfc	b.ne 0x008cbd98
008cbd00	ldr w8,[x8]
008cbd04	cmp w8,#0x0
008cbd08	cset w0,ne
008cbd0c	b 0x008cbda4
008cbd10	mov x0,x21
008cbd14	mov x1,x19
008cbd18	mov w2,#0x10
008cbd1c	bl 0x008be028
008cbd20	ldr w8,[x0, #0xc]
008cbd24	cbz w8,0x008cbdb4
008cbd28	mov x22,x0
008cbd2c	mov x0,x21
008cbd30	mov x1,x20
008cbd34	mov w2,#0x10
008cbd38	bl 0x008be028
008cbd3c	mov x1,x0
008cbd40	mov x0,x22
008cbd44	bl 0x008b9214
008cbd48	cbz w0,0x008cbdb4
008cbd4c	ldr x1,[x21, #0x68]
008cbd50	mov x0,x21
008cbd54	mov x2,x22
008cbd58	mov x3,x19
008cbd5c	mov x4,x20
008cbd60	bl 0x008cb070
008cbd64	ldr x8,[x21, #0x68]
008cbd68	ldr w9,[x8, #0xc]
008cbd6c	cbz w9,0x008cbd98
008cbd70	cmp w9,#0x1
008cbd74	b.ne 0x008cbda0
008cbd78	ldr w8,[x8]
008cbd7c	cmp w8,#0x0
008cbd80	cset w0,eq
008cbd84	b 0x008cbda4
008cbd88	mov w10,wzr
008cbd8c	cmp w10,#0x1
008cbd90	cset w0,lt
008cbd94	b 0x008cbda4
008cbd98	mov w0,#0x1
008cbd9c	b 0x008cbda4
008cbda0	mov w0,wzr
008cbda4	ldp x20,x19,[sp, #0x20]
008cbda8	ldp x22,x21,[sp, #0x10]
008cbdac	ldp x29,x30,[sp], #0x30
008cbdb0	ret
008cbdb4	mov x0,x21
008cbdb8	mov x1,x20
008cbdbc	mov x2,x19
008cbdc0	mov w3,#0x11
008cbdc4	bl 0x008b3b74
