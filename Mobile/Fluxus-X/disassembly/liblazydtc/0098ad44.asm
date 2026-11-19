; std::__ndk1::function<std::__ndk1::shared_ptr<ix::ConnectionState>()>::swap @ 0098ad44
0098ad44	sub sp,sp,#0x60
0098ad48	str x21,[sp, #0x30]
0098ad4c	stp x20,x19,[sp, #0x40]
0098ad50	stp x29,x30,[sp, #0x50]
0098ad54	add x29,sp,#0x50
0098ad58	mrs x21,tpidr_el0
0098ad5c	ldr x8,[x21, #0x28]
0098ad60	mov x19,x1
0098ad64	mov x20,x0
0098ad68	cmp x1,x0
0098ad6c	str x8,[sp, #0x28]
0098ad70	b.eq 0x0098ae7c
0098ad74	ldr x0,[x20, #0x20]
0098ad78	cmp x0,x20
0098ad7c	b.eq 0x0098ad98
0098ad80	ldr x8,[x19, #0x20]
0098ad84	cmp x19,x8
0098ad88	b.eq 0x0098add0
0098ad8c	str x8,[x20, #0x20]
0098ad90	str x0,[x19, #0x20]
0098ad94	b 0x0098ae7c
0098ad98	ldr x8,[x19, #0x20]
0098ad9c	cmp x8,x19
0098ada0	b.eq 0x0098ae04
0098ada4	ldr x8,[x0]
0098ada8	ldr x8,[x8, #0x18]
0098adac	mov x1,x19
0098adb0	blr x8
0098adb4	ldr x0,[x20, #0x20]
0098adb8	ldr x8,[x0]
0098adbc	ldr x8,[x8, #0x20]
0098adc0	blr x8
0098adc4	ldr x8,[x19, #0x20]
0098adc8	str x8,[x20, #0x20]
0098adcc	b 0x0098ae78
0098add0	ldr x9,[x8]
0098add4	ldr x9,[x9, #0x18]
0098add8	mov x0,x8
0098addc	mov x1,x20
0098ade0	blr x9
0098ade4	ldr x0,[x19, #0x20]
0098ade8	ldr x8,[x0]
0098adec	ldr x8,[x8, #0x20]
0098adf0	blr x8
0098adf4	ldr x8,[x20, #0x20]
0098adf8	str x8,[x19, #0x20]
0098adfc	str x20,[x20, #0x20]
0098ae00	b 0x0098ae7c
0098ae04	ldr x8,[x0]
0098ae08	ldr x8,[x8, #0x18]
0098ae0c	mov x1,sp
0098ae10	blr x8
0098ae14	ldr x0,[x20, #0x20]
0098ae18	ldr x8,[x0]
0098ae1c	ldr x8,[x8, #0x20]
0098ae20	blr x8
0098ae24	str xzr,[x20, #0x20]
0098ae28	ldr x0,[x19, #0x20]
0098ae2c	ldr x8,[x0]
0098ae30	ldr x8,[x8, #0x18]
0098ae34	mov x1,x20
0098ae38	blr x8
0098ae3c	ldr x0,[x19, #0x20]
0098ae40	ldr x8,[x0]
0098ae44	ldr x8,[x8, #0x20]
0098ae48	blr x8
0098ae4c	str xzr,[x19, #0x20]
0098ae50	str x20,[x20, #0x20]
0098ae54	ldr x8,[sp]
0098ae58	ldr x8,[x8, #0x18]
0098ae5c	mov x0,sp
0098ae60	mov x1,x19
0098ae64	blr x8
0098ae68	ldr x8,[sp]
0098ae6c	mov x0,sp
0098ae70	ldr x8,[x8, #0x20]
0098ae74	blr x8
0098ae78	str x19,[x19, #0x20]
0098ae7c	ldr x8,[x21, #0x28]
0098ae80	ldr x9,[sp, #0x28]
0098ae84	cmp x8,x9
0098ae88	b.ne 0x0098aea0
0098ae8c	ldp x29,x30,[sp, #0x50]
0098ae90	ldp x20,x19,[sp, #0x40]
0098ae94	ldr x21,[sp, #0x30]
0098ae98	add sp,sp,#0x60
0098ae9c	ret
0098aea0	bl 0x00c2fec0
