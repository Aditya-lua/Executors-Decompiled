; ssl3_do_write @ 009e2818
009e2818	str x21,[sp, #-0x30]!
009e281c	stp x20,x19,[sp, #0x10]
009e2820	stp x29,x30,[sp, #0x20]
009e2824	str xzr,[sp, #0x8]
009e2828	ldr x8,[x0, #0x88]
009e282c	ldp x3,x9,[x0, #0x98]
009e2830	add x4,sp,#0x8
009e2834	add x29,sp,#0x20
009e2838	ldr x8,[x8, #0x8]
009e283c	mov w20,w1
009e2840	mov x19,x0
009e2844	add x2,x8,x9
009e2848	bl 0x00c341d0
009e284c	cmp w0,#0x1
009e2850	b.lt 0x009e2908
009e2854	cmp w20,#0x16
009e2858	b.ne 0x009e28c0
009e285c	ldr x8,[x19, #0x8]
009e2860	ldr x9,[x8, #0xc0]
009e2864	ldrb w9,[x9, #0x60]
009e2868	tbnz w9,#0x3,0x009e28a0
009e286c	ldr w8,[x8]
009e2870	cmp w8,#0x304
009e2874	b.lt 0x009e28a0
009e2878	cmp w8,#0x10, LSL #12
009e287c	b.eq 0x009e28a0
009e2880	ldr w8,[x19, #0x5c]
009e2884	cmp w8,#0x2b
009e2888	b.hi 0x009e28a0
009e288c	mov w9,#0x1
009e2890	lsl x8,x9,x8
009e2894	mov x9,#0xc0200000000
009e2898	tst x8,x9
009e289c	b.ne 0x009e28c0
009e28a0	ldr x8,[x19, #0x88]
009e28a4	ldr x9,[x19, #0xa0]
009e28a8	ldr x2,[sp, #0x8]
009e28ac	mov x0,x19
009e28b0	ldr x8,[x8, #0x8]
009e28b4	add x1,x8,x9
009e28b8	bl 0x00c345b0
009e28bc	cbz w0,0x009e2908
009e28c0	ldr x9,[sp, #0x8]
009e28c4	ldr x8,[x19, #0x98]
009e28c8	subs x8,x8,x9
009e28cc	b.ne 0x009e2910
009e28d0	ldr x8,[x19, #0x4c0]
009e28d4	cbz x8,0x009e2924
009e28d8	ldr x10,[x19, #0x88]
009e28dc	ldr x11,[x19, #0xa0]
009e28e0	ldr w1,[x19]
009e28e4	ldr x6,[x19, #0x4c8]
009e28e8	ldr x3,[x10, #0x8]
009e28ec	add x4,x11,x9
009e28f0	mov w0,#0x1
009e28f4	mov w2,w20
009e28f8	mov x5,x19
009e28fc	mov w21,#0x1
009e2900	blr x8
009e2904	b 0x009e2928
009e2908	mov w21,#0xffffffff
009e290c	b 0x009e2928
009e2910	ldr x10,[x19, #0xa0]
009e2914	mov w21,wzr
009e2918	add x9,x10,x9
009e291c	stp x8,x9,[x19, #0x98]
009e2920	b 0x009e2928
009e2924	mov w21,#0x1
009e2928	ldp x29,x30,[sp, #0x20]
009e292c	ldp x20,x19,[sp, #0x10]
009e2930	mov w0,w21
009e2934	ldr x21,[sp], #0x30
009e2938	ret
