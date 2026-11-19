; std::make_exception_ptr<std::__ndk1::future_error> @ 008f5ac0
008f5ac0	str x21,[sp, #-0x30]!
008f5ac4	stp x20,x19,[sp, #0x10]
008f5ac8	stp x29,x30,[sp, #0x20]
008f5acc	add x29,sp,#0x20
008f5ad0	mov x20,x0
008f5ad4	mov w0,#0x20
008f5ad8	mov x19,x8
008f5adc	bl 0x00c30000
008f5ae0	mov x1,x20
008f5ae4	mov x21,x0
008f5ae8	bl 0x00c31430
008f5aec	adrp x8,0xcb4000
008f5af0	ldr x8,[x8, #0xd38]
008f5af4	add x8,x8,#0x10
008f5af8	str x8,[x21]
008f5afc	ldr q0,[x20, #0x10]
008f5b00	str q0,[x21, #0x10]
008f5b04	adrp x1,0xcb4000
008f5b08	adrp x2,0xcb4000
008f5b0c	ldr x1,[x1, #0xd20]
008f5b10	ldr x2,[x2, #0xd08]
008f5b14	mov x0,x21
008f5b18	bl 0x00c30020
