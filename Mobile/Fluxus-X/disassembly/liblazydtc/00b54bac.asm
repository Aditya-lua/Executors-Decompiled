; FUN_00b54bac @ 00b54bac
00b54bac	str x23,[sp, #-0x40]!
00b54bb0	stp x22,x21,[sp, #0x10]
00b54bb4	stp x20,x19,[sp, #0x20]
00b54bb8	stp x29,x30,[sp, #0x30]
00b54bbc	mov x21,x0
00b54bc0	ldr x0,[x0, #0x28]
00b54bc4	mov x19,x2
00b54bc8	mov x20,x1
00b54bcc	add x29,sp,#0x30
00b54bd0	cbz x0,0x00b54be8
00b54bd4	ldr x1,[x21, #0x30]
00b54bd8	adrp x2,0x2bc000
00b54bdc	add x2,x2,#0x9e7
00b54be0	mov w3,#0x9d
00b54be4	bl 0x00c38e10
00b54be8	cmp x19,#0x0
00b54bec	adrp x1,0x2bc000
00b54bf0	csinc x0,x19,xzr,ne
00b54bf4	add x1,x1,#0x9e7
00b54bf8	mov w2,#0x9f
00b54bfc	bl 0x00c39220
00b54c00	str x0,[x21, #0x28]
00b54c04	cbz x0,0x00b54c70
00b54c08	mov x1,x20
00b54c0c	mov x2,x19
00b54c10	bl 0x00c2ffd0
00b54c14	add x23,x21,#0x10
00b54c18	mov x0,x23
00b54c1c	str x19,[x21, #0x30]
00b54c20	bl 0x00c41160
00b54c24	mov x22,x0
00b54c28	cbnz x20,0x00b54c3c
00b54c2c	mov w0,#0x1
00b54c30	cbz x22,0x00b54c70
00b54c34	ldr x8,[x21, #0x38]
00b54c38	cbnz x8,0x00b54c70
00b54c3c	ldr x21,[x21, #0x8]
00b54c40	mov x0,x23
00b54c44	bl 0x00c41130
00b54c48	mov x4,x0
00b54c4c	mov x0,x21
00b54c50	mov x1,x20
00b54c54	mov w2,w19
00b54c58	mov x3,x22
00b54c5c	ldp x29,x30,[sp, #0x30]
00b54c60	ldp x20,x19,[sp, #0x20]
00b54c64	ldp x22,x21,[sp, #0x10]
00b54c68	ldr x23,[sp], #0x40
00b54c6c	b 0x00c36930
00b54c70	ldp x29,x30,[sp, #0x30]
00b54c74	ldp x20,x19,[sp, #0x20]
00b54c78	ldp x22,x21,[sp, #0x10]
00b54c7c	ldr x23,[sp], #0x40
00b54c80	ret
