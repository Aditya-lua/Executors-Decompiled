; FUN_008a0ec8 @ 008a0ec8
008a0ec8	sub sp,sp,#0xb0
008a0ecc	stp x29,x30,[sp, #0x70]
008a0ed0	stp x24,x23,[sp, #0x80]
008a0ed4	stp x22,x21,[sp, #0x90]
008a0ed8	stp x20,x19,[sp, #0xa0]
008a0edc	add x29,sp,#0x70
008a0ee0	mrs x22,tpidr_el0
008a0ee4	movi v0.2D,#0x0
008a0ee8	mov x19,x0
008a0eec	ldr x8,[x22, #0x28]
008a0ef0	adrp x23,0xc4c000
008a0ef4	add x23,x23,#0x48
008a0ef8	stur x8,[x29, #-0x8]
008a0efc	mov w8,#0x40
008a0f00	stp x23,x3,[sp, #0x8]
008a0f04	str x4,[sp, #0x18]
008a0f08	stp q0,q0,[sp, #0x20]
008a0f0c	stur q0,[sp, #0x40]
008a0f10	strb w8,[sp, #0x50]
008a0f14	stp xzr,xzr,[sp, #0x58]
008a0f18	cbz x2,0x008a0fe0
008a0f1c	mov x21,x2
008a0f20	mov x20,x1
008a0f24	add x24,sp,#0x8
008a0f28	add x0,x24,#0x18
008a0f2c	bl 0x008a1090
008a0f30	mov w8,#0xff00
008a0f34	cmp x21,#0x1
008a0f38	str x8,[x0]
008a0f3c	b.eq 0x008a0fe0
008a0f40	add x0,x24,#0x18
008a0f44	add x1,x20,#0x8
008a0f48	bl 0x008a1090
008a0f4c	mov w8,#0xff0000
008a0f50	cmp x21,#0x2
008a0f54	str x8,[x0]
008a0f58	b.eq 0x008a0fe0
008a0f5c	add x0,x24,#0x18
008a0f60	add x1,x20,#0x10
008a0f64	bl 0x008a1090
008a0f68	mov w8,#0xff000000
008a0f6c	cmp x21,#0x3
008a0f70	str x8,[x0]
008a0f74	b.eq 0x008a0fe0
008a0f78	add x0,x24,#0x18
008a0f7c	add x1,x20,#0x18
008a0f80	bl 0x008a1090
008a0f84	mov x8,#0xff00000000
008a0f88	cmp x21,#0x4
008a0f8c	str x8,[x0]
008a0f90	b.eq 0x008a0fe0
008a0f94	add x0,x24,#0x18
008a0f98	add x1,x20,#0x20
008a0f9c	bl 0x008a1090
008a0fa0	mov x8,#0xff0000000000
008a0fa4	cmp x21,#0x5
008a0fa8	str x8,[x0]
008a0fac	b.eq 0x008a0fe0
008a0fb0	add x0,x24,#0x18
008a0fb4	add x1,x20,#0x28
008a0fb8	bl 0x008a1090
008a0fbc	mov x8,#0xff000000000000
008a0fc0	cmp x21,#0x6
008a0fc4	str x8,[x0]
008a0fc8	b.eq 0x008a0fe0
008a0fcc	add x0,x24,#0x18
008a0fd0	add x1,x20,#0x30
008a0fd4	bl 0x008a1090
008a0fd8	mov x8,#-0x100000000000000
008a0fdc	str x8,[x0]
008a0fe0	ldr x8,[x19]
008a0fe4	ldr x8,[x8]
008a0fe8	add x1,sp,#0x8
008a0fec	mov x0,x19
008a0ff0	blr x8
008a0ff4	ldr x0,[sp, #0x20]
008a0ff8	ldr x19,[sp, #0x58]
008a0ffc	str x23,[sp, #0x8]
008a1000	cbz x0,0x008a1030
008a1004	bl 0x00c301d0
008a1008	ldr x0,[sp, #0x38]
008a100c	str xzr,[sp, #0x20]
008a1010	bl 0x00c301d0
008a1014	mov x0,xzr
008a1018	stp xzr,xzr,[sp, #0x28]
008a101c	str xzr,[sp, #0x38]
008a1020	bl 0x00c301d0
008a1024	mov w8,#0x40
008a1028	str xzr,[sp, #0x40]
008a102c	strb w8,[sp, #0x50]
008a1030	ldr x0,[sp, #0x38]
008a1034	bl 0x00c301d0
008a1038	ldr x8,[x22, #0x28]
008a103c	ldur x9,[x29, #-0x8]
008a1040	cmp x8,x9
008a1044	b.ne 0x008a108c
008a1048	mov x0,x19
008a104c	ldp x20,x19,[sp, #0xa0]
008a1050	ldp x22,x21,[sp, #0x90]
008a1054	ldp x24,x23,[sp, #0x80]
008a1058	ldp x29,x30,[sp, #0x70]
008a105c	add sp,sp,#0xb0
008a1060	ret
008a108c	bl 0x00c2fec0
