; FUN_00875a20 @ 00875a20
00875a20	sub sp,sp,#0x60
00875a24	stp x29,x30,[sp, #0x30]
00875a28	stp x22,x21,[sp, #0x40]
00875a2c	stp x20,x19,[sp, #0x50]
00875a30	add x29,sp,#0x30
00875a34	mrs x21,tpidr_el0
00875a38	mov x20,x0
00875a3c	ldr x8,[x21, #0x28]
00875a40	stur x8,[x29, #-0x8]
00875a44	ldp x8,x9,[x20, #0x60]!
00875a48	sub x8,x9,x8
00875a4c	mov w9,#0xcccd
00875a50	lsr x8,x8,#0x3
00875a54	movk w9,#0xcccc, LSL #16
00875a58	mul w19,w8,w9
00875a5c	lsr w8,w19,#0x17
00875a60	cbz w8,0x00875a6c
00875a64	mov w19,#0xffffffff
00875a68	b 0x00875b28
00875a6c	mov x8,x0
00875a70	mov w12,#0x6db7
00875a74	movi v0.2D,#0x0
00875a78	ldp x10,x9,[x8, #0xc0]!
00875a7c	movk w12,#0xb6db, LSL #16
00875a80	ldr x11,[x8, #0x10]
00875a84	str xzr,[sp, #0x20]
00875a88	sub x10,x9,x10
00875a8c	cmp x9,x11
00875a90	stp q0,q0,[sp]
00875a94	lsr x10,x10,#0x3
00875a98	mul w10,w10,w12
00875a9c	mov w12,#0x9
00875aa0	str w12,[sp]
00875aa4	str w10,[sp, #0x8]
00875aa8	b.cs 0x00875b04
00875aac	ldrh w8,[x1, #0x4]
00875ab0	ldr w10,[x1]
00875ab4	stp xzr,xzr,[x9, #0x10]
00875ab8	str xzr,[x9, #0x8]
00875abc	strh w8,[x9, #0x4]
00875ac0	str w10,[x9]
00875ac4	ldur q0,[x1, #0x8]
00875ac8	stur q0,[x9, #0x8]
00875acc	ldr x8,[x1, #0x18]
00875ad0	str x8,[x9, #0x18]
00875ad4	stp xzr,xzr,[x1, #0x8]
00875ad8	str xzr,[x1, #0x18]
00875adc	stp xzr,xzr,[x9, #0x20]
00875ae0	str xzr,[x9, #0x30]
00875ae4	ldr q0,[x1, #0x20]
00875ae8	str q0,[x9, #0x20]
00875aec	ldr x8,[x1, #0x30]
00875af0	str x8,[x9, #0x30]
00875af4	add x8,x9,#0x38
00875af8	stp xzr,xzr,[x1, #0x20]
00875afc	str xzr,[x1, #0x30]
00875b00	b 0x00875b18
00875b04	mov x22,x0
00875b08	mov x0,x8
00875b0c	bl 0x00879e34
00875b10	mov x8,x0
00875b14	mov x0,x22
00875b18	str x8,[x0, #0xc8]
00875b1c	mov x1,sp
00875b20	mov x0,x20
00875b24	bl 0x00874c40
00875b28	ldr x8,[x21, #0x28]
00875b2c	ldur x9,[x29, #-0x8]
00875b30	cmp x8,x9
00875b34	b.ne 0x00875b50
00875b38	mov w0,w19
00875b3c	ldp x20,x19,[sp, #0x50]
00875b40	ldp x22,x21,[sp, #0x40]
00875b44	ldp x29,x30,[sp, #0x30]
00875b48	add sp,sp,#0x60
00875b4c	ret
00875b50	bl 0x00c2fec0
