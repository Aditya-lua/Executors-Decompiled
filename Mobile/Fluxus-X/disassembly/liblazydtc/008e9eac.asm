; std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>> @ 008e9eac
008e9eac	sub sp,sp,#0x70
008e9eb0	stp x26,x25,[sp, #0x20]
008e9eb4	stp x24,x23,[sp, #0x30]
008e9eb8	stp x22,x21,[sp, #0x40]
008e9ebc	stp x20,x19,[sp, #0x50]
008e9ec0	stp x29,x30,[sp, #0x60]
008e9ec4	add x29,sp,#0x60
008e9ec8	mrs x25,tpidr_el0
008e9ecc	ldr x8,[x25, #0x28]
008e9ed0	mov x20,x2
008e9ed4	mov x19,x0
008e9ed8	mov x21,x1
008e9edc	str x8,[sp, #0x18]
008e9ee0	strb wzr,[sp]
008e9ee4	str x0,[sp, #0x8]
008e9ee8	ldr x8,[x0]
008e9eec	ldr x9,[x8, #-0x18]!
008e9ef0	add x9,x0,x9
008e9ef4	ldr w10,[x9, #0x20]
008e9ef8	cbnz w10,0x008e9fb8
008e9efc	ldr x0,[x9, #0x88]
008e9f00	cbz x0,0x008e9f10
008e9f04	bl 0x00c30e50
008e9f08	ldr x8,[x19]
008e9f0c	sub x8,x8,#0x18
008e9f10	mov w9,#0x1
008e9f14	strb w9,[sp]
008e9f18	ldr x8,[x8]
008e9f1c	add x22,x19,x8
008e9f20	ldr w5,[x22, #0x90]
008e9f24	ldr x23,[x22, #0x28]
008e9f28	ldr w26,[x22, #0x8]
008e9f2c	cmn w5,#0x1
008e9f30	b.ne 0x008e9f74
008e9f34	add x8,sp,#0x10
008e9f38	mov x0,x22
008e9f3c	bl 0x00c30070
008e9f40	adrp x1,0xcb4000
008e9f44	ldr x1,[x1, #0x998]
008e9f48	add x0,sp,#0x10
008e9f4c	bl 0x00c30080
008e9f50	ldr x8,[x0]
008e9f54	ldr x8,[x8, #0x38]
008e9f58	mov w1,#0x20
008e9f5c	blr x8
008e9f60	mov w24,w0
008e9f64	add x0,sp,#0x10
008e9f68	bl 0x00c30090
008e9f6c	and w5,w24,#0xff
008e9f70	str w5,[x22, #0x90]
008e9f74	mov w8,#0xb0
008e9f78	and w8,w26,w8
008e9f7c	add x3,x21,x20
008e9f80	cmp w8,#0x20
008e9f84	csel x2,x3,x21,eq
008e9f88	mov x0,x23
008e9f8c	mov x1,x21
008e9f90	mov x4,x22
008e9f94	bl 0x008ea050
008e9f98	cbnz x0,0x008e9fb8
008e9f9c	ldr x8,[x19]
008e9fa0	mov w9,#0x5
008e9fa4	ldur x8,[x8, #-0x18]
008e9fa8	add x0,x19,x8
008e9fac	ldr w8,[x0, #0x20]
008e9fb0	orr w1,w8,w9
008e9fb4	bl 0x00c30130
008e9fb8	mov x0,sp
008e9fbc	bl 0x00c30e60
008e9fc0	ldr x8,[x25, #0x28]
008e9fc4	ldr x9,[sp, #0x18]
008e9fc8	cmp x8,x9
008e9fcc	b.ne 0x008e9ff0
008e9fd0	mov x0,x19
008e9fd4	ldp x29,x30,[sp, #0x60]
008e9fd8	ldp x20,x19,[sp, #0x50]
008e9fdc	ldp x22,x21,[sp, #0x40]
008e9fe0	ldp x24,x23,[sp, #0x30]
008e9fe4	ldp x26,x25,[sp, #0x20]
008e9fe8	add sp,sp,#0x70
008e9fec	ret
008e9ff0	bl 0x00c2fec0
