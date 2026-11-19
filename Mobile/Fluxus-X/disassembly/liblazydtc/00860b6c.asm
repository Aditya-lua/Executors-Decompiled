; FUN_00860b6c @ 00860b6c
00860b6c	sub sp,sp,#0x80
00860b70	stp x29,x30,[sp, #0x20]
00860b74	stp x28,x27,[sp, #0x30]
00860b78	stp x26,x25,[sp, #0x40]
00860b7c	stp x24,x23,[sp, #0x50]
00860b80	stp x22,x21,[sp, #0x60]
00860b84	stp x20,x19,[sp, #0x70]
00860b88	add x29,sp,#0x20
00860b8c	mrs x22,tpidr_el0
00860b90	mov x20,x4
00860b94	mov x19,x0
00860b98	ldr x8,[x22, #0x28]
00860b9c	stur x8,[x29, #-0x8]
00860ba0	ldr q0,[x1]
00860ba4	str q0,[x4]
00860ba8	ldrb w8,[x5, #0x10]
00860bac	cmp w8,#0x1
00860bb0	b.ne 0x00860bbc
00860bb4	mov w8,wzr
00860bb8	strb wzr,[x5, #0x10]
00860bbc	ldr w9,[x19, #0x90]
00860bc0	cmp w9,#0x127
00860bc4	b.ne 0x00860c1c
00860bc8	ldr w23,[x19, #0x124]
00860bcc	adrp x9,0xd1e000
00860bd0	mov w10,#0x1
00860bd4	ldr w9,[x9, #0xba0]
00860bd8	strb w10,[x3, #0x30]
00860bdc	add w11,w23,#0x1
00860be0	cmp w11,w9
00860be4	str w11,[x19, #0x124]
00860be8	b.hi 0x00860d68
00860bec	ldur q0,[x19, #0x94]
00860bf0	str q0,[x5]
00860bf4	tbnz w8,#0x0,0x00860c00
00860bf8	mov w8,#0x1
00860bfc	strb w8,[x5, #0x10]
00860c00	mov x0,x19
00860c04	bl 0x0085a024
00860c08	ldur q0,[x0, #0xc]
00860c0c	mov x21,x0
00860c10	str q0,[x20]
00860c14	str w23,[x19, #0x124]
00860c18	b 0x00860d34
00860c1c	cmp w9,#0x126
00860c20	str x3,[sp]
00860c24	b.ne 0x00860cc8
00860c28	mov w9,#0x1
00860c2c	strb w9,[x3, #0x30]
00860c30	ldur q0,[x19, #0x94]
00860c34	str q0,[x5]
00860c38	tbnz w8,#0x0,0x00860c40
00860c3c	strb w9,[x5, #0x10]
00860c40	ldr w24,[x19, #0x90]
00860c44	ldur x25,[x19, #0x94]
00860c48	mov x0,x19
00860c4c	ldur x26,[x19, #0x9c]
00860c50	bl 0x00858f2c
00860c54	ldp x9,x8,[x19, #0x1b8]
00860c58	mov x0,x19
00860c5c	sub x21,x8,x9
00860c60	bl 0x00859498
00860c64	ldp x9,x8,[x19, #0x1b8]
00860c68	ubfx x27,x21,#0x3,#0x20
00860c6c	mov x21,x0
00860c70	sub x8,x8,x9
00860c74	asr x23,x8,#0x3
00860c78	cmp x23,x27
00860c7c	b.ls 0x00860cb4
00860c80	ldr x9,[x19, #0x1b8]
00860c84	add x0,x19,#0x180
00860c88	add x9,x9,x23, LSL #0x3
00860c8c	sub x23,x23,#0x1
00860c90	ldur x1,[x9, #-0x8]
00860c94	ldr x28,[x1, #0x18]
00860c98	bl 0x0086e18c
00860c9c	cmp x23,x27
00860ca0	str x28,[x0]
00860ca4	b.hi 0x00860c80
00860ca8	ldp x9,x8,[x19, #0x1b8]
00860cac	sub x8,x8,x9
00860cb0	asr x23,x8,#0x3
00860cb4	subs x1,x27,x23
00860cb8	b.ls 0x00860cd8
00860cbc	add x0,x19,#0x1b8
00860cc0	bl 0x00870174
00860cc4	b 0x00860ce4
00860cc8	ldr w24,[x2]
00860ccc	ldur x25,[x2, #0x4]
00860cd0	mov x21,xzr
00860cd4	b 0x00860ce8
00860cd8	b.cs 0x00860ce4
00860cdc	add x8,x9,x27, LSL #0x3
00860ce0	str x8,[x19, #0x1c0]
00860ce4	stur x26,[x21, #0xc]
00860ce8	ldur q0,[x19, #0x94]
00860cec	add x2,sp,#0xc
00860cf0	mov x0,x19
00860cf4	mov w1,#0x128
00860cf8	str w24,[sp, #0xc]
00860cfc	str q0,[x20]
00860d00	stur x25,[sp, #0x10]
00860d04	bl 0x00861094
00860d08	and w8,w0,#0x1
00860d0c	cbz x21,0x00860d2c
00860d10	adrp x9,0xd1b000
00860d14	ldr w10,[x21, #0x8]
00860d18	ldr w9,[x9, #0xf0]
00860d1c	cmp w10,w9
00860d20	b.ne 0x00860d34
00860d24	strb w8,[x21, #0x30]
00860d28	b 0x00860d34
00860d2c	ldr x9,[sp]
00860d30	strb w8,[x9, #0x30]
00860d34	ldr x8,[x22, #0x28]
00860d38	ldur x9,[x29, #-0x8]
00860d3c	cmp x8,x9
00860d40	b.ne 0x00860d90
00860d44	mov x0,x21
00860d48	ldp x20,x19,[sp, #0x70]
00860d4c	ldp x22,x21,[sp, #0x60]
00860d50	ldp x24,x23,[sp, #0x50]
00860d54	ldp x26,x25,[sp, #0x40]
00860d58	ldp x28,x27,[sp, #0x30]
00860d5c	ldp x29,x30,[sp, #0x20]
00860d60	add sp,sp,#0x80
00860d64	ret
00860d68	ldr x8,[x22, #0x28]
00860d6c	ldur x9,[x29, #-0x8]
00860d70	cmp x8,x9
00860d74	b.ne 0x00860d90
00860d78	adrp x1,0x2a1000
00860d7c	add x1,x1,#0x5df
00860d80	adrp x2,0x2cc000
00860d84	add x2,x2,#0xaca
00860d88	add x0,x19,#0x94
00860d8c	bl 0x008578f8
00860d90	bl 0x00c2fec0
