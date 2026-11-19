; FUN_008b2e4c @ 008b2e4c
008b2e4c	sub sp,sp,#0x70
008b2e50	stp x29,x30,[sp, #0x20]
008b2e54	str x25,[sp, #0x30]
008b2e58	stp x24,x23,[sp, #0x40]
008b2e5c	stp x22,x21,[sp, #0x50]
008b2e60	stp x20,x19,[sp, #0x60]
008b2e64	add x29,sp,#0x20
008b2e68	mrs x21,tpidr_el0
008b2e6c	mov x19,x0
008b2e70	ldr x8,[x21, #0x28]
008b2e74	stur x8,[x29, #-0x8]
008b2e78	ldr x8,[x0, #0x50]
008b2e7c	ldr x8,[x8, #0x8]
008b2e80	ldr x8,[x8]
008b2e84	ldr x22,[x8, #0x30]
008b2e88	ldrb w8,[x22, #0x6a]
008b2e8c	cmp w8,#0x1
008b2e90	b.eq 0x008b2fbc
008b2e94	ldr w8,[x22, #0x60]
008b2e98	cbnz w8,0x008b2fdc
008b2e9c	mov x0,x19
008b2ea0	bl 0x008aa984
008b2ea4	cmp w0,#0x2
008b2ea8	b.ne 0x008b3004
008b2eac	ldr x8,[x19, #0x70]
008b2eb0	ldr w9,[x8, #0xc]
008b2eb4	cmp w9,#0xc
008b2eb8	b.ne 0x008b3030
008b2ebc	ldr x20,[x8]
008b2ec0	ldr x9,[x20, #0x10]
008b2ec4	cmp x9,x22
008b2ec8	b.ne 0x008b3050
008b2ecc	ldr x9,[x19, #0x68]
008b2ed0	ldr w8,[x22, #0x58]
008b2ed4	str wzr,[x9, #0xc]
008b2ed8	add x9,x9,#0x10
008b2edc	str x9,[x19, #0x68]
008b2ee0	cbz w8,0x008b2f84
008b2ee4	mov x23,xzr
008b2ee8	mov x24,xzr
008b2eec	mov w25,#0x5
008b2ef0	b 0x008b2f08
008b2ef4	ldr w8,[x22, #0x58]
008b2ef8	add x24,x24,#0x1
008b2efc	add x23,x23,#0x10
008b2f00	cmp x24,x8
008b2f04	b.cs 0x008b2f80
008b2f08	ldr x9,[x22, #0x40]
008b2f0c	ldr x9,[x9, x24, LSL #0x3]
008b2f10	cbz x9,0x008b2ef8
008b2f14	ldp x8,x10,[x19, #0x68]
008b2f18	add x2,sp,#0x8
008b2f1c	mov x0,x19
008b2f20	str x9,[sp, #0x8]
008b2f24	str w25,[sp, #0x14]
008b2f28	sub x3,x8,#0x10
008b2f2c	add x1,x10,#0x10
008b2f30	bl 0x008cadd4
008b2f34	ldr x8,[x19, #0x68]
008b2f38	ldr x9,[x20, #0x20]
008b2f3c	ldur q0,[x8, #-0x10]
008b2f40	str q0,[x9,x23]
008b2f44	ldr x8,[x20, #0x20]
008b2f48	add x9,x8,x23
008b2f4c	ldr w9,[x9, #0xc]
008b2f50	cmp w9,#0x5
008b2f54	b.lt 0x008b2ef4
008b2f58	ldrb w9,[x20, #0x2]
008b2f5c	tbz w9,#0x2,0x008b2ef4
008b2f60	ldr x2,[x8, x23#0x0]
008b2f64	ldrb w8,[x2, #0x2]
008b2f68	tst w8,#0x3
008b2f6c	b.eq 0x008b2ef4
008b2f70	mov x0,x19
008b2f74	mov x1,x20
008b2f78	bl 0x008b6188
008b2f7c	b 0x008b2ef4
008b2f80	ldr x9,[x19, #0x68]
008b2f84	sub x8,x9,#0x10
008b2f88	str x8,[x19, #0x68]
008b2f8c	ldr x8,[x21, #0x28]
008b2f90	ldur x9,[x29, #-0x8]
008b2f94	cmp x8,x9
008b2f98	b.ne 0x008b30a4
008b2f9c	mov w0,wzr
008b2fa0	ldp x20,x19,[sp, #0x60]
008b2fa4	ldr x25,[sp, #0x30]
008b2fa8	ldp x22,x21,[sp, #0x50]
008b2fac	ldp x24,x23,[sp, #0x40]
008b2fb0	ldp x29,x30,[sp, #0x20]
008b2fb4	add sp,sp,#0x70
008b2fb8	ret
008b2fbc	ldr x8,[x22, #0x10]
008b2fc0	ldr x9,[x21, #0x28]
008b2fc4	ldur x10,[x29, #-0x8]
008b2fc8	cmp x9,x10
008b2fcc	b.ne 0x008b30a4
008b2fd0	adrp x1,0x2c6000
008b2fd4	add x1,x1,#0xb59
008b2fd8	b 0x008b3098
008b2fdc	ldr x9,[x22, #0x20]
008b2fe0	ldr x8,[x22, #0x10]
008b2fe4	cbnz x9,0x008b3080
008b2fe8	ldr x9,[x21, #0x28]
008b2fec	ldur x10,[x29, #-0x8]
008b2ff0	cmp x9,x10
008b2ff4	b.ne 0x008b30a4
008b2ff8	adrp x1,0x2b1000
008b2ffc	add x1,x1,#0x40f
008b3000	b 0x008b3098
008b3004	ldr x8,[x22, #0x10]
008b3008	ldr x9,[x21, #0x28]
008b300c	ldur x10,[x29, #-0x8]
008b3010	cmp x9,x10
008b3014	b.ne 0x008b30a4
008b3018	mov w3,w0
008b301c	adrp x1,0x2a9000
008b3020	add x1,x1,#0x3f9
008b3024	add x2,x8,#0x18
008b3028	mov x0,x19
008b302c	bl 0x008aecb4
008b3030	ldr x8,[x22, #0x10]
008b3034	ldr x9,[x21, #0x28]
008b3038	ldur x10,[x29, #-0x8]
008b303c	cmp x9,x10
008b3040	b.ne 0x008b30a4
008b3044	adrp x1,0x2a5000
008b3048	add x1,x1,#0x224
008b304c	b 0x008b3098
008b3050	ldr x8,[x22, #0x10]
008b3054	ldr x9,[x9, #0x10]
008b3058	ldr x10,[x21, #0x28]
008b305c	ldur x11,[x29, #-0x8]
008b3060	cmp x10,x11
008b3064	b.ne 0x008b30a4
008b3068	adrp x1,0x2a3000
008b306c	add x1,x1,#0x56a
008b3070	add x2,x8,#0x18
008b3074	add x3,x9,#0x18
008b3078	mov x0,x19
008b307c	bl 0x008aecb4
008b3080	ldr x9,[x21, #0x28]
008b3084	ldur x10,[x29, #-0x8]
008b3088	cmp x9,x10
008b308c	b.ne 0x008b30a4
008b3090	adrp x1,0x2c2000
008b3094	add x1,x1,#0xe1e
008b3098	add x2,x8,#0x18
008b309c	mov x0,x19
008b30a0	bl 0x008aecb4
008b30a4	bl 0x00c2fec0
