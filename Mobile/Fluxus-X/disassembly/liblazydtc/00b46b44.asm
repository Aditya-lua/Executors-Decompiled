; FUN_00b46b44 @ 00b46b44
00b46b44	sub sp,sp,#0xc0
00b46b48	stp x22,x21,[sp, #0x90]
00b46b4c	stp x20,x19,[sp, #0xa0]
00b46b50	stp x29,x30,[sp, #0xb0]
00b46b54	ldr x21,[x0]
00b46b58	add x20,x0,#0x30
00b46b5c	mov x19,x0
00b46b60	mov x0,x20
00b46b64	str x23,[sp, #0x80]
00b46b68	add x29,sp,#0xb0
00b46b6c	bl 0x00c41170
00b46b70	ldr x0,[x19, #0x18]
00b46b74	adrp x22,0x2d8000
00b46b78	add x22,x22,#0xc50
00b46b7c	mov w2,#0x56
00b46b80	mov x1,x22
00b46b84	bl 0x00c32310
00b46b88	mov x23,x19
00b46b8c	ldr x0,[x23, #0x8]!
00b46b90	ldr x1,[x19, #0x10]
00b46b94	mov w3,#0x57
00b46b98	mov x2,x22
00b46b9c	bl 0x00c345e0
00b46ba0	mov w2,#0x48
00b46ba4	mov x0,x23
00b46ba8	mov w1,wzr
00b46bac	bl 0x00c301c0
00b46bb0	add x0,sp,#0x30
00b46bb4	mov w2,#0x50
00b46bb8	mov w1,wzr
00b46bbc	str x21,[x19]
00b46bc0	bl 0x00c301c0
00b46bc4	mov x0,x21
00b46bc8	bl 0x00c41210
00b46bcc	mov x21,x0
00b46bd0	adrp x0,0x29d000
00b46bd4	adrp x1,0x2d1000
00b46bd8	add x0,x0,#0xe2e
00b46bdc	add x1,x1,#0x42e
00b46be0	add x8,sp,#0x8
00b46be4	mov x2,xzr
00b46be8	bl 0x00c36280
00b46bec	ldr x8,[sp, #0x28]
00b46bf0	ldur q0,[sp, #0x18]
00b46bf4	ldur q1,[sp, #0x8]
00b46bf8	add x1,sp,#0x30
00b46bfc	mov x0,x20
00b46c00	mov x2,x21
00b46c04	str x8,[sp, #0x50]
00b46c08	stp q1,q0,[sp, #0x30]
00b46c0c	bl 0x00c41150
00b46c10	cbnz w0,0x00b46c1c
00b46c14	mov x0,x20
00b46c18	bl 0x00c41170
00b46c1c	adrp x8,0xcb5000
00b46c20	ldr x8,[x8, #0x8f0]
00b46c24	mov w9,#0x800
00b46c28	ldr x23,[sp, #0x80]
00b46c2c	ldr w8,[x8]
00b46c30	str x9,[x19, #0x28]
00b46c34	str w8,[x19, #0x48]
00b46c38	ldp x29,x30,[sp, #0xb0]
00b46c3c	ldp x20,x19,[sp, #0xa0]
00b46c40	ldp x22,x21,[sp, #0x90]
00b46c44	add sp,sp,#0xc0
00b46c48	ret
