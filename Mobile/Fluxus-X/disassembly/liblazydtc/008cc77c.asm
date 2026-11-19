; FUN_008cc77c @ 008cc77c
008cc77c	sub sp,sp,#0x70
008cc780	stp x29,x30,[sp, #0x20]
008cc784	str x25,[sp, #0x30]
008cc788	stp x24,x23,[sp, #0x40]
008cc78c	stp x22,x21,[sp, #0x50]
008cc790	stp x20,x19,[sp, #0x60]
008cc794	add x29,sp,#0x20
008cc798	mrs x22,tpidr_el0
008cc79c	mov x19,x3
008cc7a0	ldr x8,[x22, #0x28]
008cc7a4	stur x8,[x29, #-0x8]
008cc7a8	ldr w8,[x2, #0xc]
008cc7ac	ldr w9,[x3, #0xc]
008cc7b0	cmp w8,#0x4
008cc7b4	csel x21,x2,xzr,eq
008cc7b8	cmp w9,#0x4
008cc7bc	csel x20,x3,xzr,eq
008cc7c0	cbz x21,0x008cc7f8
008cc7c4	cbz x20,0x008cc7f8
008cc7c8	ldr s0,[x21]
008cc7cc	ldr s1,[x20]
008cc7d0	fmul s0,s0,s1
008cc7d4	str s0,[x1]
008cc7d8	ldr s0,[x21, #0x4]
008cc7dc	ldr s1,[x20, #0x4]
008cc7e0	fmul s0,s0,s1
008cc7e4	str s0,[x1, #0x4]
008cc7e8	ldr s0,[x21, #0x8]
008cc7ec	ldr s1,[x20, #0x8]
008cc7f0	fmul s0,s0,s1
008cc7f4	b 0x008cc8e0
008cc7f8	cbz x21,0x008cc80c
008cc7fc	cmp w9,#0x3
008cc800	b.ne 0x008cc820
008cc804	ldr d0,[x19]
008cc808	b 0x008cc85c
008cc80c	cbz x20,0x008cc918
008cc810	cmp w8,#0x3
008cc814	b.ne 0x008cc880
008cc818	ldr d0,[x2]
008cc81c	b 0x008cc8bc
008cc820	cmp w9,#0x5
008cc824	b.ne 0x008cc918
008cc828	ldr x8,[x19]
008cc82c	mov x20,x0
008cc830	mov x23,x1
008cc834	add x1,sp,#0x10
008cc838	mov x24,x2
008cc83c	add x0,x8,#0x18
008cc840	bl 0x008b93c8
008cc844	mov x2,x24
008cc848	mov x1,x23
008cc84c	mov w8,w0
008cc850	mov x0,x20
008cc854	cbz w8,0x008cc918
008cc858	ldr d0,[sp, #0x10]
008cc85c	fcvt s0,d0
008cc860	ldr s1,[x21]
008cc864	fmul s1,s1,s0
008cc868	str s1,[x1]
008cc86c	ldr s1,[x21, #0x4]
008cc870	fmul s1,s1,s0
008cc874	str s1,[x1, #0x4]
008cc878	ldr s1,[x21, #0x8]
008cc87c	b 0x008cc8dc
008cc880	cmp w8,#0x5
008cc884	b.ne 0x008cc918
008cc888	ldr x8,[x2]
008cc88c	mov x21,x0
008cc890	mov x23,x1
008cc894	add x1,sp,#0x10
008cc898	mov x24,x2
008cc89c	add x0,x8,#0x18
008cc8a0	bl 0x008b93c8
008cc8a4	mov x2,x24
008cc8a8	mov x1,x23
008cc8ac	mov w8,w0
008cc8b0	mov x0,x21
008cc8b4	cbz w8,0x008cc918
008cc8b8	ldr d0,[sp, #0x10]
008cc8bc	fcvt s0,d0
008cc8c0	ldr s1,[x20]
008cc8c4	fmul s1,s1,s0
008cc8c8	str s1,[x1]
008cc8cc	ldr s1,[x20, #0x4]
008cc8d0	fmul s1,s1,s0
008cc8d4	str s1,[x1, #0x4]
008cc8d8	ldr s1,[x20, #0x8]
008cc8dc	fmul s0,s1,s0
008cc8e0	mov w8,#0x4
008cc8e4	str s0,[x1, #0x8]
008cc8e8	str w8,[x1, #0xc]
008cc8ec	ldr x8,[x22, #0x28]
008cc8f0	ldur x9,[x29, #-0x8]
008cc8f4	cmp x8,x9
008cc8f8	b.ne 0x008cca48
008cc8fc	ldp x20,x19,[sp, #0x60]
008cc900	ldr x25,[sp, #0x30]
008cc904	ldp x22,x21,[sp, #0x50]
008cc908	ldp x24,x23,[sp, #0x40]
008cc90c	ldp x29,x30,[sp, #0x20]
008cc910	add sp,sp,#0x70
008cc914	ret
008cc918	ldr w8,[x2, #0xc]
008cc91c	mov x20,x2
008cc920	cmp w8,#0x3
008cc924	b.eq 0x008cc96c
008cc928	cmp w8,#0x5
008cc92c	b.ne 0x008cc9b4
008cc930	ldr x8,[x2]
008cc934	mov x20,x0
008cc938	mov x21,x1
008cc93c	add x1,sp,#0x10
008cc940	mov x23,x2
008cc944	add x0,x8,#0x18
008cc948	bl 0x008b93c8
008cc94c	mov x2,x23
008cc950	mov x1,x21
008cc954	mov w8,w0
008cc958	mov x0,x20
008cc95c	cbz w8,0x008cc9b4
008cc960	ldr d0,[sp, #0x10]
008cc964	add x20,sp,#0x8
008cc968	str d0,[sp, #0x8]
008cc96c	ldr w8,[x19, #0xc]
008cc970	cmp w8,#0x3
008cc974	b.eq 0x008cca08
008cc978	cmp w8,#0x5
008cc97c	b.ne 0x008cc9b4
008cc980	ldr x8,[x19]
008cc984	mov x23,x0
008cc988	mov x24,x1
008cc98c	add x1,sp,#0x10
008cc990	add x21,sp,#0x10
008cc994	mov x25,x2
008cc998	add x0,x8,#0x18
008cc99c	bl 0x008b93c8
008cc9a0	mov x2,x25
008cc9a4	mov x1,x24
008cc9a8	mov w8,w0
008cc9ac	mov x0,x23
008cc9b0	cbnz w8,0x008cca0c
008cc9b4	mov x23,x1
008cc9b8	mov x20,x2
008cc9bc	mov x1,x2
008cc9c0	mov w2,#0xa
008cc9c4	mov x21,x0
008cc9c8	bl 0x008be028
008cc9cc	ldr w8,[x0, #0xc]
008cc9d0	cbnz w8,0x008cc9ec
008cc9d4	mov x0,x21
008cc9d8	mov x1,x19
008cc9dc	mov w2,#0xa
008cc9e0	bl 0x008be028
008cc9e4	ldr w8,[x0, #0xc]
008cc9e8	cbz w8,0x008cca24
008cc9ec	mov x2,x0
008cc9f0	mov x1,x23
008cc9f4	mov x0,x21
008cc9f8	mov x3,x20
008cc9fc	mov x4,x19
008cca00	bl 0x008cb070
008cca04	b 0x008cc8ec
008cca08	mov x21,x19
008cca0c	ldr d0,[x21]
008cca10	ldr d1,[x20]
008cca14	mov w8,#0x3
008cca18	fmul d0,d1,d0
008cca1c	str d0,[x1]
008cca20	b 0x008cc8e8
008cca24	ldr x8,[x22, #0x28]
008cca28	ldur x9,[x29, #-0x8]
008cca2c	cmp x8,x9
008cca30	b.ne 0x008cca48
008cca34	mov x0,x21
008cca38	mov x1,x20
008cca3c	mov x2,x19
008cca40	mov w3,#0xa
008cca44	bl 0x008b3afc
008cca48	bl 0x00c2fec0
