; std::__ndk1::function<bool(char*,unsigned_long&,long)>::swap @ 008f367c
008f367c	sub sp,sp,#0x60
008f3680	str x21,[sp, #0x30]
008f3684	stp x20,x19,[sp, #0x40]
008f3688	stp x29,x30,[sp, #0x50]
008f368c	add x29,sp,#0x50
008f3690	mrs x21,tpidr_el0
008f3694	ldr x8,[x21, #0x28]
008f3698	mov x19,x1
008f369c	mov x20,x0
008f36a0	cmp x1,x0
008f36a4	str x8,[sp, #0x28]
008f36a8	b.eq 0x008f37b4
008f36ac	ldr x0,[x20, #0x20]
008f36b0	cmp x0,x20
008f36b4	b.eq 0x008f36d0
008f36b8	ldr x8,[x19, #0x20]
008f36bc	cmp x19,x8
008f36c0	b.eq 0x008f3708
008f36c4	str x8,[x20, #0x20]
008f36c8	str x0,[x19, #0x20]
008f36cc	b 0x008f37b4
008f36d0	ldr x8,[x19, #0x20]
008f36d4	cmp x8,x19
008f36d8	b.eq 0x008f373c
008f36dc	ldr x8,[x0]
008f36e0	ldr x8,[x8, #0x18]
008f36e4	mov x1,x19
008f36e8	blr x8
008f36ec	ldr x0,[x20, #0x20]
008f36f0	ldr x8,[x0]
008f36f4	ldr x8,[x8, #0x20]
008f36f8	blr x8
008f36fc	ldr x8,[x19, #0x20]
008f3700	str x8,[x20, #0x20]
008f3704	b 0x008f37b0
008f3708	ldr x9,[x8]
008f370c	ldr x9,[x9, #0x18]
008f3710	mov x0,x8
008f3714	mov x1,x20
008f3718	blr x9
008f371c	ldr x0,[x19, #0x20]
008f3720	ldr x8,[x0]
008f3724	ldr x8,[x8, #0x20]
008f3728	blr x8
008f372c	ldr x8,[x20, #0x20]
008f3730	str x8,[x19, #0x20]
008f3734	str x20,[x20, #0x20]
008f3738	b 0x008f37b4
008f373c	ldr x8,[x0]
008f3740	ldr x8,[x8, #0x18]
008f3744	mov x1,sp
008f3748	blr x8
008f374c	ldr x0,[x20, #0x20]
008f3750	ldr x8,[x0]
008f3754	ldr x8,[x8, #0x20]
008f3758	blr x8
008f375c	str xzr,[x20, #0x20]
008f3760	ldr x0,[x19, #0x20]
008f3764	ldr x8,[x0]
008f3768	ldr x8,[x8, #0x18]
008f376c	mov x1,x20
008f3770	blr x8
008f3774	ldr x0,[x19, #0x20]
008f3778	ldr x8,[x0]
008f377c	ldr x8,[x8, #0x20]
008f3780	blr x8
008f3784	str xzr,[x19, #0x20]
008f3788	str x20,[x20, #0x20]
008f378c	ldr x8,[sp]
008f3790	ldr x8,[x8, #0x18]
008f3794	mov x0,sp
008f3798	mov x1,x19
008f379c	blr x8
008f37a0	ldr x8,[sp]
008f37a4	mov x0,sp
008f37a8	ldr x8,[x8, #0x20]
008f37ac	blr x8
008f37b0	str x19,[x19, #0x20]
008f37b4	ldr x8,[x21, #0x28]
008f37b8	ldr x9,[sp, #0x28]
008f37bc	cmp x8,x9
008f37c0	b.ne 0x008f37d8
008f37c4	ldp x29,x30,[sp, #0x50]
008f37c8	ldp x20,x19,[sp, #0x40]
008f37cc	ldr x21,[sp, #0x30]
008f37d0	add sp,sp,#0x60
008f37d4	ret
008f37d8	bl 0x00c2fec0
