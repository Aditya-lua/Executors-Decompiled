; FUN_00b47bb4 @ 00b47bb4
00b47bb4	cbz x0,0x00b47c34
00b47bb8	stp x20,x19,[sp, #-0x20]!
00b47bbc	stp x29,x30,[sp, #0x10]
00b47bc0	mov x19,x0
00b47bc4	ldr x0,[x0, #0x8]
00b47bc8	adrp x20,0x2b6000
00b47bcc	add x20,x20,#0x95f
00b47bd0	mov w2,#0x4f
00b47bd4	mov x1,x20
00b47bd8	add x29,sp,#0x10
00b47bdc	bl 0x00c32310
00b47be0	ldr x0,[x19, #0x50]
00b47be4	bl 0x00c35800
00b47be8	ldr x0,[x19, #0x20]
00b47bec	mov w2,#0x5a
00b47bf0	mov x1,x20
00b47bf4	bl 0x00c32310
00b47bf8	ldp x0,x1,[x19, #0x10]
00b47bfc	mov w3,#0x5b
00b47c00	mov x2,x20
00b47c04	bl 0x00c345e0
00b47c08	adrp x8,0x29c000
00b47c0c	adrp x9,0x29c000
00b47c10	ldr q0,[x8, #0x3a0]
00b47c14	ldr q1,[x9, #0xfe0]
00b47c18	mov w2,#0x52
00b47c1c	mov x0,x19
00b47c20	mov x1,x20
00b47c24	stp q0,q1,[x19, #0x30]
00b47c28	ldp x29,x30,[sp, #0x10]
00b47c2c	ldp x20,x19,[sp], #0x20
00b47c30	b 0x00c32310
00b47c34	ret
