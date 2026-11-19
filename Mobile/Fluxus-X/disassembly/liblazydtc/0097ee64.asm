; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::underflow @ 0097ee64
0097ee64	sub sp,sp,#0x60
0097ee68	stp x24,x23,[sp, #0x20]
0097ee6c	stp x22,x21,[sp, #0x30]
0097ee70	stp x20,x19,[sp, #0x40]
0097ee74	stp x29,x30,[sp, #0x50]
0097ee78	add x29,sp,#0x50
0097ee7c	mrs x23,tpidr_el0
0097ee80	ldr x8,[x23, #0x28]
0097ee84	mov x19,x0
0097ee88	str x8,[sp, #0x18]
0097ee8c	ldr x8,[x0, #0x78]
0097ee90	cbz x8,0x0097ef08
0097ee94	ldrb w8,[x19, #0x9c]
0097ee98	tbnz w8,#0x3,0x0097ef10
0097ee9c	ldrb w8,[x19, #0xa2]
0097eea0	orr w9,wzr,#0x60
0097eea4	orr w10,wzr,#0x70
0097eea8	stp xzr,xzr,[x19, #0x28]
0097eeac	cmp w8,#0x0
0097eeb0	mov w8,#0x40
0097eeb4	csel x9,x10,x9,eq
0097eeb8	mov w10,#0x68
0097eebc	str xzr,[x19, #0x38]
0097eec0	csel x8,x10,x8,eq
0097eec4	ldr x10,[x19, x8#0x0]
0097eec8	ldr x8,[x19, x9#0x0]
0097eecc	mov w9,#0x8
0097eed0	str w9,[x19, #0x9c]
0097eed4	mov w9,#0x1
0097eed8	add x8,x10,x8
0097eedc	stp x10,x8,[x19, #0x10]
0097eee0	str x8,[x19, #0x20]
0097eee4	cbz x8,0x0097ef1c
0097eee8	cbz w9,0x0097ef30
0097eeec	ldr x9,[x19, #0x20]
0097eef0	mov x20,xzr
0097eef4	cmp x8,x9
0097eef8	b.eq 0x0097ef5c
0097eefc	ldrb w0,[x8]
0097ef00	add x24,x19,#0x10
0097ef04	b 0x0097f0a4
0097ef08	mov w0,#0xffffffff
0097ef0c	b 0x0097f0bc
0097ef10	ldr x8,[x19, #0x18]
0097ef14	mov w9,wzr
0097ef18	cbnz x8,0x0097eee8
0097ef1c	add x10,sp,#0x14
0097ef20	orr x8,x10,#0x1
0097ef24	stp x10,x8,[x19, #0x10]
0097ef28	str x8,[x19, #0x20]
0097ef2c	cbnz w9,0x0097eeec
0097ef30	ldr x9,[x19, #0x20]
0097ef34	ldr x10,[x19, #0x10]
0097ef38	mov w11,#0x4
0097ef3c	sub x10,x9,x10
0097ef40	cmp x10,#0x0
0097ef44	cinc x10,x10,lt
0097ef48	asr x10,x10,#0x1
0097ef4c	cmp x10,#0x4
0097ef50	csel x20,x10,x11,cc
0097ef54	cmp x8,x9
0097ef58	b.ne 0x0097eefc
0097ef5c	mov x24,x19
0097ef60	ldr x0,[x24, #0x10]!
0097ef64	sub x1,x8,x20
0097ef68	mov x2,x20
0097ef6c	bl 0x00c2ff60
0097ef70	ldrb w8,[x24, #0x92]
0097ef74	cbz w8,0x0097efac
0097ef78	ldr x8,[x19, #0x20]
0097ef7c	ldr x9,[x19, #0x10]
0097ef80	ldr x3,[x19, #0x78]
0097ef84	mov w1,#0x1
0097ef88	sub x8,x8,x20
0097ef8c	sub x2,x8,x9
0097ef90	add x0,x9,x20
0097ef94	bl 0x00c31e60
0097ef98	cbz x0,0x0097f0a0
0097ef9c	ldr x8,[x19, #0x10]
0097efa0	add x8,x8,x20
0097efa4	add x9,x8,x0
0097efa8	b 0x0097f094
0097efac	mov x21,x19
0097efb0	ldr x1,[x21, #0x48]!
0097efb4	ldr x9,[x21, #0x8]
0097efb8	subs x2,x9,x1
0097efbc	b.eq 0x0097efcc
0097efc0	ldr x0,[x19, #0x40]
0097efc4	bl 0x00c2ff60
0097efc8	ldp x1,x9,[x19, #0x48]
0097efcc	ldr x8,[x19, #0x40]
0097efd0	sub x9,x9,x1
0097efd4	add x10,x19,#0x58
0097efd8	add x0,x8,x9
0097efdc	cmp x8,x10
0097efe0	str x0,[x19, #0x48]
0097efe4	b.eq 0x0097eff0
0097efe8	ldr x9,[x19, #0x60]
0097efec	b 0x0097eff4
0097eff0	mov w9,#0x8
0097eff4	mov x22,x19
0097eff8	ldr x10,[x22, #0x88]!
0097effc	add x8,x8,x9
0097f000	sub x11,x8,x0
0097f004	mov w1,#0x1
0097f008	ldp x9,x3,[x22, #-0x18]
0097f00c	stur x8,[x22, #-0x38]
0097f010	str x10,[x22, #0x8]
0097f014	sub x8,x9,x20
0097f018	cmp x11,x8
0097f01c	csel x2,x11,x8,cc
0097f020	bl 0x00c31e60
0097f024	mov x8,x0
0097f028	cbz x0,0x0097f0a0
0097f02c	ldr x0,[x19, #0x80]
0097f030	cbz x0,0x0097f0e8
0097f034	ldp x2,x9,[x19, #0x40]
0097f038	ldr x10,[x19, #0x70]
0097f03c	add x7,sp,#0x8
0097f040	mov x1,x22
0097f044	add x3,x9,x8
0097f048	str x3,[x19, #0x50]
0097f04c	ldr x8,[x0]
0097f050	ldr x9,[x19, #0x10]
0097f054	mov x4,x21
0097f058	ldr x8,[x8, #0x20]
0097f05c	add x5,x9,x20
0097f060	add x6,x9,x10
0097f064	blr x8
0097f068	cmp w0,#0x3
0097f06c	b.ne 0x0097f080
0097f070	ldr x8,[x19, #0x40]
0097f074	ldr x9,[x19, #0x50]
0097f078	str x8,[x19, #0x10]
0097f07c	b 0x0097f094
0097f080	ldr x8,[x24]
0097f084	ldr x9,[sp, #0x8]
0097f088	add x8,x8,x20
0097f08c	cmp x9,x8
0097f090	b.eq 0x0097f0a0
0097f094	stp x8,x9,[x19, #0x18]
0097f098	ldrb w0,[x8]
0097f09c	b 0x0097f0a4
0097f0a0	mov w0,#0xffffffff
0097f0a4	ldr x8,[x24]
0097f0a8	add x9,sp,#0x14
0097f0ac	cmp x8,x9
0097f0b0	b.ne 0x0097f0bc
0097f0b4	stp xzr,xzr,[x19, #0x10]
0097f0b8	str xzr,[x19, #0x20]
0097f0bc	ldr x8,[x23, #0x28]
0097f0c0	ldr x9,[sp, #0x18]
0097f0c4	cmp x8,x9
0097f0c8	b.ne 0x0097f0e4
0097f0cc	ldp x29,x30,[sp, #0x50]
0097f0d0	ldp x20,x19,[sp, #0x40]
0097f0d4	ldp x22,x21,[sp, #0x30]
0097f0d8	ldp x24,x23,[sp, #0x20]
0097f0dc	add sp,sp,#0x60
0097f0e0	ret
0097f0e4	bl 0x00c2fec0
0097f0e8	mov w0,#0x8
0097f0ec	bl 0x00c30000
0097f0f0	mov x19,x0
0097f0f4	bl 0x00c333c0
0097f0f8	adrp x1,0xcb4000
0097f0fc	adrp x2,0xcb4000
0097f100	ldr x1,[x1, #0xf80]
0097f104	ldr x2,[x2, #0xf78]
0097f108	mov x0,x19
0097f10c	bl 0x00c30020
