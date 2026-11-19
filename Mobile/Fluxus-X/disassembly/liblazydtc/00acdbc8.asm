; FUN_00acdbc8 @ 00acdbc8
00acdbc8	sub sp,sp,#0x40
00acdbcc	stp x22,x21,[sp, #0x10]
00acdbd0	stp x20,x19,[sp, #0x20]
00acdbd4	stp x29,x30,[sp, #0x30]
00acdbd8	stp xzr,xzr,[sp]
00acdbdc	ldr x21,[x1, #0x20]
00acdbe0	mov x20,x1
00acdbe4	mov x19,x0
00acdbe8	orr w1,wzr,#0xf000
00acdbec	mov x0,x21
00acdbf0	add x29,sp,#0x30
00acdbf4	bl 0x00c3fac0
00acdbf8	cmp w0,#0x1, LSL #12
00acdbfc	b.ne 0x00acdc28
00acdc00	ldr x21,[x21, #0x80]
00acdc04	cbz x21,0x00acdc30
00acdc08	bl 0x00c3fa50
00acdc0c	mov x1,x0
00acdc10	mov x2,sp
00acdc14	mov x0,x21
00acdc18	bl 0x00c37a90
00acdc1c	cbz x0,0x00acdc9c
00acdc20	mov w21,#0x10
00acdc24	b 0x00acdc34
00acdc28	mov w21,#0x5
00acdc2c	b 0x00acdc34
00acdc30	mov w21,#0xffffffff
00acdc34	ldr x0,[x20, #0x20]
00acdc38	add x1,sp,#0x8
00acdc3c	bl 0x00c3f240
00acdc40	cmp w0,#0x0
00acdc44	b.le 0x00acdc90
00acdc48	ldr x8,[x20, #0x8]
00acdc4c	mov w22,w0
00acdc50	ldr w0,[x8]
00acdc54	bl 0x00c37740
00acdc58	ldp x3,x4,[sp]
00acdc5c	mov x1,x0
00acdc60	mov x0,x19
00acdc64	mov w2,w21
00acdc68	mov w5,w22
00acdc6c	bl 0x00c39ba0
00acdc70	cbz w0,0x00acdc7c
00acdc74	mov w0,#0x1
00acdc78	b 0x00acdc9c
00acdc7c	ldr x0,[sp, #0x8]
00acdc80	adrp x1,0x2aa000
00acdc84	add x1,x1,#0x8f8
00acdc88	mov w2,#0x47
00acdc8c	bl 0x00c32310
00acdc90	ldr x0,[sp]
00acdc94	bl 0x00c37890
00acdc98	mov w0,wzr
00acdc9c	ldp x29,x30,[sp, #0x30]
00acdca0	ldp x20,x19,[sp, #0x20]
00acdca4	ldp x22,x21,[sp, #0x10]
00acdca8	add sp,sp,#0x40
00acdcac	ret
