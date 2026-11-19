; FUN_00904a98 @ 00904a98
00904a98	str x23,[sp, #-0x40]!
00904a9c	stp x22,x21,[sp, #0x10]
00904aa0	stp x20,x19,[sp, #0x20]
00904aa4	stp x29,x30,[sp, #0x30]
00904aa8	add x29,sp,#0x30
00904aac	ldrb w8,[x0, #0xa85]
00904ab0	mov x19,x3
00904ab4	mov x21,x2
00904ab8	mov x20,x0
00904abc	mov w22,w1
00904ac0	tbnz w8,#0x4,0x00904ad8
00904ac4	ldp x29,x30,[sp, #0x30]
00904ac8	ldp x20,x19,[sp, #0x20]
00904acc	ldp x22,x21,[sp, #0x10]
00904ad0	ldr x23,[sp], #0x40
00904ad4	ret
00904ad8	ldr x8,[x20, #0x258]
00904adc	cbz x8,0x00904b30
00904ae0	mov x0,x20
00904ae4	bl 0x0092f1bc
00904ae8	mov w23,w0
00904aec	mov w1,#0x1
00904af0	mov x0,x20
00904af4	bl 0x0092f198
00904af8	ldr x8,[x20, #0x258]
00904afc	ldr x4,[x20, #0x1c0]
00904b00	mov x0,x20
00904b04	mov w1,w22
00904b08	mov x2,x21
00904b0c	mov x3,x19
00904b10	blr x8
00904b14	mov x0,x20
00904b18	ldp x29,x30,[sp, #0x30]
00904b1c	ldp x20,x19,[sp, #0x20]
00904b20	ldp x22,x21,[sp, #0x10]
00904b24	and w1,w23,#0x1
00904b28	ldr x23,[sp], #0x40
00904b2c	b 0x0092f198
00904b30	cmp w22,#0x2
00904b34	b.hi 0x00904ac4
00904b38	ldr x3,[x20, #0x1b8]
00904b3c	mov w8,w22
00904b40	adrp x9,0x746000
00904b44	add x8,x8,w22, UXTW  #0x1
00904b48	add x9,x9,#0x4a8
00904b4c	add x0,x9,x8
00904b50	mov w1,#0x2
00904b54	mov w2,#0x1
00904b58	bl 0x00c308f0
00904b5c	ldr x3,[x20, #0x1b8]
00904b60	mov x0,x21
00904b64	mov x1,x19
00904b68	ldp x29,x30,[sp, #0x30]
00904b6c	ldp x20,x19,[sp, #0x20]
00904b70	ldp x22,x21,[sp, #0x10]
00904b74	mov w2,#0x1
00904b78	ldr x23,[sp], #0x40
00904b7c	b 0x00c308f0
