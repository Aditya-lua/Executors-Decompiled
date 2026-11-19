; OCSP_request_sign @ 00aafb58
00aafb58	sub sp,sp,#0x60
00aafb5c	stp x20,x19,[sp, #0x40]
00aafb60	mov x19,x0
00aafb64	mov x0,x1
00aafb68	stp x26,x25,[sp, #0x10]
00aafb6c	stp x24,x23,[sp, #0x20]
00aafb70	stp x22,x21,[sp, #0x30]
00aafb74	stp x29,x30,[sp, #0x50]
00aafb78	add x29,sp,#0x50
00aafb7c	mov x22,x5
00aafb80	mov x20,x4
00aafb84	mov x23,x3
00aafb88	mov x24,x2
00aafb8c	mov x21,x1
00aafb90	bl 0x00c32d20
00aafb94	mov x26,x0
00aafb98	bl 0x00c3ef10
00aafb9c	cbz x0,0x00aafca8
00aafba0	mov x25,x0
00aafba4	add x0,x0,#0x8
00aafba8	mov x1,x26
00aafbac	bl 0x00c3ef30
00aafbb0	cbz w0,0x00aafc68
00aafbb4	mov w8,#0x4
00aafbb8	str w8,[x25]
00aafbbc	ldr x0,[x19, #0x8]
00aafbc0	bl 0x00c3ef00
00aafbc4	str x25,[x19, #0x8]
00aafbc8	bl 0x00c3eee0
00aafbcc	str x0,[x19, #0x20]
00aafbd0	cbz x0,0x00aafca8
00aafbd4	cbz x24,0x00aafc18
00aafbd8	mov x0,x21
00aafbdc	mov x1,x24
00aafbe0	bl 0x00c35c40
00aafbe4	cbz w0,0x00aafc7c
00aafbe8	bl 0x00c3ee90
00aafbec	ldr x1,[x19, #0x20]
00aafbf0	ldp x8,x9,[x21, #0x170]
00aafbf4	mov x2,xzr
00aafbf8	mov x4,x19
00aafbfc	ldr x3,[x1, #0x10]
00aafc00	mov x5,xzr
00aafc04	mov x6,x24
00aafc08	mov x7,x23
00aafc0c	stp x8,x9,[sp]
00aafc10	bl 0x00c377e0
00aafc14	cbz w0,0x00aafca8
00aafc18	tbnz w22,#0x0,0x00aafc74
00aafc1c	ldr x0,[x19, #0x20]
00aafc20	cbnz x0,0x00aafc30
00aafc24	bl 0x00c3eee0
00aafc28	str x0,[x19, #0x20]
00aafc2c	cbz x0,0x00aafca8
00aafc30	cbz x21,0x00aafc4c
00aafc34	add x0,x0,#0x18
00aafc38	mov w2,#0x1
00aafc3c	mov x1,x21
00aafc40	bl 0x00c3ef60
00aafc44	cbz w0,0x00aafca8
00aafc48	ldr x0,[x19, #0x20]
00aafc4c	ldr x0,[x0, #0x18]
00aafc50	mov w2,#0x1
00aafc54	mov x1,x20
00aafc58	mov w21,#0x1
00aafc5c	bl 0x00c3ef40
00aafc60	cbnz w0,0x00aafcb8
00aafc64	b 0x00aafca8
00aafc68	mov x0,x25
00aafc6c	bl 0x00c3ef00
00aafc70	b 0x00aafca8
00aafc74	mov w21,#0x1
00aafc78	b 0x00aafcb8
00aafc7c	bl 0x00c342a0
00aafc80	adrp x0,0x2d0000
00aafc84	adrp x2,0x2b6000
00aafc88	add x0,x0,#0x1c9
00aafc8c	add x2,x2,#0x26a
00aafc90	mov w1,#0x5e
00aafc94	bl 0x00c342b0
00aafc98	mov w0,#0x27
00aafc9c	mov w1,#0x6e
00aafca0	mov x2,xzr
00aafca4	bl 0x00c342c0
00aafca8	ldr x0,[x19, #0x20]
00aafcac	bl 0x00c3eed0
00aafcb0	mov w21,wzr
00aafcb4	str xzr,[x19, #0x20]
00aafcb8	mov w0,w21
00aafcbc	ldp x29,x30,[sp, #0x50]
00aafcc0	ldp x20,x19,[sp, #0x40]
00aafcc4	ldp x22,x21,[sp, #0x30]
00aafcc8	ldp x24,x23,[sp, #0x20]
00aafccc	ldp x26,x25,[sp, #0x10]
00aafcd0	add sp,sp,#0x60
00aafcd4	ret
