; std::__ndk1::function<bool(std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>::swap @ 008f37e4
008f37e4	sub sp,sp,#0x60
008f37e8	str x21,[sp, #0x30]
008f37ec	stp x20,x19,[sp, #0x40]
008f37f0	stp x29,x30,[sp, #0x50]
008f37f4	add x29,sp,#0x50
008f37f8	mrs x21,tpidr_el0
008f37fc	ldr x8,[x21, #0x28]
008f3800	mov x19,x1
008f3804	mov x20,x0
008f3808	cmp x1,x0
008f380c	str x8,[sp, #0x28]
008f3810	b.eq 0x008f391c
008f3814	ldr x0,[x20, #0x20]
008f3818	cmp x0,x20
008f381c	b.eq 0x008f3838
008f3820	ldr x8,[x19, #0x20]
008f3824	cmp x19,x8
008f3828	b.eq 0x008f3870
008f382c	str x8,[x20, #0x20]
008f3830	str x0,[x19, #0x20]
008f3834	b 0x008f391c
008f3838	ldr x8,[x19, #0x20]
008f383c	cmp x8,x19
008f3840	b.eq 0x008f38a4
008f3844	ldr x8,[x0]
008f3848	ldr x8,[x8, #0x18]
008f384c	mov x1,x19
008f3850	blr x8
008f3854	ldr x0,[x20, #0x20]
008f3858	ldr x8,[x0]
008f385c	ldr x8,[x8, #0x20]
008f3860	blr x8
008f3864	ldr x8,[x19, #0x20]
008f3868	str x8,[x20, #0x20]
008f386c	b 0x008f3918
008f3870	ldr x9,[x8]
008f3874	ldr x9,[x9, #0x18]
008f3878	mov x0,x8
008f387c	mov x1,x20
008f3880	blr x9
008f3884	ldr x0,[x19, #0x20]
008f3888	ldr x8,[x0]
008f388c	ldr x8,[x8, #0x20]
008f3890	blr x8
008f3894	ldr x8,[x20, #0x20]
008f3898	str x8,[x19, #0x20]
008f389c	str x20,[x20, #0x20]
008f38a0	b 0x008f391c
008f38a4	ldr x8,[x0]
008f38a8	ldr x8,[x8, #0x18]
008f38ac	mov x1,sp
008f38b0	blr x8
008f38b4	ldr x0,[x20, #0x20]
008f38b8	ldr x8,[x0]
008f38bc	ldr x8,[x8, #0x20]
008f38c0	blr x8
008f38c4	str xzr,[x20, #0x20]
008f38c8	ldr x0,[x19, #0x20]
008f38cc	ldr x8,[x0]
008f38d0	ldr x8,[x8, #0x18]
008f38d4	mov x1,x20
008f38d8	blr x8
008f38dc	ldr x0,[x19, #0x20]
008f38e0	ldr x8,[x0]
008f38e4	ldr x8,[x8, #0x20]
008f38e8	blr x8
008f38ec	str xzr,[x19, #0x20]
008f38f0	str x20,[x20, #0x20]
008f38f4	ldr x8,[sp]
008f38f8	ldr x8,[x8, #0x18]
008f38fc	mov x0,sp
008f3900	mov x1,x19
008f3904	blr x8
008f3908	ldr x8,[sp]
008f390c	mov x0,sp
008f3910	ldr x8,[x8, #0x20]
008f3914	blr x8
008f3918	str x19,[x19, #0x20]
008f391c	ldr x8,[x21, #0x28]
008f3920	ldr x9,[sp, #0x28]
008f3924	cmp x8,x9
008f3928	b.ne 0x008f3940
008f392c	ldp x29,x30,[sp, #0x50]
008f3930	ldp x20,x19,[sp, #0x40]
008f3934	ldr x21,[sp, #0x30]
008f3938	add sp,sp,#0x60
008f393c	ret
008f3940	bl 0x00c2fec0
