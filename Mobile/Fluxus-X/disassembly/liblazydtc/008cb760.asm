; FUN_008cb760 @ 008cb760
008cb760	stp x29,x30,[sp, #-0x50]!
008cb764	str x25,[sp, #0x10]
008cb768	stp x24,x23,[sp, #0x20]
008cb76c	stp x22,x21,[sp, #0x30]
008cb770	stp x20,x19,[sp, #0x40]
008cb774	mov x29,sp
008cb778	ldr x21,[x0, #0x68]
008cb77c	ldr q0,[x1]
008cb780	mov x19,x0
008cb784	str q0,[x21]
008cb788	ldr q0,[x2]
008cb78c	str q0,[x21, #0x10]
008cb790	ldr q0,[x3]
008cb794	str q0,[x21, #0x20]
008cb798	ldr q0,[x4]
008cb79c	str q0,[x21, #0x30]
008cb7a0	ldrb w8,[x0, #0x6]
008cb7a4	cmp w8,#0x1
008cb7a8	b.ne 0x008cb7e4
008cb7ac	ldr x8,[x19, #0x50]
008cb7b0	ldr x8,[x8, #0x8]
008cb7b4	ldr w9,[x8, #0xc]
008cb7b8	cmp w9,#0x7
008cb7bc	b.ne 0x008cb7e4
008cb7c0	ldr x8,[x8]
008cb7c4	ldrb w8,[x8, #0x6]
008cb7c8	cbnz w8,0x008cb7e4
008cb7cc	ldr w8,[x21, #0xc]
008cb7d0	cmp w8,#0x7
008cb7d4	b.ne 0x008cb7e4
008cb7d8	ldr x8,[x21]
008cb7dc	ldrb w8,[x8, #0x6]
008cb7e0	cbz w8,0x008cb830
008cb7e4	ldr x8,[x19, #0x48]
008cb7e8	ldr x1,[x19, #0x68]
008cb7ec	sub x8,x8,x1
008cb7f0	cmp x8,#0x40
008cb7f4	b.gt 0x008cb808
008cb7f8	mov x0,x19
008cb7fc	mov w1,#0x4
008cb800	bl 0x008b41e4
008cb804	ldr x1,[x19, #0x68]
008cb808	add x8,x1,#0x40
008cb80c	mov x0,x19
008cb810	mov w2,wzr
008cb814	str x8,[x19, #0x68]
008cb818	ldp x20,x19,[sp, #0x40]
008cb81c	ldr x25,[sp, #0x10]
008cb820	ldp x22,x21,[sp, #0x30]
008cb824	ldp x24,x23,[sp, #0x20]
008cb828	ldp x29,x30,[sp], #0x50
008cb82c	b 0x008b465c
008cb830	ldr x8,[x19, #0x68]
008cb834	ldrh w9,[x19, #0x28]
008cb838	add x8,x8,#0x40
008cb83c	add w9,w9,#0x1
008cb840	str x8,[x19, #0x68]
008cb844	and w8,w9,#0xffff
008cb848	ldr x24,[x21]
008cb84c	cmp w8,#0xc8
008cb850	strh w9,[x19, #0x28]
008cb854	b.cc 0x008cb860
008cb858	mov x0,x19
008cb85c	bl 0x008b42d8
008cb860	ldrb w8,[x24, #0x6]
008cb864	ldr x22,[x19, #0x58]
008cb868	cbz w8,0x008cb874
008cb86c	mov x23,xzr
008cb870	b 0x008cb8ac
008cb874	adrp x8,0xd1f000
008cb878	add x8,x8,#0xdf0
008cb87c	ldr x23,[x24, #0x18]
008cb880	ldrb w8,[x8]
008cb884	cmp w8,#0x1
008cb888	b.ne 0x008cb8ac
008cb88c	ldr x8,[x23, #0xd0]
008cb890	cbz x8,0x008cb8ac
008cb894	str x8,[x24, #0x18]
008cb898	mov x23,x8
008cb89c	ldr x8,[x8, #0xd0]
008cb8a0	cbnz x8,0x008cb894
008cb8a4	ldrb w8,[x23, #0x5]
008cb8a8	strb w8,[x24, #0x4]
008cb8ac	adrp x8,0xcb4000
008cb8b0	add x25,x21,#0x10
008cb8b4	ldr x8,[x8, #0xbd8]
008cb8b8	ldrb w8,[x8]
008cb8bc	cmp w8,#0x1
008cb8c0	b.ne 0x008cb8d0
008cb8c4	ldr w8,[x23, #0x48]
008cb8c8	add w8,w8,#0x1
008cb8cc	str w8,[x23, #0x48]
008cb8d0	ldr x8,[x19, #0x50]
008cb8d4	ldr x9,[x19, #0x18]
008cb8d8	cmp x8,x9
008cb8dc	b.eq 0x008cb8ec
008cb8e0	add x20,x8,#0x30
008cb8e4	str x20,[x19, #0x50]
008cb8e8	b 0x008cb8f8
008cb8ec	mov x0,x19
008cb8f0	bl 0x008b4200
008cb8f4	mov x20,x0
008cb8f8	ldr x8,[x19, #0x68]
008cb8fc	ldrb w9,[x24, #0x4]
008cb900	ldr x10,[x23, #0x30]
008cb904	str x25,[x20, #0x10]
008cb908	add x8,x8,x9, LSL #0x4
008cb90c	str x10,[x20, #0x20]
008cb910	adrp x9,0x29b000
008cb914	ldr x11,[x19, #0x48]
008cb918	ldr x10,[x19, #0x68]
008cb91c	ldr d0,[x9, #0x470]
008cb920	str x8,[x20, #0x18]
008cb924	ldrb w8,[x24, #0x4]
008cb928	sub x9,x11,x10
008cb92c	stp x23,x21,[x20]
008cb930	cmp x9,w8, UXTW  #0x4
008cb934	str d0,[x20, #0x28]
008cb938	str x25,[x19, #0x70]
008cb93c	b.gt 0x008cb964
008cb940	ldr w9,[x19, #0x40]
008cb944	mov x0,x19
008cb948	mov w2,#0x1
008cb94c	lsl w10,w9,#0x1
008cb950	add w11,w9,w8
008cb954	cmp w9,w8
008cb958	csel w1,w11,w10,lt
008cb95c	bl 0x008b3fdc
008cb960	ldp x10,x25,[x19, #0x68]
008cb964	ldrb w8,[x23, #0x7]
008cb968	add x8,x25,x8, LSL #0x4
008cb96c	cmp x10,x8
008cb970	b.cs 0x008cb998
008cb974	add x9,x10,#0x10
008cb978	mvn x11,x10
008cb97c	cmp x8,x9
008cb980	csel x9,x8,x9,hi
008cb984	add x9,x9,x11
008cb988	cmp x9,#0x10
008cb98c	b.cs 0x008cb9a0
008cb990	mov x9,x10
008cb994	b 0x008cb9d0
008cb998	mov x9,x10
008cb99c	b 0x008cb9e8
008cb9a0	lsr x9,x9,#0x4
008cb9a4	add x11,x9,#0x1
008cb9a8	and x12,x11,#0x1ffffffffffffffe
008cb9ac	add x9,x10,x12, LSL #0x4
008cb9b0	add x10,x10,#0x1c
008cb9b4	mov x13,x12
008cb9b8	subs x13,x13,#0x2
008cb9bc	stur wzr,[x10, #-0x10]
008cb9c0	str wzr,[x10], #0x20
008cb9c4	b.ne 0x008cb9b8
008cb9c8	cmp x11,x12
008cb9cc	b.eq 0x008cb9e8
008cb9d0	mov x10,x9
008cb9d4	add x9,x10,#0x10
008cb9d8	str wzr,[x10, #0xc]
008cb9dc	cmp x9,x8
008cb9e0	mov x10,x9
008cb9e4	b.cc 0x008cb9d4
008cb9e8	ldrb w8,[x23, #0x3]
008cb9ec	cbnz w8,0x008cb9f4
008cb9f0	ldr x9,[x20, #0x18]
008cb9f4	ldr x8,[x23, #0x58]
008cb9f8	str x9,[x19, #0x68]
008cb9fc	cbz x8,0x008cba14
008cba00	ldr x8,[x23, #0x50]
008cba04	cbz x8,0x008cba14
008cba08	ldr w8,[x20, #0x2c]
008cba0c	orr w8,w8,#0x4
008cba10	str w8,[x20, #0x2c]
008cba14	mov x0,x19
008cba18	sub x20,x21,x22
008cba1c	bl 0x008be71c
008cba20	ldr x8,[x19, #0x58]
008cba24	ldrh w9,[x19, #0x28]
008cba28	add x8,x8,x20
008cba2c	sub w9,w9,#0x1
008cba30	str x8,[x19, #0x68]
008cba34	strh w9,[x19, #0x28]
008cba38	ldp x20,x19,[sp, #0x40]
008cba3c	ldr x25,[sp, #0x10]
008cba40	ldp x22,x21,[sp, #0x30]
008cba44	ldp x24,x23,[sp, #0x20]
008cba48	ldp x29,x30,[sp], #0x50
008cba4c	ret
