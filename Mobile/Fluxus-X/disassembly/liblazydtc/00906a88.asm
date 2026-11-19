; FUN_00906a88 @ 00906a88
00906a88	sub sp,sp,#0x40
00906a8c	str x21,[sp, #0x10]
00906a90	stp x20,x19,[sp, #0x20]
00906a94	stp x29,x30,[sp, #0x30]
00906a98	add x29,sp,#0x30
00906a9c	mrs x21,tpidr_el0
00906aa0	ldr x8,[x21, #0x28]
00906aa4	adrp x1,0xcc4000
00906aa8	mov x19,x0
00906aac	add x1,x1,#0x6c8
00906ab0	mov x0,sp
00906ab4	mov x2,xzr
00906ab8	str x8,[sp, #0x8]
00906abc	bl 0x00907328
00906ac0	mov w20,w0
00906ac4	cbnz w0,0x00906ad4
00906ac8	ldr x1,[sp]
00906acc	mov x0,x19
00906ad0	bl 0x009073e8
00906ad4	ldr x8,[x21, #0x28]
00906ad8	ldr x9,[sp, #0x8]
00906adc	cmp x8,x9
00906ae0	b.ne 0x00906afc
00906ae4	mov w0,w20
00906ae8	ldp x29,x30,[sp, #0x30]
00906aec	ldp x20,x19,[sp, #0x20]
00906af0	ldr x21,[sp, #0x10]
00906af4	add sp,sp,#0x40
00906af8	ret
00906afc	bl 0x00c2fec0
