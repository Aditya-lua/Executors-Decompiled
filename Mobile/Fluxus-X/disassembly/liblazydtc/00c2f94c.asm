; FUN_00c2f94c @ 00c2f94c
00c2f94c	paciasp
00c2f950	sub sp,sp,#0xa0
00c2f954	stp x29,x30,[sp, #0x40]
00c2f958	stp x28,x27,[sp, #0x50]
00c2f95c	stp x26,x25,[sp, #0x60]
00c2f960	stp x24,x23,[sp, #0x70]
00c2f964	stp x22,x21,[sp, #0x80]
00c2f968	stp x20,x19,[sp, #0x90]
00c2f96c	add x29,sp,#0x40
00c2f970	add x24,x2,w3, UXTW 
00c2f974	mov x23,x2
00c2f978	mov x20,x1
00c2f97c	add x3,sp,#0x20
00c2f980	mov x1,x2
00c2f984	mov x21,x5
00c2f988	mov x2,x24
00c2f98c	mov x19,x4
00c2f990	mov x22,x0
00c2f994	bl 0x00c2f664
00c2f998	tbz w0,#0x0,0x00c2fa8c
00c2f99c	ldr x8,[sp, #0x28]
00c2f9a0	cbz x8,0x00c2fa8c
00c2f9a4	ldrb w0,[sp, #0x38]
00c2f9a8	stp x21,x19,[sp, #0x8]
00c2f9ac	bl 0x00c2fab4
00c2f9b0	ldr x27,[sp, #0x28]
00c2f9b4	mov x25,x0
00c2f9b8	mov x26,xzr
00c2f9bc	cmp x27,#0x1
00c2f9c0	b.ls 0x00c2fa0c
00c2f9c4	lsr x21,x27,#0x1
00c2f9c8	ldr x8,[sp, #0x30]
00c2f9cc	ldrb w3,[sp, #0x38]
00c2f9d0	add x1,sp,#0x18
00c2f9d4	mov x0,x22
00c2f9d8	mov x2,x24
00c2f9dc	add x19,x21,x26
00c2f9e0	mov x4,x23
00c2f9e4	mul x28,x19,x25
00c2f9e8	add x8,x8,x28
00c2f9ec	str x8,[sp, #0x18]
00c2f9f0	bl 0x00c2e33c
00c2f9f4	sub x8,x27,x21
00c2f9f8	cmp x0,x20
00c2f9fc	csel x26,x26,x19,cs
00c2fa00	csel x27,x21,x8,cs
00c2fa04	b.ne 0x00c2f9bc
00c2fa08	b 0x00c2fa10
00c2fa0c	mul x28,x26,x25
00c2fa10	ldr x8,[sp, #0x30]
00c2fa14	ldrb w25,[sp, #0x38]
00c2fa18	add x1,sp,#0x18
00c2fa1c	mov x0,x22
00c2fa20	mov x2,x24
00c2fa24	mov x4,x23
00c2fa28	add x8,x8,x28
00c2fa2c	mov w3,w25
00c2fa30	str x8,[sp, #0x18]
00c2fa34	bl 0x00c2e33c
00c2fa38	add x1,sp,#0x18
00c2fa3c	mov x0,x22
00c2fa40	mov x2,x24
00c2fa44	mov w3,w25
00c2fa48	mov x4,x23
00c2fa4c	bl 0x00c2e33c
00c2fa50	ldp x3,x19,[sp, #0x8]
00c2fa54	mov x1,x0
00c2fa58	mov x0,x22
00c2fa5c	mov w4,wzr
00c2fa60	mov x2,x19
00c2fa64	bl 0x00c2c5cc
00c2fa68	cbnz x0,0x00c2fa8c
00c2fa6c	ldr x8,[x19, #0x18]
00c2fa70	cmp x20,x8
00c2fa74	b.cc 0x00c2fa8c
00c2fa78	ldr x8,[x19, #0x20]
00c2fa7c	cmp x20,x8
00c2fa80	b.cs 0x00c2fa8c
00c2fa84	mov w0,#0x1
00c2fa88	b 0x00c2fa90
00c2fa8c	mov w0,wzr
00c2fa90	ldp x20,x19,[sp, #0x90]
00c2fa94	ldp x22,x21,[sp, #0x80]
00c2fa98	ldp x24,x23,[sp, #0x70]
00c2fa9c	ldp x26,x25,[sp, #0x60]
00c2faa0	ldp x28,x27,[sp, #0x50]
00c2faa4	ldp x29,x30,[sp, #0x40]
00c2faa8	add sp,sp,#0xa0
00c2faac	autiasp
00c2fab0	ret
