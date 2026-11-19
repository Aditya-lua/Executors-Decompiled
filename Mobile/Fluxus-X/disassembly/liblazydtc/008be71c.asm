; FUN_008be71c @ 008be71c
008be71c	ldrb w8,[x0, #0x5]
008be720	cmp w8,#0x1
008be724	b.ne 0x008be72c
008be728	b 0x008be730
008be72c	b 0x008c37c4
008be730	sub sp,sp,#0xe0
008be734	stp x29,x30,[sp, #0x80]
008be738	stp x28,x27,[sp, #0x90]
008be73c	stp x26,x25,[sp, #0xa0]
008be740	stp x24,x23,[sp, #0xb0]
008be744	stp x22,x21,[sp, #0xc0]
008be748	stp x20,x19,[sp, #0xd0]
008be74c	add x29,sp,#0x80
008be750	mrs x8,tpidr_el0
008be754	mov x19,x0
008be758	str x8,[sp, #0x8]
008be75c	ldr x8,[x8, #0x28]
008be760	stur x8,[x29, #-0x8]
008be764	b 0x008c352c
008be768	ldr x9,[sp, #0x20]
008be76c	ldr d0,[x2]
008be770	ldr d1,[x9,x8]
008be774	fdiv d2,d0,d1
008be778	frintm d2,d2
008be77c	fmsub d0,d2,d1,d0
008be780	mov w8,#0x3
008be784	str d0,[x1]
008be788	str w8,[x1, #0xc]
008be78c	adrp x9,0x8be000
008be790	add x9,x9,#0x79c
008be794	mov x28,x26
008be798	br x9
008be79c	ldr x8,[x19, #0x60]
008be7a0	ldr x8,[x8, #0x668]
008be7a4	cbz x8,0x008be7e4
008be7a8	ldr w8,[x28]
008be7ac	mov w9,#0xbf
008be7b0	and w8,w8,w9
008be7b4	cmp w8,#0x1
008be7b8	b.eq 0x008be7e4
008be7bc	ldr x8,[x19, #0x50]
008be7c0	mov x0,x19
008be7c4	mov x2,xzr
008be7c8	str x28,[x8, #0x20]
008be7cc	ldr x8,[x19, #0x60]
008be7d0	ldr x1,[x8, #0x668]
008be7d4	bl 0x008be474
008be7d8	ldrb w8,[x19, #0x3]
008be7dc	cbnz w8,0x008c3618
008be7e0	ldr x25,[x19, #0x70]
008be7e4	ldrb w8,[x28]
008be7e8	adrp x9,0xc4d000
008be7ec	add x9,x9,#0x278
008be7f0	ldr x9,[x9, x8, LSL #0x3]
008be7f4	br x9
008be7f8	ldr w8,[x28], #0x4
008be7fc	asr w9,w8,#0x10
008be800	lsr x8,x8,#0x8
008be804	scvtf d0,w9
008be808	add x8,x25,w8, UXTB  #0x4
008be80c	mov w9,#0x3
008be810	str w9,[x8, #0xc]
008be814	str d0,[x8]
008be818	b 0x008bfd24
008be81c	ldr w8,[x28], #0x4
008be820	ldr x10,[sp, #0x20]
008be824	asr w9,w8,#0x10
008be828	ubfx x8,x8,#0x8,#0x8
008be82c	ldr q0,[x10,w9, sxtw #4]
008be830	str q0,[x25,x8, lsl #4]
008be834	b 0x008bfd24
008be838	ldr w8,[x28], #0x4
008be83c	ubfx x9,x8,#0x10,#0x8
008be840	ubfx x8,x8,#0x8,#0x8
008be844	ldr q0,[x25,x9, lsl #4]
008be848	str q0,[x25,x8, lsl #4]
008be84c	b 0x008bfd24
008be850	ldr x8,[sp, #0x18]
008be854	add x26,x28,#0x8
008be858	ldp w10,w11,[x28]
008be85c	ldr x1,[x8, #0x10]
008be860	ldrb w8,[x1, #0x4]
008be864	ldr x9,[x1, #0x28]
008be868	and w8,w8,w10, LSR #0x18
008be86c	lsr x10,x10,#0x8
008be870	add x9,x9,x8, LSL #0x5
008be874	add x3,x25,w10, UXTB  #0x4
008be878	ldr x10,[sp, #0x20]
008be87c	ldr w12,[x9, #0x1c]
008be880	add x2,x10,x11, LSL #0x4
008be884	and w12,w12,#0xf
008be888	cmp w12,#0x5
008be88c	b.ne 0x008c2b54
008be890	ldr x10,[x9, #0x10]
008be894	ldr x11,[x2]
008be898	cmp x10,x11
008be89c	b.ne 0x008c2b54
008be8a0	ldr w10,[x9, #0xc]
008be8a4	cbz w10,0x008c2b54
008be8a8	ldrb w10,[x1, #0x7]
008be8ac	cbnz w10,0x008c2b54
008be8b0	ldr q0,[x3]
008be8b4	str q0,[x9]
008be8b8	ldr w8,[x3, #0xc]
008be8bc	adrp x9,0x8be000
008be8c0	add x9,x9,#0x79c
008be8c4	cmp w8,#0x5
008be8c8	b.lt 0x008be794
008be8cc	ldrb w8,[x1, #0x2]
008be8d0	adrp x9,0x8be000
008be8d4	add x9,x9,#0x79c
008be8d8	tbz w8,#0x2,0x008be794
008be8dc	ldr x2,[x3]
008be8e0	adrp x9,0x8be000
008be8e4	add x9,x9,#0x79c
008be8e8	ldrb w8,[x2, #0x2]
008be8ec	tst w8,#0x3
008be8f0	b.ne 0x008c2334
008be8f4	b 0x008be794
008be8f8	ldr w8,[x28], #0x4
008be8fc	ldr x10,[sp, #0x18]
008be900	lsr x9,x8,#0x10
008be904	add x9,x10,w9, UXTB  #0x4
008be908	ldr w10,[x9, #0x2c]
008be90c	add x9,x9,#0x20
008be910	cmp w10,#0xf
008be914	b.ne 0x008be920
008be918	ldr x9,[x9]
008be91c	ldr x9,[x9, #0x8]
008be920	lsr x8,x8,#0x8
008be924	ldr q0,[x9]
008be928	add x8,x25,w8, UXTB  #0x4
008be92c	str q0,[x8]
008be930	b 0x008bfd24
008be934	ldr w8,[x28], #0x4
008be938	ldr x10,[sp, #0x18]
008be93c	mov x26,x28
008be940	lsr x9,x8,#0x10
008be944	lsr x8,x8,#0x8
008be948	add x9,x10,w9, UXTB  #0x4
008be94c	add x8,x25,w8, UXTB  #0x4
008be950	ldr x1,[x9, #0x20]
008be954	ldr q0,[x8]
008be958	ldr x9,[x1, #0x8]
008be95c	str q0,[x9]
008be960	ldr w9,[x8, #0xc]
008be964	cmp w9,#0x5
008be968	adrp x9,0x8be000
008be96c	add x9,x9,#0x79c
008be970	b.lt 0x008be794
008be974	ldrb w10,[x1, #0x2]
008be978	adrp x9,0x8be000
008be97c	add x9,x9,#0x79c
008be980	tbz w10,#0x2,0x008be794
008be984	ldr x2,[x8]
008be988	adrp x9,0x8be000
008be98c	add x9,x9,#0x79c
008be990	ldrb w8,[x2, #0x2]
008be994	tst w8,#0x3
008be998	b.ne 0x008c23e0
008be99c	b 0x008be794
008be9a0	ldr x8,[x19, #0x30]
008be9a4	add x26,x28,#0x4
008be9a8	adrp x9,0x8be000
008be9ac	add x9,x9,#0x79c
008be9b0	cbz x8,0x008be794
008be9b4	ldrb w9,[x28, #0x1]
008be9b8	ldr x8,[x8, #0x8]
008be9bc	add x1,x25,x9, LSL #0x4
008be9c0	adrp x9,0x8be000
008be9c4	add x9,x9,#0x79c
008be9c8	cmp x8,x1
008be9cc	b.cc 0x008be794
008be9d0	b 0x008c2224
008be9d4	ldp w20,w9,[x28]
008be9d8	add x26,x28,#0x8
008be9dc	lsr x8,x20,#0x10
008be9e0	lsr x10,x20,#0x8
008be9e4	add x1,x25,w8, UXTB  #0x4
008be9e8	add x3,x25,w10, UXTB  #0x4
008be9ec	ldr x10,[sp, #0x20]
008be9f0	ldr w8,[x1, #0xc]
008be9f4	add x2,x10,x9, LSL #0x4
008be9f8	cmp w8,#0x6
008be9fc	b.ne 0x008c2c40
008bea00	ldr x22,[x1]
008bea04	ldrb w9,[x22, #0x4]
008bea08	ldr x10,[x22, #0x28]
008bea0c	and w9,w9,w20, LSR #0x18
008bea10	add x10,x10,x9, LSL #0x5
008bea14	ldr w11,[x10, #0x1c]
008bea18	and w11,w11,#0xf
008bea1c	cmp w11,#0x5
008bea20	b.ne 0x008bea8c
008bea24	ldr x11,[x10, #0x10]
008bea28	ldr x12,[x2]
008bea2c	cmp x11,x12
008bea30	b.ne 0x008bea8c
008bea34	ldr w11,[x10, #0xc]
008bea38	cbz w11,0x008bea8c
008bea3c	ldrb w11,[x22, #0x7]
008bea40	cbnz w11,0x008bea8c
008bea44	ldr q0,[x3]
008bea48	str q0,[x10]
008bea4c	ldr w9,[x3, #0xc]
008bea50	cmp w9,#0x5
008bea54	adrp x9,0x8be000
008bea58	add x9,x9,#0x79c
008bea5c	b.lt 0x008be794
008bea60	ldrb w10,[x22, #0x2]
008bea64	adrp x9,0x8be000
008bea68	add x9,x9,#0x79c
008bea6c	tbz w10,#0x2,0x008be794
008bea70	ldr x2,[x3]
008bea74	ldrb w9,[x2, #0x2]
008bea78	tst w9,#0x3
008bea7c	adrp x9,0x8be000
008bea80	add x9,x9,#0x79c
008bea84	b.ne 0x008c23ec
008bea88	b 0x008be794
008bea8c	ldr x10,[x22, #0x10]
008bea90	cbz x10,0x008beaa4
008bea94	ldrb w11,[x10, #0x6]
008bea98	ldr x10,[x19, #0x50]
008bea9c	tbnz w11,#0x1,0x008beaa8
008beaa0	b 0x008c2b90
008beaa4	ldr x10,[x19, #0x50]
008beaa8	ldrb w11,[x22, #0x7]
008beaac	cbnz w11,0x008c2b90
008beab0	str x26,[x10, #0x20]
008beab4	mov x0,x19
008beab8	mov x1,x22
008beabc	ldr x2,[x2]
008beac0	mov x20,x3
008beac4	bl 0x008bce4c
008beac8	ldr w9,[x22, #0x28]
008beacc	sub w9,w0,w9
008bead0	lsr w9,w9,#0x5
008bead4	strb w9,[x28, #0x3]
008bead8	ldr q0,[x20]
008beadc	str q0,[x0]
008beae0	ldr w9,[x20, #0xc]
008beae4	cmp w9,#0x5
008beae8	adrp x9,0x8be000
008beaec	add x9,x9,#0x79c
008beaf0	b.lt 0x008be794
008beaf4	ldrb w10,[x22, #0x2]
008beaf8	adrp x9,0x8be000
008beafc	add x9,x9,#0x79c
008beb00	tbz w10,#0x2,0x008be794
008beb04	ldr x2,[x20]
008beb08	ldrb w8,[x2, #0x2]
008beb0c	tst w8,#0x3
008beb10	b 0x008bea7c
008beb14	ldr w9,[x28], #0x4
008beb18	mov x26,x28
008beb1c	lsr x8,x9,#0x10
008beb20	lsr x10,x9,#0x8
008beb24	lsr x9,x9,#0x14
008beb28	add x8,x25,w8, UXTB  #0x4
008beb2c	add x3,x25,w10, UXTB  #0x4
008beb30	and x9,x9,#0xff0
008beb34	add x2,x25,x9
008beb38	ldr w11,[x8, #0xc]
008beb3c	cmp w11,#0x6
008beb40	b.ne 0x008c1e40
008beb44	ldr w9,[x2, #0xc]
008beb48	cmp w9,#0x3
008beb4c	b.ne 0x008c1e40
008beb50	ldr d0,[x2]
008beb54	ldr x1,[x8]
008beb58	fcvtzs w10,d0
008beb5c	ldr w11,[x1, #0x8]
008beb60	sub w9,w10,#0x1
008beb64	cmp w9,w11
008beb68	b.cs 0x008c1e40
008beb6c	ldr x11,[x1, #0x10]
008beb70	cbnz x11,0x008c1e40
008beb74	scvtf d1,w10
008beb78	ldrb w10,[x1, #0x7]
008beb7c	fcmp d0,d1
008beb80	ccmp w10,#0x0,#0x0,eq
008beb84	b.ne 0x008c1e40
008beb88	ldr x8,[x1, #0x20]
008beb8c	ldr q0,[x3]
008beb90	str q0,[x8,w9, uxtw #4]
008beb94	b 0x008be8b8
008beb98	ldr w9,[x28], #0x4
008beb9c	mov x26,x28
008beba0	lsr x8,x9,#0x10
008beba4	lsr x10,x9,#0x8
008beba8	lsr x9,x9,#0x18
008bebac	add x8,x25,w8, UXTB  #0x4
008bebb0	add x3,x25,w10, UXTB  #0x4
008bebb4	ldr w11,[x8, #0xc]
008bebb8	cmp w11,#0x6
008bebbc	b.ne 0x008c1ee0
008bebc0	ldr x1,[x8]
008bebc4	ldr w10,[x1, #0x8]
008bebc8	cmp w9,w10
008bebcc	b.cs 0x008c1ee0
008bebd0	ldr x10,[x1, #0x10]
008bebd4	cbnz x10,0x008c1ee0
008bebd8	ldrb w10,[x1, #0x7]
008bebdc	cbnz w10,0x008c1ee0
008bebe0	ldr x8,[x1, #0x20]
008bebe4	ldr q0,[x3]
008bebe8	str q0,[x8,x9, lsl #4]
008bebec	b 0x008be8b8
008bebf0	ldp w27,w9,[x28]
008bebf4	add x26,x28,#0x8
008bebf8	lsr x8,x27,#0x10
008bebfc	lsr x10,x27,#0x8
008bec00	ubfx x24,x27,#0x8,#0x8
008bec04	add x1,x25,w8, UXTB  #0x4
008bec08	add x3,x25,w10, UXTB  #0x4
008bec0c	ldr x10,[sp, #0x20]
008bec10	ldr w8,[x1, #0xc]
008bec14	add x22,x10,x9, LSL #0x4
008bec18	cmp w8,#0x6
008bec1c	b.ne 0x008bed54
008bec20	ldr x8,[x1]
008bec24	ldr x9,[x22]
008bec28	mov w11,#0xffffffff
008bec2c	ldrb w10,[x8, #0x5]
008bec30	ldr w12,[x9, #0x10]
008bec34	lsl w10,w11,w10
008bec38	ldr x11,[x8, #0x28]
008bec3c	bic w10,w12,w10
008bec40	add x10,x11,x10, LSL #0x5
008bec44	ldr w11,[x10, #0x1c]
008bec48	and w12,w11,#0xf
008bec4c	cmp w12,#0x5
008bec50	b.ne 0x008bec60
008bec54	ldr x12,[x10, #0x10]
008bec58	cmp x12,x9
008bec5c	b.eq 0x008beca8
008bec60	cmp w11,#0xf
008bec64	b.hi 0x008bed00
008bec68	ldr x0,[x8, #0x10]
008bec6c	cbz x0,0x008bed00
008bec70	ldrb w8,[x0, #0x6]
008bec74	tbnz w8,#0x0,0x008bed00
008bec78	ldrb w8,[x0, #0x7]
008bec7c	tbnz w8,#0x1,0x008becb4
008bec80	ldr x8,[x19, #0x60]
008bec84	mov x20,x1
008bec88	mov w1,wzr
008bec8c	mov x21,x3
008bec90	ldr x2,[x8, #0x338]
008bec94	bl 0x008bdfe0
008bec98	mov x1,x20
008bec9c	mov x3,x21
008beca0	cbnz x0,0x008becbc
008beca4	b 0x008bed00
008beca8	ldr w9,[x10, #0xc]
008becac	cbnz w9,0x008c2574
008becb0	b 0x008bec60
008becb4	ldr x8,[x0, #0x20]
008becb8	sub x0,x8,#0x10
008becbc	ldr w8,[x0, #0xc]
008becc0	cmp w8,#0x6
008becc4	b.ne 0x008bed00
008becc8	ldr x9,[x0]
008beccc	ldr x8,[x9, #0x28]
008becd0	cbz x8,0x008bed00
008becd4	ldrb w9,[x9, #0x4]
008becd8	and w9,w9,w27, LSR #0x18
008becdc	add x8,x8,x9, LSL #0x5
008bece0	ldr w9,[x8, #0x1c]
008bece4	and w9,w9,#0xf
008bece8	cmp w9,#0x5
008becec	b.ne 0x008bed00
008becf0	ldr x9,[x8, #0x10]
008becf4	ldr x10,[x22]
008becf8	cmp x9,x10
008becfc	b.eq 0x008bed48
008bed00	ldr q0,[x1]
008bed04	lsr w8,w27,#0x18
008bed08	str q0,[x3, #0x10]
008bed0c	ldr x9,[x19, #0x50]
008bed10	mov x0,x19
008bed14	mov x2,x22
008bed18	str w8,[x19, #0x2c]
008bed1c	str x26,[x9, #0x20]
008bed20	bl 0x008cadd4
008bed24	ldr x25,[x19, #0x70]
008bed28	ldrb w9,[x19, #0x2c]
008bed2c	add x8,x25,x24, LSL #0x4
008bed30	strb w9,[x28, #0x3]
008bed34	ldr w10,[x8, #0xc]
008bed38	adrp x9,0x8be000
008bed3c	add x9,x9,#0x79c
008bed40	cbnz w10,0x008be794
008bed44	b 0x008c36e0
008bed48	ldr w9,[x8, #0xc]
008bed4c	cbnz w9,0x008c2a20
008bed50	b 0x008bed00
008bed54	cmp w8,#0x8
008bed58	b.ne 0x008bed68
008bed5c	ldr x8,[x1]
008bed60	add x8,x8,#0x8
008bed64	b 0x008bed78
008bed68	sxtw x8,w8
008bed6c	ldr x9,[x19, #0x60]
008bed70	add x8,x9,x8, LSL #0x3
008bed74	add x8,x8,#0x448
008bed78	ldr x23,[x8]
008bed7c	cbz x23,0x008bee4c
008bed80	ldrb w8,[x23, #0x6]
008bed84	tbnz w8,#0x3,0x008bedbc
008bed88	ldrb w8,[x23, #0x7]
008bed8c	tbnz w8,#0x1,0x008c30f8
008bed90	ldr x8,[x19, #0x60]
008bed94	mov x0,x23
008bed98	mov x20,x1
008bed9c	mov w1,#0x3
008beda0	mov x21,x3
008beda4	ldr x2,[x8, #0x350]
008beda8	bl 0x008bdfe0
008bedac	mov x1,x20
008bedb0	mov x3,x21
008bedb4	cbnz x0,0x008c3100
008bedb8	ldrb w8,[x23, #0x6]
008bedbc	tbnz w8,#0x0,0x008bee4c
008bedc0	ldrb w8,[x23, #0x7]
008bedc4	tbnz w8,#0x1,0x008bedf4
008bedc8	ldr x8,[x19, #0x60]
008bedcc	mov x0,x23
008bedd0	mov x20,x1
008bedd4	mov w1,wzr
008bedd8	mov x21,x3
008beddc	ldr x2,[x8, #0x338]
008bede0	bl 0x008bdfe0
008bede4	mov x1,x20
008bede8	mov x3,x21
008bedec	cbnz x0,0x008bedfc
008bedf0	b 0x008bee4c
008bedf4	ldr x8,[x23, #0x20]
008bedf8	sub x0,x8,#0x10
008bedfc	ldr w8,[x0, #0xc]
008bee00	cmp w8,#0x6
008bee04	b.ne 0x008bee4c
008bee08	ldr x9,[x0]
008bee0c	ldrb w8,[x9, #0x4]
008bee10	ldr x9,[x9, #0x28]
008bee14	and w8,w8,w27, LSR #0x18
008bee18	add x9,x9,x8, LSL #0x5
008bee1c	ldr w10,[x9, #0x1c]
008bee20	and w10,w10,#0xf
008bee24	cmp w10,#0x5
008bee28	b.ne 0x008bee44
008bee2c	ldr x10,[x9, #0x10]
008bee30	ldr x11,[x22]
008bee34	cmp x10,x11
008bee38	b.ne 0x008bee44
008bee3c	ldr w10,[x9, #0xc]
008bee40	cbnz w10,0x008c319c
008bee44	ldr q0,[x1]
008bee48	b 0x008bed08
008bee4c	adrp x8,0xd1f000
008bee50	ldrb w8,[x8, #0xdd0]
008bee54	cmp w8,#0x1
008bee58	b.ne 0x008bee68
008bee5c	ldr w8,[x1, #0xc]
008bee60	cmp w8,#0xc
008bee64	b.eq 0x008c3384
008bee68	ldr q0,[x1]
008bee6c	mov x0,x19
008bee70	mov x2,x22
008bee74	str q0,[x3, #0x10]
008bee78	ldr x8,[x19, #0x50]
008bee7c	str x26,[x8, #0x20]
008bee80	bl 0x008cadd4
008bee84	ldr x25,[x19, #0x70]
008bee88	add x8,x25,x24, LSL #0x4
008bee8c	b 0x008bed34
008bee90	ldr x8,[x19, #0x60]
008bee94	ldr x9,[x8, #0x688]
008bee98	ldr x8,[x19, #0x50]
008bee9c	cbnz x9,0x008bf088
008beea0	ldr w24,[x28], #0x4
008beea4	ldr x11,[x19, #0x68]
008beea8	mov x26,x28
008beeac	lsr x9,x24,#0x8
008beeb0	ubfx x10,x24,#0x10,#0x8
008beeb4	add x23,x25,w9, UXTB  #0x4
008beeb8	lsr x9,x24,#0x10
008beebc	cmp w10,#0x0
008beec0	add x20,x23,#0x10
008beec4	ldr w12,[x23, #0xc]
008beec8	add x9,x20,w9, UXTB  #0x4
008beecc	sub x9,x9,#0x10
008beed0	csel x21,x11,x9,eq
008beed4	cmp w12,#0x7
008beed8	b.ne 0x008bf0bc
008beedc	ldr x27,[x23]
008beee0	str x26,[x8, #0x20]
008beee4	ldr x8,[x19, #0x50]
008beee8	ldr x9,[x19, #0x18]
008beeec	cmp x8,x9
008beef0	b.eq 0x008bef00
008beef4	add x22,x8,#0x30
008beef8	str x22,[x19, #0x50]
008beefc	b 0x008bef0c
008bef00	mov x0,x19
008bef04	bl 0x008b4200
008bef08	mov x22,x0
008bef0c	ldrb w8,[x27, #0x6]
008bef10	str x23,[x22, #0x8]
008bef14	cbz w8,0x008bef20
008bef18	mov x8,xzr
008bef1c	b 0x008bef54
008bef20	adrp x8,0xd1f000
008bef24	ldrb w9,[x8, #0xdf0]
008bef28	ldr x8,[x27, #0x18]
008bef2c	cmp w9,#0x1
008bef30	b.ne 0x008bef54
008bef34	ldr x9,[x8, #0xd0]
008bef38	cbz x9,0x008bef54
008bef3c	str x9,[x27, #0x18]
008bef40	mov x8,x9
008bef44	ldr x9,[x9, #0xd0]
008bef48	cbnz x9,0x008bef3c
008bef4c	ldrb w9,[x8, #0x5]
008bef50	strb w9,[x27, #0x4]
008bef54	ldrb w9,[x27, #0x4]
008bef58	str x8,[x22]
008bef5c	str xzr,[x22, #0x20]
008bef60	add x8,x21,x9, LSL #0x4
008bef64	lsr w9,w24,#0x18
008bef68	ldr x10,[x19, #0x48]
008bef6c	str x20,[x22, #0x10]
008bef70	str x8,[x22, #0x18]
008bef74	ldrb w8,[x27, #0x4]
008bef78	sub w23,w9,#0x1
008bef7c	sub x9,x10,x21
008bef80	stp w23,wzr,[x22, #0x28]
008bef84	cmp x9,w8, UXTW  #0x4
008bef88	stp x21,x20,[x19, #0x68]
008bef8c	b.gt 0x008befb0
008bef90	ldr w9,[x19, #0x40]
008bef94	mov x0,x19
008bef98	mov w2,#0x1
008bef9c	lsl w10,w9,#0x1
008befa0	add w11,w9,w8
008befa4	cmp w9,w8
008befa8	csel w1,w11,w10,lt
008befac	bl 0x008b3fdc
008befb0	ldrb w8,[x27, #0x6]
008befb4	cbnz w8,0x008c1de4
008befb8	adrp x8,0xd1f000
008befbc	add x8,x8,#0x4f8
008befc0	ldrb w9,[x8]
008befc4	ldr x8,[x27, #0x18]
008befc8	cmp w9,#0x1
008befcc	b.ne 0x008befdc
008befd0	ldr w9,[x8, #0x48]
008befd4	add w9,w9,#0x1
008befd8	str w9,[x8, #0x48]
008befdc	ldp x11,x25,[x19, #0x68]
008befe0	ldrb w9,[x8, #0x7]
008befe4	add x9,x25,x9, LSL #0x4
008befe8	cmp x11,x9
008befec	b.cs 0x008bf074
008beff0	add x10,x11,#0x10
008beff4	mvn x12,x11
008beff8	cmp x9,x10
008beffc	csel x10,x9,x10,hi
008bf000	add x10,x10,x12
008bf004	cmp x10,#0x10
008bf008	b.cc 0x008bf040
008bf00c	lsr x10,x10,#0x4
008bf010	add x12,x10,#0x1
008bf014	and x13,x12,#0x1ffffffffffffffe
008bf018	add x10,x11,x13, LSL #0x4
008bf01c	add x11,x11,#0x1c
008bf020	mov x14,x13
008bf024	subs x14,x14,#0x2
008bf028	stur wzr,[x11, #-0x10]
008bf02c	str wzr,[x11], #0x20
008bf030	b.ne 0x008bf024
008bf034	cmp x12,x13
008bf038	mov x11,x10
008bf03c	b.eq 0x008bf054
008bf040	add x10,x11,#0x10
008bf044	str wzr,[x11, #0xc]
008bf048	cmp x10,x9
008bf04c	mov x11,x10
008bf050	b.cc 0x008bf040
008bf054	ldrb w9,[x8, #0x3]
008bf058	cbz w9,0x008bf080
008bf05c	ldp x8,x28,[x8, #0x28]
008bf060	adrp x9,0x8be000
008bf064	add x9,x9,#0x79c
008bf068	str x10,[x19, #0x68]
008bf06c	stp x27,x8,[sp, #0x18]
008bf070	br x9
008bf074	mov x10,x11
008bf078	ldrb w9,[x8, #0x3]
008bf07c	cbnz w9,0x008bf05c
008bf080	ldr x10,[x22, #0x18]
008bf084	b 0x008bf05c
008bf088	str x28,[x8, #0x20]
008bf08c	mov x0,x19
008bf090	mov w1,#0xffffffff
008bf094	ldr x8,[x19, #0x50]
008bf098	ldr x10,[x8, #0x20]
008bf09c	add x10,x10,#0x4
008bf0a0	str x10,[x8, #0x20]
008bf0a4	blr x9
008bf0a8	ldrb w9,[x19, #0x3]
008bf0ac	ldr x8,[x19, #0x50]
008bf0b0	cbnz w9,0x008c360c
008bf0b4	ldr x25,[x19, #0x70]
008bf0b8	b 0x008beea0
008bf0bc	mov x0,x19
008bf0c0	mov x1,x23
008bf0c4	str x26,[x8, #0x20]
008bf0c8	bl 0x008cda50
008bf0cc	ldr x8,[x19, #0x50]
008bf0d0	add x21,x21,#0x10
008bf0d4	b 0x008beedc
008bf0d8	ldr x8,[x19, #0x60]
008bf0dc	ldr x8,[x8, #0x688]
008bf0e0	cbnz x8,0x008bf2f8
008bf0e4	ldp w27,w24,[x28]
008bf0e8	ldr x10,[x19, #0x68]
008bf0ec	add x26,x28,#0x8
008bf0f0	lsr x8,x27,#0x8
008bf0f4	ubfx x9,x27,#0x10,#0x8
008bf0f8	add x25,x25,w8, UXTB  #0x4
008bf0fc	lsr x8,x27,#0x10
008bf100	cmp w9,#0x0
008bf104	add x20,x25,#0x10
008bf108	ldr w11,[x25, #0xc]
008bf10c	add x8,x20,w8, UXTB  #0x4
008bf110	sub x8,x8,#0x10
008bf114	csel x21,x10,x8,eq
008bf118	cmp w11,#0x7
008bf11c	b.ne 0x008bf32c
008bf120	ldr x8,[x19, #0x50]
008bf124	ldr x22,[x25]
008bf128	str x26,[x8, #0x20]
008bf12c	ldr x8,[x19, #0x50]
008bf130	ldr x9,[x19, #0x18]
008bf134	cmp x8,x9
008bf138	b.eq 0x008bf148
008bf13c	add x23,x8,#0x30
008bf140	str x23,[x19, #0x50]
008bf144	b 0x008bf154
008bf148	mov x0,x19
008bf14c	bl 0x008b4200
008bf150	mov x23,x0
008bf154	ldrb w8,[x22, #0x6]
008bf158	str x25,[x23, #0x8]
008bf15c	cbz w8,0x008bf168
008bf160	mov x8,xzr
008bf164	b 0x008bf19c
008bf168	adrp x8,0xd1f000
008bf16c	ldrb w9,[x8, #0xdf0]
008bf170	ldr x8,[x22, #0x18]
008bf174	cmp w9,#0x1
008bf178	b.ne 0x008bf19c
008bf17c	ldr x9,[x8, #0xd0]
008bf180	cbz x9,0x008bf19c
008bf184	str x9,[x22, #0x18]
008bf188	mov x8,x9
008bf18c	ldr x9,[x9, #0xd0]
008bf190	cbnz x9,0x008bf184
008bf194	ldrb w9,[x8, #0x5]
008bf198	strb w9,[x22, #0x4]
008bf19c	ldrb w9,[x22, #0x4]
008bf1a0	str x8,[x23]
008bf1a4	str xzr,[x23, #0x20]
008bf1a8	add x8,x21,x9, LSL #0x4
008bf1ac	lsr w9,w27,#0x18
008bf1b0	ldr x10,[x19, #0x48]
008bf1b4	str x20,[x23, #0x10]
008bf1b8	str x8,[x23, #0x18]
008bf1bc	ldrb w8,[x22, #0x4]
008bf1c0	sub w25,w9,#0x1
008bf1c4	sub x9,x10,x21
008bf1c8	stp w25,wzr,[x23, #0x28]
008bf1cc	cmp x9,w8, UXTW  #0x4
008bf1d0	stp x21,x20,[x19, #0x68]
008bf1d4	b.gt 0x008bf1f8
008bf1d8	ldr w9,[x19, #0x40]
008bf1dc	mov x0,x19
008bf1e0	mov w2,#0x1
008bf1e4	lsl w10,w9,#0x1
008bf1e8	add w11,w9,w8
008bf1ec	cmp w9,w8
008bf1f0	csel w1,w11,w10,lt
008bf1f4	bl 0x008b3fdc
008bf1f8	ldrb w8,[x22, #0x6]
008bf1fc	cbnz w8,0x008bf358
008bf200	adrp x8,0xd1f000
008bf204	add x8,x8,#0x4f8
008bf208	ldr x20,[x22, #0x18]
008bf20c	ldrb w8,[x8]
008bf210	cmp w8,#0x1
008bf214	b.ne 0x008bf224
008bf218	ldr w8,[x20, #0x48]
008bf21c	add w8,w8,#0x1
008bf220	str w8,[x20, #0x48]
008bf224	cmn w24,#0x1
008bf228	b.eq 0x008bf24c
008bf22c	ldr x1,[sp, #0x18]
008bf230	mov x0,x19
008bf234	mov x2,x22
008bf238	mov w3,w24
008bf23c	bl 0x008b51c8
008bf240	tbnz w0,#0x0,0x008bf24c
008bf244	mov w8,#0xffffffff
008bf248	str w8,[x28, #0x4]
008bf24c	ldp x10,x25,[x19, #0x68]
008bf250	ldrb w8,[x20, #0x7]
008bf254	add x8,x25,x8, LSL #0x4
008bf258	cmp x10,x8
008bf25c	b.cs 0x008bf2e4
008bf260	add x9,x10,#0x10
008bf264	mvn x11,x10
008bf268	cmp x8,x9
008bf26c	csel x9,x8,x9,hi
008bf270	add x9,x9,x11
008bf274	cmp x9,#0x10
008bf278	b.cc 0x008bf2b0
008bf27c	lsr x9,x9,#0x4
008bf280	add x11,x9,#0x1
008bf284	and x12,x11,#0x1ffffffffffffffe
008bf288	add x9,x10,x12, LSL #0x4
008bf28c	add x10,x10,#0x1c
008bf290	mov x13,x12
008bf294	subs x13,x13,#0x2
008bf298	stur wzr,[x10, #-0x10]
008bf29c	str wzr,[x10], #0x20
008bf2a0	b.ne 0x008bf294
008bf2a4	cmp x11,x12
008bf2a8	mov x10,x9
008bf2ac	b.eq 0x008bf2c4
008bf2b0	add x9,x10,#0x10
008bf2b4	str wzr,[x10, #0xc]
008bf2b8	cmp x9,x8
008bf2bc	mov x10,x9
008bf2c0	b.cc 0x008bf2b0
008bf2c4	ldrb w8,[x20, #0x3]
008bf2c8	cbz w8,0x008bf2f0
008bf2cc	ldp x8,x28,[x20, #0x28]
008bf2d0	str x9,[x19, #0x68]
008bf2d4	adrp x9,0x8be000
008bf2d8	add x9,x9,#0x79c
008bf2dc	stp x22,x8,[sp, #0x18]
008bf2e0	br x9
008bf2e4	mov x9,x10
008bf2e8	ldrb w8,[x20, #0x3]
008bf2ec	cbnz w8,0x008bf2cc
008bf2f0	ldr x9,[x23, #0x18]
008bf2f4	b 0x008bf2cc
008bf2f8	ldr x9,[x19, #0x50]
008bf2fc	mov x0,x19
008bf300	mov w1,#0xffffffff
008bf304	str x28,[x9, #0x20]
008bf308	ldr x9,[x19, #0x50]
008bf30c	ldr x10,[x9, #0x20]
008bf310	add x10,x10,#0x4
008bf314	str x10,[x9, #0x20]
008bf318	blr x8
008bf31c	ldrb w8,[x19, #0x3]
008bf320	cbnz w8,0x008c3608
008bf324	ldr x25,[x19, #0x70]
008bf328	b 0x008bf0e4
008bf32c	cmn w24,#0x1
008bf330	b.eq 0x008bf33c
008bf334	mov w8,#0xffffffff
008bf338	str w8,[x28, #0x4]
008bf33c	ldr x8,[x19, #0x50]
008bf340	mov x0,x19
008bf344	mov x1,x25
008bf348	str x26,[x8, #0x20]
008bf34c	bl 0x008cda50
008bf350	add x21,x21,#0x10
008bf354	b 0x008bf120
008bf358	cmn w24,#0x1
008bf35c	b.eq 0x008bf368
008bf360	mov w8,#0xffffffff
008bf364	str w8,[x28, #0x4]
008bf368	ldr x8,[x22, #0x28]
008bf36c	mov x0,x19
008bf370	blr x8
008bf374	tbnz w0,#0x1f,0x008c3618
008bf378	ldr x8,[x19, #0x50]
008bf37c	ldr x10,[x8, #0x8]
008bf380	cbz w25,0x008bf3b0
008bf384	cbz w0,0x008bf3b0
008bf388	ldr x9,[x19, #0x68]
008bf38c	sub x11,x9,w0, UXTW  #0x4
008bf390	add x11,x11,#0x10
008bf394	ldur q0,[x11, #-0x10]
008bf398	subs w25,w25,#0x1
008bf39c	str q0,[x10], #0x10
008bf3a0	b.eq 0x008bf3b0
008bf3a4	cmp x11,x9
008bf3a8	add x11,x11,#0x10
008bf3ac	b.cc 0x008bf394
008bf3b0	cmp w25,#0x1
008bf3b4	b.lt 0x008bf3c4
008bf3b8	b.ne 0x008bf3cc
008bf3bc	mov x9,x10
008bf3c0	b 0x008bf3fc
008bf3c4	mov x9,x10
008bf3c8	b 0x008bf41c
008bf3cc	mov w11,w25
008bf3d0	and x12,x11,#0x7ffffffe
008bf3d4	add x9,x10,x12, LSL #0x4
008bf3d8	sub w25,w25,w12
008bf3dc	add x10,x10,#0x1c
008bf3e0	mov x13,x12
008bf3e4	subs x13,x13,#0x2
008bf3e8	stur wzr,[x10, #-0x10]
008bf3ec	str wzr,[x10], #0x20
008bf3f0	b.ne 0x008bf3e4
008bf3f4	cmp x12,x11
008bf3f8	b.eq 0x008bf41c
008bf3fc	add w10,w25,#0x1
008bf400	mov x11,x9
008bf404	sub w10,w10,#0x1
008bf408	add x9,x11,#0x10
008bf40c	str wzr,[x11, #0xc]
008bf410	cmp w10,#0x1
008bf414	mov x11,x9
008bf418	b.hi 0x008bf404
008bf41c	ldur x25,[x8, #-0x20]
008bf420	lsr w11,w27,#0x18
008bf424	sub x10,x8,#0x30
008bf428	str x10,[x19, #0x50]
008bf42c	str x25,[x19, #0x70]
008bf430	cbz w11,0x008bf438
008bf434	ldur x9,[x8, #-0x18]
008bf438	str x9,[x19, #0x68]
008bf43c	adrp x9,0x8be000
008bf440	add x9,x9,#0x79c
008bf444	mov x28,x26
008bf448	br x9
008bf44c	ldr w20,[x28]
008bf450	ldr w9,[x28, #0x4]!
008bf454	lsr x8,x20,#0x8
008bf458	add x2,x25,x9, LSL #0x4
008bf45c	add x1,x25,w8, UXTB  #0x4
008bf460	ldr w8,[x1, #0xc]
008bf464	cmp w8,#0x3
008bf468	b.ne 0x008c2ba4
008bf46c	ldr w8,[x2, #0xc]
008bf470	cmp w8,#0x3
008bf474	b.ne 0x008c2bd8
008bf478	ldr d0,[x1]
008bf47c	ldr d1,[x2]
008bf480	sbfx x8,x20,#0x10,#0x10
008bf484	fcmp d0,d1
008bf488	csinc x8,x8,xzr,pl
008bf48c	b 0x008c012c
008bf490	ldr w20,[x28], #0x4
008bf494	mov x26,x28
008bf498	lsr x8,x20,#0x10
008bf49c	lsr x9,x20,#0x8
008bf4a0	lsr x10,x20,#0x14
008bf4a4	add x2,x25,w8, UXTB  #0x4
008bf4a8	add x1,x25,w9, UXTB  #0x4
008bf4ac	and x9,x10,#0xff0
008bf4b0	add x3,x25,x9
008bf4b4	ldr w8,[x2, #0xc]
008bf4b8	cmp w8,#0x3
008bf4bc	b.ne 0x008bf4d0
008bf4c0	ldr w8,[x3, #0xc]
008bf4c4	cmp w8,#0x3
008bf4c8	b.eq 0x008c1410
008bf4cc	b 0x008bf534
008bf4d0	cmp w8,#0x4
008bf4d4	b.ne 0x008bf4e8
008bf4d8	ldr w8,[x3, #0xc]
008bf4dc	cmp w8,#0x4
008bf4e0	b.ne 0x008bf534
008bf4e4	b 0x008c2fe0
008bf4e8	cmp w8,#0x8
008bf4ec	b.ne 0x008bf534
008bf4f0	mov x0,x19
008bf4f4	mov x21,x1
008bf4f8	mov x1,x2
008bf4fc	mov x22,x2
008bf500	mov w2,#0x8
008bf504	mov x23,x3
008bf508	bl 0x008be028
008bf50c	mov x3,x23
008bf510	mov x1,x21
008bf514	mov x2,x22
008bf518	cbz x0,0x008bf534
008bf51c	ldr w8,[x0, #0xc]
008bf520	cmp w8,#0x7
008bf524	b.ne 0x008bf534
008bf528	ldr x8,[x0]
008bf52c	ldrb w8,[x8, #0x6]
008bf530	cbnz w8,0x008bf5ec
008bf534	ldr x8,[x19, #0x50]
008bf538	str x26,[x8, #0x20]
008bf53c	mov x0,x19
008bf540	bl 0x008cc36c
008bf544	b 0x008bfef8
008bf548	ldr w20,[x28], #0x4
008bf54c	mov x26,x28
008bf550	lsr x8,x20,#0x10
008bf554	lsr x9,x20,#0x8
008bf558	lsr x10,x20,#0x14
008bf55c	add x2,x25,w8, UXTB  #0x4
008bf560	add x1,x25,w9, UXTB  #0x4
008bf564	and x9,x10,#0xff0
008bf568	add x3,x25,x9
008bf56c	ldr w8,[x2, #0xc]
008bf570	cmp w8,#0x3
008bf574	b.ne 0x008bf588
008bf578	ldr w8,[x3, #0xc]
008bf57c	cmp w8,#0x3
008bf580	b.eq 0x008c13f0
008bf584	b 0x008bf608
008bf588	cmp w8,#0x4
008bf58c	b.ne 0x008bf5a0
008bf590	ldr w8,[x3, #0xc]
008bf594	cmp w8,#0x4
008bf598	b.ne 0x008bf608
008bf59c	b 0x008c2fc4
008bf5a0	cmp w8,#0x8
008bf5a4	b.ne 0x008bf608
008bf5a8	mov x0,x19
008bf5ac	mov x21,x1
008bf5b0	mov x1,x2
008bf5b4	mov x22,x2
008bf5b8	mov w2,#0x9
008bf5bc	mov x23,x3
008bf5c0	bl 0x008be028
008bf5c4	mov x3,x23
008bf5c8	mov x1,x21
008bf5cc	mov x2,x22
008bf5d0	cbz x0,0x008bf608
008bf5d4	ldr w8,[x0, #0xc]
008bf5d8	cmp w8,#0x7
008bf5dc	b.ne 0x008bf608
008bf5e0	ldr x8,[x0]
008bf5e4	ldrb w8,[x8, #0x6]
008bf5e8	cbz w8,0x008bf608
008bf5ec	ldr x8,[x19, #0x68]
008bf5f0	ldr q0,[x0]
008bf5f4	str q0,[x8]
008bf5f8	ldr q0,[x2]
008bf5fc	str q0,[x8, #0x10]
008bf600	ldr q0,[x3]
008bf604	b 0x008bfa28
008bf608	ldr x8,[x19, #0x50]
008bf60c	str x26,[x8, #0x20]
008bf610	mov x0,x19
008bf614	bl 0x008cc574
008bf618	b 0x008bfef8
008bf61c	ldr w20,[x28], #0x4
008bf620	mov x26,x28
008bf624	lsr x8,x20,#0x10
008bf628	lsr x9,x20,#0x8
008bf62c	lsr x10,x20,#0x14
008bf630	add x23,x25,w8, UXTB  #0x4
008bf634	add x22,x25,w9, UXTB  #0x4
008bf638	and x9,x10,#0xff0
008bf63c	add x24,x25,x9
008bf640	ldr w8,[x23, #0xc]
008bf644	cmp w8,#0x3
008bf648	b.ne 0x008bf668
008bf64c	ldr w8,[x24, #0xc]
008bf650	cmp w8,#0x3
008bf654	b.eq 0x008c13cc
008bf658	cmp w8,#0x4
008bf65c	mov x1,x24
008bf660	b.eq 0x008c2f78
008bf664	b 0x008bf68c
008bf668	cmp w8,#0x4
008bf66c	mov x1,x23
008bf670	b.ne 0x008bf68c
008bf674	ldr w8,[x24, #0xc]
008bf678	cmp w8,#0x4
008bf67c	b.eq 0x008c3094
008bf680	cmp w8,#0x3
008bf684	b.eq 0x008c3068
008bf688	b 0x008bf6bc
008bf68c	cmp w8,#0x8
008bf690	b.ne 0x008bf6bc
008bf694	mov x0,x19
008bf698	mov w2,#0xa
008bf69c	bl 0x008be028
008bf6a0	cbz x0,0x008bf6bc
008bf6a4	ldr w8,[x0, #0xc]
008bf6a8	cmp w8,#0x7
008bf6ac	b.ne 0x008bf6bc
008bf6b0	ldr x8,[x0]
008bf6b4	ldrb w8,[x8, #0x6]
008bf6b8	cbnz w8,0x008bf6dc
008bf6bc	ldr x8,[x19, #0x50]
008bf6c0	mov x0,x19
008bf6c4	mov x1,x22
008bf6c8	mov x2,x23
008bf6cc	mov x3,x24
008bf6d0	str x26,[x8, #0x20]
008bf6d4	bl 0x008cc77c
008bf6d8	b 0x008bfef8
008bf6dc	ldr x8,[x19, #0x68]
008bf6e0	ldr q0,[x0]
008bf6e4	str q0,[x8]
008bf6e8	ldr q0,[x23]
008bf6ec	str q0,[x8, #0x10]
008bf6f0	ldr q0,[x24]
008bf6f4	b 0x008bfa28
008bf6f8	ldr w20,[x28], #0x4
008bf6fc	mov x26,x28
008bf700	lsr x8,x20,#0x10
008bf704	lsr x9,x20,#0x8
008bf708	lsr x10,x20,#0x14
008bf70c	add x23,x25,w8, UXTB  #0x4
008bf710	add x22,x25,w9, UXTB  #0x4
008bf714	and x9,x10,#0xff0
008bf718	add x24,x25,x9
008bf71c	ldr w8,[x23, #0xc]
008bf720	cmp w8,#0x3
008bf724	b.ne 0x008bf744
008bf728	ldr w8,[x24, #0xc]
008bf72c	cmp w8,#0x3
008bf730	b.eq 0x008c1400
008bf734	cmp w8,#0x4
008bf738	mov x1,x24
008bf73c	b.eq 0x008c2fa0
008bf740	b 0x008bf768
008bf744	cmp w8,#0x4
008bf748	mov x1,x23
008bf74c	b.ne 0x008bf768
008bf750	ldr w8,[x24, #0xc]
008bf754	cmp w8,#0x4
008bf758	b.eq 0x008c30b0
008bf75c	cmp w8,#0x3
008bf760	b.eq 0x008c30d8
008bf764	b 0x008bf798
008bf768	cmp w8,#0x8
008bf76c	b.ne 0x008bf798
008bf770	mov x0,x19
008bf774	mov w2,#0xb
008bf778	bl 0x008be028
008bf77c	cbz x0,0x008bf798
008bf780	ldr w8,[x0, #0xc]
008bf784	cmp w8,#0x7
008bf788	b.ne 0x008bf798
008bf78c	ldr x8,[x0]
008bf790	ldrb w8,[x8, #0x6]
008bf794	cbnz w8,0x008bf6dc
008bf798	ldr x8,[x19, #0x50]
008bf79c	mov x0,x19
008bf7a0	mov x1,x22
008bf7a4	mov x2,x23
008bf7a8	mov x3,x24
008bf7ac	b 0x008c08b0
008bf7b0	ldr w20,[x28], #0x4
008bf7b4	mov x26,x28
008bf7b8	lsr x8,x20,#0x10
008bf7bc	lsr x9,x20,#0x8
008bf7c0	lsr x10,x20,#0x14
008bf7c4	add x23,x25,w8, UXTB  #0x4
008bf7c8	add x22,x25,w9, UXTB  #0x4
008bf7cc	and x9,x10,#0xff0
008bf7d0	add x24,x25,x9
008bf7d4	ldr w8,[x23, #0xc]
008bf7d8	cmp w8,#0x3
008bf7dc	b.ne 0x008bf7f4
008bf7e0	ldr w8,[x24, #0xc]
008bf7e4	cmp w8,#0x3
008bf7e8	b.eq 0x008c13dc
008bf7ec	mov x1,x24
008bf7f0	b 0x008bf810
008bf7f4	cmp w8,#0x4
008bf7f8	mov x1,x23
008bf7fc	b.ne 0x008bf810
008bf800	ldr w8,[x24, #0xc]
008bf804	cmp w8,#0x3
008bf808	b.eq 0x008c3008
008bf80c	b 0x008bf840
008bf810	cmp w8,#0x8
008bf814	b.ne 0x008bf840
008bf818	mov x0,x19
008bf81c	mov w2,#0xc
008bf820	bl 0x008be028
008bf824	cbz x0,0x008bf840
008bf828	ldr w8,[x0, #0xc]
008bf82c	cmp w8,#0x7
008bf830	b.ne 0x008bf840
008bf834	ldr x8,[x0]
008bf838	ldrb w8,[x8, #0x6]
008bf83c	cbnz w8,0x008bf6dc
008bf840	ldr x8,[x19, #0x50]
008bf844	mov x0,x19
008bf848	mov x1,x22
008bf84c	mov x2,x23
008bf850	mov x3,x24
008bf854	str x26,[x8, #0x20]
008bf858	bl 0x008ccd18
008bf85c	b 0x008bfef8
008bf860	ldr w8,[x28], #0x4
008bf864	mov x26,x28
008bf868	lsr x9,x8,#0x10
008bf86c	add x2,x25,w9, UXTB  #0x4
008bf870	lsr x9,x8,#0x8
008bf874	lsr x8,x8,#0x14
008bf878	ldr w10,[x2, #0xc]
008bf87c	add x1,x25,w9, UXTB  #0x4
008bf880	and x8,x8,#0xff0
008bf884	add x3,x25,x8
008bf888	cmp w10,#0x3
008bf88c	b.ne 0x008bf89c
008bf890	ldr w8,[x3, #0xc]
008bf894	cmp w8,#0x3
008bf898	b.eq 0x008c21dc
008bf89c	ldr x8,[x19, #0x50]
008bf8a0	str x26,[x8, #0x20]
008bf8a4	mov x0,x19
008bf8a8	bl 0x008cd058
008bf8ac	b 0x008bfef8
008bf8b0	ldr w8,[x28], #0x4
008bf8b4	mov x26,x28
008bf8b8	lsr x9,x8,#0x10
008bf8bc	add x2,x25,w9, UXTB  #0x4
008bf8c0	lsr x9,x8,#0x8
008bf8c4	lsr x8,x8,#0x14
008bf8c8	ldr w10,[x2, #0xc]
008bf8cc	add x1,x25,w9, UXTB  #0x4
008bf8d0	and x8,x8,#0xff0
008bf8d4	add x3,x25,x8
008bf8d8	cmp w10,#0x3
008bf8dc	b.ne 0x008bf8ec
008bf8e0	ldr w8,[x3, #0xc]
008bf8e4	cmp w8,#0x3
008bf8e8	b.eq 0x008c21f4
008bf8ec	ldr x8,[x19, #0x50]
008bf8f0	str x26,[x8, #0x20]
008bf8f4	mov x0,x19
008bf8f8	bl 0x008cd244
008bf8fc	b 0x008bfef8
008bf900	ldr w8,[x28], #0x4
008bf904	mov x26,x28
008bf908	lsr x9,x8,#0x10
008bf90c	add x2,x25,w9, UXTB  #0x4
008bf910	lsr x9,x8,#0x8
008bf914	lsr x8,x8,#0x14
008bf918	ldr w10,[x2, #0xc]
008bf91c	add x1,x25,w9, UXTB  #0x4
008bf920	and x8,x8,#0xff0
008bf924	cmp w10,#0x3
008bf928	b.eq 0x008c1e58
008bf92c	ldr x9,[x19, #0x50]
008bf930	str x26,[x9, #0x20]
008bf934	ldr x9,[sp, #0x20]
008bf938	add x3,x9,x8
008bf93c	b 0x008bf53c
008bf940	ldr w8,[x28], #0x4
008bf944	mov x26,x28
008bf948	lsr x9,x8,#0x10
008bf94c	add x2,x25,w9, UXTB  #0x4
008bf950	lsr x9,x8,#0x8
008bf954	lsr x8,x8,#0x14
008bf958	ldr w10,[x2, #0xc]
008bf95c	add x1,x25,w9, UXTB  #0x4
008bf960	and x8,x8,#0xff0
008bf964	cmp w10,#0x3
008bf968	b.eq 0x008c1e98
008bf96c	ldr x9,[x19, #0x50]
008bf970	str x26,[x9, #0x20]
008bf974	ldr x9,[sp, #0x20]
008bf978	add x3,x9,x8
008bf97c	b 0x008bf610
008bf980	ldr w20,[x28], #0x4
008bf984	mov x26,x28
008bf988	lsr x8,x20,#0x10
008bf98c	lsr x9,x20,#0x8
008bf990	lsr x10,x20,#0x14
008bf994	add x22,x25,w8, UXTB  #0x4
008bf998	add x23,x25,w9, UXTB  #0x4
008bf99c	and x21,x10,#0xff0
008bf9a0	ldr w8,[x22, #0xc]
008bf9a4	cmp w8,#0x3
008bf9a8	b.eq 0x008c1388
008bf9ac	cmp w8,#0x4
008bf9b0	b.eq 0x008c2f08
008bf9b4	cmp w8,#0x8
008bf9b8	b.ne 0x008bf9e8
008bf9bc	mov x0,x19
008bf9c0	mov x1,x22
008bf9c4	mov w2,#0xa
008bf9c8	bl 0x008be028
008bf9cc	cbz x0,0x008bf9e8
008bf9d0	ldr w8,[x0, #0xc]
008bf9d4	cmp w8,#0x7
008bf9d8	b.ne 0x008bf9e8
008bf9dc	ldr x8,[x0]
008bf9e0	ldrb w8,[x8, #0x6]
008bf9e4	cbnz w8,0x008bfa0c
008bf9e8	ldr x8,[x19, #0x50]
008bf9ec	mov x0,x19
008bf9f0	mov x1,x23
008bf9f4	mov x2,x22
008bf9f8	str x26,[x8, #0x20]
008bf9fc	ldr x8,[sp, #0x20]
008bfa00	add x3,x8,x21
008bfa04	bl 0x008cc77c
008bfa08	b 0x008bfef8
008bfa0c	ldr x8,[x19, #0x68]
008bfa10	ldr q0,[x0]
008bfa14	str q0,[x8]
008bfa18	ldr q0,[x22]
008bfa1c	ldr x9,[sp, #0x20]
008bfa20	str q0,[x8, #0x10]
008bfa24	ldr q0,[x9,x21]
008bfa28	str q0,[x8, #0x20]
008bfa2c	add x8,x8,#0x30
008bfa30	ubfx x2,x20,#0x8,#0x8
008bfa34	ldr x9,[x19, #0x50]
008bfa38	mov x0,x19
008bfa3c	mov w1,#0x2
008bfa40	str x8,[x19, #0x68]
008bfa44	str x26,[x9, #0x20]
008bfa48	bl 0x008cd928
008bfa4c	b 0x008bfef8
008bfa50	ldr w20,[x28], #0x4
008bfa54	mov x26,x28
008bfa58	lsr x8,x20,#0x10
008bfa5c	lsr x9,x20,#0x8
008bfa60	lsr x10,x20,#0x14
008bfa64	add x22,x25,w8, UXTB  #0x4
008bfa68	add x23,x25,w9, UXTB  #0x4
008bfa6c	and x21,x10,#0xff0
008bfa70	ldr w8,[x22, #0xc]
008bfa74	cmp w8,#0x3
008bfa78	b.eq 0x008c13ac
008bfa7c	cmp w8,#0x4
008bfa80	b.eq 0x008c2eb8
008bfa84	cmp w8,#0x8
008bfa88	b.ne 0x008bfab8
008bfa8c	mov x0,x19
008bfa90	mov x1,x22
008bfa94	mov w2,#0xb
008bfa98	bl 0x008be028
008bfa9c	cbz x0,0x008bfab8
008bfaa0	ldr w8,[x0, #0xc]
008bfaa4	cmp w8,#0x7
008bfaa8	b.ne 0x008bfab8
008bfaac	ldr x8,[x0]
008bfab0	ldrb w8,[x8, #0x6]
008bfab4	cbnz w8,0x008bfa0c
008bfab8	ldr x8,[x19, #0x50]
008bfabc	mov x0,x19
008bfac0	mov x1,x23
008bfac4	mov x2,x22
008bfac8	str x26,[x8, #0x20]
008bfacc	ldr x8,[sp, #0x20]
008bfad0	add x3,x8,x21
008bfad4	bl 0x008cca4c
008bfad8	b 0x008bfef8
008bfadc	ldr w20,[x28], #0x4
008bfae0	mov x26,x28
008bfae4	lsr x8,x20,#0x10
008bfae8	lsr x9,x20,#0x8
008bfaec	lsr x10,x20,#0x14
008bfaf0	add x23,x25,w8, UXTB  #0x4
008bfaf4	add x22,x25,w9, UXTB  #0x4
008bfaf8	and x21,x10,#0xff0
008bfafc	ldr w8,[x23, #0xc]
008bfb00	cmp w8,#0x3
008bfb04	b.eq 0x008c1374
008bfb08	cmp w8,#0x4
008bfb0c	b.eq 0x008c2f6c
008bfb10	cmp w8,#0x8
008bfb14	b.ne 0x008bfb58
008bfb18	mov x0,x19
008bfb1c	mov x1,x23
008bfb20	mov w2,#0xc
008bfb24	bl 0x008be028
008bfb28	cbz x0,0x008bfb58
008bfb2c	ldr w8,[x0, #0xc]
008bfb30	cmp w8,#0x7
008bfb34	b.ne 0x008bfb58
008bfb38	ldr x8,[x0]
008bfb3c	ldrb w8,[x8, #0x6]
008bfb40	cbz w8,0x008bfb58
008bfb44	ldr x8,[x19, #0x68]
008bfb48	ldr q0,[x0]
008bfb4c	str q0,[x8]
008bfb50	ldr q0,[x23]
008bfb54	b 0x008bfa1c
008bfb58	ldr x8,[x19, #0x50]
008bfb5c	mov x0,x19
008bfb60	mov x1,x22
008bfb64	mov x2,x23
008bfb68	str x26,[x8, #0x20]
008bfb6c	ldr x8,[sp, #0x20]
008bfb70	add x3,x8,x21
008bfb74	bl 0x008ccd18
008bfb78	b 0x008bfef8
008bfb7c	ldr w8,[x28], #0x4
008bfb80	mov x26,x28
008bfb84	lsr x9,x8,#0x10
008bfb88	add x2,x25,w9, UXTB  #0x4
008bfb8c	lsr x9,x8,#0x8
008bfb90	lsr x8,x8,#0x14
008bfb94	ldr w10,[x2, #0xc]
008bfb98	add x1,x25,w9, UXTB  #0x4
008bfb9c	and x8,x8,#0xff0
008bfba0	cmp w10,#0x3
008bfba4	b.eq 0x008be768
008bfba8	ldr x9,[x19, #0x50]
008bfbac	str x26,[x9, #0x20]
008bfbb0	ldr x9,[sp, #0x20]
008bfbb4	add x3,x9,x8
008bfbb8	b 0x008bf8a4
008bfbbc	ldr w8,[x28], #0x4
008bfbc0	mov x26,x28
008bfbc4	lsr x9,x8,#0x10
008bfbc8	add x2,x25,w9, UXTB  #0x4
008bfbcc	lsr x9,x8,#0x8
008bfbd0	lsr x8,x8,#0x14
008bfbd4	ldr w10,[x2, #0xc]
008bfbd8	add x1,x25,w9, UXTB  #0x4
008bfbdc	and x8,x8,#0xff0
008bfbe0	cmp w10,#0x3
008bfbe4	b.eq 0x008c1e78
008bfbe8	ldr x9,[x19, #0x50]
008bfbec	str x26,[x9, #0x20]
008bfbf0	ldr x9,[sp, #0x20]
008bfbf4	add x3,x9,x8
008bfbf8	b 0x008bf8f4
008bfbfc	ldr w8,[x28], #0x4
008bfc00	lsr x9,x8,#0x10
008bfc04	add x9,x25,w9, UXTB  #0x4
008bfc08	ldr w10,[x9, #0xc]
008bfc0c	cbz w10,0x008be920
008bfc10	cmp w10,#0x1
008bfc14	b.ne 0x008bfc20
008bfc18	ldr w10,[x9]
008bfc1c	cbz w10,0x008be920
008bfc20	lsr x9,x8,#0x14
008bfc24	and x9,x9,#0xff0
008bfc28	add x9,x25,x9
008bfc2c	b 0x008be920
008bfc30	ldr w8,[x28], #0x4
008bfc34	lsr x9,x8,#0x10
008bfc38	add x10,x25,w9, UXTB  #0x4
008bfc3c	lsr x9,x8,#0x14
008bfc40	ldr w11,[x10, #0xc]
008bfc44	and x9,x9,#0xff0
008bfc48	add x9,x25,x9
008bfc4c	cbz w11,0x008be920
008bfc50	cmp w11,#0x1
008bfc54	b.ne 0x008bfc60
008bfc58	ldr w11,[x10]
008bfc5c	cbz w11,0x008be920
008bfc60	mov x9,x10
008bfc64	b 0x008be920
008bfc68	ldr w8,[x28], #0x4
008bfc6c	lsr x9,x8,#0x10
008bfc70	add x9,x25,w9, UXTB  #0x4
008bfc74	ldr w10,[x9, #0xc]
008bfc78	cbz w10,0x008be920
008bfc7c	cmp w10,#0x1
008bfc80	b.ne 0x008bfc8c
008bfc84	ldr w10,[x9]
008bfc88	cbz w10,0x008be920
008bfc8c	lsr x9,x8,#0x14
008bfc90	ldr x10,[sp, #0x20]
008bfc94	and x9,x9,#0xff0
008bfc98	add x9,x10,x9
008bfc9c	b 0x008be920
008bfca0	ldr w8,[x28], #0x4
008bfca4	ldr x12,[sp, #0x20]
008bfca8	lsr x9,x8,#0x10
008bfcac	add x10,x25,w9, UXTB  #0x4
008bfcb0	lsr x9,x8,#0x14
008bfcb4	ldr w11,[x10, #0xc]
008bfcb8	and x9,x9,#0xff0
008bfcbc	add x9,x12,x9
008bfcc0	cbnz w11,0x008bfc50
008bfcc4	b 0x008be920
008bfcc8	ldr w20,[x28], #0x4
008bfccc	ldr x8,[x19, #0x50]
008bfcd0	mov x0,x19
008bfcd4	ubfx x21,x20,#0x10,#0x8
008bfcd8	lsr w2,w20,#0x18
008bfcdc	str x28,[x8, #0x20]
008bfce0	sub w8,w2,w21
008bfce4	add w1,w8,#0x1
008bfce8	bl 0x008cc074
008bfcec	ldr x8,[x19, #0x70]
008bfcf0	ubfx x9,x20,#0x8,#0x8
008bfcf4	ldr q0,[x8,x21, lsl #4]
008bfcf8	str q0,[x8,x9, lsl #4]
008bfcfc	ldr x8,[x19, #0x50]
008bfd00	str x28,[x8, #0x20]
008bfd04	ldr x8,[x19, #0x60]
008bfd08	ldp x8,x9,[x8, #0x8]
008bfd0c	cmp x9,x8
008bfd10	b.cc 0x008bfd20
008bfd14	mov x0,x19
008bfd18	mov w1,#0x1
008bfd1c	bl 0x008b52c4
008bfd20	ldr x25,[x19, #0x70]
008bfd24	adrp x9,0x8be000
008bfd28	add x9,x9,#0x79c
008bfd2c	br x9
008bfd30	ldr w8,[x28], #0x4
008bfd34	lsr x9,x8,#0x10
008bfd38	add x10,x25,w9, UXTB  #0x4
008bfd3c	mov w9,#0x1
008bfd40	ldr w11,[x10, #0xc]
008bfd44	cbz w11,0x008bfd60
008bfd48	cmp w11,#0x1
008bfd4c	b.ne 0x008bfd68
008bfd50	ldr w10,[x10]
008bfd54	cmp w10,#0x0
008bfd58	cset w10,eq
008bfd5c	b 0x008bfd6c
008bfd60	mov w10,#0x1
008bfd64	b 0x008bfd6c
008bfd68	mov w10,wzr
008bfd6c	lsr x8,x8,#0x8
008bfd70	add x8,x25,w8, UXTB  #0x4
008bfd74	str w10,[x8]
008bfd78	str w9,[x8, #0xc]
008bfd7c	b 0x008bfd24
008bfd80	ldr w20,[x28], #0x4
008bfd84	mov x26,x28
008bfd88	lsr x8,x20,#0x10
008bfd8c	lsr x9,x20,#0x8
008bfd90	add x22,x25,w8, UXTB  #0x4
008bfd94	add x23,x25,w9, UXTB  #0x4
008bfd98	ldr w8,[x22, #0xc]
008bfd9c	cmp w8,#0x3
008bfda0	b.eq 0x008c1368
008bfda4	cmp w8,#0x4
008bfda8	b.eq 0x008c2f38
008bfdac	cmp w8,#0x8
008bfdb0	b.ne 0x008bfe10
008bfdb4	mov x0,x19
008bfdb8	mov x1,x22
008bfdbc	mov w2,#0xf
008bfdc0	bl 0x008be028
008bfdc4	cbz x0,0x008bfe10
008bfdc8	ldr w8,[x0, #0xc]
008bfdcc	cmp w8,#0x7
008bfdd0	b.ne 0x008bfe10
008bfdd4	ldr x8,[x0]
008bfdd8	ldrb w8,[x8, #0x6]
008bfddc	cbz w8,0x008bfe10
008bfde0	ldr x8,[x19, #0x68]
008bfde4	ldr q0,[x0]
008bfde8	ubfx x2,x20,#0x8,#0x8
008bfdec	mov x0,x19
008bfdf0	mov w1,#0x1
008bfdf4	str q0,[x8]
008bfdf8	ldr q0,[x22]
008bfdfc	str q0,[x8, #0x10]
008bfe00	add x8,x8,#0x20
008bfe04	ldr x9,[x19, #0x50]
008bfe08	str x8,[x19, #0x68]
008bfe0c	b 0x008bfa44
008bfe10	ldr x8,[x19, #0x50]
008bfe14	mov x0,x19
008bfe18	mov x1,x23
008bfe1c	mov x2,x22
008bfe20	mov x3,x22
008bfe24	str x26,[x8, #0x20]
008bfe28	bl 0x008cd428
008bfe2c	b 0x008bfef8
008bfe30	ldr w8,[x28], #0x4
008bfe34	mov x26,x28
008bfe38	lsr x9,x8,#0x10
008bfe3c	add x2,x25,w9, UXTB  #0x4
008bfe40	lsr x9,x8,#0x8
008bfe44	ldr w8,[x2, #0xc]
008bfe48	add x22,x25,w9, UXTB  #0x4
008bfe4c	cmp w8,#0x6
008bfe50	b.ne 0x008bfe80
008bfe54	ldr x0,[x2]
008bfe58	ldr x8,[x0, #0x10]
008bfe5c	cbz x8,0x008c1dcc
008bfe60	ldrb w8,[x8, #0x6]
008bfe64	tbnz w8,#0x6,0x008c1dcc
008bfe68	ldr x8,[x19, #0x50]
008bfe6c	mov x0,x19
008bfe70	mov x1,x22
008bfe74	str x26,[x8, #0x20]
008bfe78	bl 0x008cd618
008bfe7c	b 0x008bfef8
008bfe80	cmp w8,#0x5
008bfe84	b.eq 0x008c2f58
008bfe88	b 0x008bfe68
008bfe8c	ldp w8,w1,[x28]
008bfe90	mov w9,#0xff
008bfe94	mov w12,#0x1
008bfe98	ldr x13,[x19, #0x50]
008bfe9c	add x26,x28,#0x8
008bfea0	mov x0,x19
008bfea4	ands w10,w9,w8, LSR #0x10
008bfea8	lsr x11,x8,#0x8
008bfeac	str x26,[x13, #0x20]
008bfeb0	tst w9,w8, LSR #0x10
008bfeb4	sub w10,w10,#0x1
008bfeb8	add x20,x25,w11, UXTB  #0x4
008bfebc	lsl w10,w12,w10
008bfec0	csel w2,wzr,w10,eq
008bfec4	bl 0x008bae54
008bfec8	str x0,[x20]
008bfecc	mov w8,#0x6
008bfed0	ldr x9,[x19, #0x50]
008bfed4	str w8,[x20, #0xc]
008bfed8	str x26,[x9, #0x20]
008bfedc	ldr x8,[x19, #0x60]
008bfee0	ldp x8,x9,[x8, #0x8]
008bfee4	cmp x9,x8
008bfee8	b.cc 0x008bfef8
008bfeec	mov x0,x19
008bfef0	mov w1,#0x1
008bfef4	bl 0x008b52c4
008bfef8	ldr x25,[x19, #0x70]
008bfefc	adrp x9,0x8be000
008bff00	add x9,x9,#0x79c
008bff04	mov x28,x26
008bff08	br x9
008bff0c	ldr w8,[x28], #0x4
008bff10	ldr x10,[x19, #0x50]
008bff14	mov x0,x19
008bff18	asr w9,w8,#0x10
008bff1c	lsr x8,x8,#0x8
008bff20	str x28,[x10, #0x20]
008bff24	sbfiz x9,x9,#0x4,#0x20
008bff28	add x20,x25,w8, UXTB  #0x4
008bff2c	ldr x8,[sp, #0x20]
008bff30	ldr x1,[x8, x9#0x0]
008bff34	bl 0x008bd16c
008bff38	str x0,[x20]
008bff3c	mov w8,#0x6
008bff40	ldr x9,[x19, #0x50]
008bff44	str w8,[x20, #0xc]
008bff48	str x28,[x9, #0x20]
008bff4c	b 0x008bfd04
008bff50	ldp w8,w21,[x28]
008bff54	lsr x10,x8,#0x10
008bff58	lsr w9,w8,#0x18
008bff5c	add x20,x25,w10, UXTB  #0x4
008bff60	cbnz w9,0x008bff80
008bff64	ldr x9,[x19, #0x68]
008bff68	ldr x10,[x19, #0x50]
008bff6c	sub x9,x9,x20
008bff70	ldr x10,[x10, #0x18]
008bff74	lsr x23,x9,#0x4
008bff78	str x10,[x19, #0x68]
008bff7c	b 0x008bff84
008bff80	sub w23,w9,#0x1
008bff84	lsr x8,x8,#0x8
008bff88	add x8,x25,w8, UXTB  #0x4
008bff8c	ldr w9,[x8, #0xc]
008bff90	cmp w9,#0x6
008bff94	b.ne 0x008c3618
008bff98	ldr x22,[x8]
008bff9c	add w8,w21,w23
008bffa0	add x26,x28,#0x8
008bffa4	sub w2,w8,#0x1
008bffa8	ldr w9,[x22, #0x8]
008bffac	cmp w2,w9
008bffb0	b.le 0x008bffc8
008bffb4	ldr x8,[x19, #0x50]
008bffb8	mov x0,x19
008bffbc	mov x1,x22
008bffc0	str x26,[x8, #0x20]
008bffc4	bl 0x008ba760
008bffc8	cmp w23,#0x1
008bffcc	b.lt 0x008bfff0
008bffd0	ldr x8,[x22, #0x20]
008bffd4	mov w9,w23
008bffd8	sub w10,w21,#0x1
008bffdc	ldr q0,[x20], #0x10
008bffe0	subs x9,x9,#0x1
008bffe4	str q0,[x8,w10, uxtw #4]
008bffe8	add w10,w10,#0x1
008bffec	b.ne 0x008bffdc
008bfff0	ldrb w8,[x22, #0x2]
008bfff4	adrp x9,0x8be000
008bfff8	add x9,x9,#0x79c
008bfffc	tbz w8,#0x2,0x008be794
008c0000	add x2,x22,#0x18
008c0004	mov x0,x19
008c0008	mov x1,x22
008c000c	bl 0x008b63a4
008c0010	adrp x9,0x8be000
008c0014	add x9,x9,#0x79c
008c0018	mov x28,x26
008c001c	br x9
008c0020	ldr w20,[x28], #0x4
008c0024	mov x26,x28
008c0028	lsr x8,x20,#0x8
008c002c	add x22,x25,w8, UXTB  #0x4
008c0030	ldr w8,[x22, #0xc]
008c0034	cmp w8,#0x3
008c0038	b.ne 0x008c0054
008c003c	ldr w8,[x22, #0x1c]
008c0040	cmp w8,#0x3
008c0044	b.ne 0x008c0054
008c0048	ldr w8,[x22, #0x2c]
008c004c	cmp w8,#0x3
008c0050	b.eq 0x008c0070
008c0054	ldr x8,[x19, #0x50]
008c0058	add x2,x22,#0x10
008c005c	add x3,x22,#0x20
008c0060	mov x0,x19
008c0064	mov x1,x22
008c0068	str x26,[x8, #0x20]
008c006c	bl 0x008cd7b4
008c0070	adrp x8,0xd1f000
008c0074	add x8,x8,#0x4f8
008c0078	ldr d0,[x22]
008c007c	ldr d2,[x22, #0x10]
008c0080	ldr d1,[x22, #0x20]
008c0084	ldrb w8,[x8]
008c0088	cmp w8,#0x1
008c008c	b.ne 0x008c0108
008c0090	fcmp d2,#0.0
008c0094	b.le 0x008c00a4
008c0098	fcmp d1,d0
008c009c	b.ls 0x008c00ac
008c00a0	b 0x008c21d0
008c00a4	fcmp d0,d1
008c00a8	b.hi 0x008c21d0
008c00ac	fsub d0,d0,d1
008c00b0	fmov d1,0x3ff0000000000000
008c00b4	adrp x9,0x8be000
008c00b8	add x9,x9,#0x79c
008c00bc	fdiv d0,d0,d2
008c00c0	fadd d0,d0,d1
008c00c4	fcmp d0,#0.0
008c00c8	b.le 0x008be794
008c00cc	ldr x8,[x19, #0x50]
008c00d0	mov w10,#0x3fffffff
008c00d4	fcvtzu w11,d0
008c00d8	mov x28,x26
008c00dc	ldr x8,[x8]
008c00e0	ldr w9,[x8, #0x48]
008c00e4	sub w10,w10,w9
008c00e8	ucvtf d1,w10
008c00ec	fcmp d0,d1
008c00f0	csel w10,w11,w10,mi
008c00f4	add w9,w10,w9
008c00f8	str w9,[x8, #0x48]
008c00fc	adrp x9,0x8be000
008c0100	add x9,x9,#0x79c
008c0104	br x9
008c0108	fcmp d2,#0.0
008c010c	b.le 0x008c0120
008c0110	fcmp d1,d0
008c0114	b.hi 0x008c0128
008c0118	mov x8,xzr
008c011c	b 0x008c012c
008c0120	fcmp d0,d1
008c0124	b.ls 0x008c0118
008c0128	sbfx x8,x20,#0x10,#0x10
008c012c	adrp x9,0x8be000
008c0130	add x9,x9,#0x79c
008c0134	add x28,x28,x8, LSL #0x2
008c0138	br x9
008c013c	ldr x8,[x19, #0x50]
008c0140	ldr x11,[x19, #0x60]
008c0144	ldr x9,[x8]
008c0148	ldr x11,[x11, #0x678]
008c014c	ldr x10,[x9, #0x30]
008c0150	ldr x9,[x9, #0x60]
008c0154	sub x10,x28,x10
008c0158	lsr x10,x10,#0x2
008c015c	ldrb w20,[x9, w10, UXTW ]
008c0160	cbz x11,0x008c0188
008c0164	str x28,[x8, #0x20]
008c0168	mov x0,x19
008c016c	mov x2,xzr
008c0170	ldr x8,[x19, #0x60]
008c0174	ldr x1,[x8, #0x678]
008c0178	bl 0x008be474
008c017c	ldrb w8,[x19, #0x3]
008c0180	cbnz w8,0x008c3618
008c0184	ldr x25,[x19, #0x70]
008c0188	adrp x8,0xc4d000
008c018c	add x8,x8,#0x278
008c0190	ldr x9,[x8, x20, LSL #0x3]
008c0194	br x9
008c0198	ldr x9,[x19, #0x60]
008c019c	ldr x8,[x9, #0x688]
008c01a0	cbnz x8,0x008c0218
008c01a4	ldp x9,x8,[x9, #0x8]
008c01a8	cmp x8,x9
008c01ac	b.cc 0x008c01c8
008c01b0	ldr x8,[x19, #0x50]
008c01b4	mov x0,x19
008c01b8	mov w1,#0x1
008c01bc	str x28,[x8, #0x20]
008c01c0	bl 0x008b52c4
008c01c4	ldr x25,[x19, #0x70]
008c01c8	ldr w8,[x28], #0x4
008c01cc	mov w10,#0x3
008c01d0	lsr x9,x8,#0x8
008c01d4	add x9,x25,w9, UXTB  #0x4
008c01d8	ldr d1,[x9, #0x10]
008c01dc	ldr d0,[x9, #0x20]
008c01e0	str w10,[x9, #0x2c]
008c01e4	fadd d0,d1,d0
008c01e8	fcmp d1,#0.0
008c01ec	ldr d1,[x9]
008c01f0	str d0,[x9, #0x20]
008c01f4	b.le 0x008c0200
008c01f8	fcmp d0,d1
008c01fc	b 0x008c0204
008c0200	fcmp d1,d0
008c0204	adrp x9,0x8be000
008c0208	add x9,x9,#0x79c
008c020c	mov x26,x28
008c0210	b.hi 0x008be794
008c0214	b 0x008c1970
008c0218	ldr x9,[x19, #0x50]
008c021c	mov x0,x19
008c0220	mov w1,#0xffffffff
008c0224	str x28,[x9, #0x20]
008c0228	ldr x9,[x19, #0x50]
008c022c	ldr x10,[x9, #0x20]
008c0230	add x10,x10,#0x4
008c0234	str x10,[x9, #0x20]
008c0238	blr x8
008c023c	ldrb w8,[x19, #0x3]
008c0240	cbnz w8,0x008c3608
008c0244	ldr x25,[x19, #0x70]
008c0248	ldr x9,[x19, #0x60]
008c024c	b 0x008c01a4
008c0250	ldr x9,[x19, #0x60]
008c0254	ldr x8,[x9, #0x688]
008c0258	cbnz x8,0x008c03f8
008c025c	ldp x9,x8,[x9, #0x8]
008c0260	cmp x8,x9
008c0264	b.cc 0x008c0280
008c0268	ldr x8,[x19, #0x50]
008c026c	mov x0,x19
008c0270	mov w1,#0x1
008c0274	str x28,[x8, #0x20]
008c0278	bl 0x008b52c4
008c027c	ldr x25,[x19, #0x70]
008c0280	ldr w23,[x28]
008c0284	mov x22,x28
008c0288	ldr w12,[x22, #0x4]!
008c028c	lsr x8,x23,#0x8
008c0290	ubfx x20,x23,#0x8,#0x8
008c0294	add x8,x25,w8, UXTB  #0x4
008c0298	ldr w9,[x8, #0xc]
008c029c	cbnz w9,0x008c0334
008c02a0	ldr w9,[x8, #0x1c]
008c02a4	cmp w9,#0x6
008c02a8	b.ne 0x008c0334
008c02ac	ldr x9,[x8, #0x10]
008c02b0	ldr x10,[x8, #0x20]
008c02b4	cmp w12,#0x3
008c02b8	ldr w11,[x9, #0x8]
008c02bc	b.ge 0x008c0430
008c02c0	tbnz w12,#0x1f,0x008c03cc
008c02c4	cmp w11,w10
008c02c8	b.ls 0x008c02ec
008c02cc	ldr x12,[x9, #0x20]
008c02d0	add x12,x12,w10, SXTW  #0x4
008c02d4	ldr w13,[x12, #0xc]
008c02d8	cbnz w13,0x008c279c
008c02dc	add w10,w10,#0x1
008c02e0	add x12,x12,#0x10
008c02e4	cmp w11,w10
008c02e8	b.hi 0x008c02d4
008c02ec	ldrb w12,[x9, #0x5]
008c02f0	sub w11,w10,w11
008c02f4	lsr w13,w11,w12
008c02f8	cbnz w13,0x008c03e8
008c02fc	mov w13,w10
008c0300	mov x14,#0x100000000
008c0304	ldr x10,[x9, #0x28]
008c0308	add x9,x14,x13, LSL #0x20
008c030c	sxtw x13,w11
008c0310	add x13,x10,x13, LSL #0x5
008c0314	ldr w14,[x13, #0xc]
008c0318	cbnz w14,0x008c291c
008c031c	add w11,w11,#0x1
008c0320	mov x14,#0x100000000
008c0324	lsr w13,w11,w12
008c0328	add x9,x9,x14
008c032c	cbz w13,0x008c030c
008c0330	b 0x008c03e8
008c0334	adrp x9,0xd1f000
008c0338	add x9,x9,#0x4f8
008c033c	ldrb w9,[x9]
008c0340	cmp w9,#0x1
008c0344	b.ne 0x008c035c
008c0348	ldr x9,[x19, #0x50]
008c034c	ldr x9,[x9]
008c0350	ldr w10,[x9, #0x48]
008c0354	add w10,w10,#0x1
008c0358	str w10,[x9, #0x48]
008c035c	ldp q1,q0,[x8, #0x10]
008c0360	add x9,x8,#0x60
008c0364	ldr q2,[x8]
008c0368	add x1,x8,#0x30
008c036c	and w2,w12,#0xff
008c0370	mov x0,x19
008c0374	stp q1,q0,[x8, #0x40]
008c0378	str q2,[x8, #0x30]
008c037c	ldr x10,[x19, #0x50]
008c0380	str x9,[x19, #0x68]
008c0384	str x22,[x10, #0x20]
008c0388	bl 0x008b4310
008c038c	tbnz w0,#0x0,0x008c3618
008c0390	ldr x25,[x19, #0x70]
008c0394	ldr x8,[x19, #0x50]
008c0398	asr w11,w23,#0x10
008c039c	add x9,x25,x20, LSL #0x4
008c03a0	ldr x8,[x8, #0x18]
008c03a4	ldr w10,[x9, #0x3c]
008c03a8	str x8,[x19, #0x68]
008c03ac	ldr q0,[x9, #0x30]
008c03b0	cmp w10,#0x0
008c03b4	csinc w8,w11,wzr,ne
008c03b8	str q0,[x9, #0x20]
008c03bc	adrp x9,0x8be000
008c03c0	add x9,x9,#0x79c
008c03c4	add x28,x22,w8, SXTW  #0x2
008c03c8	br x9
008c03cc	cmp w11,w10
008c03d0	b.ls 0x008c03e8
008c03d4	ldr x12,[x9, #0x20]
008c03d8	lsl x13,x10,#0x20
008c03dc	add x12,x12,x13, ASR #0x1c
008c03e0	ldr w12,[x12, #0xc]
008c03e4	cbnz w12,0x008c02c4
008c03e8	adrp x9,0x8be000
008c03ec	add x9,x9,#0x79c
008c03f0	add x28,x28,#0x8
008c03f4	br x9
008c03f8	ldr x9,[x19, #0x50]
008c03fc	mov x0,x19
008c0400	mov w1,#0xffffffff
008c0404	str x28,[x9, #0x20]
008c0408	ldr x9,[x19, #0x50]
008c040c	ldr x10,[x9, #0x20]
008c0410	add x10,x10,#0x4
008c0414	str x10,[x9, #0x20]
008c0418	blr x8
008c041c	ldrb w8,[x19, #0x3]
008c0420	cbnz w8,0x008c3608
008c0424	ldr x25,[x19, #0x70]
008c0428	ldr x9,[x19, #0x60]
008c042c	b 0x008c025c
008c0430	sub x14,x12,#0x2
008c0434	cmp x14,#0x2
008c0438	b.cs 0x008c0444
008c043c	mov w13,#0x2
008c0440	b 0x008c0470
008c0444	add x16,x8,#0x3c
008c0448	and x15,x14,#-0x2
008c044c	add x13,x15,#0x2
008c0450	add x16,x16,#0x30
008c0454	mov x17,x15
008c0458	subs x17,x17,#0x2
008c045c	stur wzr,[x16, #-0x10]
008c0460	str wzr,[x16], #0x20
008c0464	b.ne 0x008c0458
008c0468	cmp x14,x15
008c046c	b.eq 0x008c02c0
008c0470	lsl x14,x13,#0x4
008c0474	sub x13,x12,x13
008c0478	add x14,x14,x20, LSL #0x4
008c047c	add x14,x25,x14
008c0480	add x14,x14,#0x3c
008c0484	subs x13,x13,#0x1
008c0488	str wzr,[x14], #0x10
008c048c	b.ne 0x008c0484
008c0490	b 0x008c02c0
008c0494	ldr x8,[x19, #0x50]
008c0498	ldr w20,[x28], #0x4
008c049c	mov x26,x28
008c04a0	ldp x10,x9,[x8]
008c04a4	sub x11,x25,x9
008c04a8	ldrb w10,[x10, #0x7]
008c04ac	ubfx w9,w20,#0x10,#0x8
008c04b0	lsr x11,x11,#0x4
008c04b4	mvn w10,w10
008c04b8	add w22,w11,w10
008c04bc	cbz w9,0x008c2100
008c04c0	sub w8,w9,#0x1
008c04c4	cmp w8,w22
008c04c8	csel w11,w8,w22,lt
008c04cc	cmp w11,#0x1
008c04d0	b.lt 0x008c04f4
008c04d4	lsr x9,x20,#0x8
008c04d8	sub x10,x25,w22, SXTW  #0x4
008c04dc	ubfiz x11,x11,#0x4,#0x20
008c04e0	add x9,x25,w9, UXTB  #0x4
008c04e4	ldr q0,[x10], #0x10
008c04e8	subs x11,x11,#0x10
008c04ec	str q0,[x9], #0x10
008c04f0	b.ne 0x008c04e4
008c04f4	cmp w22,w8
008c04f8	adrp x9,0x8be000
008c04fc	add x9,x9,#0x79c
008c0500	b.ge 0x008be794
008c0504	sxtw x13,w22
008c0508	ubfx w8,w20,#0x10,#0x8
008c050c	ubfx x10,x20,#0x8,#0x8
008c0510	mvn x9,x13
008c0514	mov x11,x13
008c0518	add x9,x9,x8
008c051c	cmp x9,#0x2
008c0520	b.cc 0x008c0560
008c0524	lsl x11,x13,#0x4
008c0528	and x12,x9,#-0x2
008c052c	add x11,x11,x10, LSL #0x4
008c0530	add x14,x25,x11
008c0534	add x11,x12,x13
008c0538	add x13,x14,#0x1c
008c053c	mov x14,x12
008c0540	subs x14,x14,#0x2
008c0544	stur wzr,[x13, #-0x10]
008c0548	str wzr,[x13], #0x20
008c054c	b.ne 0x008c0540
008c0550	cmp x9,x12
008c0554	adrp x9,0x8be000
008c0558	add x9,x9,#0x79c
008c055c	b.eq 0x008be794
008c0560	lsl x9,x11,#0x4
008c0564	mvn x11,x11
008c0568	add x8,x11,x8
008c056c	add x9,x9,x10, LSL #0x4
008c0570	orr x10,x9,#0xc
008c0574	str wzr,[x25, x10#0x0]
008c0578	subs x8,x8,#0x1
008c057c	add x10,x10,#0x10
008c0580	adrp x9,0x8be000
008c0584	add x9,x9,#0x79c
008c0588	b.ne 0x008c0574
008c058c	b 0x008be794
008c0590	ldr w20,[x28], #0x4
008c0594	ldr x9,[x19, #0x50]
008c0598	ldr x10,[sp, #0x20]
008c059c	asr w8,w20,#0x10
008c05a0	sbfiz x8,x8,#0x4,#0x20
008c05a4	ldr x24,[x10, x8#0x0]
008c05a8	str x28,[x9, #0x20]
008c05ac	ldr x9,[sp, #0x18]
008c05b0	ldr x8,[x24, #0x10]
008c05b4	ldr x2,[x9, #0x10]
008c05b8	mov x22,x24
008c05bc	cmp x8,x2
008c05c0	b.eq 0x008c0618
008c05c4	ldrb w8,[x24, #0x6]
008c05c8	cbz w8,0x008c05d4
008c05cc	mov x3,xzr
008c05d0	b 0x008c0608
008c05d4	adrp x8,0xd1f000
008c05d8	ldr x3,[x24, #0x18]
008c05dc	ldrb w8,[x8, #0xdf0]
008c05e0	cmp w8,#0x1
008c05e4	b.ne 0x008c0608
008c05e8	ldr x8,[x3, #0xd0]
008c05ec	cbz x8,0x008c0608
008c05f0	str x8,[x24, #0x18]
008c05f4	mov x3,x8
008c05f8	ldr x8,[x8, #0xd0]
008c05fc	cbnz x8,0x008c05f0
008c0600	ldrb w8,[x3, #0x5]
008c0604	strb w8,[x24, #0x4]
008c0608	ldrb w1,[x24, #0x5]
008c060c	mov x0,x19
008c0610	bl 0x008b4d5c
008c0614	mov x22,x0
008c0618	lsr x8,x20,#0x8
008c061c	mov w9,#0x7
008c0620	add x26,x25,w8, UXTB  #0x4
008c0624	str x22,[x26]
008c0628	ldrb w8,[x24, #0x5]
008c062c	str w9,[x26, #0xc]
008c0630	cbz w8,0x008c0744
008c0634	ldr x8,[sp, #0x18]
008c0638	mov w20,wzr
008c063c	add x27,x8,#0x20
008c0640	b 0x008c0664
008c0644	add x0,x21,#0x20
008c0648	mov x1,x23
008c064c	bl 0x008b9214
008c0650	cbz w0,0x008c06cc
008c0654	ldrb w8,[x24, #0x5]
008c0658	add w20,w20,#0x1
008c065c	cmp w20,w8
008c0660	b.ge 0x008c0748
008c0664	ldr w8,[x28, w20, SXTW #0x2]
008c0668	sxtw x10,w20
008c066c	lsr x9,x8,#0xc
008c0670	tst w8,#0xff00
008c0674	add x21,x22,x10, LSL #0x4
008c0678	and x9,x9,#0xff0
008c067c	add x11,x25,x9
008c0680	add x9,x27,x9
008c0684	csel x23,x11,x9,eq
008c0688	cmp x22,x24
008c068c	b.eq 0x008c0644
008c0690	ldr q0,[x23]
008c0694	str q0,[x21, #0x20]
008c0698	ldr w8,[x23, #0xc]
008c069c	cmp w8,#0x5
008c06a0	b.lt 0x008c0654
008c06a4	ldrb w8,[x22, #0x2]
008c06a8	tbz w8,#0x2,0x008c0654
008c06ac	ldr x2,[x23]
008c06b0	ldrb w8,[x2, #0x2]
008c06b4	tst w8,#0x3
008c06b8	b.eq 0x008c0654
008c06bc	mov x0,x19
008c06c0	mov x1,x22
008c06c4	bl 0x008b6188
008c06c8	b 0x008c0654
008c06cc	ldrb w8,[x24, #0x3]
008c06d0	cbnz w8,0x008c0690
008c06d4	ldr x9,[sp, #0x18]
008c06d8	ldrb w8,[x24, #0x6]
008c06dc	ldr x2,[x9, #0x10]
008c06e0	cbz w8,0x008c06ec
008c06e4	mov x3,xzr
008c06e8	b 0x008c0720
008c06ec	adrp x8,0xd1f000
008c06f0	ldr x3,[x24, #0x18]
008c06f4	ldrb w8,[x8, #0xdf0]
008c06f8	cmp w8,#0x1
008c06fc	b.ne 0x008c0720
008c0700	ldr x8,[x3, #0xd0]
008c0704	cbz x8,0x008c0720
008c0708	str x8,[x24, #0x18]
008c070c	mov x3,x8
008c0710	ldr x8,[x8, #0xd0]
008c0714	cbnz x8,0x008c0708
008c0718	ldrb w8,[x3, #0x5]
008c071c	strb w8,[x24, #0x4]
008c0720	ldrb w1,[x24, #0x5]
008c0724	mov x0,x19
008c0728	bl 0x008b4d5c
008c072c	mov w8,#0x7
008c0730	mov x22,x0
008c0734	str x0,[x26]
008c0738	str w8,[x26, #0xc]
008c073c	mov w20,#0xffffffff
008c0740	b 0x008c0654
008c0744	mov x8,xzr
008c0748	cmp x24,x22
008c074c	strb wzr,[x22, #0x3]
008c0750	b.eq 0x008c012c
008c0754	ldr x8,[x19, #0x50]
008c0758	str x28,[x8, #0x20]
008c075c	ldr x8,[x19, #0x60]
008c0760	ldp x8,x9,[x8, #0x8]
008c0764	cmp x9,x8
008c0768	b.cc 0x008c0778
008c076c	mov x0,x19
008c0770	mov w1,#0x1
008c0774	bl 0x008b52c4
008c0778	ldr x25,[x19, #0x70]
008c077c	ldrb w8,[x24, #0x5]
008c0780	b 0x008c012c
008c0784	ldr w8,[x28, #0x4]
008c0788	ldr x10,[sp, #0x20]
008c078c	ldrb w9,[x28, #0x1]
008c0790	add x28,x28,#0x8
008c0794	ldr q0,[x10,x8, lsl #4]
008c0798	str q0,[x25,x9, lsl #4]
008c079c	adrp x9,0x8be000
008c07a0	add x9,x9,#0x79c
008c07a4	br x9
008c07a8	mov x26,x28
008c07ac	ldr w10,[x26], #0x4
008c07b0	lsr x8,x10,#0x16
008c07b4	and x8,x8,#0x3fc
008c07b8	add x20,x26,x8
008c07bc	ldr w21,[x20]
008c07c0	lsr x9,x21,#0x8
008c07c4	ubfx w8,w21,#0x10,#0x8
008c07c8	add x22,x25,w9, UXTB  #0x4
008c07cc	cbnz w8,0x008c07dc
008c07d0	ldr x8,[x19, #0x68]
008c07d4	sub x8,x8,x22
008c07d8	lsr x8,x8,#0x4
008c07dc	ldr x9,[sp, #0x18]
008c07e0	ldr x9,[x9, #0x10]
008c07e4	ldrb w11,[x9, #0x3]
008c07e8	adrp x9,0x8be000
008c07ec	add x9,x9,#0x79c
008c07f0	cbz w11,0x008be794
008c07f4	ubfx x9,x10,#0x8,#0x8
008c07f8	adrp x10,0xcb4000
008c07fc	lsr w11,w21,#0x18
008c0800	ldr x10,[x10, #0xbc0]
008c0804	ldr x12,[x19, #0x50]
008c0808	sub w5,w8,#0x1
008c080c	sub w3,w11,#0x1
008c0810	add x2,x22,#0x10
008c0814	add x4,x22,#0x20
008c0818	ldr x9,[x10, x9, LSL #0x3]
008c081c	mov x0,x19
008c0820	mov x1,x22
008c0824	str x26,[x12, #0x20]
008c0828	blr x9
008c082c	adrp x9,0x8be000
008c0830	add x9,x9,#0x79c
008c0834	tbnz w0,#0x1f,0x008be794
008c0838	lsr w8,w21,#0x18
008c083c	cbz w8,0x008c0944
008c0840	ldr x8,[x19, #0x50]
008c0844	ldr x8,[x8, #0x18]
008c0848	b 0x008c0948
008c084c	ldr w8,[x28]
008c0850	mov w10,#0x7fffff
008c0854	asr w9,w8,#0x8
008c0858	cmp w9,w10
008c085c	cinc w9,w9,lt
008c0860	bfm w8,w9,#0x18,#0x17
008c0864	str w8,[x28], #0x4
008c0868	b 0x008bfd24
008c086c	ldr w8,[x28], #0x4
008c0870	mov x26,x28
008c0874	lsr x9,x8,#0x14
008c0878	lsr x10,x8,#0x10
008c087c	and x9,x9,#0xff0
008c0880	add x3,x25,x9
008c0884	lsr x9,x8,#0x8
008c0888	ldr w8,[x3, #0xc]
008c088c	add x1,x25,w9, UXTB  #0x4
008c0890	ldr x9,[sp, #0x20]
008c0894	cmp w8,#0x3
008c0898	add x2,x9,w10, UXTB  #0x4
008c089c	b.eq 0x008c139c
008c08a0	cmp w8,#0x4
008c08a4	b.eq 0x008c2ee4
008c08a8	ldr x8,[x19, #0x50]
008c08ac	mov x0,x19
008c08b0	str x26,[x8, #0x20]
008c08b4	bl 0x008cca4c
008c08b8	b 0x008bfef8
008c08bc	ldr x8,[sp, #0x18]
008c08c0	adrp x9,0x8be000
008c08c4	add x9,x9,#0x79c
008c08c8	ldr x8,[x8, #0x10]
008c08cc	ldrb w10,[x8, #0x3]
008c08d0	ldr w8,[x28], #0x4
008c08d4	mov x26,x28
008c08d8	cbz w10,0x008be794
008c08dc	lsr x9,x8,#0x16
008c08e0	adrp x12,0xcb4000
008c08e4	ubfx x10,x8,#0x8,#0x8
008c08e8	ubfx w8,w8,#0x10,#0x8
008c08ec	mov x0,x19
008c08f0	mov x4,xzr
008c08f4	and x9,x9,#0x3fc
008c08f8	mov w5,#0x1
008c08fc	add x20,x28,x9
008c0900	add x2,x25,w8, UXTW  #0x4
008c0904	ldr w9,[x20]
008c0908	ldr x12,[x12, #0xbc0]
008c090c	lsr x11,x9,#0x8
008c0910	lsr w21,w9,#0x18
008c0914	ldr x9,[x19, #0x50]
008c0918	ldr x10,[x12, x10, LSL #0x3]
008c091c	add x22,x25,w11, UXTB  #0x4
008c0920	sub w3,w21,#0x1
008c0924	str x28,[x9, #0x20]
008c0928	mov x1,x22
008c092c	blr x10
008c0930	adrp x9,0x8be000
008c0934	add x9,x9,#0x79c
008c0938	mov x26,x28
008c093c	tbnz w0,#0x1f,0x008be794
008c0940	cbnz w21,0x008c094c
008c0944	add x8,x22,w0, UXTW  #0x4
008c0948	str x8,[x19, #0x68]
008c094c	adrp x9,0x8be000
008c0950	add x9,x9,#0x79c
008c0954	add x28,x20,#0x4
008c0958	br x9
008c095c	ldr x8,[sp, #0x18]
008c0960	mov x26,x28
008c0964	adrp x9,0x8be000
008c0968	add x9,x9,#0x79c
008c096c	ldr x8,[x8, #0x10]
008c0970	ldrb w10,[x8, #0x3]
008c0974	ldr w8,[x26], #0x8
008c0978	cbz w10,0x008be794
008c097c	lsr x9,x8,#0x16
008c0980	adrp x10,0xcb4000
008c0984	ubfx x12,x8,#0x8,#0x8
008c0988	ubfx w8,w8,#0x10,#0x8
008c098c	mov x0,x19
008c0990	mov w5,#0x2
008c0994	and x9,x9,#0x3fc
008c0998	add x20,x26,x9
008c099c	add x2,x25,w8, UXTW  #0x4
008c09a0	ldur w9,[x20, #-0x4]
008c09a4	ldr x10,[x10, #0xbc0]
008c09a8	ldr w13,[x28, #0x4]
008c09ac	ldr x14,[x19, #0x50]
008c09b0	lsr x11,x9,#0x8
008c09b4	lsr w21,w9,#0x18
008c09b8	ldr x9,[x10, x12, LSL #0x3]
008c09bc	add x4,x25,x13, LSL #0x4
008c09c0	str x26,[x14, #0x20]
008c09c4	add x22,x25,w11, UXTB  #0x4
008c09c8	sub w3,w21,#0x1
008c09cc	mov x1,x22
008c09d0	blr x9
008c09d4	adrp x9,0x8be000
008c09d8	add x9,x9,#0x79c
008c09dc	tbnz w0,#0x1f,0x008be794
008c09e0	adrp x9,0x8be000
008c09e4	add x9,x9,#0x79c
008c09e8	mov x26,x20
008c09ec	cbnz w21,0x008be794
008c09f0	add x8,x22,w0, UXTW  #0x4
008c09f4	adrp x9,0x8be000
008c09f8	add x9,x9,#0x79c
008c09fc	mov x28,x20
008c0a00	str x8,[x19, #0x68]
008c0a04	br x9
008c0a08	ldp w8,w3,[x28], #0x8
008c0a0c	ldr x10,[x19, #0x50]
008c0a10	mov x0,x19
008c0a14	lsr x9,x8,#0x8
008c0a18	lsr x8,x8,#0x10
008c0a1c	str x28,[x10, #0x20]
008c0a20	add x1,x25,w9, UXTB  #0x4
008c0a24	add x2,x25,w8, UXTB  #0x4
008c0a28	bl 0x008b30a8
008c0a2c	adrp x9,0x8be000
008c0a30	add x9,x9,#0x79c
008c0a34	br x9
008c0a38	ldr x8,[sp, #0x18]
008c0a3c	mov x26,x28
008c0a40	adrp x9,0x8be000
008c0a44	add x9,x9,#0x79c
008c0a48	ldr x8,[x8, #0x10]
008c0a4c	ldrb w10,[x8, #0x3]
008c0a50	ldr w8,[x26], #0x8
008c0a54	cbz w10,0x008be794
008c0a58	lsr x9,x8,#0x16
008c0a5c	adrp x10,0xcb4000
008c0a60	ubfx x12,x8,#0x8,#0x8
008c0a64	ubfx w8,w8,#0x10,#0x8
008c0a68	mov x0,x19
008c0a6c	mov w5,#0x2
008c0a70	and x9,x9,#0x3fc
008c0a74	add x20,x26,x9
008c0a78	add x2,x25,w8, UXTW  #0x4
008c0a7c	ldur w9,[x20, #-0x4]
008c0a80	ldr x10,[x10, #0xbc0]
008c0a84	ldr w13,[x28, #0x4]
008c0a88	ldr x14,[x19, #0x50]
008c0a8c	lsr x11,x9,#0x8
008c0a90	lsr w21,w9,#0x18
008c0a94	ldr x9,[x10, x12, LSL #0x3]
008c0a98	ldr x10,[sp, #0x20]
008c0a9c	str x26,[x14, #0x20]
008c0aa0	add x22,x25,w11, UXTB  #0x4
008c0aa4	sub w3,w21,#0x1
008c0aa8	add x4,x10,x13, LSL #0x4
008c0aac	b 0x008c09cc
008c0ab0	ldr x8,[sp, #0x18]
008c0ab4	mov x26,x28
008c0ab8	adrp x9,0x8be000
008c0abc	add x9,x9,#0x79c
008c0ac0	ldr x8,[x8, #0x10]
008c0ac4	ldrb w10,[x8, #0x3]
008c0ac8	ldr w8,[x26], #0x8
008c0acc	cbz w10,0x008be794
008c0ad0	lsr x9,x8,#0x16
008c0ad4	adrp x11,0xcb4000
008c0ad8	ubfx x10,x8,#0x8,#0x8
008c0adc	ldr x11,[x11, #0xbc0]
008c0ae0	ldr w12,[x28, #0x4]
008c0ae4	ldr x13,[x19, #0x50]
008c0ae8	and x9,x9,#0x3fc
008c0aec	ubfx w8,w8,#0x10,#0x8
008c0af0	mov x0,x19
008c0af4	add x20,x26,x9
008c0af8	ldr x10,[x11, x10, LSL #0x3]
008c0afc	and x11,x12,#0xff
008c0b00	ldur w9,[x20, #-0x4]
008c0b04	str x26,[x13, #0x20]
008c0b08	add x2,x25,w8, UXTW  #0x4
008c0b0c	ldr x4,[x19, #0x68]
008c0b10	ldr q0,[x25,x11, lsl #4]
008c0b14	ubfx x11,x12,#0x8,#0x8
008c0b18	lsr x12,x9,#0x8
008c0b1c	lsr w21,w9,#0x18
008c0b20	mov w5,#0x3
008c0b24	str q0,[x4]
008c0b28	add x22,x25,w12, UXTB  #0x4
008c0b2c	ldr q0,[x25,x11, lsl #4]
008c0b30	sub w3,w21,#0x1
008c0b34	mov x1,x22
008c0b38	str q0,[x4, #0x10]
008c0b3c	blr x10
008c0b40	b 0x008c09d4
008c0b44	ldr w8,[x28]
008c0b48	ldr w12,[x28, #0x4]!
008c0b4c	ldr x11,[sp, #0x20]
008c0b50	lsr x9,x8,#0x8
008c0b54	and x10,x12,#0xffffff
008c0b58	add x10,x11,x10, LSL #0x4
008c0b5c	add x9,x25,w9, UXTB  #0x4
008c0b60	ldr w11,[x9, #0xc]
008c0b64	cmp w11,#0x3
008c0b68	tbnz w12,#0x1f,0x008c0b84
008c0b6c	b.ne 0x008c0b98
008c0b70	ldr d0,[x9]
008c0b74	ldr d1,[x10]
008c0b78	fcmp d0,d1
008c0b7c	b.eq 0x008c0ba0
008c0b80	b 0x008c0b98
008c0b84	b.ne 0x008c0ba0
008c0b88	ldr d0,[x9]
008c0b8c	ldr d1,[x10]
008c0b90	fcmp d0,d1
008c0b94	b.ne 0x008c0ba0
008c0b98	mov w8,#0x1
008c0b9c	b 0x008c012c
008c0ba0	sbfx x8,x8,#0x10,#0x10
008c0ba4	b 0x008c012c
008c0ba8	ldp w20,w24,[x28]
008c0bac	lsr x8,x20,#0x10
008c0bb0	and x11,x24,#0xffff
008c0bb4	add x8,x25,w8, UXTB  #0x4
008c0bb8	ldr w9,[x8, #0xc]
008c0bbc	cmp w9,#0x8
008c0bc0	b.ne 0x008c0bf0
008c0bc4	ldr x27,[x8]
008c0bc8	mov w9,#0x48
008c0bcc	ldr x10,[x19, #0x60]
008c0bd0	ldrb w22,[x27, #0x3]
008c0bd4	nop
008c0bd8	umaddl x9,w22,w9,x10
008c0bdc	ldr x21,[x9, #0x960]
008c0be0	cbz x21,0x008c0bf0
008c0be4	add x9,x9,#0x930
008c0be8	ldr w10,[x9, #0xc]
008c0bec	cbnz w10,0x008c1420
008c0bf0	and w8,w20,#0xffffff00
008c0bf4	adrp x9,0x8c1000
008c0bf8	add x9,x9,#0x9c4
008c0bfc	orr w8,w8,#0xf
008c0c00	stp w8,w11,[x28]
008c0c04	br x9
008c0c08	ldp w8,w21,[x28]
008c0c0c	lsr x9,x8,#0x10
008c0c10	and x12,x21,#0xffff
008c0c14	add x9,x25,w9, UXTB  #0x4
008c0c18	ldr w10,[x9, #0xc]
008c0c1c	cmp w10,#0x8
008c0c20	b.ne 0x008c0d54
008c0c24	ldr x24,[x9]
008c0c28	mov w10,#0x48
008c0c2c	ldr x11,[x19, #0x60]
008c0c30	ldrb w22,[x24, #0x3]
008c0c34	nop
008c0c38	umaddl x10,w22,w10,x11
008c0c3c	ldr x27,[x10, #0x968]
008c0c40	cbz x27,0x008c0d54
008c0c44	add x11,x10,#0x930
008c0c48	ldr w11,[x11, #0x1c]
008c0c4c	cbz w11,0x008c0d54
008c0c50	add x10,x10,#0x940
008c0c54	ldr x23,[x19, #0x68]
008c0c58	lsr x8,x8,#0x8
008c0c5c	ldr q0,[x10]
008c0c60	add x26,x28,#0x8
008c0c64	str x12,[sp, #0x10]
008c0c68	add x8,x25,w8, UXTB  #0x4
008c0c6c	str q0,[x23]
008c0c70	ldr q0,[x9]
008c0c74	ldr x9,[sp, #0x20]
008c0c78	add x20,x9,w21, UXTH  #0x4
008c0c7c	str q0,[x23, #0x10]
008c0c80	ldr q0,[x20]
008c0c84	str q0,[x23, #0x20]
008c0c88	ldr q0,[x8]
008c0c8c	str q0,[x23, #0x30]
008c0c90	ldr x8,[x19, #0x68]
008c0c94	ldr x9,[x19, #0x50]
008c0c98	add x8,x8,#0x40
008c0c9c	str x8,[x19, #0x68]
008c0ca0	str x26,[x9, #0x20]
008c0ca4	ldrh w8,[x19, #0x28]
008c0ca8	add w8,w8,#0x1
008c0cac	and w9,w8,#0xffff
008c0cb0	strh w8,[x19, #0x28]
008c0cb4	cmp w9,#0xc8
008c0cb8	b.cc 0x008c0cc4
008c0cbc	mov x0,x19
008c0cc0	bl 0x008b42d8
008c0cc4	mov x0,x19
008c0cc8	mov w1,wzr
008c0ccc	mov x2,x23
008c0cd0	bl 0x008be620
008c0cd4	ldr x8,[x20]
008c0cd8	lsr w20,w21,#0x10
008c0cdc	add x1,x24,#0x10
008c0ce0	add x3,sp,#0x30
008c0ce4	mov x0,x19
008c0ce8	mov w4,w22
008c0cec	ldrsh w2,[x8, #0x6]
008c0cf0	strh w20,[sp, #0x30]
008c0cf4	blr x27
008c0cf8	ldrh w8,[sp, #0x30]
008c0cfc	cmp w20,w8
008c0d00	b.eq 0x008c0d1c
008c0d04	ldrb w9,[x28]
008c0d08	cmp w9,#0x54
008c0d0c	b.ne 0x008c0d1c
008c0d10	ldr x9,[sp, #0x10]
008c0d14	orr w8,w9,w8, LSL #0x10
008c0d18	str w8,[x28, #0x4]
008c0d1c	ldr x8,[x19, #0x50]
008c0d20	ldrh w9,[x19, #0x28]
008c0d24	mov x28,x26
008c0d28	ldur q0,[x8, #-0x20]
008c0d2c	sub w9,w9,#0x1
008c0d30	sub x8,x8,#0x30
008c0d34	strh w9,[x19, #0x28]
008c0d38	adrp x9,0x8be000
008c0d3c	add x9,x9,#0x79c
008c0d40	ext v1.16B,v0.16B,v0.16B,0x8
008c0d44	str x8,[x19, #0x50]
008c0d48	fmov x25,d0
008c0d4c	stur q1,[x19, #0x68]
008c0d50	br x9
008c0d54	and w8,w8,#0xffffff00
008c0d58	adrp x9,0x8be000
008c0d5c	add x9,x9,#0x9d4
008c0d60	orr w8,w8,#0x10
008c0d64	stp w8,w12,[x28]
008c0d68	br x9
008c0d6c	ldp w8,w21,[x28]
008c0d70	lsr x9,x8,#0x10
008c0d74	and x12,x21,#0xffff
008c0d78	add x9,x25,w9, UXTB  #0x4
008c0d7c	ldr w10,[x9, #0xc]
008c0d80	cmp w10,#0x8
008c0d84	b.ne 0x008c0db4
008c0d88	ldr x27,[x9]
008c0d8c	mov w10,#0x48
008c0d90	ldr x11,[x19, #0x60]
008c0d94	ldrb w23,[x27, #0x3]
008c0d98	nop
008c0d9c	umaddl x10,w23,w10,x11
008c0da0	ldr x20,[x10, #0x970]
008c0da4	cbz x20,0x008c0db4
008c0da8	add x11,x10,#0x930
008c0dac	ldr w11,[x11, #0x2c]
008c0db0	cbnz w11,0x008c0dcc
008c0db4	mov w9,#0x14
008c0db8	bfxil w8,w9,#0x0,#0x8
008c0dbc	adrp x9,0x8be000
008c0dc0	add x9,x9,#0xbf0
008c0dc4	stp w8,w12,[x28]
008c0dc8	br x9
008c0dcc	lsr x8,x8,#0x8
008c0dd0	ldr q0,[x9]
008c0dd4	mov w9,#0x10
008c0dd8	str x12,[sp, #0x10]
008c0ddc	add x2,x25,w8, UXTB  #0x4
008c0de0	add x8,x10,#0x950
008c0de4	ldr x10,[sp, #0x20]
008c0de8	str q0,[x2, #0x10]
008c0dec	add x25,x10,w21, UXTH  #0x4
008c0df0	ldr q0,[x8]
008c0df4	str q0,[x2]
008c0df8	ldr w24,[x28, #0x8]
008c0dfc	and w8,w24,#0xff
008c0e00	cmp w8,#0x57
008c0e04	mov w8,#0xc
008c0e08	csel x8,x9,x8,eq
008c0e0c	ldr x9,[x19, #0x50]
008c0e10	add x26,x28,x8
008c0e14	ubfx x8,x24,#0x10,#0x8
008c0e18	str x26,[x9, #0x20]
008c0e1c	ldr x9,[x25]
008c0e20	str x9,[x19, #0x8]
008c0e24	cbz w8,0x008c0e38
008c0e28	add x9,x2,#0x10
008c0e2c	add x8,x9,x8, LSL #0x4
008c0e30	sub x8,x8,#0x10
008c0e34	b 0x008c0e3c
008c0e38	ldr x8,[x19, #0x68]
008c0e3c	lsr w9,w24,#0x18
008c0e40	mov x0,x19
008c0e44	str x8,[x19, #0x68]
008c0e48	sub w22,w9,#0x1
008c0e4c	mov w1,w22
008c0e50	bl 0x008be620
008c0e54	ldr x8,[x25]
008c0e58	lsr w21,w21,#0x10
008c0e5c	add x1,x27,#0x10
008c0e60	add x3,sp,#0x2c
008c0e64	mov x0,x19
008c0e68	mov w4,w23
008c0e6c	ldrsh w2,[x8, #0x6]
008c0e70	strh w21,[sp, #0x2c]
008c0e74	blr x20
008c0e78	ldrh w8,[sp, #0x2c]
008c0e7c	cmp w21,w8
008c0e80	b.eq 0x008c0e9c
008c0e84	ldrb w9,[x28]
008c0e88	cmp w9,#0x55
008c0e8c	b.ne 0x008c0e9c
008c0e90	ldr x9,[sp, #0x10]
008c0e94	orr w8,w9,w8, LSL #0x10
008c0e98	str w8,[x28, #0x4]
008c0e9c	tbnz w0,#0x1f,0x008c3618
008c0ea0	ldr x8,[x19, #0x50]
008c0ea4	ldr x10,[x8, #0x8]
008c0ea8	cbz w22,0x008c0ed8
008c0eac	cbz w0,0x008c0ed8
008c0eb0	ldr x9,[x19, #0x68]
008c0eb4	sub x11,x9,w0, UXTW  #0x4
008c0eb8	add x11,x11,#0x10
008c0ebc	ldur q0,[x11, #-0x10]
008c0ec0	subs w22,w22,#0x1
008c0ec4	str q0,[x10], #0x10
008c0ec8	b.eq 0x008c0ed8
008c0ecc	cmp x11,x9
008c0ed0	add x11,x11,#0x10
008c0ed4	b.cc 0x008c0ebc
008c0ed8	cmp w22,#0x1
008c0edc	b.lt 0x008c0eec
008c0ee0	b.ne 0x008c0ef4
008c0ee4	mov x9,x10
008c0ee8	b 0x008c0f24
008c0eec	mov x9,x10
008c0ef0	b 0x008c0f44
008c0ef4	mov w11,w22
008c0ef8	and x12,x11,#0x7ffffffe
008c0efc	add x9,x10,x12, LSL #0x4
008c0f00	sub w22,w22,w12
008c0f04	add x10,x10,#0x1c
008c0f08	mov x13,x12
008c0f0c	subs x13,x13,#0x2
008c0f10	stur wzr,[x10, #-0x10]
008c0f14	str wzr,[x10], #0x20
008c0f18	b.ne 0x008c0f0c
008c0f1c	cmp x12,x11
008c0f20	b.eq 0x008c0f44
008c0f24	add w10,w22,#0x1
008c0f28	mov x11,x9
008c0f2c	sub w10,w10,#0x1
008c0f30	add x9,x11,#0x10
008c0f34	str wzr,[x11, #0xc]
008c0f38	cmp w10,#0x1
008c0f3c	mov x11,x9
008c0f40	b.hi 0x008c0f2c
008c0f44	ldur x25,[x8, #-0x20]
008c0f48	sub x10,x8,#0x30
008c0f4c	lsr w11,w24,#0x18
008c0f50	b 0x008bf428
008c0f54	ldp w8,w2,[x28]
008c0f58	ldr x11,[x19, #0x50]
008c0f5c	add x26,x28,#0x8
008c0f60	lsr x9,x8,#0x8
008c0f64	lsr x10,x8,#0x14
008c0f68	tst w8,#0xff0000
008c0f6c	str x26,[x11, #0x20]
008c0f70	add x9,x25,w9, UXTB  #0x4
008c0f74	and x8,x10,#0xff0
008c0f78	b.eq 0x008c0f9c
008c0f7c	ldr x1,[x9]
008c0f80	add x3,x25,x8
008c0f84	mov x0,x19
008c0f88	bl 0x008b2c3c
008c0f8c	adrp x9,0x8be000
008c0f90	add x9,x9,#0x79c
008c0f94	mov x28,x26
008c0f98	br x9
008c0f9c	lsl x10,x2,#0x4
008c0fa0	ldr x1,[x9]
008c0fa4	ldr x9,[sp, #0x20]
008c0fa8	add x3,x25,x8
008c0fac	mov x0,x19
008c0fb0	ldr x2,[x9, x10#0x0]
008c0fb4	bl 0x008b2a58
008c0fb8	adrp x9,0x8be000
008c0fbc	add x9,x9,#0x79c
008c0fc0	mov x28,x26
008c0fc4	br x9
008c0fc8	ldr w8,[x28]
008c0fcc	add x26,x28,#0x8
008c0fd0	lsr x9,x8,#0x8
008c0fd4	add x9,x25,w9, UXTB  #0x4
008c0fd8	ldr w10,[x9, #0xc]
008c0fdc	cmp w10,#0x7
008c0fe0	b.ne 0x008c100c
008c0fe4	ldr x9,[x9]
008c0fe8	ldrb w10,[x9, #0x6]
008c0fec	cbnz w10,0x008c100c
008c0ff0	ldr x9,[x9, #0x18]
008c0ff4	ldr w10,[x28, #0x4]
008c0ff8	ldr w9,[x9, #0xcc]
008c0ffc	cmp w9,w10
008c1000	adrp x9,0x8be000
008c1004	add x9,x9,#0x79c
008c1008	b.eq 0x008be794
008c100c	asr w8,w8,#0x10
008c1010	adrp x9,0x8be000
008c1014	add x9,x9,#0x79c
008c1018	add x8,x26,w8, SXTW  #0x2
008c101c	sub x28,x8,#0x4
008c1020	br x9
008c1024	ldr w8,[x28], #0x4
008c1028	mov x26,x28
008c102c	lsr x9,x8,#0x14
008c1030	and x9,x9,#0xff0
008c1034	add x3,x25,x9
008c1038	lsr x9,x8,#0x8
008c103c	lsr x8,x8,#0x10
008c1040	ldr w10,[x3, #0xc]
008c1044	add x1,x25,w9, UXTB  #0x4
008c1048	ldr x9,[sp, #0x20]
008c104c	cmp w10,#0x3
008c1050	add x2,x9,w8, UXTB  #0x4
008c1054	b.ne 0x008bf608
008c1058	b 0x008c1e6c
008c105c	ldr w20,[x28]
008c1060	ldr x9,[x19, #0x50]
008c1064	add x26,x28,#0x8
008c1068	ldrb w21,[x28, #0x4]
008c106c	lsr x8,x20,#0x10
008c1070	str x26,[x9, #0x20]
008c1074	add x1,x25,w8, UXTB  #0x4
008c1078	ldr w8,[x1, #0xc]
008c107c	cmp w8,#0xc
008c1080	b.ne 0x008c36bc
008c1084	lsr x8,x20,#0x14
008c1088	ldr x9,[sp, #0x18]
008c108c	and x8,x8,#0xff0
008c1090	add x8,x9,x8
008c1094	ldr w9,[x8, #0x2c]
008c1098	add x8,x8,#0x20
008c109c	cmp w9,#0xf
008c10a0	b.ne 0x008c10b0
008c10a4	ldr x8,[x8]
008c10a8	ldr x8,[x8, #0x8]
008c10ac	ldr w9,[x8, #0xc]
008c10b0	cmp w9,#0xb
008c10b4	b.ne 0x008c3678
008c10b8	ldr x22,[x1]
008c10bc	ldr x23,[x8]
008c10c0	mov x0,x22
008c10c4	mov x1,x23
008c10c8	bl 0x008b3380
008c10cc	tbz w0,#0x0,0x008c3698
008c10d0	lsr x8,x20,#0x8
008c10d4	ldr w9,[x23, #0x64]
008c10d8	ldr x10,[x22, #0x20]
008c10dc	add x8,x25,w8, UXTB  #0x4
008c10e0	add w9,w9,w21
008c10e4	ldr q0,[x8]
008c10e8	str q0,[x10,w9, uxtw #4]
008c10ec	ldr w9,[x8, #0xc]
008c10f0	cmp w9,#0x5
008c10f4	adrp x9,0x8be000
008c10f8	add x9,x9,#0x79c
008c10fc	b.lt 0x008be794
008c1100	ldrb w10,[x22, #0x2]
008c1104	adrp x9,0x8be000
008c1108	add x9,x9,#0x79c
008c110c	tbz w10,#0x2,0x008be794
008c1110	ldr x2,[x8]
008c1114	adrp x9,0x8be000
008c1118	add x9,x9,#0x79c
008c111c	ldrb w8,[x2, #0x2]
008c1120	tst w8,#0x3
008c1124	b.eq 0x008be794
008c1128	mov x0,x19
008c112c	mov x1,x22
008c1130	bl 0x008b6188
008c1134	adrp x9,0x8be000
008c1138	add x9,x9,#0x79c
008c113c	mov x28,x26
008c1140	br x9
008c1144	ldr x8,[x19, #0x60]
008c1148	ldr w20,[x28], #0x4
008c114c	mov x26,x28
008c1150	ldr x8,[x8, #0x688]
008c1154	cbnz x8,0x008c1334
008c1158	lsr x8,x20,#0x16
008c115c	and x8,x8,#0x3fc
008c1160	add x21,x28,x8
008c1164	ldr w27,[x21]
008c1168	lsr x9,x27,#0x8
008c116c	ubfx w8,w27,#0x10,#0x8
008c1170	add x22,x25,w9, UXTB  #0x4
008c1174	ldr x9,[sp, #0x18]
008c1178	cbnz w8,0x008c1188
008c117c	ldr x8,[x19, #0x68]
008c1180	sub x8,x8,x22
008c1184	lsr x8,x8,#0x4
008c1188	ldr x9,[x9, #0x10]
008c118c	ldrb w10,[x9, #0x3]
008c1190	adrp x9,0x8be000
008c1194	add x9,x9,#0x79c
008c1198	cbz w10,0x008be794
008c119c	ldrh w9,[x19, #0x28]
008c11a0	ldrh w10,[x19, #0x2a]
008c11a4	cmp w9,w10
008c11a8	adrp x9,0x8be000
008c11ac	add x9,x9,#0x79c
008c11b0	b.hi 0x008be794
008c11b4	adrp x10,0xcb4000
008c11b8	ubfx w9,w20,#0x8,#0x8
008c11bc	sub w24,w8,#0x1
008c11c0	ldr x10,[x10, #0xbc8]
008c11c4	mov x0,x19
008c11c8	mov x1,x22
008c11cc	mov w2,w24
008c11d0	ldr x9,[x10, w9, UXTW #0x3]
008c11d4	blr x9
008c11d8	adrp x9,0x8be000
008c11dc	add x9,x9,#0x79c
008c11e0	tbnz w0,#0x1f,0x008be794
008c11e4	ldr x8,[x19, #0x50]
008c11e8	add x26,x21,#0x4
008c11ec	add x20,x22,#0x10
008c11f0	mov w23,w0
008c11f4	str x26,[x8, #0x20]
008c11f8	add x8,x20,w24, SXTW  #0x4
008c11fc	ldr x9,[x19, #0x50]
008c1200	ldr x10,[x19, #0x18]
008c1204	str x8,[x19, #0x68]
008c1208	ldr x21,[x22]
008c120c	cmp x9,x10
008c1210	b.eq 0x008c1290
008c1214	add x0,x9,#0x30
008c1218	str x0,[x19, #0x50]
008c121c	b 0x008c129c
008c1220	ldp w8,w10,[x28]
008c1224	ldr x9,[x19, #0x50]
008c1228	add x26,x28,#0x8
008c122c	lsr x11,x8,#0x8
008c1230	str x26,[x9, #0x20]
008c1234	ldr x9,[sp, #0x20]
008c1238	add x20,x25,w11, UXTB  #0x4
008c123c	ldr q0,[x9,x10, lsl #4]
008c1240	ubfx w9,w8,#0x18,#0x1
008c1244	mov w10,#0xff0000
008c1248	str q0,[x20]
008c124c	bics wzr,w10,w8
008c1250	ldr x1,[x20]
008c1254	strb w9,[x1, #0x69]
008c1258	adrp x9,0x8be000
008c125c	add x9,x9,#0x79c
008c1260	b.eq 0x008be794
008c1264	b 0x008c1f44
008c1268	ldr w8,[x28], #0x4
008c126c	mov x26,x28
008c1270	lsr x9,x8,#0x8
008c1274	add x10,x25,w9, UXTB  #0x4
008c1278	ldr w9,[x10, #0xc]
008c127c	cmp w9,#0xc
008c1280	adrp x9,0x8be000
008c1284	add x9,x9,#0x79c
008c1288	b.eq 0x008c1fbc
008c128c	b 0x008be794
008c1290	mov x0,x19
008c1294	bl 0x008b4200
008c1298	ldr x8,[x19, #0x68]
008c129c	ldrb w9,[x21, #0x4]
008c12a0	str w23,[x0, #0x20]
008c12a4	mov w12,#0x12
008c12a8	ldr x10,[x19, #0x48]
008c12ac	ldr x11,[x19, #0x68]
008c12b0	stp xzr,x22,[x0]
008c12b4	add x9,x8,x9, LSL #0x4
008c12b8	lsr w22,w27,#0x18
008c12bc	ldrb w8,[x21, #0x4]
008c12c0	sub x10,x10,x11
008c12c4	stp x20,x9,[x0, #0x10]
008c12c8	sub w20,w22,#0x1
008c12cc	cmp x10,w8, UXTW  #0x4
008c12d0	stp w20,w12,[x0, #0x28]
008c12d4	b.gt 0x008c12f8
008c12d8	ldr w9,[x19, #0x40]
008c12dc	mov x0,x19
008c12e0	mov w2,#0x1
008c12e4	lsl w10,w9,#0x1
008c12e8	add w11,w9,w8
008c12ec	cmp w9,w8
008c12f0	csel w1,w11,w10,lt
008c12f4	bl 0x008b3fdc
008c12f8	ldr x8,[x19, #0x50]
008c12fc	lsr w9,w27,#0x19
008c1300	mov x0,x19
008c1304	ldr x8,[x8, #0x10]
008c1308	cmp w9,#0x0
008c130c	add x1,x8,w23, UXTW  #0x4
008c1310	sub w8,w22,#0x2
008c1314	csel w2,w8,w20,ne
008c1318	bl 0x008c8994
008c131c	cbz w0,0x008c2074
008c1320	cmp w0,#0x1
008c1324	b.ne 0x008c3618
008c1328	mov x0,x19
008c132c	bl 0x008c8d44
008c1330	b 0x008bfef8
008c1334	ldr x9,[x19, #0x50]
008c1338	mov x0,x19
008c133c	mov w1,#0xffffffff
008c1340	str x26,[x9, #0x20]
008c1344	ldr x9,[x19, #0x50]
008c1348	ldr x10,[x9, #0x20]
008c134c	add x10,x10,#0x4
008c1350	str x10,[x9, #0x20]
008c1354	blr x8
008c1358	ldrb w8,[x19, #0x3]
008c135c	cbnz w8,0x008c3608
008c1360	ldr x25,[x19, #0x70]
008c1364	b 0x008c1158
008c1368	ldr d0,[x22]
008c136c	fneg d0,d0
008c1370	b 0x008c13c0
008c1374	ldr x8,[sp, #0x20]
008c1378	ldr d0,[x23]
008c137c	ldr d1,[x8,x21]
008c1380	mov w8,#0x3
008c1384	b 0x008c13e4
008c1388	ldr x8,[sp, #0x20]
008c138c	ldr d0,[x22]
008c1390	ldr d1,[x8,x21]
008c1394	fmul d0,d0,d1
008c1398	b 0x008c13bc
008c139c	ldr d0,[x2]
008c13a0	ldr d1,[x3]
008c13a4	fdiv d0,d0,d1
008c13a8	b 0x008be784
008c13ac	ldr x8,[sp, #0x20]
008c13b0	ldr d0,[x22]
008c13b4	ldr d1,[x8,x21]
008c13b8	fdiv d0,d0,d1
008c13bc	mov w8,#0x3
008c13c0	str d0,[x23]
008c13c4	str w8,[x23, #0xc]
008c13c8	b 0x008be78c
008c13cc	ldr d0,[x23]
008c13d0	ldr d1,[x24]
008c13d4	fmul d0,d0,d1
008c13d8	b 0x008c1dd8
008c13dc	ldr d0,[x23]
008c13e0	ldr d1,[x24]
008c13e4	fdiv d0,d0,d1
008c13e8	frintm d0,d0
008c13ec	b 0x008c1dd8
008c13f0	ldr d0,[x2]
008c13f4	ldr d1,[x3]
008c13f8	fsub d0,d0,d1
008c13fc	b 0x008be784
008c1400	ldr d0,[x23]
008c1404	ldr d1,[x24]
008c1408	fdiv d0,d0,d1
008c140c	b 0x008c1dd8
008c1410	ldr d0,[x2]
008c1414	ldr d1,[x3]
008c1418	fadd d0,d0,d1
008c141c	b 0x008be784
008c1420	ldr x23,[x19, #0x68]
008c1424	ldr q0,[x9]
008c1428	add x26,x28,#0x8
008c142c	str x11,[sp, #0x10]
008c1430	str q0,[x23]
008c1434	ldr q0,[x8]
008c1438	ldr x8,[sp, #0x20]
008c143c	add x25,x8,w24, UXTH  #0x4
008c1440	str q0,[x23, #0x10]
008c1444	ldr q0,[x25]
008c1448	str q0,[x23, #0x20]
008c144c	ldr x8,[x19, #0x68]
008c1450	ldr x9,[x19, #0x50]
008c1454	add x8,x8,#0x30
008c1458	str x8,[x19, #0x68]
008c145c	str x26,[x9, #0x20]
008c1460	ldrh w8,[x19, #0x28]
008c1464	add w8,w8,#0x1
008c1468	and w9,w8,#0xffff
008c146c	strh w8,[x19, #0x28]
008c1470	cmp w9,#0xc8
008c1474	b.cc 0x008c1480
008c1478	mov x0,x19
008c147c	bl 0x008b42d8
008c1480	mov x0,x19
008c1484	mov w1,#0x1
008c1488	mov x2,x23
008c148c	bl 0x008be620
008c1490	ldr x8,[x25]
008c1494	lsr w23,w24,#0x10
008c1498	add x1,x27,#0x10
008c149c	add x3,sp,#0x34
008c14a0	mov x0,x19
008c14a4	mov w4,w22
008c14a8	ldrsh w2,[x8, #0x6]
008c14ac	strh w23,[sp, #0x34]
008c14b0	blr x21
008c14b4	ldrh w8,[sp, #0x34]
008c14b8	cmp w23,w8
008c14bc	b.eq 0x008c14d8
008c14c0	ldrb w9,[x28]
008c14c4	cmp w9,#0x53
008c14c8	b.ne 0x008c14d8
008c14cc	ldr x9,[sp, #0x10]
008c14d0	orr w8,w9,w8, LSL #0x10
008c14d4	str w8,[x28, #0x4]
008c14d8	ldr x8,[x19, #0x50]
008c14dc	ldrh w9,[x19, #0x28]
008c14e0	ldur x25,[x8, #-0x20]
008c14e4	sub w9,w9,#0x1
008c14e8	sub x10,x8,#0x30
008c14ec	strh w9,[x19, #0x28]
008c14f0	ldr x9,[x19, #0x68]
008c14f4	str x10,[x19, #0x50]
008c14f8	ubfx x10,x20,#0x8,#0x8
008c14fc	str x25,[x19, #0x70]
008c1500	ldur q0,[x9, #-0x10]
008c1504	str q0,[x25,x10, lsl #4]
008c1508	ldur x8,[x8, #-0x18]
008c150c	str x8,[x19, #0x68]
008c1510	b 0x008be78c
008c1514	ldr w8,[x28]
008c1518	lsr x9,x8,#0x8
008c151c	add x10,x25,w9, UXTB  #0x4
008c1520	ldr w9,[x28, #0x4]!
008c1524	ldr w11,[x10, #0xc]
008c1528	cmp w11,#0x5
008c152c	b.ne 0x008c1f74
008c1530	and x11,x9,#0xffffff
008c1534	ldr x12,[sp, #0x20]
008c1538	ldr x10,[x10]
008c153c	lsl x11,x11,#0x4
008c1540	ldr x11,[x12, x11#0x0]
008c1544	cmp x10,x11
008c1548	cset w10,eq
008c154c	b 0x008c1f78
008c1550	ldr w9,[x28]
008c1554	ldp x11,x10,[sp, #0x18]
008c1558	asr w8,w9,#0x10
008c155c	lsr x9,x9,#0x8
008c1560	add x8,x10,w8, SXTW  #0x4
008c1564	add x3,x25,w9, UXTB  #0x4
008c1568	ldr w10,[x8, #0xc]
008c156c	cbz w10,0x008c1eb4
008c1570	ldr x9,[x11, #0x10]
008c1574	ldrb w9,[x9, #0x3]
008c1578	cbz w9,0x008c1eb4
008c157c	ldr q0,[x8]
008c1580	str q0,[x3]
008c1584	b 0x008c25a8
008c1588	ldr w24,[x28]
008c158c	mov x23,x28
008c1590	ldr w8,[x23, #0x4]!
008c1594	lsr x9,x24,#0x8
008c1598	add x2,x25,x8, LSL #0x4
008c159c	add x1,x25,w9, UXTB  #0x4
008c15a0	ldr w9,[x2, #0xc]
008c15a4	ldr w8,[x1, #0xc]
008c15a8	cmp w8,w9
008c15ac	b.ne 0x008c25d8
008c15b0	cmp w8,#0x6
008c15b4	b.gt 0x008c2354
008c15b8	cmp w8,#0x2
008c15bc	b.le 0x008c2580
008c15c0	cmp w8,#0x4
008c15c4	b.gt 0x008c26f4
008c15c8	cmp w8,#0x3
008c15cc	b.ne 0x008c27f8
008c15d0	ldr d0,[x1]
008c15d4	ldr d1,[x2]
008c15d8	fcmp d0,d1
008c15dc	b 0x008c2824
008c15e0	ldr x9,[x19, #0x60]
008c15e4	ldr x8,[x9, #0x688]
008c15e8	cbnz x8,0x008c2c98
008c15ec	ldp x9,x8,[x9, #0x8]
008c15f0	cmp x8,x9
008c15f4	b.cc 0x008c1610
008c15f8	ldr x8,[x19, #0x50]
008c15fc	mov x0,x19
008c1600	mov w1,#0x1
008c1604	str x28,[x8, #0x20]
008c1608	bl 0x008b52c4
008c160c	ldr x25,[x19, #0x70]
008c1610	adrp x8,0xd1f000
008c1614	add x8,x8,#0x4f8
008c1618	ldrb w9,[x8]
008c161c	ldr w8,[x28], #0x4
008c1620	cmp w9,#0x1
008c1624	b.ne 0x008c163c
008c1628	ldr x9,[x19, #0x50]
008c162c	ldr x9,[x9]
008c1630	ldr w10,[x9, #0x48]
008c1634	add w10,w10,#0x1
008c1638	str w10,[x9, #0x48]
008c163c	asr w8,w8,#0x10
008c1640	add x26,x28,w8, SXTW  #0x2
008c1644	b 0x008be78c
008c1648	ldr x8,[x19, #0x50]
008c164c	add x26,x28,#0x4
008c1650	ldr x21,[sp, #0x18]
008c1654	ldrb w20,[x28, #0x1]
008c1658	str x26,[x8, #0x20]
008c165c	ldrb w8,[x21, #0x4]
008c1660	ldr x9,[x19, #0x48]
008c1664	ldr x25,[x19, #0x68]
008c1668	add w1,w20,w8
008c166c	sub x9,x9,x25
008c1670	lsl w8,w1,#0x4
008c1674	cmp x9,x8
008c1678	b.gt 0x008c1688
008c167c	mov x0,x19
008c1680	bl 0x008b41e4
008c1684	ldr x25,[x19, #0x68]
008c1688	cbz w20,0x008c16ac
008c168c	ldr x8,[x19, #0x70]
008c1690	mov x9,x25
008c1694	ldr q0,[x8]
008c1698	subs x20,x20,#0x1
008c169c	str q0,[x9], #0x10
008c16a0	str wzr,[x8, #0xc]
008c16a4	add x8,x8,#0x10
008c16a8	b.ne 0x008c1694
008c16ac	ldrb w8,[x21, #0x4]
008c16b0	ldr x9,[x19, #0x50]
008c16b4	add x8,x25,x8, LSL #0x4
008c16b8	stp x25,x8,[x9, #0x10]
008c16bc	stp x8,x25,[x19, #0x68]
008c16c0	b 0x008be78c
008c16c4	ldr x8,[x19, #0x50]
008c16c8	ldr x1,[x8]
008c16cc	ldr x9,[x1, #0x50]
008c16d0	cbnz x9,0x008c3500
008c16d4	mov x0,x19
008c16d8	str x28,[x8, #0x20]
008c16dc	mov x21,x1
008c16e0	bl 0x008c9034
008c16e4	ldr x26,[x21, #0x30]
008c16e8	ldr x8,[x19, #0x50]
008c16ec	ldr x25,[x19, #0x70]
008c16f0	str x26,[x8, #0x20]
008c16f4	ldr x8,[x21, #0x28]
008c16f8	str x8,[sp, #0x20]
008c16fc	b 0x008be78c
008c1700	ldr x9,[x19, #0x60]
008c1704	ldr x8,[x9, #0x688]
008c1708	cbnz x8,0x008c2cd0
008c170c	ldp x9,x8,[x9, #0x8]
008c1710	cmp x8,x9
008c1714	b.cc 0x008c1730
008c1718	ldr x8,[x19, #0x50]
008c171c	mov x0,x19
008c1720	mov w1,#0x1
008c1724	str x28,[x8, #0x20]
008c1728	bl 0x008b52c4
008c172c	ldr x25,[x19, #0x70]
008c1730	ldr w8,[x28]
008c1734	asr w8,w8,#0x8
008c1738	add x8,x28,w8, SXTW  #0x2
008c173c	add x26,x8,#0x4
008c1740	b 0x008be78c
008c1744	ldr x8,[x19, #0x50]
008c1748	ldr w9,[x28], #0x4
008c174c	ldr x23,[sp, #0x18]
008c1750	mov x0,x19
008c1754	ldr x10,[x8]
008c1758	asr w11,w9,#0x10
008c175c	lsr x9,x9,#0x8
008c1760	ldr x10,[x10, #0x38]
008c1764	add x20,x25,w9, UXTB  #0x4
008c1768	ldr x22,[x10, w11, SXTW #0x3]
008c176c	str x28,[x8, #0x20]
008c1770	ldr x2,[x23, #0x10]
008c1774	ldrb w1,[x22, #0x6]
008c1778	mov x3,x22
008c177c	bl 0x008b4d5c
008c1780	str x0,[x20]
008c1784	mov w9,#0x7
008c1788	ldrb w8,[x22, #0x6]
008c178c	str w9,[x20, #0xc]
008c1790	cbz w8,0x008c20d0
008c1794	mov x20,xzr
008c1798	mov x21,xzr
008c179c	add x23,x23,#0x20
008c17a0	add x24,x0,#0x20
008c17a4	b 0x008c17cc
008c17a8	ubfx x8,x8,#0x10,#0x8
008c17ac	ldr q0,[x23,x8, lsl #4]
008c17b0	str q0,[x24]
008c17b4	ldrb w8,[x22, #0x6]
008c17b8	add x21,x21,#0x1
008c17bc	add x24,x24,#0x10
008c17c0	add x20,x20,#0x4
008c17c4	cmp x21,x8
008c17c8	b.cs 0x008c1eac
008c17cc	ldr w8,[x28, x21, LSL #0x2]
008c17d0	ubfx w9,w8,#0x8,#0x8
008c17d4	cmp w9,#0x2
008c17d8	b.eq 0x008c17a8
008c17dc	cmp w9,#0x1
008c17e0	b.ne 0x008c1804
008c17e4	ubfx w8,w8,#0x10,#0x8
008c17e8	mov x0,x19
008c17ec	add x1,x25,w8, UXTW  #0x4
008c17f0	bl 0x008b4ec4
008c17f4	mov w8,#0xf
008c17f8	str x0,[x24]
008c17fc	str w8,[x24, #0xc]
008c1800	b 0x008c17b4
008c1804	ubfx x8,x8,#0x10,#0x8
008c1808	ldr q0,[x25,x8, lsl #4]
008c180c	b 0x008c17b0
008c1810	ldr w8,[x28]
008c1814	ldr w9,[x28, #0x4]!
008c1818	lsr x10,x8,#0x8
008c181c	asr w8,w8,#0x10
008c1820	add x10,x25,w10, UXTB  #0x4
008c1824	ldr w10,[x10, #0xc]
008c1828	sub w10,w10,#0x1
008c182c	eor w9,w10,w9
008c1830	cmp w9,#0x0
008c1834	csinc w8,w8,wzr,lt
008c1838	add x26,x28,w8, SXTW  #0x2
008c183c	b 0x008be78c
008c1840	ldr w20,[x28]
008c1844	ldr w9,[x28, #0x4]!
008c1848	lsr x8,x20,#0x8
008c184c	add x2,x25,x9, LSL #0x4
008c1850	add x1,x25,w8, UXTB  #0x4
008c1854	ldr w8,[x1, #0xc]
008c1858	cmp w8,#0x3
008c185c	b.ne 0x008c2d08
008c1860	ldr w8,[x2, #0xc]
008c1864	cmp w8,#0x3
008c1868	b.ne 0x008c2d3c
008c186c	ldr d0,[x1]
008c1870	ldr d1,[x2]
008c1874	sbfx x8,x20,#0x10,#0x10
008c1878	fcmp d0,d1
008c187c	csinc x8,x8,xzr,mi
008c1880	add x26,x28,x8, LSL #0x2
008c1884	b 0x008be78c
008c1888	ldr w24,[x28], #0x4
008c188c	adrp x9,0xd1f000
008c1890	ldrb w9,[x9, #0xdd0]
008c1894	lsr x8,x24,#0x8
008c1898	ubfx x26,x24,#0x8,#0x8
008c189c	cmp w9,#0x1
008c18a0	add x22,x25,w8, UXTB  #0x4
008c18a4	ldr w8,[x22, #0xc]
008c18a8	b.ne 0x008c1f84
008c18ac	cmp w8,#0x6
008c18b0	b.eq 0x008c23fc
008c18b4	cmp w8,#0x7
008c18b8	b.eq 0x008c2688
008c18bc	cmp w8,#0x8
008c18c0	b.ne 0x008c2440
008c18c4	mov w9,#0x8
008c18c8	b 0x008c2400
008c18cc	ldr w8,[x28], #0x4
008c18d0	ldr x9,[sp, #0x18]
008c18d4	ldr x9,[x9, #0x10]
008c18d8	lsr x10,x8,#0x8
008c18dc	ldrb w9,[x9, #0x3]
008c18e0	add x1,x25,w10, UXTB  #0x4
008c18e4	cbz w9,0x008c1964
008c18e8	ldr w9,[x1, #0x1c]
008c18ec	cmp w9,#0x6
008c18f0	b.ne 0x008c1964
008c18f4	ldr w9,[x1, #0x2c]
008c18f8	cmp w9,#0x3
008c18fc	b.ne 0x008c1964
008c1900	ldr d0,[x1, #0x20]
008c1904	fcmp d0,#0.0
008c1908	b.ne 0x008c1964
008c190c	adrp x9,0xd1f000
008c1910	add x9,x9,#0x4f8
008c1914	ldrb w9,[x9]
008c1918	cmp w9,#0x1
008c191c	b.ne 0x008c255c
008c1920	ldr x9,[x1, #0x10]
008c1924	ldr w9,[x9, #0x8]
008c1928	cmp w9,#0x1
008c192c	b.ge 0x008c2538
008c1930	b 0x008c255c
008c1934	ldr w8,[x28], #0x4
008c1938	ldr x9,[sp, #0x18]
008c193c	ldr x9,[x9, #0x10]
008c1940	lsr x10,x8,#0x8
008c1944	ldrb w9,[x9, #0x3]
008c1948	add x1,x25,w10, UXTB  #0x4
008c194c	cbz w9,0x008c1964
008c1950	ldr w9,[x1, #0x1c]
008c1954	cmp w9,#0x6
008c1958	b.ne 0x008c1964
008c195c	ldr w9,[x1, #0x2c]
008c1960	cbz w9,0x008c2504
008c1964	ldr w9,[x1, #0xc]
008c1968	cmp w9,#0x7
008c196c	b.ne 0x008c364c
008c1970	asr w8,w8,#0x10
008c1974	add x26,x28,w8, SXTW  #0x2
008c1978	b 0x008be78c
008c197c	ldr w20,[x28]
008c1980	ldr w9,[x28, #0x4]!
008c1984	lsr x8,x20,#0x8
008c1988	add x2,x25,x9, LSL #0x4
008c198c	add x1,x25,w8, UXTB  #0x4
008c1990	ldr w8,[x1, #0xc]
008c1994	cmp w8,#0x3
008c1998	b.ne 0x008c2d50
008c199c	ldr w8,[x2, #0xc]
008c19a0	cmp w8,#0x3
008c19a4	b.ne 0x008c2d84
008c19a8	ldr d0,[x1]
008c19ac	ldr d1,[x2]
008c19b0	sbfx x8,x20,#0x10,#0x10
008c19b4	fcmp d0,d1
008c19b8	csinc x8,x8,xzr,ls
008c19bc	add x26,x28,x8, LSL #0x2
008c19c0	b 0x008be78c
008c19c4	ldp w27,w9,[x28]
008c19c8	add x26,x28,#0x8
008c19cc	lsr x8,x27,#0x10
008c19d0	lsr x10,x27,#0x8
008c19d4	add x1,x25,w8, UXTB  #0x4
008c19d8	add x22,x25,w10, UXTB  #0x4
008c19dc	ldr x10,[sp, #0x20]
008c19e0	ldr w8,[x1, #0xc]
008c19e4	add x2,x10,x9, LSL #0x4
008c19e8	cmp w8,#0x6
008c19ec	b.ne 0x008c2da0
008c19f0	ldr x23,[x1]
008c19f4	ldrb w8,[x23, #0x4]
008c19f8	ldr x9,[x23, #0x28]
008c19fc	and w8,w8,w27, LSR #0x18
008c1a00	add x9,x9,x8, LSL #0x5
008c1a04	ldr w10,[x9, #0x1c]
008c1a08	and w10,w10,#0xf
008c1a0c	cmp w10,#0x5
008c1a10	b.ne 0x008c2b70
008c1a14	ldr x10,[x9, #0x10]
008c1a18	ldr x11,[x2]
008c1a1c	cmp x10,x11
008c1a20	b.ne 0x008c2b70
008c1a24	ldr w10,[x9, #0xc]
008c1a28	cbz w10,0x008c2b70
008c1a2c	ldr q0,[x9]
008c1a30	str q0,[x22]
008c1a34	b 0x008be78c
008c1a38	ldr x8,[x19, #0x60]
008c1a3c	ldr x9,[x8, #0x688]
008c1a40	ldr x8,[x19, #0x50]
008c1a44	cbnz x9,0x008c2e10
008c1a48	ldr w10,[x28]
008c1a4c	lsr x11,x10,#0x8
008c1a50	ubfx x9,x10,#0x10,#0x8
008c1a54	add x13,x25,w11, UXTB  #0x4
008c1a58	cbz w9,0x008c2164
008c1a5c	add x9,x13,x9, LSL #0x4
008c1a60	sub x11,x9,#0x10
008c1a64	b 0x008c2168
008c1a68	ldr w8,[x28], #0x4
008c1a6c	mov x26,x28
008c1a70	lsr x9,x8,#0x10
008c1a74	add x1,x25,w9, UXTB  #0x4
008c1a78	lsr x9,x8,#0x8
008c1a7c	lsr x8,x8,#0x14
008c1a80	ldr w10,[x1, #0xc]
008c1a84	add x3,x25,w9, UXTB  #0x4
008c1a88	and x8,x8,#0xff0
008c1a8c	add x2,x25,x8
008c1a90	cmp w10,#0x6
008c1a94	b.ne 0x008c1e4c
008c1a98	ldr w8,[x2, #0xc]
008c1a9c	cmp w8,#0x3
008c1aa0	b.ne 0x008c1e4c
008c1aa4	ldr d0,[x2]
008c1aa8	ldr x8,[x1]
008c1aac	fcvtzs w10,d0
008c1ab0	ldr w11,[x8, #0x8]
008c1ab4	sub w9,w10,#0x1
008c1ab8	cmp w9,w11
008c1abc	b.cs 0x008c1e4c
008c1ac0	scvtf d1,w10
008c1ac4	ldr x10,[x8, #0x10]
008c1ac8	fcmp d0,d1
008c1acc	ccmp x10,#0x0,#0x0,eq
008c1ad0	b.ne 0x008c1e4c
008c1ad4	ldr x8,[x8, #0x20]
008c1ad8	ldr q0,[x8,w9, uxtw #4]
008c1adc	str q0,[x3]
008c1ae0	b 0x008be78c
008c1ae4	ldr w8,[x28], #0x4
008c1ae8	lsr x9,x8,#0x8
008c1aec	add x9,x25,w9, UXTB  #0x4
008c1af0	ldr w10,[x9, #0xc]
008c1af4	cbz w10,0x008c2068
008c1af8	cmp w10,#0x1
008c1afc	b.ne 0x008c2214
008c1b00	ldr w9,[x9]
008c1b04	cbz w9,0x008c2068
008c1b08	add x26,x28,xzr, LSL #0x2
008c1b0c	b 0x008be78c
008c1b10	ldr w20,[x28]
008c1b14	ldr w9,[x28, #0x4]!
008c1b18	lsr x8,x20,#0x8
008c1b1c	add x2,x25,x9, LSL #0x4
008c1b20	add x1,x25,w8, UXTB  #0x4
008c1b24	ldr w8,[x1, #0xc]
008c1b28	cmp w8,#0x3
008c1b2c	b.ne 0x008c2e44
008c1b30	ldr w8,[x2, #0xc]
008c1b34	cmp w8,#0x3
008c1b38	b.ne 0x008c2e78
008c1b3c	ldr d0,[x1]
008c1b40	ldr d1,[x2]
008c1b44	sbfx x8,x20,#0x10,#0x10
008c1b48	fcmp d0,d1
008c1b4c	csinc x8,x8,xzr,hi
008c1b50	add x26,x28,x8, LSL #0x2
008c1b54	b 0x008be78c
008c1b58	ldr w8,[x28]
008c1b5c	lsr x9,x8,#0x8
008c1b60	add x10,x25,w9, UXTB  #0x4
008c1b64	ldr w9,[x28, #0x4]!
008c1b68	ldr w11,[x10, #0xc]
008c1b6c	cmp w11,#0x1
008c1b70	b.ne 0x008c1fa4
008c1b74	ldr w10,[x10]
008c1b78	and w11,w9,#0x1
008c1b7c	cmp w10,w11
008c1b80	cset w10,eq
008c1b84	b 0x008c1fa8
008c1b88	add x26,x28,#0x4
008c1b8c	b 0x008be78c
008c1b90	ldrsh x8,[x28, #0x2]
008c1b94	add x8,x28,x8, LSL #0x2
008c1b98	add x26,x8,#0x4
008c1b9c	b 0x008be78c
008c1ba0	ldr x8,[sp, #0x18]
008c1ba4	add x26,x28,#0x8
008c1ba8	ldp w11,w12,[x28]
008c1bac	ldr x9,[x8, #0x10]
008c1bb0	ldrb w8,[x9, #0x4]
008c1bb4	ldr x10,[x9, #0x28]
008c1bb8	and w8,w8,w11, LSR #0x18
008c1bbc	lsr x11,x11,#0x8
008c1bc0	add x10,x10,x8, LSL #0x5
008c1bc4	add x3,x25,w11, UXTB  #0x4
008c1bc8	ldr x11,[sp, #0x20]
008c1bcc	ldr w13,[x10, #0x1c]
008c1bd0	add x2,x11,x12, LSL #0x4
008c1bd4	and w13,w13,#0xf
008c1bd8	cmp w13,#0x5
008c1bdc	b.ne 0x008c209c
008c1be0	ldr x11,[x10, #0x10]
008c1be4	ldr x12,[x2]
008c1be8	cmp x11,x12
008c1bec	b.ne 0x008c209c
008c1bf0	ldr w11,[x10, #0xc]
008c1bf4	cbz w11,0x008c209c
008c1bf8	ldr q0,[x10]
008c1bfc	str q0,[x3]
008c1c00	b 0x008be78c
008c1c04	ldr w8,[x28], #0x4
008c1c08	lsr x9,x8,#0x8
008c1c0c	add x10,x25,w9, UXTB  #0x4
008c1c10	ldr w9,[x10, #0xc]
008c1c14	cbz w9,0x008c1c2c
008c1c18	cmp w9,#0x1
008c1c1c	b.ne 0x008c1c28
008c1c20	ldr w9,[x10]
008c1c24	cbz w9,0x008c24fc
008c1c28	sbfx x9,x8,#0x10,#0x10
008c1c2c	add x26,x28,x9, LSL #0x2
008c1c30	b 0x008be78c
008c1c34	ldr w8,[x28]
008c1c38	mov w11,#0x1
008c1c3c	lsr x9,x8,#0x8
008c1c40	lsr x10,x8,#0x16
008c1c44	ubfx w8,w8,#0x10,#0x8
008c1c48	add x9,x25,w9, UXTB  #0x4
008c1c4c	and x10,x10,#0x3fc
008c1c50	str w8,[x9]
008c1c54	add x8,x28,x10
008c1c58	str w11,[x9, #0xc]
008c1c5c	add x26,x8,#0x4
008c1c60	b 0x008be78c
008c1c64	ldr w8,[x28], #0x4
008c1c68	mov x26,x28
008c1c6c	lsr x9,x8,#0x10
008c1c70	add x1,x25,w9, UXTB  #0x4
008c1c74	lsr x9,x8,#0x8
008c1c78	lsr x8,x8,#0x18
008c1c7c	ldr w10,[x1, #0xc]
008c1c80	add x3,x25,w9, UXTB  #0x4
008c1c84	cmp w10,#0x6
008c1c88	b.ne 0x008c1f14
008c1c8c	ldr x9,[x1]
008c1c90	ldr w10,[x9, #0x8]
008c1c94	cmp w8,w10
008c1c98	b.cs 0x008c1f14
008c1c9c	ldr x10,[x9, #0x10]
008c1ca0	cbnz x10,0x008c1f14
008c1ca4	ldr x9,[x9, #0x20]
008c1ca8	ldr q0,[x9,x8, lsl #4]
008c1cac	str q0,[x3]
008c1cb0	b 0x008be78c
008c1cb4	ldrb w8,[x28, #0x1]
008c1cb8	add x26,x28,#0x4
008c1cbc	add x8,x25,x8, LSL #0x4
008c1cc0	str wzr,[x8, #0xc]
008c1cc4	b 0x008be78c
008c1cc8	ldp w8,w20,[x28]
008c1ccc	ldr x10,[x19, #0x50]
008c1cd0	add x26,x28,#0x8
008c1cd4	lsr x9,x8,#0x10
008c1cd8	str x26,[x10, #0x20]
008c1cdc	add x22,x25,w9, UXTB  #0x4
008c1ce0	ldr w9,[x22, #0xc]
008c1ce4	sub w10,w9,#0xd
008c1ce8	cmn w10,#0x3
008c1cec	b.ls 0x008c354c
008c1cf0	lsr x10,x8,#0x14
008c1cf4	ldr x11,[sp, #0x18]
008c1cf8	and x10,x10,#0xff0
008c1cfc	add x11,x11,x10
008c1d00	ldr w10,[x11, #0x2c]
008c1d04	add x1,x11,#0x20
008c1d08	cmp w10,#0xf
008c1d0c	b.ne 0x008c1d1c
008c1d10	ldr x10,[x1]
008c1d14	ldr x1,[x10, #0x8]
008c1d18	ldr w10,[x1, #0xc]
008c1d1c	cmp w10,#0xb
008c1d20	b.ne 0x008c3574
008c1d24	lsr x8,x8,#0x8
008c1d28	ldr x23,[x1]
008c1d2c	ldr x24,[x22]
008c1d30	cmp w9,#0xc
008c1d34	add x21,x25,w8, UXTB  #0x4
008c1d38	b.ne 0x008c2034
008c1d3c	mov x0,x24
008c1d40	mov x1,x23
008c1d44	bl 0x008b3380
008c1d48	tbz w0,#0x0,0x008c372c
008c1d4c	tbnz w20,#0x8,0x008c2048
008c1d50	ldr w8,[x23, #0x64]
008c1d54	tbz w20,#0x9,0x008c1d60
008c1d58	ldr q0,[x22]
008c1d5c	str q0,[x21, #0x10]
008c1d60	add w8,w8,w20, UXTB 
008c1d64	ldr x9,[x24, #0x20]
008c1d68	ldr q0,[x9,w8, uxtw #4]
008c1d6c	str q0,[x21]
008c1d70	b 0x008be78c
008c1d74	ldr w24,[x28]
008c1d78	mov x23,x28
008c1d7c	ldr w8,[x23, #0x4]!
008c1d80	lsr x9,x24,#0x8
008c1d84	add x2,x25,x8, LSL #0x4
008c1d88	add x1,x25,w9, UXTB  #0x4
008c1d8c	ldr w9,[x2, #0xc]
008c1d90	ldr w8,[x1, #0xc]
008c1d94	cmp w8,w9
008c1d98	b.ne 0x008c25a8
008c1d9c	cmp w8,#0x6
008c1da0	b.gt 0x008c237c
008c1da4	cmp w8,#0x2
008c1da8	b.le 0x008c25b0
008c1dac	cmp w8,#0x4
008c1db0	b.gt 0x008c2778
008c1db4	cmp w8,#0x3
008c1db8	b.ne 0x008c2884
008c1dbc	ldr d0,[x1]
008c1dc0	ldr d1,[x2]
008c1dc4	fcmp d0,d1
008c1dc8	b 0x008c28b0
008c1dcc	bl 0x008bcf64
008c1dd0	scvtf d0,w0
008c1dd4	mov w8,#0x3
008c1dd8	str d0,[x22]
008c1ddc	str w8,[x22, #0xc]
008c1de0	b 0x008be78c
008c1de4	ldr x8,[x27, #0x28]
008c1de8	mov x0,x19
008c1dec	blr x8
008c1df0	tbnz w0,#0x1f,0x008c3618
008c1df4	ldr x8,[x19, #0x50]
008c1df8	ldr x10,[x8, #0x8]
008c1dfc	cbz w23,0x008c1e2c
008c1e00	cbz w0,0x008c1e2c
008c1e04	ldr x9,[x19, #0x68]
008c1e08	sub x11,x9,w0, UXTW  #0x4
008c1e0c	add x11,x11,#0x10
008c1e10	ldur q0,[x11, #-0x10]
008c1e14	subs w23,w23,#0x1
008c1e18	str q0,[x10], #0x10
008c1e1c	b.eq 0x008c1e2c
008c1e20	cmp x11,x9
008c1e24	add x11,x11,#0x10
008c1e28	b.cc 0x008c1e10
008c1e2c	cmp w23,#0x1
008c1e30	b.lt 0x008c221c
008c1e34	b.ne 0x008c22c0
008c1e38	mov x9,x10
008c1e3c	b 0x008c22f0
008c1e40	ldr x9,[x19, #0x50]
008c1e44	str x26,[x9, #0x20]
008c1e48	b 0x008c1f00
008c1e4c	ldr x8,[x19, #0x50]
008c1e50	str x26,[x8, #0x20]
008c1e54	b 0x008c1f34
008c1e58	ldr x9,[sp, #0x20]
008c1e5c	ldr d0,[x2]
008c1e60	ldr d1,[x9,x8]
008c1e64	fadd d0,d0,d1
008c1e68	b 0x008be780
008c1e6c	ldr d0,[x2]
008c1e70	ldr d1,[x3]
008c1e74	b 0x008c1ea4
008c1e78	ldr x9,[sp, #0x20]
008c1e7c	fmov d0,0x4000000000000000
008c1e80	ldr d1,[x9,x8]
008c1e84	fcmp d1,d0
008c1e88	ldr d0,[x2]
008c1e8c	b.ne 0x008c2340
008c1e90	fmul d0,d0,d0
008c1e94	b 0x008c290c
008c1e98	ldr x9,[sp, #0x20]
008c1e9c	ldr d0,[x2]
008c1ea0	ldr d1,[x9,x8]
008c1ea4	fsub d0,d0,d1
008c1ea8	b 0x008be780
008c1eac	add x26,x28,x20
008c1eb0	b 0x008c20d4
008c1eb4	ldr x8,[x19, #0x50]
008c1eb8	add x26,x28,#0x8
008c1ebc	ldr w4,[x28, #0x4]
008c1ec0	ldr x2,[sp, #0x20]
008c1ec4	mov x0,x19
008c1ec8	mov w5,wzr
008c1ecc	str x26,[x8, #0x20]
008c1ed0	ldr x1,[x11, #0x10]
008c1ed4	bl 0x008c8e84
008c1ed8	ldr x25,[x19, #0x70]
008c1edc	b 0x008be78c
008c1ee0	add w9,w9,#0x1
008c1ee4	ldr x10,[x19, #0x50]
008c1ee8	add x2,sp,#0x38
008c1eec	ucvtf d0,w9
008c1ef0	mov w9,#0x3
008c1ef4	str w9,[sp, #0x44]
008c1ef8	str x26,[x10, #0x20]
008c1efc	str d0,[sp, #0x38]
008c1f00	mov x0,x19
008c1f04	mov x1,x8
008c1f08	bl 0x008cb374
008c1f0c	ldr x25,[x19, #0x70]
008c1f10	b 0x008be78c
008c1f14	add w8,w8,#0x1
008c1f18	ldr x9,[x19, #0x50]
008c1f1c	sub x2,x29,#0x38
008c1f20	ucvtf d0,w8
008c1f24	mov w8,#0x3
008c1f28	stur w8,[x29, #-0x2c]
008c1f2c	str x26,[x9, #0x20]
008c1f30	stur d0,[x29, #-0x38]
008c1f34	mov x0,x19
008c1f38	bl 0x008cadd4
008c1f3c	ldr x25,[x19, #0x70]
008c1f40	b 0x008be78c
008c1f44	lsr x8,x8,#0x10
008c1f48	add x8,x25,w8, UXTB  #0x4
008c1f4c	ldr w9,[x8, #0xc]
008c1f50	cmp w9,#0xb
008c1f54	b.ne 0x008c3598
008c1f58	ldr x2,[x8]
008c1f5c	mov x0,x19
008c1f60	bl 0x008b25f4
008c1f64	mov w8,#0xb
008c1f68	str x0,[x20]
008c1f6c	str w8,[x20, #0xc]
008c1f70	b 0x008be78c
008c1f74	mov w10,wzr
008c1f78	asr w8,w8,#0x10
008c1f7c	cmp w10,w9, LSR #0x1f
008c1f80	b 0x008c1fb0
008c1f84	cmp w8,#0x6
008c1f88	b.eq 0x008c239c
008c1f8c	cmp w8,#0x7
008c1f90	b.eq 0x008c2688
008c1f94	cmp w8,#0x8
008c1f98	b.ne 0x008c3704
008c1f9c	mov w8,#0x8
008c1fa0	b 0x008c23a0
008c1fa4	mov w10,wzr
008c1fa8	asr w8,w8,#0x10
008c1fac	cmp w10,w9, LSR #0x1f
008c1fb0	csinc w8,w8,wzr,ne
008c1fb4	add x26,x28,w8, SXTW  #0x2
008c1fb8	b 0x008be78c
008c1fbc	lsr x8,x8,#0x16
008c1fc0	ldr q0,[x10]
008c1fc4	and x8,x8,#0x3fc
008c1fc8	add x8,x28,x8
008c1fcc	ldr w11,[x8]
008c1fd0	lsr x9,x11,#0x8
008c1fd4	lsr w12,w11,#0x18
008c1fd8	lsr w10,w11,#0x18
008c1fdc	add x13,x25,w9, UXTB  #0x4
008c1fe0	cmp w12,#0x3
008c1fe4	add x9,x13,#0x10
008c1fe8	str q0,[x13]
008c1fec	b.cc 0x008c261c
008c1ff0	subs w12,w10,#0x3
008c1ff4	b.eq 0x008c25fc
008c1ff8	ubfx x11,x11,#0x8,#0x8
008c1ffc	add x13,x12,#0x1
008c2000	and x14,x13,#0x1fffffffe
008c2004	orr w12,w13,#0x1
008c2008	add x15,x25,x11, LSL #0x4
008c200c	add x11,x9,x14, LSL #0x4
008c2010	mov x16,x14
008c2014	add x15,x15,#0x2c
008c2018	subs x16,x16,#0x2
008c201c	stur wzr,[x15, #-0x10]
008c2020	str wzr,[x15], #0x20
008c2024	b.ne 0x008c2018
008c2028	cmp x13,x14
008c202c	b.ne 0x008c2604
008c2030	b 0x008c261c
008c2034	mov x0,x24
008c2038	mov x1,x23
008c203c	bl 0x008b33a4
008c2040	tbz w0,#0x0,0x008c35c0
008c2044	tbz w20,#0x8,0x008c35e4
008c2048	tbz w20,#0x9,0x008c2054
008c204c	ldr q0,[x22]
008c2050	str q0,[x21, #0x10]
008c2054	ldr x8,[x23, #0x30]
008c2058	and x9,x20,#0xff
008c205c	ldr q0,[x8,x9, lsl #4]
008c2060	str q0,[x21]
008c2064	b 0x008be78c
008c2068	sbfx x8,x8,#0x10,#0x10
008c206c	add x26,x28,x8, LSL #0x2
008c2070	b 0x008be78c
008c2074	ldr x8,[x19, #0x50]
008c2078	ldr x25,[x19, #0x70]
008c207c	ldr w9,[x8, #0x2c]
008c2080	ldp x11,x10,[x8]
008c2084	orr w9,w9,#0x1
008c2088	str w9,[x8, #0x2c]
008c208c	ldp x8,x26,[x11, #0x28]
008c2090	ldr x9,[x10]
008c2094	stp x9,x8,[sp, #0x18]
008c2098	b 0x008be78c
008c209c	ldr x10,[x19, #0x50]
008c20a0	stur x9,[x29, #-0x18]
008c20a4	mov w9,#0x6
008c20a8	stur w9,[x29, #-0xc]
008c20ac	sub x1,x29,#0x18
008c20b0	mov x0,x19
008c20b4	str w8,[x19, #0x2c]
008c20b8	str x26,[x10, #0x20]
008c20bc	bl 0x008cadd4
008c20c0	ldrb w8,[x19, #0x2c]
008c20c4	ldr x25,[x19, #0x70]
008c20c8	strb w8,[x28, #0x3]
008c20cc	b 0x008be78c
008c20d0	mov x26,x28
008c20d4	ldr x8,[x19, #0x50]
008c20d8	str x26,[x8, #0x20]
008c20dc	ldr x8,[x19, #0x60]
008c20e0	ldp x8,x9,[x8, #0x8]
008c20e4	cmp x9,x8
008c20e8	b.cc 0x008c20f8
008c20ec	mov x0,x19
008c20f0	mov w1,#0x1
008c20f4	bl 0x008b52c4
008c20f8	ldr x25,[x19, #0x70]
008c20fc	b 0x008be78c
008c2100	str x26,[x8, #0x20]
008c2104	lsl w10,w22,#0x4
008c2108	ldr x8,[x19, #0x48]
008c210c	ldr x9,[x19, #0x68]
008c2110	sub x8,x8,x9
008c2114	cmp x8,w10, SXTW 
008c2118	b.gt 0x008c2128
008c211c	mov x0,x19
008c2120	mov w1,w22
008c2124	bl 0x008b41e4
008c2128	ldr x25,[x19, #0x70]
008c212c	lsr x8,x20,#0x8
008c2130	cmp w22,#0x1
008c2134	add x8,x25,w8, UXTB  #0x4
008c2138	b.lt 0x008c2158
008c213c	sub x9,x25,w22, UXTW  #0x4
008c2140	mov x10,x22
008c2144	mov x11,x8
008c2148	ldr q0,[x9], #0x10
008c214c	subs x10,x10,#0x1
008c2150	str q0,[x11], #0x10
008c2154	b.ne 0x008c2148
008c2158	add x8,x8,w22, SXTW  #0x4
008c215c	str x8,[x19, #0x68]
008c2160	b 0x008be78c
008c2164	ldr x11,[x19, #0x68]
008c2168	ldr w9,[x8, #0x28]
008c216c	ldr x12,[x8, #0x8]
008c2170	cbz w9,0x008c21bc
008c2174	cmp x13,x11
008c2178	b.cs 0x008c21bc
008c217c	ubfx x10,x10,#0x8,#0x8
008c2180	add x10,x25,x10, LSL #0x4
008c2184	add x13,x10,#0x10
008c2188	mov w10,w9
008c218c	ldur q0,[x13, #-0x10]
008c2190	subs w10,w10,#0x1
008c2194	str q0,[x12], #0x10
008c2198	b.eq 0x008c21a8
008c219c	cmp x13,x11
008c21a0	add x13,x13,#0x10
008c21a4	b.cc 0x008c218c
008c21a8	cmp w10,#0x1
008c21ac	b.lt 0x008c21c8
008c21b0	b.ne 0x008c2230
008c21b4	mov x11,x12
008c21b8	b 0x008c2260
008c21bc	mov w10,w9
008c21c0	cmp w10,#0x1
008c21c4	b.ge 0x008c21b0
008c21c8	mov x11,x12
008c21cc	b 0x008c2280
008c21d0	asr w8,w20,#0x10
008c21d4	add x26,x28,w8, SXTW  #0x2
008c21d8	b 0x008be78c
008c21dc	ldr d0,[x2]
008c21e0	ldr d1,[x3]
008c21e4	fdiv d2,d0,d1
008c21e8	frintm d2,d2
008c21ec	fmsub d0,d2,d1,d0
008c21f0	b 0x008be784
008c21f4	ldr d0,[x2]
008c21f8	ldr d1,[x3]
008c21fc	mov x20,x1
008c2200	bl 0x00c30770
008c2204	mov w8,#0x3
008c2208	str d0,[x20]
008c220c	str w8,[x20, #0xc]
008c2210	b 0x008be78c
008c2214	add x26,x28,xzr, LSL #0x2
008c2218	b 0x008be78c
008c221c	mov x9,x10
008c2220	b 0x008c2310
008c2224	mov x0,x19
008c2228	bl 0x008b4fa4
008c222c	b 0x008be78c
008c2230	mov w13,w10
008c2234	and x14,x13,#0x7ffffffe
008c2238	add x11,x12,x14, LSL #0x4
008c223c	sub w10,w10,w14
008c2240	add x12,x12,#0x1c
008c2244	mov x15,x14
008c2248	subs x15,x15,#0x2
008c224c	stur wzr,[x12, #-0x10]
008c2250	str wzr,[x12], #0x20
008c2254	b.ne 0x008c2248
008c2258	cmp x14,x13
008c225c	b.eq 0x008c2280
008c2260	add w10,w10,#0x1
008c2264	mov x12,x11
008c2268	sub w10,w10,#0x1
008c226c	add x11,x12,#0x10
008c2270	str wzr,[x12, #0xc]
008c2274	cmp w10,#0x1
008c2278	mov x12,x11
008c227c	b.hi 0x008c2268
008c2280	ldur x25,[x8, #-0x20]
008c2284	sub x10,x8,#0x30
008c2288	cmn w9,#0x1
008c228c	str x10,[x19, #0x50]
008c2290	str x25,[x19, #0x70]
008c2294	b.eq 0x008c229c
008c2298	ldur x11,[x8, #-0x18]
008c229c	str x11,[x19, #0x68]
008c22a0	ldrb w9,[x8, #0x2c]
008c22a4	tbnz w9,#0x0,0x008c3618
008c22a8	ldp x9,x10,[x8, #-0x30]
008c22ac	ldur x26,[x8, #-0x10]
008c22b0	ldr x10,[x10]
008c22b4	ldr x8,[x9, #0x28]
008c22b8	stp x10,x8,[sp, #0x18]
008c22bc	b 0x008be78c
008c22c0	mov w11,w23
008c22c4	and x12,x11,#0x7ffffffe
008c22c8	add x9,x10,x12, LSL #0x4
008c22cc	sub w23,w23,w12
008c22d0	add x10,x10,#0x1c
008c22d4	mov x13,x12
008c22d8	subs x13,x13,#0x2
008c22dc	stur wzr,[x10, #-0x10]
008c22e0	str wzr,[x10], #0x20
008c22e4	b.ne 0x008c22d8
008c22e8	cmp x12,x11
008c22ec	b.eq 0x008c2310
008c22f0	add w10,w23,#0x1
008c22f4	mov x11,x9
008c22f8	sub w10,w10,#0x1
008c22fc	add x9,x11,#0x10
008c2300	str wzr,[x11, #0xc]
008c2304	cmp w10,#0x1
008c2308	mov x11,x9
008c230c	b.hi 0x008c22f8
008c2310	ldur x25,[x8, #-0x20]
008c2314	lsr w11,w24,#0x18
008c2318	sub x10,x8,#0x30
008c231c	str x10,[x19, #0x50]
008c2320	str x25,[x19, #0x70]
008c2324	cbz w11,0x008c232c
008c2328	ldur x9,[x8, #-0x18]
008c232c	str x9,[x19, #0x68]
008c2330	b 0x008be78c
008c2334	mov x0,x19
008c2338	bl 0x008b6370
008c233c	b 0x008be78c
008c2340	fmov d2,0x3fe0000000000000
008c2344	fcmp d1,d2
008c2348	b.ne 0x008c25e4
008c234c	fsqrt d0,d0
008c2350	b 0x008c290c
008c2354	cmp w8,#0x8
008c2358	b.le 0x008c2694
008c235c	sub w9,w8,#0x9
008c2360	cmp w9,#0x2
008c2364	b.cc 0x008c26fc
008c2368	cmp w8,#0xb
008c236c	b.ne 0x008c284c
008c2370	ldr x8,[x1]
008c2374	ldr x9,[x2]
008c2378	b 0x008c2704
008c237c	cmp w8,#0x8
008c2380	b.le 0x008c2718
008c2384	sub w9,w8,#0x9
008c2388	cmp w9,#0x2
008c238c	b.cc 0x008c2780
008c2390	cmp w8,#0xb
008c2394	b.eq 0x008c2780
008c2398	b 0x008c28d8
008c239c	mov w8,#0x10
008c23a0	ldr x9,[x22]
008c23a4	ldr x23,[x9, x8#0x0]
008c23a8	cbz x23,0x008c247c
008c23ac	ldrb w8,[x23, #0x6]
008c23b0	tbnz w8,#0x5,0x008c23d8
008c23b4	ldrb w8,[x23, #0x7]
008c23b8	tbnz w8,#0x1,0x008c2634
008c23bc	ldr x8,[x19, #0x60]
008c23c0	mov x0,x23
008c23c4	mov w1,#0x5
008c23c8	ldr x2,[x8, #0x360]
008c23cc	bl 0x008bdfe0
008c23d0	cbnz x0,0x008c263c
008c23d4	ldrb w8,[x23, #0x6]
008c23d8	tbz w8,#0x4,0x008c245c
008c23dc	b 0x008c247c
008c23e0	mov x0,x19
008c23e4	bl 0x008b6188
008c23e8	b 0x008be78c
008c23ec	mov x0,x19
008c23f0	mov x1,x22
008c23f4	bl 0x008b6370
008c23f8	b 0x008be78c
008c23fc	mov w9,#0x10
008c2400	ldr x10,[x22]
008c2404	ldr x23,[x10, x9#0x0]
008c2408	cbz x23,0x008c2480
008c240c	ldrb w9,[x23, #0x6]
008c2410	tbnz w9,#0x5,0x008c2454
008c2414	ldrb w8,[x23, #0x7]
008c2418	tbnz w8,#0x1,0x008c2634
008c241c	ldr x8,[x19, #0x60]
008c2420	mov x0,x23
008c2424	mov w1,#0x5
008c2428	ldr x2,[x8, #0x360]
008c242c	bl 0x008bdfe0
008c2430	cbnz x0,0x008c263c
008c2434	ldr w8,[x22, #0xc]
008c2438	mov w9,wzr
008c243c	b 0x008c2448
008c2440	mov x23,xzr
008c2444	mov w9,#0x1
008c2448	cmp w8,#0xc
008c244c	b.eq 0x008c304c
008c2450	tbnz w9,#0x0,0x008c2480
008c2454	ldrb w9,[x23, #0x6]
008c2458	tbnz w9,#0x4,0x008c2480
008c245c	ldrb w8,[x23, #0x7]
008c2460	tbnz w8,#0x1,0x008c2688
008c2464	ldr x8,[x19, #0x60]
008c2468	mov x0,x23
008c246c	mov w1,#0x4
008c2470	ldr x2,[x8, #0x358]
008c2474	bl 0x008bdfe0
008c2478	cbnz x0,0x008c2688
008c247c	ldr w8,[x22, #0xc]
008c2480	cmp w8,#0x6
008c2484	b.ne 0x008c3704
008c2488	adrp x8,0xd1f000
008c248c	add x8,x8,#0x4f8
008c2490	ldrb w8,[x8]
008c2494	cmp w8,#0x1
008c2498	b.ne 0x008c24dc
008c249c	ldr x8,[x22]
008c24a0	mov w10,#0x1
008c24a4	ldrb w9,[x8, #0x5]
008c24a8	ldr w8,[x8, #0x8]
008c24ac	lsl w9,w10,w9
008c24b0	adds w8,w9,w8
008c24b4	b.le 0x008c24dc
008c24b8	ldr x9,[x19, #0x50]
008c24bc	mov w11,#0x3fffffff
008c24c0	ldr x9,[x9]
008c24c4	ldr w10,[x9, #0x48]
008c24c8	sub w11,w11,w10
008c24cc	cmp w8,w11
008c24d0	csel w8,w8,w11,cc
008c24d4	add w8,w8,w10
008c24d8	str w8,[x9, #0x48]
008c24dc	adrp x8,0x29a000
008c24e0	ldr q0,[x22]
008c24e4	str xzr,[x22, #0x20]
008c24e8	ldr d1,[x8, #0xb78]
008c24ec	str wzr,[x22, #0xc]
008c24f0	str q0,[x22, #0x10]
008c24f4	str d1,[x22, #0x28]
008c24f8	b 0x008c2688
008c24fc	add x26,x28,xzr, LSL #0x2
008c2500	b 0x008be78c
008c2504	adrp x9,0xd1f000
008c2508	add x9,x9,#0x4f8
008c250c	ldrb w9,[x9]
008c2510	cmp w9,#0x1
008c2514	b.ne 0x008c255c
008c2518	ldr x9,[x1, #0x10]
008c251c	mov w11,#0x1
008c2520	ldrb w10,[x9, #0x5]
008c2524	ldr w9,[x9, #0x8]
008c2528	lsl w10,w11,w10
008c252c	add w9,w10,w9
008c2530	cmp w9,#0x1
008c2534	b.lt 0x008c255c
008c2538	ldr x10,[x19, #0x50]
008c253c	mov w12,#0x3fffffff
008c2540	ldr x10,[x10]
008c2544	ldr w11,[x10, #0x48]
008c2548	sub w12,w12,w11
008c254c	cmp w9,w12
008c2550	csel w9,w9,w12,cc
008c2554	add w9,w9,w11
008c2558	str w9,[x10, #0x48]
008c255c	adrp x9,0x29a000
008c2560	str wzr,[x1, #0xc]
008c2564	ldr d0,[x9, #0xb78]
008c2568	str xzr,[x1, #0x20]
008c256c	str d0,[x1, #0x28]
008c2570	b 0x008c1970
008c2574	ldr q0,[x1]
008c2578	str q0,[x3, #0x10]
008c257c	b 0x008c1bf8
008c2580	cbz w8,0x008c25a8
008c2584	cmp w8,#0x1
008c2588	b.ne 0x008c27cc
008c258c	ldr w8,[x1]
008c2590	ldr w9,[x2]
008c2594	asr w10,w24,#0x10
008c2598	cmp w8,w9
008c259c	csinc w8,w10,wzr,ne
008c25a0	add x26,x23,w8, SXTW  #0x2
008c25a4	b 0x008be78c
008c25a8	add x26,x28,#0x8
008c25ac	b 0x008be78c
008c25b0	cbz w8,0x008c25d8
008c25b4	cmp w8,#0x1
008c25b8	b.ne 0x008c2868
008c25bc	ldr w8,[x1]
008c25c0	ldr w9,[x2]
008c25c4	asr w10,w24,#0x10
008c25c8	cmp w8,w9
008c25cc	csinc w8,w10,wzr,eq
008c25d0	add x26,x23,w8, SXTW  #0x2
008c25d4	b 0x008be78c
008c25d8	asr w8,w24,#0x10
008c25dc	add x26,x23,w8, SXTW  #0x2
008c25e0	b 0x008be78c
008c25e4	fmov d2,0x4008000000000000
008c25e8	fcmp d1,d2
008c25ec	b.ne 0x008c2900
008c25f0	fmul d1,d0,d0
008c25f4	fmul d0,d0,d1
008c25f8	b 0x008c290c
008c25fc	mov w12,#0x1
008c2600	mov x11,x9
008c2604	mvn w12,w12
008c2608	add x11,x11,#0xc
008c260c	add w12,w12,w10
008c2610	subs w12,w12,#0x1
008c2614	str wzr,[x11], #0x10
008c2618	b.ne 0x008c2610
008c261c	cbz w10,0x008c2628
008c2620	ldr x9,[x19, #0x50]
008c2624	ldr x9,[x9, #0x18]
008c2628	str x9,[x19, #0x68]
008c262c	add x26,x8,#0x4
008c2630	b 0x008be78c
008c2634	ldr x8,[x23, #0x20]
008c2638	sub x0,x8,#0x60
008c263c	ldr q0,[x22]
008c2640	add x8,x22,#0x20
008c2644	mov x1,x22
008c2648	mov w2,#0x3
008c264c	str q0,[x22, #0x10]
008c2650	ldr q0,[x0]
008c2654	mov x0,x19
008c2658	str q0,[x22]
008c265c	ldr x9,[x19, #0x50]
008c2660	str x8,[x19, #0x68]
008c2664	str x28,[x9, #0x20]
008c2668	bl 0x008b465c
008c266c	ldr x25,[x19, #0x70]
008c2670	ldr x8,[x19, #0x50]
008c2674	add x1,x25,x26, LSL #0x4
008c2678	ldr x9,[x8, #0x18]
008c267c	ldr w10,[x1, #0xc]
008c2680	str x9,[x19, #0x68]
008c2684	cbz w10,0x008c3750
008c2688	asr w8,w24,#0x10
008c268c	add x26,x28,w8, SXTW  #0x2
008c2690	b 0x008be78c
008c2694	cmp w8,#0x7
008c2698	b.eq 0x008c26fc
008c269c	ldr x8,[x1]
008c26a0	ldr x9,[x2]
008c26a4	ldr x0,[x8, #0x8]
008c26a8	ldr x10,[x9, #0x8]
008c26ac	cmp x0,x10
008c26b0	b.ne 0x008c284c
008c26b4	cbz x0,0x008c2378
008c26b8	ldrsb w10,[x0, #0x6]
008c26bc	tbnz w10,#0x1f,0x008c2378
008c26c0	ldrb w8,[x0, #0x7]
008c26c4	tbnz w8,#0x1,0x008c2a34
008c26c8	ldr x8,[x19, #0x60]
008c26cc	mov x20,x1
008c26d0	mov w1,#0x7
008c26d4	mov x21,x2
008c26d8	ldr x8,[x8, #0x370]
008c26dc	mov x2,x8
008c26e0	bl 0x008bdfe0
008c26e4	mov x1,x20
008c26e8	mov x2,x21
008c26ec	cbnz x0,0x008c2a3c
008c26f0	b 0x008c2370
008c26f4	cmp w8,#0x5
008c26f8	b.ne 0x008c2834
008c26fc	ldr x8,[x1]
008c2700	ldr x9,[x2]
008c2704	sbfx x10,x24,#0x10,#0x10
008c2708	cmp x8,x9
008c270c	csinc x8,x10,xzr,ne
008c2710	add x26,x23,x8, LSL #0x2
008c2714	b 0x008be78c
008c2718	cmp w8,#0x7
008c271c	b.eq 0x008c2780
008c2720	ldr x8,[x1]
008c2724	ldr x9,[x2]
008c2728	ldr x0,[x8, #0x8]
008c272c	ldr x10,[x9, #0x8]
008c2730	cmp x0,x10
008c2734	b.ne 0x008c28d8
008c2738	cbz x0,0x008c2788
008c273c	ldrsb w10,[x0, #0x6]
008c2740	tbnz w10,#0x1f,0x008c2788
008c2744	ldrb w8,[x0, #0x7]
008c2748	tbnz w8,#0x1,0x008c2ac4
008c274c	ldr x8,[x19, #0x60]
008c2750	mov x20,x1
008c2754	mov w1,#0x7
008c2758	mov x21,x2
008c275c	ldr x8,[x8, #0x370]
008c2760	mov x2,x8
008c2764	bl 0x008bdfe0
008c2768	mov x1,x20
008c276c	mov x2,x21
008c2770	cbnz x0,0x008c2acc
008c2774	b 0x008c2780
008c2778	cmp w8,#0x5
008c277c	b.ne 0x008c28c0
008c2780	ldr x8,[x1]
008c2784	ldr x9,[x2]
008c2788	sbfx x10,x24,#0x10,#0x10
008c278c	cmp x8,x9
008c2790	csinc x8,x10,xzr,eq
008c2794	add x26,x23,x8, LSL #0x2
008c2798	b 0x008be78c
008c279c	add w9,w10,#0x1
008c27a0	adrp x10,0x29a000
008c27a4	scvtf d0,w9
008c27a8	sxtw x9,w9
008c27ac	ldr d1,[x10, #0xb78]
008c27b0	str x9,[x8, #0x20]
008c27b4	mov w9,#0x3
008c27b8	str w9,[x8, #0x3c]
008c27bc	asr w9,w23,#0x10
008c27c0	stp d1,d0,[x8, #0x28]
008c27c4	ldr q0,[x12]
008c27c8	b 0x008c2954
008c27cc	ldr x8,[x1]
008c27d0	ldr x9,[x2]
008c27d4	cmp x8,x9
008c27d8	b.ne 0x008c29b0
008c27dc	ldr w8,[x1, #0x8]
008c27e0	ldr w9,[x2, #0x8]
008c27e4	cmp w8,w9
008c27e8	b.ne 0x008c29b0
008c27ec	mov w8,#0x1
008c27f0	add x26,x23,x8, LSL #0x2
008c27f4	b 0x008be78c
008c27f8	ldr s0,[x1]
008c27fc	ldr s1,[x2]
008c2800	fcmp s0,s1
008c2804	b.ne 0x008c29b0
008c2808	ldr s0,[x1, #0x4]
008c280c	ldr s1,[x2, #0x4]
008c2810	fcmp s0,s1
008c2814	b.ne 0x008c29b0
008c2818	ldr s0,[x1, #0x8]
008c281c	ldr s1,[x2, #0x8]
008c2820	fcmp s0,s1
008c2824	sbfx x8,x24,#0x10,#0x10
008c2828	csinc x8,x8,xzr,ne
008c282c	add x26,x23,x8, LSL #0x2
008c2830	b 0x008be78c
008c2834	ldr x8,[x1]
008c2838	ldr x9,[x2]
008c283c	ldr x0,[x8, #0x10]
008c2840	ldr x10,[x9, #0x10]
008c2844	cmp x0,x10
008c2848	b.eq 0x008c2960
008c284c	ldr x8,[x19, #0x50]
008c2850	mov x0,x19
008c2854	str x23,[x8, #0x20]
008c2858	bl 0x008cbdc8
008c285c	asr w8,w24,#0x10
008c2860	cmp w0,#0x0
008c2864	b 0x008c28f0
008c2868	ldr x8,[x1]
008c286c	ldr x9,[x2]
008c2870	cmp x8,x9
008c2874	b.eq 0x008c29a0
008c2878	mov w8,#0x1
008c287c	add x26,x23,x8, LSL #0x2
008c2880	b 0x008be78c
008c2884	ldr s0,[x1]
008c2888	ldr s1,[x2]
008c288c	fcmp s0,s1
008c2890	b.ne 0x008c29bc
008c2894	ldr s0,[x1, #0x4]
008c2898	ldr s1,[x2, #0x4]
008c289c	fcmp s0,s1
008c28a0	b.ne 0x008c2a08
008c28a4	ldr s0,[x1, #0x8]
008c28a8	ldr s1,[x2, #0x8]
008c28ac	fcmp s0,s1
008c28b0	sbfx x8,x24,#0x10,#0x10
008c28b4	csinc x8,x8,xzr,eq
008c28b8	add x26,x23,x8, LSL #0x2
008c28bc	b 0x008be78c
008c28c0	ldr x8,[x1]
008c28c4	ldr x9,[x2]
008c28c8	ldr x0,[x8, #0x10]
008c28cc	ldr x10,[x9, #0x10]
008c28d0	cmp x0,x10
008c28d4	b.eq 0x008c29c8
008c28d8	ldr x8,[x19, #0x50]
008c28dc	mov x0,x19
008c28e0	str x23,[x8, #0x20]
008c28e4	bl 0x008cbdc8
008c28e8	asr w8,w24,#0x10
008c28ec	cmp w0,#0x1
008c28f0	csinc w8,w8,wzr,eq
008c28f4	ldr x25,[x19, #0x70]
008c28f8	add x26,x23,w8, SXTW  #0x2
008c28fc	b 0x008be78c
008c2900	mov x20,x1
008c2904	bl 0x00c30770
008c2908	mov x1,x20
008c290c	mov w8,#0x3
008c2910	str d0,[x1]
008c2914	str w8,[x1, #0xc]
008c2918	b 0x008be78c
008c291c	adrp x10,0x29a000
008c2920	asr x9,x9,#0x20
008c2924	ldr d0,[x10, #0xb78]
008c2928	str x9,[x8, #0x20]
008c292c	str d0,[x8, #0x28]
008c2930	ldr x9,[x13, #0x10]
008c2934	str x9,[x8, #0x30]
008c2938	ldr w9,[x13, #0x18]
008c293c	str w9,[x8, #0x38]
008c2940	ldr w9,[x13, #0x1c]
008c2944	and w9,w9,#0xf
008c2948	str w9,[x8, #0x3c]
008c294c	asr w9,w23,#0x10
008c2950	ldr q0,[x13]
008c2954	add x26,x22,w9, SXTW  #0x2
008c2958	str q0,[x8, #0x40]
008c295c	b 0x008be78c
008c2960	cbz x0,0x008c2378
008c2964	ldrsb w10,[x0, #0x6]
008c2968	tbnz w10,#0x1f,0x008c2378
008c296c	ldrb w8,[x0, #0x7]
008c2970	tbnz w8,#0x1,0x008c284c
008c2974	ldr x8,[x19, #0x60]
008c2978	mov x20,x1
008c297c	mov w1,#0x7
008c2980	mov x21,x2
008c2984	ldr x8,[x8, #0x370]
008c2988	mov x2,x8
008c298c	bl 0x008bdfe0
008c2990	mov x1,x20
008c2994	mov x2,x21
008c2998	cbnz x0,0x008c284c
008c299c	b 0x008c2370
008c29a0	ldr w8,[x1, #0x8]
008c29a4	ldr w9,[x2, #0x8]
008c29a8	cmp w8,w9
008c29ac	b.ne 0x008c2a14
008c29b0	sbfx x8,x24,#0x10,#0x10
008c29b4	add x26,x23,x8, LSL #0x2
008c29b8	b 0x008be78c
008c29bc	mov w8,#0x1
008c29c0	add x26,x23,x8, LSL #0x2
008c29c4	b 0x008be78c
008c29c8	cbz x0,0x008c2788
008c29cc	ldrsb w10,[x0, #0x6]
008c29d0	tbnz w10,#0x1f,0x008c2788
008c29d4	ldrb w8,[x0, #0x7]
008c29d8	tbnz w8,#0x1,0x008c28d8
008c29dc	ldr x8,[x19, #0x60]
008c29e0	mov x20,x1
008c29e4	mov w1,#0x7
008c29e8	mov x21,x2
008c29ec	ldr x8,[x8, #0x370]
008c29f0	mov x2,x8
008c29f4	bl 0x008bdfe0
008c29f8	mov x1,x20
008c29fc	mov x2,x21
008c2a00	cbnz x0,0x008c28d8
008c2a04	b 0x008c2780
008c2a08	mov w8,#0x1
008c2a0c	add x26,x23,x8, LSL #0x2
008c2a10	b 0x008be78c
008c2a14	mov w8,#0x1
008c2a18	add x26,x23,x8, LSL #0x2
008c2a1c	b 0x008be78c
008c2a20	ldr q0,[x1]
008c2a24	str q0,[x3, #0x10]
008c2a28	ldr q0,[x8]
008c2a2c	str q0,[x3]
008c2a30	b 0x008be78c
008c2a34	ldr x8,[x0, #0x20]
008c2a38	sub x0,x8,#0x80
008c2a3c	ldr w8,[x0, #0xc]
008c2a40	cmp w8,#0x7
008c2a44	b.ne 0x008c284c
008c2a48	ldr x8,[x0]
008c2a4c	ldrb w8,[x8, #0x6]
008c2a50	cbz w8,0x008c284c
008c2a54	ldr x8,[x19, #0x68]
008c2a58	ldr q0,[x0]
008c2a5c	mov x0,x19
008c2a60	str q0,[x8]
008c2a64	sub x9,x8,x25
008c2a68	ldr q0,[x1]
008c2a6c	lsr x22,x9,#0x4
008c2a70	mov w1,#0x2
008c2a74	str q0,[x8, #0x10]
008c2a78	ldr q0,[x2]
008c2a7c	mov w2,w22
008c2a80	str q0,[x8, #0x20]
008c2a84	add x8,x8,#0x30
008c2a88	ldr x10,[x19, #0x50]
008c2a8c	str x8,[x19, #0x68]
008c2a90	str x23,[x10, #0x20]
008c2a94	bl 0x008cd928
008c2a98	ldr x25,[x19, #0x70]
008c2a9c	add x8,x25,w22, SXTW  #0x4
008c2aa0	ldr w9,[x8, #0xc]
008c2aa4	cbz w9,0x008c29b0
008c2aa8	cmp w9,#0x1
008c2aac	b.ne 0x008c2ea0
008c2ab0	ldr w8,[x8]
008c2ab4	cbz w8,0x008c29b0
008c2ab8	mov w8,#0x1
008c2abc	add x26,x23,x8, LSL #0x2
008c2ac0	b 0x008be78c
008c2ac4	ldr x8,[x0, #0x20]
008c2ac8	sub x0,x8,#0x80
008c2acc	ldr w8,[x0, #0xc]
008c2ad0	cmp w8,#0x7
008c2ad4	b.ne 0x008c28d8
008c2ad8	ldr x8,[x0]
008c2adc	ldrb w8,[x8, #0x6]
008c2ae0	cbz w8,0x008c28d8
008c2ae4	ldr x8,[x19, #0x68]
008c2ae8	ldr q0,[x0]
008c2aec	mov x0,x19
008c2af0	str q0,[x8]
008c2af4	sub x9,x8,x25
008c2af8	ldr q0,[x1]
008c2afc	lsr x22,x9,#0x4
008c2b00	mov w1,#0x2
008c2b04	str q0,[x8, #0x10]
008c2b08	ldr q0,[x2]
008c2b0c	mov w2,w22
008c2b10	str q0,[x8, #0x20]
008c2b14	add x8,x8,#0x30
008c2b18	ldr x10,[x19, #0x50]
008c2b1c	str x8,[x19, #0x68]
008c2b20	str x23,[x10, #0x20]
008c2b24	bl 0x008cd928
008c2b28	ldr x25,[x19, #0x70]
008c2b2c	add x8,x25,w22, SXTW  #0x4
008c2b30	ldr w9,[x8, #0xc]
008c2b34	cbz w9,0x008c2eac
008c2b38	cmp w9,#0x1
008c2b3c	b.ne 0x008c29b0
008c2b40	ldr w8,[x8]
008c2b44	cbnz w8,0x008c29b0
008c2b48	mov w8,#0x1
008c2b4c	add x26,x23,x8, LSL #0x2
008c2b50	b 0x008be78c
008c2b54	ldr x10,[x19, #0x50]
008c2b58	mov w9,#0x6
008c2b5c	stur x1,[x29, #-0x28]
008c2b60	stur w9,[x29, #-0x1c]
008c2b64	sub x1,x29,#0x28
008c2b68	str w8,[x19, #0x2c]
008c2b6c	b 0x008c2b94
008c2b70	ldr x9,[x23, #0x10]
008c2b74	cbz x9,0x008c2c00
008c2b78	ldr x9,[x19, #0x50]
008c2b7c	mov x0,x19
008c2b80	mov x3,x22
008c2b84	str w8,[x19, #0x2c]
008c2b88	str x26,[x9, #0x20]
008c2b8c	b 0x008c20bc
008c2b90	str w9,[x19, #0x2c]
008c2b94	str x26,[x10, #0x20]
008c2b98	mov x0,x19
008c2b9c	bl 0x008cb374
008c2ba0	b 0x008c20c0
008c2ba4	cmp w8,#0x5
008c2ba8	b.ne 0x008c2bd8
008c2bac	ldr w8,[x2, #0xc]
008c2bb0	cmp w8,#0x5
008c2bb4	b.ne 0x008c2bd8
008c2bb8	ldr x0,[x1]
008c2bbc	ldr x1,[x2]
008c2bc0	bl 0x008cba50
008c2bc4	asr w8,w20,#0x10
008c2bc8	cmp w0,#0x0
008c2bcc	csinc w8,w8,wzr,ge
008c2bd0	add x26,x28,w8, SXTW  #0x2
008c2bd4	b 0x008be78c
008c2bd8	ldr x8,[x19, #0x50]
008c2bdc	mov x0,x19
008c2be0	str x28,[x8, #0x20]
008c2be4	bl 0x008cbab8
008c2be8	asr w8,w20,#0x10
008c2bec	cmp w0,#0x0
008c2bf0	ldr x25,[x19, #0x70]
008c2bf4	csinc w8,w8,wzr,eq
008c2bf8	add x26,x28,w8, SXTW  #0x2
008c2bfc	b 0x008be78c
008c2c00	ldr x1,[x2]
008c2c04	mov x0,x23
008c2c08	bl 0x008bb440
008c2c0c	mov x24,x0
008c2c10	mov w0,#0x2ef0
008c2c14	movk w0,#0x7f, LSL #16
008c2c18	bl 0x008bb3b0
008c2c1c	cmp x24,x0
008c2c20	b.eq 0x008c2c34
008c2c24	ldr w8,[x23, #0x28]
008c2c28	sub w8,w24,w8
008c2c2c	lsr w8,w8,#0x5
008c2c30	strb w8,[x28, #0x3]
008c2c34	ldr q0,[x24]
008c2c38	str q0,[x22]
008c2c3c	b 0x008be78c
008c2c40	cmp w8,#0x8
008c2c44	b.ne 0x008c3184
008c2c48	ldr x8,[x1]
008c2c4c	ldr x0,[x8, #0x8]
008c2c50	cbz x0,0x008c3184
008c2c54	ldrb w8,[x0, #0x6]
008c2c58	tbnz w8,#0x1,0x008c3184
008c2c5c	ldrb w8,[x0, #0x7]
008c2c60	tbnz w8,#0x1,0x008c311c
008c2c64	ldr x8,[x19, #0x60]
008c2c68	mov x21,x1
008c2c6c	mov w1,#0x1
008c2c70	mov x22,x2
008c2c74	mov x23,x3
008c2c78	ldr x8,[x8, #0x340]
008c2c7c	mov x2,x8
008c2c80	bl 0x008bdfe0
008c2c84	mov x2,x22
008c2c88	mov x1,x21
008c2c8c	mov x3,x23
008c2c90	cbnz x0,0x008c3124
008c2c94	b 0x008c3184
008c2c98	ldr x9,[x19, #0x50]
008c2c9c	mov x0,x19
008c2ca0	mov w1,#0xffffffff
008c2ca4	str x28,[x9, #0x20]
008c2ca8	ldr x9,[x19, #0x50]
008c2cac	ldr x10,[x9, #0x20]
008c2cb0	add x10,x10,#0x4
008c2cb4	str x10,[x9, #0x20]
008c2cb8	blr x8
008c2cbc	ldrb w8,[x19, #0x3]
008c2cc0	cbnz w8,0x008c3608
008c2cc4	ldr x25,[x19, #0x70]
008c2cc8	ldr x9,[x19, #0x60]
008c2ccc	b 0x008c15ec
008c2cd0	ldr x9,[x19, #0x50]
008c2cd4	mov x0,x19
008c2cd8	mov w1,#0xffffffff
008c2cdc	str x28,[x9, #0x20]
008c2ce0	ldr x9,[x19, #0x50]
008c2ce4	ldr x10,[x9, #0x20]
008c2ce8	add x10,x10,#0x4
008c2cec	str x10,[x9, #0x20]
008c2cf0	blr x8
008c2cf4	ldrb w8,[x19, #0x3]
008c2cf8	cbnz w8,0x008c3608
008c2cfc	ldr x25,[x19, #0x70]
008c2d00	ldr x9,[x19, #0x60]
008c2d04	b 0x008c170c
008c2d08	cmp w8,#0x5
008c2d0c	b.ne 0x008c2d3c
008c2d10	ldr w8,[x2, #0xc]
008c2d14	cmp w8,#0x5
008c2d18	b.ne 0x008c2d3c
008c2d1c	ldr x0,[x1]
008c2d20	ldr x1,[x2]
008c2d24	bl 0x008cba50
008c2d28	asr w8,w20,#0x10
008c2d2c	cmp w0,#0x0
008c2d30	csinc w8,w8,wzr,lt
008c2d34	add x26,x28,w8, SXTW  #0x2
008c2d38	b 0x008be78c
008c2d3c	ldr x8,[x19, #0x50]
008c2d40	mov x0,x19
008c2d44	str x28,[x8, #0x20]
008c2d48	bl 0x008cbab8
008c2d4c	b 0x008c2d94
008c2d50	cmp w8,#0x5
008c2d54	b.ne 0x008c2d84
008c2d58	ldr w8,[x2, #0xc]
008c2d5c	cmp w8,#0x5
008c2d60	b.ne 0x008c2d84
008c2d64	ldr x0,[x1]
008c2d68	ldr x1,[x2]
008c2d6c	bl 0x008cba50
008c2d70	asr w8,w20,#0x10
008c2d74	cmp w0,#0x1
008c2d78	csinc w8,w8,wzr,lt
008c2d7c	add x26,x28,w8, SXTW  #0x2
008c2d80	b 0x008be78c
008c2d84	ldr x8,[x19, #0x50]
008c2d88	mov x0,x19
008c2d8c	str x28,[x8, #0x20]
008c2d90	bl 0x008cbbf8
008c2d94	asr w8,w20,#0x10
008c2d98	cmp w0,#0x1
008c2d9c	b 0x008c2e90
008c2da0	ubfx x23,x27,#0x8,#0x8
008c2da4	cmp w8,#0x8
008c2da8	b.ne 0x008c3268
008c2dac	ldr x9,[x1]
008c2db0	ldr x8,[x19, #0x60]
008c2db4	ldrb w10,[x9, #0x3]
008c2db8	add x8,x8,x10, LSL #0x3
008c2dbc	ldr x24,[x8, #0x5068]
008c2dc0	cbz x24,0x008c31fc
008c2dc4	ldrb w8,[x24, #0x4]
008c2dc8	ldr x10,[x24, #0x28]
008c2dcc	and w8,w8,w27, LSR #0x18
008c2dd0	add x10,x10,x8, LSL #0x5
008c2dd4	ldr w8,[x10, #0x1c]
008c2dd8	and w11,w8,#0xf
008c2ddc	ldr x8,[x2]
008c2de0	cmp w11,#0x5
008c2de4	b.ne 0x008c31b0
008c2de8	ldr x11,[x10, #0x10]
008c2dec	cmp x11,x8
008c2df0	b.ne 0x008c31b0
008c2df4	ldr w11,[x10, #0xc]
008c2df8	cbz w11,0x008c31b0
008c2dfc	ldr x8,[x10]
008c2e00	add x0,x9,#0x10
008c2e04	mov x1,x22
008c2e08	blr x8
008c2e0c	b 0x008be78c
008c2e10	str x28,[x8, #0x20]
008c2e14	mov x0,x19
008c2e18	mov w1,#0xffffffff
008c2e1c	ldr x8,[x19, #0x50]
008c2e20	ldr x10,[x8, #0x20]
008c2e24	add x10,x10,#0x4
008c2e28	str x10,[x8, #0x20]
008c2e2c	blr x9
008c2e30	ldrb w9,[x19, #0x3]
008c2e34	ldr x8,[x19, #0x50]
008c2e38	cbnz w9,0x008c360c
008c2e3c	ldr x25,[x19, #0x70]
008c2e40	b 0x008c1a48
008c2e44	cmp w8,#0x5
008c2e48	b.ne 0x008c2e78
008c2e4c	ldr w8,[x2, #0xc]
008c2e50	cmp w8,#0x5
008c2e54	b.ne 0x008c2e78
008c2e58	ldr x0,[x1]
008c2e5c	ldr x1,[x2]
008c2e60	bl 0x008cba50
008c2e64	asr w8,w20,#0x10
008c2e68	cmp w0,#0x1
008c2e6c	csinc w8,w8,wzr,ge
008c2e70	add x26,x28,w8, SXTW  #0x2
008c2e74	b 0x008be78c
008c2e78	ldr x8,[x19, #0x50]
008c2e7c	mov x0,x19
008c2e80	str x28,[x8, #0x20]
008c2e84	bl 0x008cbbf8
008c2e88	asr w8,w20,#0x10
008c2e8c	cmp w0,#0x0
008c2e90	csinc w8,w8,wzr,eq
008c2e94	ldr x25,[x19, #0x70]
008c2e98	add x26,x28,w8, SXTW  #0x2
008c2e9c	b 0x008be78c
008c2ea0	mov w8,#0x1
008c2ea4	add x26,x23,x8, LSL #0x2
008c2ea8	b 0x008be78c
008c2eac	mov w8,#0x1
008c2eb0	add x26,x23,x8, LSL #0x2
008c2eb4	b 0x008be78c
008c2eb8	ldr x8,[sp, #0x20]
008c2ebc	ldr s1,[x22, #0x8]
008c2ec0	ldr d2,[x22]
008c2ec4	ldr d0,[x8,x21]
008c2ec8	mov w8,#0x4
008c2ecc	fcvt s0,d0
008c2ed0	fdiv s1,s1,s0
008c2ed4	dup v0.2S,v0.S[0x0]
008c2ed8	fdiv v0.2S,v2.2S,v0.2S
008c2edc	str s1,[x23, #0x8]
008c2ee0	b 0x008c13c0
008c2ee4	ldr d0,[x2]
008c2ee8	ldr s1,[x3, #0x8]
008c2eec	ldr d2,[x3]
008c2ef0	fcvt s0,d0
008c2ef4	fdiv s1,s0,s1
008c2ef8	dup v0.2S,v0.S[0x0]
008c2efc	fdiv v0.2S,v0.2S,v2.2S
008c2f00	str s1,[x1, #0x8]
008c2f04	b 0x008be784
008c2f08	ldr x8,[sp, #0x20]
008c2f0c	ldr d1,[x22]
008c2f10	ldr s2,[x22, #0x8]
008c2f14	ldr d0,[x8,x21]
008c2f18	mov w8,#0x4
008c2f1c	str w8,[x23, #0xc]
008c2f20	fcvt s0,d0
008c2f24	fmul v1.2S,v1.2S,v0.S[0x0]
008c2f28	fmul s0,s2,s0
008c2f2c	str d1,[x23]
008c2f30	str s0,[x23, #0x8]
008c2f34	b 0x008be78c
008c2f38	ldr d0,[x22]
008c2f3c	ldr s1,[x22, #0x8]
008c2f40	str w8,[x23, #0xc]
008c2f44	fneg v0.2S,v0.2S
008c2f48	fneg s1,s1
008c2f4c	str d0,[x23]
008c2f50	str s1,[x23, #0x8]
008c2f54	b 0x008be78c
008c2f58	ldr x8,[x2]
008c2f5c	ldr s0,[x8, #0x14]
008c2f60	mov w8,#0x3
008c2f64	ucvtf d0,d0
008c2f68	b 0x008c1dd8
008c2f6c	ldr x8,[sp, #0x20]
008c2f70	ldr d0,[x8,x21]
008c2f74	b 0x008c300c
008c2f78	ldr d0,[x23]
008c2f7c	ldr d1,[x24]
008c2f80	ldr s2,[x24, #0x8]
008c2f84	str w8,[x22, #0xc]
008c2f88	fcvt s0,d0
008c2f8c	fmul v1.2S,v1.2S,v0.S[0x0]
008c2f90	fmul s0,s2,s0
008c2f94	str d1,[x22]
008c2f98	str s0,[x22, #0x8]
008c2f9c	b 0x008be78c
008c2fa0	ldr d0,[x23]
008c2fa4	ldr s1,[x24, #0x8]
008c2fa8	ldr d2,[x24]
008c2fac	fcvt s0,d0
008c2fb0	fdiv s1,s0,s1
008c2fb4	dup v0.2S,v0.S[0x0]
008c2fb8	fdiv v0.2S,v0.2S,v2.2S
008c2fbc	str s1,[x22, #0x8]
008c2fc0	b 0x008c1dd8
008c2fc4	ldr d0,[x2]
008c2fc8	ldr d1,[x3]
008c2fcc	ldr s2,[x2, #0x8]
008c2fd0	ldr s3,[x3, #0x8]
008c2fd4	fsub v0.2S,v0.2S,v1.2S
008c2fd8	fsub s1,s2,s3
008c2fdc	b 0x008c2ff8
008c2fe0	ldr d0,[x2]
008c2fe4	ldr d1,[x3]
008c2fe8	ldr s2,[x2, #0x8]
008c2fec	ldr s3,[x3, #0x8]
008c2ff0	fadd v0.2S,v0.2S,v1.2S
008c2ff4	fadd s1,s2,s3
008c2ff8	str d0,[x1]
008c2ffc	str s1,[x1, #0x8]
008c3000	str w8,[x1, #0xc]
008c3004	b 0x008be78c
008c3008	ldr d0,[x24]
008c300c	fcvt s0,d0
008c3010	ldr s1,[x23, #0x8]
008c3014	ldr d2,[x23]
008c3018	fcvt d1,s1
008c301c	fcvtl v2.2D,v2.2S
008c3020	fcvt d0,s0
008c3024	fdiv d1,d1,d0
008c3028	dup v0.2D,v0.D[0x0]
008c302c	fdiv v0.2D,v2.2D,v0.2D
008c3030	frintm d1,d1
008c3034	fcvt s1,d1
008c3038	frintm v0.2D,v0.2D
008c303c	fcvtn v0.2S,v0.2D
008c3040	str s1,[x22, #0x8]
008c3044	mov w8,#0x4
008c3048	b 0x008c1dd8
008c304c	mov x0,x19
008c3050	mov x1,x22
008c3054	mov w2,#0x5
008c3058	bl 0x008be028
008c305c	ldr w8,[x0, #0xc]
008c3060	cbnz w8,0x008c263c
008c3064	b 0x008c3704
008c3068	ldr d0,[x24]
008c306c	ldr d1,[x23]
008c3070	mov w8,#0x4
008c3074	ldr s2,[x23, #0x8]
008c3078	str w8,[x22, #0xc]
008c307c	fcvt s0,d0
008c3080	fmul v1.2S,v1.2S,v0.S[0x0]
008c3084	fmul s0,s2,s0
008c3088	str d1,[x22]
008c308c	str s0,[x22, #0x8]
008c3090	b 0x008be78c
008c3094	ldr d0,[x23]
008c3098	ldr d1,[x24]
008c309c	ldr s2,[x23, #0x8]
008c30a0	ldr s3,[x24, #0x8]
008c30a4	fmul v0.2S,v0.2S,v1.2S
008c30a8	fmul s1,s2,s3
008c30ac	b 0x008c30c8
008c30b0	ldr d0,[x23]
008c30b4	ldr d1,[x24]
008c30b8	ldr s2,[x24, #0x8]
008c30bc	fdiv v0.2S,v0.2S,v1.2S
008c30c0	ldr s1,[x23, #0x8]
008c30c4	fdiv s1,s1,s2
008c30c8	str d0,[x22]
008c30cc	str s1,[x22, #0x8]
008c30d0	str w8,[x22, #0xc]
008c30d4	b 0x008be78c
008c30d8	ldr d0,[x24]
008c30dc	ldr s1,[x23, #0x8]
008c30e0	ldr d2,[x23]
008c30e4	fcvt s0,d0
008c30e8	fdiv s1,s1,s0
008c30ec	dup v0.2S,v0.S[0x0]
008c30f0	fdiv v0.2S,v2.2S,v0.2S
008c30f4	b 0x008c3040
008c30f8	ldr x8,[x23, #0x20]
008c30fc	sub x0,x8,#0x40
008c3100	ldr q0,[x1]
008c3104	str q0,[x3, #0x10]
008c3108	ldr q0,[x0]
008c310c	str q0,[x3]
008c3110	ldr x8,[x22]
008c3114	str x8,[x19, #0x8]
008c3118	b 0x008be78c
008c311c	ldr x8,[x0, #0x20]
008c3120	sub x0,x8,#0x20
008c3124	ldr w8,[x0, #0xc]
008c3128	cmp w8,#0x7
008c312c	b.ne 0x008c3184
008c3130	ldr x8,[x0]
008c3134	ldrb w8,[x8, #0x6]
008c3138	cbz w8,0x008c3184
008c313c	ldr x8,[x19, #0x68]
008c3140	ldr q0,[x0]
008c3144	lsr w9,w20,#0x18
008c3148	mov x0,x19
008c314c	str q0,[x8]
008c3150	ldr q0,[x1]
008c3154	mov w1,#0x3
008c3158	str q0,[x8, #0x10]
008c315c	ldr q0,[x2]
008c3160	mov w2,#0xffffffff
008c3164	str q0,[x8, #0x20]
008c3168	ldr q0,[x3]
008c316c	str q0,[x8, #0x30]
008c3170	add x8,x8,#0x40
008c3174	str x8,[x19, #0x68]
008c3178	ldr x8,[x19, #0x50]
008c317c	str w9,[x19, #0x2c]
008c3180	b 0x008c3378
008c3184	ldr x8,[x19, #0x50]
008c3188	mov x0,x19
008c318c	str x26,[x8, #0x20]
008c3190	bl 0x008cb374
008c3194	ldr x25,[x19, #0x70]
008c3198	b 0x008be78c
008c319c	ldr q0,[x1]
008c31a0	str q0,[x3, #0x10]
008c31a4	ldr q0,[x9]
008c31a8	str q0,[x3]
008c31ac	b 0x008be78c
008c31b0	mov x20,x1
008c31b4	mov x0,x24
008c31b8	mov x1,x8
008c31bc	mov x21,x2
008c31c0	bl 0x008bb440
008c31c4	ldr w8,[x0, #0xc]
008c31c8	cbz w8,0x008c31e8
008c31cc	ldr w8,[x24, #0x28]
008c31d0	sub w8,w0,w8
008c31d4	lsr w8,w8,#0x5
008c31d8	strb w8,[x28, #0x3]
008c31dc	ldr x8,[x0]
008c31e0	ldr x9,[x20]
008c31e4	b 0x008c2e00
008c31e8	ldr w8,[x20, #0xc]
008c31ec	mov x1,x20
008c31f0	mov x2,x21
008c31f4	cmp w8,#0x8
008c31f8	b.ne 0x008c3268
008c31fc	ldr x8,[x1]
008c3200	ldr x0,[x8, #0x8]
008c3204	cbz x0,0x008c3264
008c3208	ldrb w8,[x0, #0x6]
008c320c	tbnz w8,#0x0,0x008c3264
008c3210	ldrb w8,[x0, #0x7]
008c3214	tbnz w8,#0x1,0x008c3244
008c3218	ldr x8,[x19, #0x60]
008c321c	mov x20,x1
008c3220	mov w1,wzr
008c3224	mov x21,x2
008c3228	ldr x8,[x8, #0x338]
008c322c	mov x2,x8
008c3230	bl 0x008bdfe0
008c3234	mov x2,x21
008c3238	mov x1,x20
008c323c	cbnz x0,0x008c324c
008c3240	b 0x008c3264
008c3244	ldr x8,[x0, #0x20]
008c3248	sub x0,x8,#0x10
008c324c	ldr w8,[x0, #0xc]
008c3250	cmp w8,#0x7
008c3254	b.ne 0x008c3264
008c3258	ldr x8,[x0]
008c325c	ldrb w8,[x8, #0x6]
008c3260	cbnz w8,0x008c333c
008c3264	ldr w8,[x1, #0xc]
008c3268	cmp w8,#0x4
008c326c	b.ne 0x008c32d4
008c3270	ldr x9,[x2]
008c3274	ldrb w8,[x9, #0x18]
008c3278	orr w8,w8,#0x20
008c327c	sub w8,w8,#0x78
008c3280	cmp w8,#0x2
008c3284	b.hi 0x008c3290
008c3288	ldrb w9,[x9, #0x19]
008c328c	cbz w9,0x008c3304
008c3290	ldr x8,[x19, #0x60]
008c3294	ldr x0,[x8, #0x468]
008c3298	cbz x0,0x008c32e8
008c329c	ldrb w9,[x0, #0x6]
008c32a0	tbnz w9,#0x0,0x008c32e8
008c32a4	ldrb w9,[x0, #0x7]
008c32a8	tbnz w9,#0x1,0x008c331c
008c32ac	ldr x8,[x8, #0x338]
008c32b0	mov x20,x1
008c32b4	mov w1,wzr
008c32b8	mov x21,x2
008c32bc	mov x2,x8
008c32c0	bl 0x008bdfe0
008c32c4	mov x2,x21
008c32c8	mov x1,x20
008c32cc	cbnz x0,0x008c3324
008c32d0	b 0x008c32e8
008c32d4	cmp w8,#0xc
008c32d8	b.ne 0x008c32e8
008c32dc	adrp x8,0xd1f000
008c32e0	ldrb w8,[x8, #0xdd0]
008c32e4	tbnz w8,#0x0,0x008c3414
008c32e8	ldr x8,[x19, #0x50]
008c32ec	mov x0,x19
008c32f0	mov x3,x22
008c32f4	str x26,[x8, #0x20]
008c32f8	bl 0x008cadd4
008c32fc	ldr x25,[x19, #0x70]
008c3300	b 0x008be78c
008c3304	ldr s0,[x1,w8, uxtw #2]
008c3308	mov w8,#0x3
008c330c	str w8,[x22, #0xc]
008c3310	fcvt d0,s0
008c3314	str d0,[x22]
008c3318	b 0x008be78c
008c331c	ldr x8,[x0, #0x20]
008c3320	sub x0,x8,#0x10
008c3324	ldr w8,[x0, #0xc]
008c3328	cmp w8,#0x7
008c332c	b.ne 0x008c32e8
008c3330	ldr x8,[x0]
008c3334	ldrb w8,[x8, #0x6]
008c3338	cbz w8,0x008c32e8
008c333c	ldr x8,[x19, #0x68]
008c3340	ldr q0,[x0]
008c3344	lsr w9,w27,#0x18
008c3348	mov x0,x19
008c334c	str q0,[x8]
008c3350	ldr q0,[x1]
008c3354	mov w1,#0x2
008c3358	str q0,[x8, #0x10]
008c335c	ldr q0,[x2]
008c3360	mov w2,w23
008c3364	str q0,[x8, #0x20]
008c3368	add x8,x8,#0x30
008c336c	str x8,[x19, #0x68]
008c3370	ldr x8,[x19, #0x50]
008c3374	str w9,[x19, #0x2c]
008c3378	str x26,[x8, #0x20]
008c337c	bl 0x008cd928
008c3380	b 0x008c20c0
008c3384	ldr x21,[x1]
008c3388	lsr x8,x27,#0x18
008c338c	mov x23,x1
008c3390	ldr x1,[x22]
008c3394	mov x20,x3
008c3398	ldr x9,[x21, #0x10]
008c339c	ldr w10,[x9, #0x5c]
008c33a0	ldrb w11,[x9, #0x68]
008c33a4	sub w10,w10,w11
008c33a8	cmp w8,w10
008c33ac	b.cs 0x008c33c0
008c33b0	ldr x10,[x9, #0x40]
008c33b4	ldr x10,[x10, x8, LSL #0x3]
008c33b8	cmp x1,x10
008c33bc	b.eq 0x008c347c
008c33c0	ldr x0,[x9, #0x38]
008c33c4	bl 0x008bb440
008c33c8	ldr w8,[x0, #0xc]
008c33cc	cbz w8,0x008c3778
008c33d0	ldr q0,[x23]
008c33d4	ldr d1,[x0]
008c33d8	add x11,x21,#0x20
008c33dc	str q0,[x20, #0x10]
008c33e0	fcvtzu w8,d1
008c33e4	ldr x9,[x21, #0x10]
008c33e8	ldr w10,[x9, #0x58]
008c33ec	add x9,x9,#0x28
008c33f0	cmp w10,w8
008c33f4	csel x9,x11,x9,hi
008c33f8	csel w10,wzr,w10,hi
008c33fc	ldr x9,[x9]
008c3400	sub w10,w8,w10
008c3404	ldr q0,[x9,w10, uxtw #4]
008c3408	str q0,[x20]
008c340c	strb w8,[x28, #0x3]
008c3410	b 0x008be78c
008c3414	ldr x20,[x1]
008c3418	lsr x9,x27,#0x18
008c341c	mov x23,x1
008c3420	ldr x1,[x2]
008c3424	mov x24,x2
008c3428	ldr x8,[x20, #0x10]
008c342c	ldr w10,[x8, #0x5c]
008c3430	ldrb w11,[x8, #0x68]
008c3434	sub w10,w10,w11
008c3438	cmp w9,w10
008c343c	b.cs 0x008c34b4
008c3440	ldr x10,[x8, #0x40]
008c3444	ldr x10,[x10, x9, LSL #0x3]
008c3448	cmp x1,x10
008c344c	b.ne 0x008c34b4
008c3450	ldr w10,[x8, #0x58]
008c3454	subs w10,w9,w10
008c3458	b.cs 0x008c3468
008c345c	ldr x8,[x20, #0x20]
008c3460	add x8,x8,x9, LSL #0x4
008c3464	b 0x008c3470
008c3468	ldr x8,[x8, #0x28]
008c346c	add x8,x8,w10, UXTW  #0x4
008c3470	ldr q0,[x8]
008c3474	str q0,[x22]
008c3478	b 0x008be78c
008c347c	ldr q0,[x23]
008c3480	str q0,[x20, #0x10]
008c3484	ldr x9,[x21, #0x10]
008c3488	ldr w10,[x9, #0x58]
008c348c	subs w10,w8,w10
008c3490	b.cs 0x008c34a0
008c3494	ldr x9,[x21, #0x20]
008c3498	add x8,x9,x8, LSL #0x4
008c349c	b 0x008c34a8
008c34a0	ldr x8,[x9, #0x28]
008c34a4	add x8,x8,w10, UXTW  #0x4
008c34a8	ldr q0,[x8]
008c34ac	str q0,[x20]
008c34b0	b 0x008be78c
008c34b4	ldr x0,[x8, #0x38]
008c34b8	bl 0x008bb440
008c34bc	ldr w8,[x0, #0xc]
008c34c0	cbz w8,0x008c379c
008c34c4	ldr d0,[x0]
008c34c8	ldr x8,[x20, #0x10]
008c34cc	add x11,x20,#0x20
008c34d0	fcvtzu w9,d0
008c34d4	ldr w10,[x8, #0x58]
008c34d8	add x8,x8,#0x28
008c34dc	cmp w10,w9
008c34e0	csel x8,x11,x8,hi
008c34e4	csel w10,wzr,w10,hi
008c34e8	ldr x8,[x8]
008c34ec	sub w10,w9,w10
008c34f0	ldr q0,[x8,w10, uxtw #4]
008c34f4	str q0,[x22]
008c34f8	strb w9,[x28, #0x3]
008c34fc	b 0x008be78c
008c3500	ldr x9,[x1, #0x30]
008c3504	mov x0,x19
008c3508	str x9,[x8, #0x20]
008c350c	ldr w9,[x8, #0x2c]
008c3510	ldr x10,[x19, #0x60]
008c3514	orr w9,w9,#0x4
008c3518	ldr x10,[x10, #0x6f0]
008c351c	str w9,[x8, #0x2c]
008c3520	blr x10
008c3524	cmp w0,#0x1
008c3528	b.ne 0x008c3618
008c352c	ldr x8,[x19, #0x50]
008c3530	ldr x25,[x19, #0x70]
008c3534	ldp x10,x9,[x8]
008c3538	ldr x26,[x8, #0x20]
008c353c	ldr x11,[x9]
008c3540	ldr x8,[x10, #0x28]
008c3544	stp x11,x8,[sp, #0x18]
008c3548	b 0x008be78c
008c354c	ldr x8,[sp, #0x8]
008c3550	ldr x8,[x8, #0x28]
008c3554	ldur x9,[x29, #-0x8]
008c3558	cmp x8,x9
008c355c	b.ne 0x008c37c0
008c3560	adrp x2,0x2db000
008c3564	add x2,x2,#0x8c
008c3568	mov x0,x19
008c356c	mov x1,x22
008c3570	bl 0x008b399c
008c3574	ldr x8,[sp, #0x8]
008c3578	ldr x8,[x8, #0x28]
008c357c	ldur x9,[x29, #-0x8]
008c3580	cmp x8,x9
008c3584	b.ne 0x008c37c0
008c3588	adrp x2,0x2b5000
008c358c	add x2,x2,#0x27b
008c3590	mov x0,x19
008c3594	bl 0x008b399c
008c3598	ldr x9,[sp, #0x8]
008c359c	ldr x9,[x9, #0x28]
008c35a0	ldur x10,[x29, #-0x8]
008c35a4	cmp x9,x10
008c35a8	b.ne 0x008c37c0
008c35ac	adrp x2,0x2ba000
008c35b0	add x2,x2,#0xf84
008c35b4	mov x0,x19
008c35b8	mov x1,x8
008c35bc	bl 0x008b399c
008c35c0	ldr x8,[sp, #0x8]
008c35c4	ldr x8,[x8, #0x28]
008c35c8	ldur x9,[x29, #-0x8]
008c35cc	cmp x8,x9
008c35d0	b.ne 0x008c37c0
008c35d4	adrp x1,0x2d4000
008c35d8	add x1,x1,#0xe6e
008c35dc	mov x0,x19
008c35e0	bl 0x008b39cc
008c35e4	ldr x8,[sp, #0x8]
008c35e8	ldr x8,[x8, #0x28]
008c35ec	ldur x9,[x29, #-0x8]
008c35f0	cmp x8,x9
008c35f4	b.ne 0x008c37c0
008c35f8	adrp x1,0x2b3000
008c35fc	add x1,x1,#0x4b5
008c3600	mov x0,x19
008c3604	bl 0x008b39cc
008c3608	ldr x8,[x19, #0x50]
008c360c	ldr x9,[x8, #0x20]
008c3610	sub x9,x9,#0x4
008c3614	str x9,[x8, #0x20]
008c3618	ldr x8,[sp, #0x8]
008c361c	ldr x8,[x8, #0x28]
008c3620	ldur x9,[x29, #-0x8]
008c3624	cmp x8,x9
008c3628	b.ne 0x008c37c0
008c362c	ldp x20,x19,[sp, #0xd0]
008c3630	ldp x22,x21,[sp, #0xc0]
008c3634	ldp x24,x23,[sp, #0xb0]
008c3638	ldp x26,x25,[sp, #0xa0]
008c363c	ldp x28,x27,[sp, #0x90]
008c3640	ldp x29,x30,[sp, #0x80]
008c3644	add sp,sp,#0xe0
008c3648	ret
008c364c	ldr x8,[x19, #0x50]
008c3650	str x28,[x8, #0x20]
008c3654	ldr x8,[sp, #0x8]
008c3658	ldr x8,[x8, #0x28]
008c365c	ldur x9,[x29, #-0x8]
008c3660	cmp x8,x9
008c3664	b.ne 0x008c37c0
008c3668	adrp x2,0x2c4000
008c366c	add x2,x2,#0xd59
008c3670	mov x0,x19
008c3674	bl 0x008b399c
008c3678	ldr x9,[sp, #0x8]
008c367c	ldr x9,[x9, #0x28]
008c3680	ldur x10,[x29, #-0x8]
008c3684	cmp x9,x10
008c3688	b.ne 0x008c37c0
008c368c	adrp x2,0x2c8000
008c3690	add x2,x2,#0xcab
008c3694	b 0x008c35b4
008c3698	ldr x8,[sp, #0x8]
008c369c	ldr x8,[x8, #0x28]
008c36a0	ldur x9,[x29, #-0x8]
008c36a4	cmp x8,x9
008c36a8	b.ne 0x008c37c0
008c36ac	adrp x1,0x2b6000
008c36b0	add x1,x1,#0xdb9
008c36b4	mov x0,x19
008c36b8	bl 0x008b39cc
008c36bc	ldr x8,[sp, #0x8]
008c36c0	ldr x8,[x8, #0x28]
008c36c4	ldur x9,[x29, #-0x8]
008c36c8	cmp x8,x9
008c36cc	b.ne 0x008c37c0
008c36d0	adrp x2,0x2c8000
008c36d4	add x2,x2,#0xcab
008c36d8	mov x0,x19
008c36dc	bl 0x008b399c
008c36e0	ldr x9,[sp, #0x8]
008c36e4	ldr x2,[x22]
008c36e8	ldr x9,[x9, #0x28]
008c36ec	ldur x10,[x29, #-0x8]
008c36f0	cmp x9,x10
008c36f4	b.ne 0x008c37c0
008c36f8	add x1,x8,#0x10
008c36fc	mov x0,x19
008c3700	bl 0x008b3cbc
008c3704	ldr x8,[x19, #0x50]
008c3708	str x28,[x8, #0x20]
008c370c	ldr x8,[sp, #0x8]
008c3710	ldr x8,[x8, #0x28]
008c3714	ldur x9,[x29, #-0x8]
008c3718	cmp x8,x9
008c371c	b.ne 0x008c37c0
008c3720	adrp x2,0x2c4000
008c3724	add x2,x2,#0xd59
008c3728	b 0x008c3568
008c372c	ldr x8,[sp, #0x8]
008c3730	ldr x8,[x8, #0x28]
008c3734	ldur x9,[x29, #-0x8]
008c3738	cmp x8,x9
008c373c	b.ne 0x008c37c0
008c3740	adrp x1,0x2ad000
008c3744	add x1,x1,#0x23
008c3748	mov x0,x19
008c374c	bl 0x008b39cc
008c3750	str x28,[x8, #0x20]
008c3754	ldr x8,[sp, #0x8]
008c3758	ldr x8,[x8, #0x28]
008c375c	ldur x9,[x29, #-0x8]
008c3760	cmp x8,x9
008c3764	b.ne 0x008c37c0
008c3768	adrp x2,0x2c8000
008c376c	add x2,x2,#0xca6
008c3770	mov x0,x19
008c3774	bl 0x008b399c
008c3778	ldr x8,[sp, #0x8]
008c377c	ldr x8,[x8, #0x28]
008c3780	ldur x9,[x29, #-0x8]
008c3784	cmp x8,x9
008c3788	b.ne 0x008c37c0
008c378c	mov x0,x19
008c3790	mov x1,x23
008c3794	mov x2,x22
008c3798	bl 0x008b3c58
008c379c	ldr x8,[sp, #0x8]
008c37a0	ldr x8,[x8, #0x28]
008c37a4	ldur x9,[x29, #-0x8]
008c37a8	cmp x8,x9
008c37ac	b.ne 0x008c37c0
008c37b0	mov x0,x19
008c37b4	mov x1,x23
008c37b8	mov x2,x24
008c37bc	bl 0x008b3c58
008c37c0	bl 0x00c2fec0
008c37c4	sub sp,sp,#0xe0
008c37c8	stp x29,x30,[sp, #0x80]
008c37cc	stp x28,x27,[sp, #0x90]
008c37d0	stp x26,x25,[sp, #0xa0]
008c37d4	stp x24,x23,[sp, #0xb0]
008c37d8	stp x22,x21,[sp, #0xc0]
008c37dc	stp x20,x19,[sp, #0xd0]
008c37e0	add x29,sp,#0x80
008c37e4	mrs x8,tpidr_el0
008c37e8	mov x19,x0
008c37ec	str x8,[sp]
008c37f0	ldr x8,[x8, #0x28]
008c37f4	stur x8,[x29, #-0x8]
008c37f8	ldr x8,[x0, #0x50]
008c37fc	ldrb w9,[x8, #0x2c]
008c3800	tbz w9,#0x2,0x008c381c
008c3804	ldr x9,[x19, #0x60]
008c3808	ldr x1,[x8]
008c380c	mov x0,x19
008c3810	ldr x8,[x9, #0x6f0]
008c3814	blr x8
008c3818	cbz w0,0x008c8794
008c381c	str x19,[sp, #0x20]
008c3820	ldr x8,[x19, #0x50]
008c3824	adrp x26,0xc4d000
008c3828	add x26,x26,#0xa78
008c382c	ldr x25,[x19, #0x70]
008c3830	ldr x28,[x8, #0x20]
008c3834	ldp x8,x9,[x8]
008c3838	ldrb w10,[x28]
008c383c	ldr x27,[x8, #0x28]
008c3840	ldr x24,[x9]
008c3844	ldr x8,[x26, x10, LSL #0x3]
008c3848	br x8
008c384c	ldr w8,[x28]
008c3850	mov w11,#0x1
008c3854	lsr x9,x8,#0x8
008c3858	lsr x10,x8,#0x16
008c385c	ubfx w8,w8,#0x10,#0x8
008c3860	add x9,x25,w9, UXTB  #0x4
008c3864	and x10,x10,#0x3fc
008c3868	add x28,x28,x10
008c386c	str w8,[x9]
008c3870	str w11,[x9, #0xc]
008c3874	b 0x008c86bc
008c3878	ldr w8,[x28]
008c387c	asr w9,w8,#0x10
008c3880	lsr x8,x8,#0x8
008c3884	scvtf d0,w9
008c3888	add x8,x25,w8, UXTB  #0x4
008c388c	mov w9,#0x3
008c3890	str w9,[x8, #0xc]
008c3894	str d0,[x8]
008c3898	b 0x008c86bc
008c389c	ldr w8,[x28]
008c38a0	asr w9,w8,#0x10
008c38a4	ubfx x8,x8,#0x8,#0x8
008c38a8	ldr q0,[x27,w9, sxtw #4]
008c38ac	str q0,[x25,x8, lsl #4]
008c38b0	b 0x008c86bc
008c38b4	ldr w8,[x28]
008c38b8	ubfx x9,x8,#0x10,#0x8
008c38bc	ubfx x8,x8,#0x8,#0x8
008c38c0	ldr q0,[x25,x9, lsl #4]
008c38c4	str q0,[x25,x8, lsl #4]
008c38c8	b 0x008c86bc
008c38cc	ldr x9,[x24, #0x10]
008c38d0	add x20,x28,#0x8
008c38d4	ldp w11,w12,[x28]
008c38d8	ldrb w8,[x9, #0x4]
008c38dc	ldr x10,[x9, #0x28]
008c38e0	and w8,w8,w11, LSR #0x18
008c38e4	lsr x11,x11,#0x8
008c38e8	add x2,x27,x12, LSL #0x4
008c38ec	add x10,x10,x8, LSL #0x5
008c38f0	add x3,x25,w11, UXTB  #0x4
008c38f4	ldr w13,[x10, #0x1c]
008c38f8	and w13,w13,#0xf
008c38fc	cmp w13,#0x5
008c3900	b.ne 0x008c392c
008c3904	ldr x11,[x10, #0x10]
008c3908	ldr x12,[x2]
008c390c	cmp x11,x12
008c3910	b.ne 0x008c392c
008c3914	ldr w11,[x10, #0xc]
008c3918	cbz w11,0x008c392c
008c391c	ldr q0,[x10]
008c3920	str q0,[x3]
008c3924	ldrb w8,[x20]
008c3928	b 0x008c3a18
008c392c	ldr x10,[x19, #0x50]
008c3930	stur x9,[x29, #-0x18]
008c3934	mov w9,#0x6
008c3938	sub x1,x29,#0x18
008c393c	mov x0,x19
008c3940	stur w9,[x29, #-0xc]
008c3944	str w8,[x19, #0x2c]
008c3948	str x20,[x10, #0x20]
008c394c	bl 0x008cadd4
008c3950	ldrb w8,[x19, #0x2c]
008c3954	ldrb w9,[x28, #0x8]
008c3958	ldr x25,[x19, #0x70]
008c395c	strb w8,[x28, #0x3]
008c3960	b 0x008c775c
008c3964	ldr x1,[x24, #0x10]
008c3968	add x20,x28,#0x8
008c396c	ldp w10,w11,[x28]
008c3970	ldrb w8,[x1, #0x4]
008c3974	ldr x9,[x1, #0x28]
008c3978	and w8,w8,w10, LSR #0x18
008c397c	lsr x10,x10,#0x8
008c3980	add x2,x27,x11, LSL #0x4
008c3984	add x9,x9,x8, LSL #0x5
008c3988	add x3,x25,w10, UXTB  #0x4
008c398c	ldr w12,[x9, #0x1c]
008c3990	and w12,w12,#0xf
008c3994	cmp w12,#0x5
008c3998	b.ne 0x008c39f0
008c399c	ldr x10,[x9, #0x10]
008c39a0	ldr x11,[x2]
008c39a4	cmp x10,x11
008c39a8	b.ne 0x008c39f0
008c39ac	ldr w10,[x9, #0xc]
008c39b0	cbz w10,0x008c39f0
008c39b4	ldrb w10,[x1, #0x7]
008c39b8	cbnz w10,0x008c39f0
008c39bc	ldr q0,[x3]
008c39c0	str q0,[x9]
008c39c4	ldr w8,[x3, #0xc]
008c39c8	cmp w8,#0x5
008c39cc	b.lt 0x008c3a14
008c39d0	ldrb w8,[x1, #0x2]
008c39d4	tbz w8,#0x2,0x008c3a14
008c39d8	ldr x2,[x3]
008c39dc	ldrb w8,[x2, #0x2]
008c39e0	tst w8,#0x3
008c39e4	b.eq 0x008c3a14
008c39e8	mov x0,x19
008c39ec	b 0x008c3a10
008c39f0	ldr x10,[x19, #0x50]
008c39f4	mov w9,#0x6
008c39f8	stur x1,[x29, #-0x28]
008c39fc	stur w9,[x29, #-0x1c]
008c3a00	sub x1,x29,#0x28
008c3a04	str w8,[x19, #0x2c]
008c3a08	str x20,[x10, #0x20]
008c3a0c	b 0x008c4074
008c3a10	bl 0x008b6370
008c3a14	ldrb w8,[x20]
008c3a18	ldr x8,[x26, x8, LSL #0x3]
008c3a1c	mov x28,x20
008c3a20	br x8
008c3a24	ldr w8,[x28], #0x4
008c3a28	lsr x9,x8,#0x10
008c3a2c	add x9,x24,w9, UXTB  #0x4
008c3a30	ldr w10,[x9, #0x2c]
008c3a34	add x9,x9,#0x20
008c3a38	cmp w10,#0xf
008c3a3c	b.ne 0x008c3a48
008c3a40	ldr x9,[x9]
008c3a44	ldr x9,[x9, #0x8]
008c3a48	lsr x8,x8,#0x8
008c3a4c	ldr q0,[x9]
008c3a50	add x8,x25,w8, UXTB  #0x4
008c3a54	str q0,[x8]
008c3a58	ldrb w8,[x28]
008c3a5c	ldr x8,[x26, x8, LSL #0x3]
008c3a60	br x8
008c3a64	ldr w8,[x28], #0x4
008c3a68	lsr x9,x8,#0x10
008c3a6c	lsr x8,x8,#0x8
008c3a70	add x9,x24,w9, UXTB  #0x4
008c3a74	add x8,x25,w8, UXTB  #0x4
008c3a78	ldr x1,[x9, #0x20]
008c3a7c	ldr q0,[x8]
008c3a80	ldr x9,[x1, #0x8]
008c3a84	str q0,[x9]
008c3a88	ldr w9,[x8, #0xc]
008c3a8c	cmp w9,#0x5
008c3a90	b.lt 0x008c3ab4
008c3a94	ldrb w9,[x1, #0x2]
008c3a98	tbz w9,#0x2,0x008c3ab4
008c3a9c	ldr x2,[x8]
008c3aa0	ldrb w8,[x2, #0x2]
008c3aa4	tst w8,#0x3
008c3aa8	b.eq 0x008c3ab4
008c3aac	mov x0,x19
008c3ab0	bl 0x008b6188
008c3ab4	ldrb w8,[x28]
008c3ab8	ldr x8,[x26, x8, LSL #0x3]
008c3abc	br x8
008c3ac0	ldr x8,[x19, #0x30]
008c3ac4	cbz x8,0x008c3ae4
008c3ac8	ldrb w9,[x28, #0x1]
008c3acc	ldr x8,[x8, #0x8]
008c3ad0	add x1,x25,x9, LSL #0x4
008c3ad4	cmp x8,x1
008c3ad8	b.cc 0x008c3ae4
008c3adc	mov x0,x19
008c3ae0	bl 0x008b4fa4
008c3ae4	ldrb w8,[x28, #0x4]!
008c3ae8	ldr x8,[x26, x8, LSL #0x3]
008c3aec	br x8
008c3af0	ldr w9,[x28]
008c3af4	asr w8,w9,#0x10
008c3af8	lsr x9,x9,#0x8
008c3afc	add x8,x27,w8, SXTW  #0x4
008c3b00	add x3,x25,w9, UXTB  #0x4
008c3b04	ldr w10,[x8, #0xc]
008c3b08	cbz w10,0x008c3b2c
008c3b0c	ldr x9,[x24, #0x10]
008c3b10	ldrb w9,[x9, #0x3]
008c3b14	cbz w9,0x008c3b2c
008c3b18	ldr q0,[x8]
008c3b1c	str q0,[x3]
008c3b20	ldrb w8,[x28, #0x8]!
008c3b24	ldr x8,[x26, x8, LSL #0x3]
008c3b28	br x8
008c3b2c	ldr x8,[x19, #0x50]
008c3b30	add x20,x28,#0x8
008c3b34	ldr w4,[x28, #0x4]
008c3b38	mov x0,x19
008c3b3c	mov x2,x27
008c3b40	mov w5,wzr
008c3b44	str x20,[x8, #0x20]
008c3b48	ldr x1,[x24, #0x10]
008c3b4c	bl 0x008c8e84
008c3b50	ldrb w8,[x28, #0x8]
008c3b54	ldr x25,[x19, #0x70]
008c3b58	b 0x008c3a18
008c3b5c	ldp w20,w9,[x28]
008c3b60	mov x21,x24
008c3b64	add x24,x28,#0x8
008c3b68	lsr x8,x20,#0x10
008c3b6c	lsr x10,x20,#0x8
008c3b70	add x2,x27,x9, LSL #0x4
008c3b74	add x1,x25,w8, UXTB  #0x4
008c3b78	add x22,x25,w10, UXTB  #0x4
008c3b7c	ldr w8,[x1, #0xc]
008c3b80	cmp w8,#0x6
008c3b84	b.ne 0x008c3c54
008c3b88	ldr x23,[x1]
008c3b8c	ldrb w8,[x23, #0x4]
008c3b90	ldr x9,[x23, #0x28]
008c3b94	and w8,w8,w20, LSR #0x18
008c3b98	add x9,x9,x8, LSL #0x5
008c3b9c	ldr w10,[x9, #0x1c]
008c3ba0	and w10,w10,#0xf
008c3ba4	cmp w10,#0x5
008c3ba8	b.ne 0x008c3be0
008c3bac	ldr x10,[x9, #0x10]
008c3bb0	ldr x11,[x2]
008c3bb4	cmp x10,x11
008c3bb8	b.ne 0x008c3be0
008c3bbc	ldr w10,[x9, #0xc]
008c3bc0	cbz w10,0x008c3be0
008c3bc4	ldr q0,[x9]
008c3bc8	str q0,[x22]
008c3bcc	ldrb w8,[x24]
008c3bd0	ldr x8,[x26, x8, LSL #0x3]
008c3bd4	mov x28,x24
008c3bd8	mov x24,x21
008c3bdc	br x8
008c3be0	ldr x9,[x23, #0x10]
008c3be4	cbz x9,0x008c3c18
008c3be8	ldr x9,[x19, #0x50]
008c3bec	mov x0,x19
008c3bf0	mov x3,x22
008c3bf4	str w8,[x19, #0x2c]
008c3bf8	str x24,[x9, #0x20]
008c3bfc	bl 0x008cadd4
008c3c00	ldrb w8,[x19, #0x2c]
008c3c04	ldrb w9,[x28, #0x8]
008c3c08	ldr x25,[x19, #0x70]
008c3c0c	strb w8,[x28, #0x3]
008c3c10	ldr x8,[x26, x9, LSL #0x3]
008c3c14	b 0x008c3bd4
008c3c18	ldr x1,[x2]
008c3c1c	mov x0,x23
008c3c20	bl 0x008bb440
008c3c24	mov x20,x0
008c3c28	mov w0,#0x2ef0
008c3c2c	movk w0,#0x7f, LSL #16
008c3c30	bl 0x008bb3b0
008c3c34	cmp x20,x0
008c3c38	b.eq 0x008c3c4c
008c3c3c	ldr w8,[x23, #0x28]
008c3c40	sub w8,w20,w8
008c3c44	lsr w8,w8,#0x5
008c3c48	strb w8,[x28, #0x3]
008c3c4c	ldr q0,[x20]
008c3c50	b 0x008c3bc8
008c3c54	ubfx x12,x20,#0x8,#0x8
008c3c58	cmp w8,#0x8
008c3c5c	b.ne 0x008c3d9c
008c3c60	ldr x9,[x1]
008c3c64	ldr x8,[x19, #0x60]
008c3c68	ldrb w10,[x9, #0x3]
008c3c6c	add x8,x8,x10, LSL #0x3
008c3c70	ldr x23,[x8, #0x5068]
008c3c74	cbz x23,0x008c3d30
008c3c78	ldrb w8,[x23, #0x4]
008c3c7c	ldr x10,[x23, #0x28]
008c3c80	and w8,w8,w20, LSR #0x18
008c3c84	add x10,x10,x8, LSL #0x5
008c3c88	ldr w8,[x10, #0x1c]
008c3c8c	and w11,w8,#0xf
008c3c90	ldr x8,[x2]
008c3c94	cmp w11,#0x5
008c3c98	b.ne 0x008c3cc4
008c3c9c	ldr x11,[x10, #0x10]
008c3ca0	cmp x11,x8
008c3ca4	b.ne 0x008c3cc4
008c3ca8	ldr w11,[x10, #0xc]
008c3cac	cbz w11,0x008c3cc4
008c3cb0	ldr x8,[x10]
008c3cb4	add x0,x9,#0x10
008c3cb8	mov x1,x22
008c3cbc	blr x8
008c3cc0	b 0x008c3bcc
008c3cc4	mov x19,x1
008c3cc8	mov x0,x23
008c3ccc	mov x1,x8
008c3cd0	str x12,[sp, #0x18]
008c3cd4	mov x26,x2
008c3cd8	bl 0x008bb440
008c3cdc	ldr w8,[x0, #0xc]
008c3ce0	cbz w8,0x008c3d10
008c3ce4	ldr w8,[x23, #0x28]
008c3ce8	mov x1,x22
008c3cec	sub w8,w0,w8
008c3cf0	lsr w8,w8,#0x5
008c3cf4	strb w8,[x28, #0x3]
008c3cf8	ldr x9,[x19]
008c3cfc	ldr x8,[x0]
008c3d00	add x0,x9,#0x10
008c3d04	blr x8
008c3d08	ldrb w8,[x28, #0x8]
008c3d0c	b 0x008c3f2c
008c3d10	mov x1,x19
008c3d14	ldr w8,[x19, #0xc]
008c3d18	mov x2,x26
008c3d1c	ldp x12,x19,[sp, #0x18]
008c3d20	adrp x26,0xc4d000
008c3d24	add x26,x26,#0xa78
008c3d28	cmp w8,#0x8
008c3d2c	b.ne 0x008c3d9c
008c3d30	ldr x8,[x1]
008c3d34	ldr x0,[x8, #0x8]
008c3d38	cbz x0,0x008c3d98
008c3d3c	ldrb w8,[x0, #0x6]
008c3d40	tbnz w8,#0x0,0x008c3d98
008c3d44	ldrb w8,[x0, #0x7]
008c3d48	tbnz w8,#0x1,0x008c3d78
008c3d4c	ldr x8,[x19, #0x60]
008c3d50	stp x2,x1,[sp, #0x10]
008c3d54	mov w1,wzr
008c3d58	mov x23,x12
008c3d5c	ldr x8,[x8, #0x338]
008c3d60	mov x2,x8
008c3d64	bl 0x008bdfe0
008c3d68	ldp x2,x1,[sp, #0x10]
008c3d6c	mov x12,x23
008c3d70	cbnz x0,0x008c3d80
008c3d74	b 0x008c3d98
008c3d78	ldr x8,[x0, #0x20]
008c3d7c	sub x0,x8,#0x10
008c3d80	ldr w8,[x0, #0xc]
008c3d84	cmp w8,#0x7
008c3d88	b.ne 0x008c3d98
008c3d8c	ldr x8,[x0]
008c3d90	ldrb w8,[x8, #0x6]
008c3d94	cbnz w8,0x008c3e7c
008c3d98	ldr w8,[x1, #0xc]
008c3d9c	cmp w8,#0x4
008c3da0	b.ne 0x008c3e10
008c3da4	ldr x9,[x2]
008c3da8	ldrb w8,[x9, #0x18]
008c3dac	orr w8,w8,#0x20
008c3db0	sub w8,w8,#0x78
008c3db4	cmp w8,#0x2
008c3db8	b.hi 0x008c3dc4
008c3dbc	ldrb w9,[x9, #0x19]
008c3dc0	cbz w9,0x008c3e44
008c3dc4	ldr x8,[x19, #0x60]
008c3dc8	ldr x0,[x8, #0x468]
008c3dcc	cbz x0,0x008c3e24
008c3dd0	ldrb w9,[x0, #0x6]
008c3dd4	tbnz w9,#0x0,0x008c3e24
008c3dd8	ldrb w9,[x0, #0x7]
008c3ddc	tbnz w9,#0x1,0x008c3e5c
008c3de0	ldr x8,[x8, #0x338]
008c3de4	str x1,[sp, #0x18]
008c3de8	mov w1,wzr
008c3dec	mov x23,x2
008c3df0	mov x25,x12
008c3df4	mov x2,x8
008c3df8	bl 0x008bdfe0
008c3dfc	ldr x1,[sp, #0x18]
008c3e00	mov x12,x25
008c3e04	mov x2,x23
008c3e08	cbnz x0,0x008c3e64
008c3e0c	b 0x008c3e24
008c3e10	cmp w8,#0xc
008c3e14	b.ne 0x008c3e24
008c3e18	adrp x8,0xd1f000
008c3e1c	ldrb w8,[x8, #0xdd0]
008c3e20	tbnz w8,#0x0,0x008c3ec4
008c3e24	ldr x8,[x19, #0x50]
008c3e28	mov x0,x19
008c3e2c	mov x3,x22
008c3e30	str x24,[x8, #0x20]
008c3e34	bl 0x008cadd4
008c3e38	ldrb w8,[x24]
008c3e3c	ldr x25,[x19, #0x70]
008c3e40	b 0x008c3bd0
008c3e44	ldr s0,[x1,w8, uxtw #2]
008c3e48	mov w8,#0x3
008c3e4c	str w8,[x22, #0xc]
008c3e50	fcvt d0,s0
008c3e54	str d0,[x22]
008c3e58	b 0x008c3bcc
008c3e5c	ldr x8,[x0, #0x20]
008c3e60	sub x0,x8,#0x10
008c3e64	ldr w8,[x0, #0xc]
008c3e68	cmp w8,#0x7
008c3e6c	b.ne 0x008c3e24
008c3e70	ldr x8,[x0]
008c3e74	ldrb w8,[x8, #0x6]
008c3e78	cbz w8,0x008c3e24
008c3e7c	ldr x8,[x19, #0x68]
008c3e80	ldr q0,[x0]
008c3e84	lsr w9,w20,#0x18
008c3e88	mov x0,x19
008c3e8c	str q0,[x8]
008c3e90	ldr q0,[x1]
008c3e94	mov w1,#0x2
008c3e98	str q0,[x8, #0x10]
008c3e9c	ldr q0,[x2]
008c3ea0	mov w2,w12
008c3ea4	str q0,[x8, #0x20]
008c3ea8	add x8,x8,#0x30
008c3eac	str x8,[x19, #0x68]
008c3eb0	ldr x8,[x19, #0x50]
008c3eb4	str w9,[x19, #0x2c]
008c3eb8	str x24,[x8, #0x20]
008c3ebc	bl 0x008cd928
008c3ec0	b 0x008c3c00
008c3ec4	ldr x19,[x1]
008c3ec8	lsr x9,x20,#0x18
008c3ecc	str x1,[sp, #0x18]
008c3ed0	ldr x1,[x2]
008c3ed4	mov x23,x2
008c3ed8	ldr x8,[x19, #0x10]
008c3edc	ldr w10,[x8, #0x5c]
008c3ee0	ldrb w11,[x8, #0x68]
008c3ee4	sub w10,w10,w11
008c3ee8	cmp w9,w10
008c3eec	b.cs 0x008c3f48
008c3ef0	ldr x10,[x8, #0x40]
008c3ef4	ldr x10,[x10, x9, LSL #0x3]
008c3ef8	cmp x1,x10
008c3efc	b.ne 0x008c3f48
008c3f00	ldr w10,[x8, #0x58]
008c3f04	subs w10,w9,w10
008c3f08	b.cs 0x008c3f18
008c3f0c	ldr x8,[x19, #0x20]
008c3f10	add x8,x8,x9, LSL #0x4
008c3f14	b 0x008c3f20
008c3f18	ldr x8,[x8, #0x28]
008c3f1c	add x8,x8,w10, UXTW  #0x4
008c3f20	ldr q0,[x8]
008c3f24	str q0,[x22]
008c3f28	ldrb w8,[x24]
008c3f2c	adrp x26,0xc4d000
008c3f30	add x26,x26,#0xa78
008c3f34	ldr x8,[x26, x8, LSL #0x3]
008c3f38	ldr x19,[sp, #0x20]
008c3f3c	mov x28,x24
008c3f40	mov x24,x21
008c3f44	br x8
008c3f48	ldr x0,[x8, #0x38]
008c3f4c	bl 0x008bb440
008c3f50	ldr w8,[x0, #0xc]
008c3f54	cbz w8,0x008c88fc
008c3f58	ldr d0,[x0]
008c3f5c	ldr x9,[x19, #0x10]
008c3f60	add x11,x19,#0x20
008c3f64	adrp x26,0xc4d000
008c3f68	add x26,x26,#0xa78
008c3f6c	fcvtzu w8,d0
008c3f70	ldr w10,[x9, #0x58]
008c3f74	add x9,x9,#0x28
008c3f78	cmp w10,w8
008c3f7c	csel x9,x11,x9,hi
008c3f80	csel w10,wzr,w10,hi
008c3f84	ldr x9,[x9]
008c3f88	sub w10,w8,w10
008c3f8c	ldr q0,[x9,w10, uxtw #4]
008c3f90	str q0,[x22]
008c3f94	ldrb w9,[x28, #0x8]
008c3f98	strb w8,[x28, #0x3]
008c3f9c	ldr x8,[x26, x9, LSL #0x3]
008c3fa0	b 0x008c3f38
008c3fa4	ldp w21,w9,[x28]
008c3fa8	add x20,x28,#0x8
008c3fac	lsr x8,x21,#0x10
008c3fb0	lsr x10,x21,#0x8
008c3fb4	add x2,x27,x9, LSL #0x4
008c3fb8	add x1,x25,w8, UXTB  #0x4
008c3fbc	add x3,x25,w10, UXTB  #0x4
008c3fc0	ldr w8,[x1, #0xc]
008c3fc4	cmp w8,#0x6
008c3fc8	b.ne 0x008c40cc
008c3fcc	ldr x22,[x1]
008c3fd0	ldrb w8,[x22, #0x4]
008c3fd4	ldr x9,[x22, #0x28]
008c3fd8	and w8,w8,w21, LSR #0x18
008c3fdc	add x9,x9,x8, LSL #0x5
008c3fe0	ldr w10,[x9, #0x1c]
008c3fe4	and w10,w10,#0xf
008c3fe8	cmp w10,#0x5
008c3fec	b.ne 0x008c4048
008c3ff0	ldr x10,[x9, #0x10]
008c3ff4	ldr x11,[x2]
008c3ff8	cmp x10,x11
008c3ffc	b.ne 0x008c4048
008c4000	ldr w10,[x9, #0xc]
008c4004	cbz w10,0x008c4048
008c4008	ldrb w10,[x22, #0x7]
008c400c	cbnz w10,0x008c4048
008c4010	ldr q0,[x3]
008c4014	str q0,[x9]
008c4018	ldr w8,[x3, #0xc]
008c401c	cmp w8,#0x5
008c4020	b.lt 0x008c3a14
008c4024	ldrb w8,[x22, #0x2]
008c4028	tbz w8,#0x2,0x008c3a14
008c402c	ldr x2,[x3]
008c4030	ldrb w8,[x2, #0x2]
008c4034	tst w8,#0x3
008c4038	b.eq 0x008c3a14
008c403c	mov x0,x19
008c4040	mov x1,x22
008c4044	b 0x008c3a10
008c4048	ldr x9,[x22, #0x10]
008c404c	cbz x9,0x008c4060
008c4050	ldrb w10,[x9, #0x6]
008c4054	ldr x9,[x19, #0x50]
008c4058	tbnz w10,#0x1,0x008c4064
008c405c	b 0x008c406c
008c4060	ldr x9,[x19, #0x50]
008c4064	ldrb w10,[x22, #0x7]
008c4068	cbz w10,0x008c4080
008c406c	str w8,[x19, #0x2c]
008c4070	str x20,[x9, #0x20]
008c4074	mov x0,x19
008c4078	bl 0x008cb374
008c407c	b 0x008c3950
008c4080	str x20,[x9, #0x20]
008c4084	mov x0,x19
008c4088	mov x1,x22
008c408c	ldr x2,[x2]
008c4090	mov x21,x3
008c4094	bl 0x008bce4c
008c4098	ldr w9,[x22, #0x28]
008c409c	sub w9,w0,w9
008c40a0	lsr w9,w9,#0x5
008c40a4	strb w9,[x28, #0x3]
008c40a8	ldr q0,[x21]
008c40ac	str q0,[x0]
008c40b0	ldr w9,[x21, #0xc]
008c40b4	cmp w9,#0x5
008c40b8	b.lt 0x008c3a14
008c40bc	ldrb w9,[x22, #0x2]
008c40c0	tbz w9,#0x2,0x008c3a14
008c40c4	ldr x2,[x21]
008c40c8	b 0x008c4030
008c40cc	cmp w8,#0x8
008c40d0	b.ne 0x008c41a0
008c40d4	ldr x8,[x1]
008c40d8	ldr x0,[x8, #0x8]
008c40dc	cbz x0,0x008c41a0
008c40e0	ldrb w8,[x0, #0x6]
008c40e4	tbnz w8,#0x1,0x008c41a0
008c40e8	ldrb w8,[x0, #0x7]
008c40ec	tbnz w8,#0x1,0x008c4130
008c40f0	ldr x8,[x19, #0x60]
008c40f4	mov x22,x1
008c40f8	mov w1,#0x1
008c40fc	mov x23,x2
008c4100	mov x19,x24
008c4104	mov x24,x3
008c4108	ldr x8,[x8, #0x340]
008c410c	mov x2,x8
008c4110	bl 0x008bdfe0
008c4114	mov x3,x24
008c4118	mov x24,x19
008c411c	ldr x19,[sp, #0x20]
008c4120	mov x2,x23
008c4124	mov x1,x22
008c4128	cbnz x0,0x008c4138
008c412c	b 0x008c41a0
008c4130	ldr x8,[x0, #0x20]
008c4134	sub x0,x8,#0x20
008c4138	ldr w8,[x0, #0xc]
008c413c	cmp w8,#0x7
008c4140	b.ne 0x008c41a0
008c4144	ldr x8,[x0]
008c4148	ldrb w8,[x8, #0x6]
008c414c	cbz w8,0x008c41a0
008c4150	ldr x8,[x19, #0x68]
008c4154	ldr q0,[x0]
008c4158	lsr w9,w21,#0x18
008c415c	mov x0,x19
008c4160	str q0,[x8]
008c4164	ldr q0,[x1]
008c4168	mov w1,#0x3
008c416c	str q0,[x8, #0x10]
008c4170	ldr q0,[x2]
008c4174	mov w2,#0xffffffff
008c4178	str q0,[x8, #0x20]
008c417c	ldr q0,[x3]
008c4180	str q0,[x8, #0x30]
008c4184	add x8,x8,#0x40
008c4188	str x8,[x19, #0x68]
008c418c	ldr x8,[x19, #0x50]
008c4190	str w9,[x19, #0x2c]
008c4194	str x20,[x8, #0x20]
008c4198	bl 0x008cd928
008c419c	b 0x008c3950
008c41a0	ldr x8,[x19, #0x50]
008c41a4	mov x0,x19
008c41a8	str x20,[x8, #0x20]
008c41ac	bl 0x008cb374
008c41b0	ldrb w8,[x20]
008c41b4	ldr x25,[x19, #0x70]
008c41b8	b 0x008c3a18
008c41bc	ldr w8,[x28], #0x4
008c41c0	lsr x9,x8,#0x10
008c41c4	add x1,x25,w9, UXTB  #0x4
008c41c8	lsr x9,x8,#0x8
008c41cc	lsr x8,x8,#0x14
008c41d0	ldr w10,[x1, #0xc]
008c41d4	add x3,x25,w9, UXTB  #0x4
008c41d8	and x8,x8,#0xff0
008c41dc	add x2,x25,x8
008c41e0	cmp w10,#0x6
008c41e4	b.ne 0x008c4230
008c41e8	ldr w8,[x2, #0xc]
008c41ec	cmp w8,#0x3
008c41f0	b.ne 0x008c4230
008c41f4	ldr d0,[x2]
008c41f8	ldr x8,[x1]
008c41fc	fcvtzs w10,d0
008c4200	ldr w11,[x8, #0x8]
008c4204	sub w9,w10,#0x1
008c4208	cmp w9,w11
008c420c	b.cs 0x008c4230
008c4210	scvtf d1,w10
008c4214	ldr x10,[x8, #0x10]
008c4218	fcmp d0,d1
008c421c	ccmp x10,#0x0,#0x0,eq
008c4220	b.ne 0x008c4230
008c4224	ldr x8,[x8, #0x20]
008c4228	ldr q0,[x8,w9, uxtw #4]
008c422c	b 0x008c423c
008c4230	ldr x8,[x19, #0x50]
008c4234	str x28,[x8, #0x20]
008c4238	b 0x008c424c
008c423c	str q0,[x3]
008c4240	ldrb w8,[x28]
008c4244	ldr x8,[x26, x8, LSL #0x3]
008c4248	br x8
008c424c	mov x0,x19
008c4250	bl 0x008cadd4
008c4254	b 0x008c450c
008c4258	ldr w8,[x28], #0x4
008c425c	lsr x9,x8,#0x10
008c4260	add x1,x25,w9, UXTB  #0x4
008c4264	lsr x9,x8,#0x8
008c4268	lsr x8,x8,#0x14
008c426c	ldr w10,[x1, #0xc]
008c4270	add x3,x25,w9, UXTB  #0x4
008c4274	and x8,x8,#0xff0
008c4278	add x2,x25,x8
008c427c	cmp w10,#0x6
008c4280	b.ne 0x008c42d8
008c4284	ldr w8,[x2, #0xc]
008c4288	cmp w8,#0x3
008c428c	b.ne 0x008c42d8
008c4290	ldr d0,[x2]
008c4294	ldr x8,[x1]
008c4298	fcvtzs w10,d0
008c429c	ldr w11,[x8, #0x8]
008c42a0	sub w9,w10,#0x1
008c42a4	cmp w9,w11
008c42a8	b.cs 0x008c42d8
008c42ac	ldr x11,[x8, #0x10]
008c42b0	cbnz x11,0x008c42d8
008c42b4	scvtf d1,w10
008c42b8	ldrb w10,[x8, #0x7]
008c42bc	fcmp d0,d1
008c42c0	ccmp w10,#0x0,#0x0,eq
008c42c4	b.ne 0x008c42d8
008c42c8	ldr x10,[x8, #0x20]
008c42cc	ldr q0,[x3]
008c42d0	str q0,[x10,w9, uxtw #4]
008c42d4	b 0x008c42e4
008c42d8	ldr x8,[x19, #0x50]
008c42dc	str x28,[x8, #0x20]
008c42e0	b 0x008c4320
008c42e4	ldr w9,[x3, #0xc]
008c42e8	cmp w9,#0x5
008c42ec	b.lt 0x008c3ab4
008c42f0	ldrb w9,[x8, #0x2]
008c42f4	tbz w9,#0x2,0x008c3ab4
008c42f8	ldr x2,[x3]
008c42fc	ldrb w9,[x2, #0x2]
008c4300	tst w9,#0x3
008c4304	b.eq 0x008c3ab4
008c4308	mov x0,x19
008c430c	mov x1,x8
008c4310	bl 0x008b6370
008c4314	ldrb w8,[x28]
008c4318	ldr x8,[x26, x8, LSL #0x3]
008c431c	br x8
008c4320	mov x0,x19
008c4324	bl 0x008cb374
008c4328	b 0x008c450c
008c432c	ldr w8,[x28], #0x4
008c4330	lsr x9,x8,#0x10
008c4334	add x1,x25,w9, UXTB  #0x4
008c4338	lsr x9,x8,#0x8
008c433c	lsr x8,x8,#0x18
008c4340	ldr w10,[x1, #0xc]
008c4344	add x3,x25,w9, UXTB  #0x4
008c4348	cmp w10,#0x6
008c434c	b.ne 0x008c4374
008c4350	ldr x9,[x1]
008c4354	ldr w10,[x9, #0x8]
008c4358	cmp w8,w10
008c435c	b.cs 0x008c4374
008c4360	ldr x10,[x9, #0x10]
008c4364	cbnz x10,0x008c4374
008c4368	ldr x9,[x9, #0x20]
008c436c	ldr q0,[x9,x8, lsl #4]
008c4370	b 0x008c423c
008c4374	add w8,w8,#0x1
008c4378	ldr x9,[x19, #0x50]
008c437c	sub x2,x29,#0x38
008c4380	ucvtf d0,w8
008c4384	mov w8,#0x3
008c4388	stur w8,[x29, #-0x2c]
008c438c	str x28,[x9, #0x20]
008c4390	stur d0,[x29, #-0x38]
008c4394	b 0x008c424c
008c4398	ldr w8,[x28], #0x4
008c439c	lsr x9,x8,#0x10
008c43a0	add x1,x25,w9, UXTB  #0x4
008c43a4	lsr x9,x8,#0x8
008c43a8	ldr w10,[x1, #0xc]
008c43ac	add x3,x25,w9, UXTB  #0x4
008c43b0	lsr x9,x8,#0x18
008c43b4	cmp w10,#0x6
008c43b8	b.ne 0x008c43ec
008c43bc	ldr x8,[x1]
008c43c0	ldr w10,[x8, #0x8]
008c43c4	cmp w9,w10
008c43c8	b.cs 0x008c43ec
008c43cc	ldr x10,[x8, #0x10]
008c43d0	cbnz x10,0x008c43ec
008c43d4	ldrb w10,[x8, #0x7]
008c43d8	cbnz w10,0x008c43ec
008c43dc	ldr x10,[x8, #0x20]
008c43e0	ldr q0,[x3]
008c43e4	str q0,[x10,x9, lsl #4]
008c43e8	b 0x008c42e4
008c43ec	add w8,w9,#0x1
008c43f0	ldr x9,[x19, #0x50]
008c43f4	add x2,sp,#0x38
008c43f8	ucvtf d0,w8
008c43fc	mov w8,#0x3
008c4400	str w8,[sp, #0x44]
008c4404	str x28,[x9, #0x20]
008c4408	str d0,[sp, #0x38]
008c440c	b 0x008c4320
008c4410	ldr x8,[x19, #0x50]
008c4414	ldr w9,[x28], #0x4
008c4418	mov x0,x19
008c441c	ldr x10,[x8]
008c4420	asr w11,w9,#0x10
008c4424	lsr x9,x9,#0x8
008c4428	ldr x10,[x10, #0x38]
008c442c	add x20,x25,w9, UXTB  #0x4
008c4430	ldr x22,[x10, w11, SXTW #0x3]
008c4434	str x28,[x8, #0x20]
008c4438	ldr x2,[x24, #0x10]
008c443c	ldrb w1,[x22, #0x6]
008c4440	mov x3,x22
008c4444	bl 0x008b4d5c
008c4448	str x0,[x20]
008c444c	mov w9,#0x7
008c4450	ldrb w8,[x22, #0x6]
008c4454	str w9,[x20, #0xc]
008c4458	cbz w8,0x008c44e8
008c445c	mov x20,xzr
008c4460	mov x21,xzr
008c4464	mov x19,x24
008c4468	add x23,x24,#0x20
008c446c	add x24,x0,#0x20
008c4470	b 0x008c4498
008c4474	ubfx x8,x8,#0x10,#0x8
008c4478	ldr q0,[x23,x8, lsl #4]
008c447c	str q0,[x24]
008c4480	ldrb w8,[x22, #0x6]
008c4484	add x21,x21,#0x1
008c4488	add x24,x24,#0x10
008c448c	add x20,x20,#0x4
008c4490	cmp x21,x8
008c4494	b.cs 0x008c44dc
008c4498	ldr w8,[x28, x21, LSL #0x2]
008c449c	ubfx w9,w8,#0x8,#0x8
008c44a0	cmp w9,#0x2
008c44a4	b.eq 0x008c4474
008c44a8	cmp w9,#0x1
008c44ac	b.ne 0x008c44d0
008c44b0	ubfx w8,w8,#0x10,#0x8
008c44b4	ldr x0,[sp, #0x20]
008c44b8	add x1,x25,w8, UXTW  #0x4
008c44bc	bl 0x008b4ec4
008c44c0	mov w8,#0xf
008c44c4	str x0,[x24]
008c44c8	str w8,[x24, #0xc]
008c44cc	b 0x008c4480
008c44d0	ubfx x8,x8,#0x10,#0x8
008c44d4	ldr q0,[x25,x8, lsl #4]
008c44d8	b 0x008c447c
008c44dc	mov x24,x19
008c44e0	ldr x19,[sp, #0x20]
008c44e4	add x28,x28,x20
008c44e8	ldr x8,[x19, #0x50]
008c44ec	str x28,[x8, #0x20]
008c44f0	ldr x8,[x19, #0x60]
008c44f4	ldp x8,x9,[x8, #0x8]
008c44f8	cmp x9,x8
008c44fc	b.cc 0x008c450c
008c4500	mov x0,x19
008c4504	mov w1,#0x1
008c4508	bl 0x008b52c4
008c450c	ldrb w8,[x28]
008c4510	ldr x25,[x19, #0x70]
008c4514	ldr x8,[x26, x8, LSL #0x3]
008c4518	br x8
008c451c	ldp w26,w9,[x28]
008c4520	str x24,[sp, #0x10]
008c4524	add x24,x28,#0x8
008c4528	lsr x8,x26,#0x10
008c452c	lsr x10,x26,#0x8
008c4530	ubfx x20,x26,#0x8,#0x8
008c4534	add x22,x27,x9, LSL #0x4
008c4538	add x1,x25,w8, UXTB  #0x4
008c453c	add x3,x25,w10, UXTB  #0x4
008c4540	ldr w8,[x1, #0xc]
008c4544	cmp w8,#0x6
008c4548	b.ne 0x008c46b4
008c454c	ldr x8,[x1]
008c4550	ldr x9,[x22]
008c4554	mov w11,#0xffffffff
008c4558	ldrb w10,[x8, #0x5]
008c455c	ldr w12,[x9, #0x10]
008c4560	lsl w10,w11,w10
008c4564	ldr x11,[x8, #0x28]
008c4568	bic w10,w12,w10
008c456c	add x10,x11,x10, LSL #0x5
008c4570	ldr w11,[x10, #0x1c]
008c4574	and w12,w11,#0xf
008c4578	cmp w12,#0x5
008c457c	b.ne 0x008c458c
008c4580	ldr x12,[x10, #0x10]
008c4584	cmp x12,x9
008c4588	b.eq 0x008c45d4
008c458c	cmp w11,#0xf
008c4590	b.hi 0x008c4644
008c4594	ldr x0,[x8, #0x10]
008c4598	cbz x0,0x008c4644
008c459c	ldrb w8,[x0, #0x6]
008c45a0	tbnz w8,#0x0,0x008c4644
008c45a4	ldrb w8,[x0, #0x7]
008c45a8	tbnz w8,#0x1,0x008c45f8
008c45ac	ldr x8,[x19, #0x60]
008c45b0	mov x21,x1
008c45b4	mov w1,wzr
008c45b8	mov x23,x3
008c45bc	ldr x2,[x8, #0x338]
008c45c0	bl 0x008bdfe0
008c45c4	mov x1,x21
008c45c8	mov x3,x23
008c45cc	cbnz x0,0x008c4600
008c45d0	b 0x008c4644
008c45d4	ldr w9,[x10, #0xc]
008c45d8	cbz w9,0x008c458c
008c45dc	ldr q0,[x1]
008c45e0	str q0,[x3, #0x10]
008c45e4	ldr q0,[x10]
008c45e8	str q0,[x3]
008c45ec	adrp x26,0xc4d000
008c45f0	add x26,x26,#0xa78
008c45f4	b 0x008c4688
008c45f8	ldr x8,[x0, #0x20]
008c45fc	sub x0,x8,#0x10
008c4600	ldr w8,[x0, #0xc]
008c4604	cmp w8,#0x6
008c4608	b.ne 0x008c4644
008c460c	ldr x9,[x0]
008c4610	ldr x8,[x9, #0x28]
008c4614	cbz x8,0x008c4644
008c4618	ldrb w9,[x9, #0x4]
008c461c	and w9,w9,w26, LSR #0x18
008c4620	add x8,x8,x9, LSL #0x5
008c4624	ldr w9,[x8, #0x1c]
008c4628	and w9,w9,#0xf
008c462c	cmp w9,#0x5
008c4630	b.ne 0x008c4644
008c4634	ldr x9,[x8, #0x10]
008c4638	ldr x10,[x22]
008c463c	cmp x9,x10
008c4640	b.eq 0x008c469c
008c4644	ldr q0,[x1]
008c4648	lsr w8,w26,#0x18
008c464c	str q0,[x3, #0x10]
008c4650	ldr x9,[x19, #0x50]
008c4654	mov x0,x19
008c4658	mov x2,x22
008c465c	str w8,[x19, #0x2c]
008c4660	str x24,[x9, #0x20]
008c4664	bl 0x008cadd4
008c4668	ldr x25,[x19, #0x70]
008c466c	ldrb w9,[x19, #0x2c]
008c4670	add x8,x25,x20, LSL #0x4
008c4674	strb w9,[x28, #0x3]
008c4678	ldr w9,[x8, #0xc]
008c467c	adrp x26,0xc4d000
008c4680	add x26,x26,#0xa78
008c4684	cbz w9,0x008c8864
008c4688	ldrb w8,[x24]
008c468c	mov x28,x24
008c4690	ldr x24,[sp, #0x10]
008c4694	ldr x8,[x26, x8, LSL #0x3]
008c4698	br x8
008c469c	ldr w9,[x8, #0xc]
008c46a0	cbz w9,0x008c4644
008c46a4	ldr q0,[x1]
008c46a8	str q0,[x3, #0x10]
008c46ac	ldr q0,[x8]
008c46b0	b 0x008c45e8
008c46b4	cmp w8,#0x8
008c46b8	b.ne 0x008c46c8
008c46bc	ldr x8,[x1]
008c46c0	add x8,x8,#0x8
008c46c4	b 0x008c46d8
008c46c8	sxtw x8,w8
008c46cc	ldr x9,[x19, #0x60]
008c46d0	add x8,x9,x8, LSL #0x3
008c46d4	add x8,x8,#0x448
008c46d8	ldr x23,[x8]
008c46dc	cbz x23,0x008c47d8
008c46e0	ldrb w8,[x23, #0x6]
008c46e4	tbnz w8,#0x3,0x008c471c
008c46e8	ldrb w8,[x23, #0x7]
008c46ec	tbnz w8,#0x1,0x008c4754
008c46f0	ldr x8,[x19, #0x60]
008c46f4	mov x0,x23
008c46f8	str x1,[sp, #0x18]
008c46fc	mov w1,#0x3
008c4700	mov x21,x3
008c4704	ldr x2,[x8, #0x350]
008c4708	bl 0x008bdfe0
008c470c	ldr x1,[sp, #0x18]
008c4710	mov x3,x21
008c4714	cbnz x0,0x008c475c
008c4718	ldrb w8,[x23, #0x6]
008c471c	tbnz w8,#0x0,0x008c47d8
008c4720	ldrb w8,[x23, #0x7]
008c4724	tbnz w8,#0x1,0x008c4778
008c4728	ldr x8,[x19, #0x60]
008c472c	mov x0,x23
008c4730	mov x21,x1
008c4734	mov w1,wzr
008c4738	mov x23,x3
008c473c	ldr x2,[x8, #0x338]
008c4740	bl 0x008bdfe0
008c4744	mov x1,x21
008c4748	mov x3,x23
008c474c	cbnz x0,0x008c4780
008c4750	b 0x008c47d8
008c4754	ldr x8,[x23, #0x20]
008c4758	sub x0,x8,#0x40
008c475c	ldr q0,[x1]
008c4760	str q0,[x3, #0x10]
008c4764	ldr q0,[x0]
008c4768	str q0,[x3]
008c476c	ldr x8,[x22]
008c4770	str x8,[x19, #0x8]
008c4774	b 0x008c45ec
008c4778	ldr x8,[x23, #0x20]
008c477c	sub x0,x8,#0x10
008c4780	ldr w8,[x0, #0xc]
008c4784	cmp w8,#0x6
008c4788	b.ne 0x008c47d8
008c478c	ldr x9,[x0]
008c4790	ldrb w8,[x9, #0x4]
008c4794	ldr x9,[x9, #0x28]
008c4798	and w8,w8,w26, LSR #0x18
008c479c	add x9,x9,x8, LSL #0x5
008c47a0	ldr w10,[x9, #0x1c]
008c47a4	and w10,w10,#0xf
008c47a8	cmp w10,#0x5
008c47ac	b.ne 0x008c48b0
008c47b0	ldr x10,[x9, #0x10]
008c47b4	ldr x11,[x22]
008c47b8	cmp x10,x11
008c47bc	b.ne 0x008c48b0
008c47c0	ldr w10,[x9, #0xc]
008c47c4	cbz w10,0x008c48b0
008c47c8	ldr q0,[x1]
008c47cc	str q0,[x3, #0x10]
008c47d0	ldr q0,[x9]
008c47d4	b 0x008c45e8
008c47d8	adrp x8,0xd1f000
008c47dc	ldrb w8,[x8, #0xdd0]
008c47e0	cmp w8,#0x1
008c47e4	b.ne 0x008c47f4
008c47e8	ldr w8,[x1, #0xc]
008c47ec	cmp w8,#0xc
008c47f0	b.eq 0x008c481c
008c47f4	ldr q0,[x1]
008c47f8	mov x0,x19
008c47fc	mov x2,x22
008c4800	str q0,[x3, #0x10]
008c4804	ldr x8,[x19, #0x50]
008c4808	str x24,[x8, #0x20]
008c480c	bl 0x008cadd4
008c4810	ldr x25,[x19, #0x70]
008c4814	add x8,x25,x20, LSL #0x4
008c4818	b 0x008c4678
008c481c	ldr x21,[x1]
008c4820	lsr x8,x26,#0x18
008c4824	mov x23,x1
008c4828	ldr x1,[x22]
008c482c	mov x20,x3
008c4830	ldr x9,[x21, #0x10]
008c4834	ldr w10,[x9, #0x5c]
008c4838	ldrb w11,[x9, #0x68]
008c483c	sub w10,w10,w11
008c4840	cmp w8,w10
008c4844	b.cs 0x008c4858
008c4848	ldr x10,[x9, #0x40]
008c484c	ldr x10,[x10, x8, LSL #0x3]
008c4850	cmp x1,x10
008c4854	b.eq 0x008c48b8
008c4858	ldr x0,[x9, #0x38]
008c485c	bl 0x008bb440
008c4860	ldr w8,[x0, #0xc]
008c4864	cbz w8,0x008c8920
008c4868	ldr q0,[x23]
008c486c	ldr d1,[x0]
008c4870	add x11,x21,#0x20
008c4874	str q0,[x20, #0x10]
008c4878	fcvtzu w8,d1
008c487c	ldr x9,[x21, #0x10]
008c4880	ldr w10,[x9, #0x58]
008c4884	add x9,x9,#0x28
008c4888	cmp w10,w8
008c488c	csel x9,x11,x9,hi
008c4890	csel w10,wzr,w10,hi
008c4894	ldr x9,[x9]
008c4898	sub w10,w8,w10
008c489c	ldr q0,[x9,w10, uxtw #4]
008c48a0	str q0,[x20]
008c48a4	strb w8,[x28, #0x3]
008c48a8	ldr x19,[sp, #0x20]
008c48ac	b 0x008c45ec
008c48b0	ldr q0,[x1]
008c48b4	b 0x008c464c
008c48b8	ldr q0,[x23]
008c48bc	str q0,[x20, #0x10]
008c48c0	ldr x9,[x21, #0x10]
008c48c4	ldr w10,[x9, #0x58]
008c48c8	subs w10,w8,w10
008c48cc	b.cs 0x008c48dc
008c48d0	ldr x9,[x21, #0x20]
008c48d4	add x8,x9,x8, LSL #0x4
008c48d8	b 0x008c48e4
008c48dc	ldr x8,[x9, #0x28]
008c48e0	add x8,x8,w10, UXTW  #0x4
008c48e4	ldr q0,[x8]
008c48e8	str q0,[x20]
008c48ec	b 0x008c48a8
008c48f0	ldr x8,[x19, #0x60]
008c48f4	ldr x9,[x8, #0x688]
008c48f8	ldr x8,[x19, #0x50]
008c48fc	cbnz x9,0x008c4c00
008c4900	ldr w20,[x28], #0x4
008c4904	ldr x11,[x19, #0x68]
008c4908	str x27,[sp, #0x18]
008c490c	mov x27,x24
008c4910	lsr x9,x20,#0x8
008c4914	ubfx x10,x20,#0x10,#0x8
008c4918	add x23,x25,w9, UXTB  #0x4
008c491c	lsr x9,x20,#0x10
008c4920	cmp w10,#0x0
008c4924	add x21,x23,#0x10
008c4928	ldr w12,[x23, #0xc]
008c492c	add x9,x21,w9, UXTB  #0x4
008c4930	sub x9,x9,#0x10
008c4934	csel x25,x11,x9,eq
008c4938	cmp w12,#0x7
008c493c	b.ne 0x008c4c34
008c4940	ldr x24,[x23]
008c4944	str x28,[x8, #0x20]
008c4948	ldr x8,[x19, #0x50]
008c494c	ldr x9,[x19, #0x18]
008c4950	cmp x8,x9
008c4954	b.eq 0x008c4964
008c4958	add x22,x8,#0x30
008c495c	str x22,[x19, #0x50]
008c4960	b 0x008c4970
008c4964	mov x0,x19
008c4968	bl 0x008b4200
008c496c	mov x22,x0
008c4970	ldrb w8,[x24, #0x6]
008c4974	str x23,[x22, #0x8]
008c4978	cbz w8,0x008c4984
008c497c	mov x8,xzr
008c4980	b 0x008c49b8
008c4984	adrp x8,0xd1f000
008c4988	ldrb w9,[x8, #0xdf0]
008c498c	ldr x8,[x24, #0x18]
008c4990	cmp w9,#0x1
008c4994	b.ne 0x008c49b8
008c4998	ldr x9,[x8, #0xd0]
008c499c	cbz x9,0x008c49b8
008c49a0	str x9,[x24, #0x18]
008c49a4	mov x8,x9
008c49a8	ldr x9,[x9, #0xd0]
008c49ac	cbnz x9,0x008c49a0
008c49b0	ldrb w9,[x8, #0x5]
008c49b4	strb w9,[x24, #0x4]
008c49b8	ldrb w9,[x24, #0x4]
008c49bc	str x8,[x22]
008c49c0	str xzr,[x22, #0x20]
008c49c4	add x8,x25,x9, LSL #0x4
008c49c8	lsr w9,w20,#0x18
008c49cc	ldr x10,[x19, #0x48]
008c49d0	str x21,[x22, #0x10]
008c49d4	str x8,[x22, #0x18]
008c49d8	ldrb w8,[x24, #0x4]
008c49dc	sub w23,w9,#0x1
008c49e0	sub x9,x10,x25
008c49e4	stp w23,wzr,[x22, #0x28]
008c49e8	cmp x9,w8, UXTW  #0x4
008c49ec	stp x25,x21,[x19, #0x68]
008c49f0	b.gt 0x008c4a14
008c49f4	ldr w9,[x19, #0x40]
008c49f8	mov x0,x19
008c49fc	mov w2,#0x1
008c4a00	lsl w10,w9,#0x1
008c4a04	add w11,w9,w8
008c4a08	cmp w9,w8
008c4a0c	csel w1,w11,w10,lt
008c4a10	bl 0x008b3fdc
008c4a14	ldrb w8,[x24, #0x6]
008c4a18	cbz w8,0x008c4a88
008c4a1c	ldr x8,[x24, #0x28]
008c4a20	mov x0,x19
008c4a24	blr x8
008c4a28	tbnz w0,#0x1f,0x008c8794
008c4a2c	ldr x8,[x19, #0x50]
008c4a30	ldr x10,[x8, #0x8]
008c4a34	cbz w23,0x008c4a64
008c4a38	cbz w0,0x008c4a64
008c4a3c	ldr x9,[x19, #0x68]
008c4a40	sub x11,x9,w0, UXTW  #0x4
008c4a44	add x11,x11,#0x10
008c4a48	ldur q0,[x11, #-0x10]
008c4a4c	subs w23,w23,#0x1
008c4a50	str q0,[x10], #0x10
008c4a54	b.eq 0x008c4a64
008c4a58	cmp x11,x9
008c4a5c	add x11,x11,#0x10
008c4a60	b.cc 0x008c4a48
008c4a64	cmp w23,#0x1
008c4a68	b.lt 0x008c4b4c
008c4a6c	adrp x26,0xc4d000
008c4a70	add x26,x26,#0xa78
008c4a74	mov x24,x27
008c4a78	b.ne 0x008c4b64
008c4a7c	ldr x27,[sp, #0x18]
008c4a80	mov x9,x10
008c4a84	b 0x008c4b98
008c4a88	adrp x8,0xd1f000
008c4a8c	add x8,x8,#0x4f8
008c4a90	ldrb w9,[x8]
008c4a94	ldr x8,[x24, #0x18]
008c4a98	cmp w9,#0x1
008c4a9c	b.ne 0x008c4aac
008c4aa0	ldr w9,[x8, #0x48]
008c4aa4	add w9,w9,#0x1
008c4aa8	str w9,[x8, #0x48]
008c4aac	ldp x11,x25,[x19, #0x68]
008c4ab0	ldrb w9,[x8, #0x7]
008c4ab4	add x9,x25,x9, LSL #0x4
008c4ab8	cmp x11,x9
008c4abc	b.cs 0x008c4be4
008c4ac0	add x10,x11,#0x10
008c4ac4	mvn x12,x11
008c4ac8	adrp x26,0xc4d000
008c4acc	add x26,x26,#0xa78
008c4ad0	cmp x9,x10
008c4ad4	csel x10,x9,x10,hi
008c4ad8	add x10,x10,x12
008c4adc	cmp x10,#0x10
008c4ae0	b.cc 0x008c4b18
008c4ae4	lsr x10,x10,#0x4
008c4ae8	add x12,x10,#0x1
008c4aec	and x13,x12,#0x1ffffffffffffffe
008c4af0	add x10,x11,x13, LSL #0x4
008c4af4	add x11,x11,#0x1c
008c4af8	mov x14,x13
008c4afc	subs x14,x14,#0x2
008c4b00	stur wzr,[x11, #-0x10]
008c4b04	str wzr,[x11], #0x20
008c4b08	b.ne 0x008c4afc
008c4b0c	cmp x12,x13
008c4b10	mov x11,x10
008c4b14	b.eq 0x008c4b2c
008c4b18	add x10,x11,#0x10
008c4b1c	str wzr,[x11, #0xc]
008c4b20	cmp x10,x9
008c4b24	mov x11,x10
008c4b28	b.cc 0x008c4b18
008c4b2c	ldrb w9,[x8, #0x3]
008c4b30	cbz w9,0x008c4bf8
008c4b34	ldr x28,[x8, #0x18]
008c4b38	str x10,[x19, #0x68]
008c4b3c	ldr x27,[x8, #0x28]
008c4b40	ldrb w9,[x28]
008c4b44	ldr x8,[x26, x9, LSL #0x3]
008c4b48	br x8
008c4b4c	mov x24,x27
008c4b50	ldr x27,[sp, #0x18]
008c4b54	mov x9,x10
008c4b58	adrp x26,0xc4d000
008c4b5c	add x26,x26,#0xa78
008c4b60	b 0x008c4bb8
008c4b64	mov w11,w23
008c4b68	ldr x27,[sp, #0x18]
008c4b6c	and x12,x11,#0x7ffffffe
008c4b70	add x9,x10,x12, LSL #0x4
008c4b74	sub w23,w23,w12
008c4b78	add x10,x10,#0x1c
008c4b7c	mov x13,x12
008c4b80	subs x13,x13,#0x2
008c4b84	stur wzr,[x10, #-0x10]
008c4b88	str wzr,[x10], #0x20
008c4b8c	b.ne 0x008c4b80
008c4b90	cmp x12,x11
008c4b94	b.eq 0x008c4bb8
008c4b98	add w10,w23,#0x1
008c4b9c	mov x11,x9
008c4ba0	sub w10,w10,#0x1
008c4ba4	add x9,x11,#0x10
008c4ba8	str wzr,[x11, #0xc]
008c4bac	cmp w10,#0x1
008c4bb0	mov x11,x9
008c4bb4	b.hi 0x008c4ba0
008c4bb8	ldur x25,[x8, #-0x20]
008c4bbc	lsr w11,w20,#0x18
008c4bc0	sub x10,x8,#0x30
008c4bc4	str x10,[x19, #0x50]
008c4bc8	str x25,[x19, #0x70]
008c4bcc	cbz w11,0x008c4bd4
008c4bd0	ldur x9,[x8, #-0x18]
008c4bd4	ldrb w8,[x28]
008c4bd8	str x9,[x19, #0x68]
008c4bdc	ldr x8,[x26, x8, LSL #0x3]
008c4be0	br x8
008c4be4	mov x10,x11
008c4be8	adrp x26,0xc4d000
008c4bec	add x26,x26,#0xa78
008c4bf0	ldrb w9,[x8, #0x3]
008c4bf4	cbnz w9,0x008c4b34
008c4bf8	ldr x10,[x22, #0x18]
008c4bfc	b 0x008c4b34
008c4c00	str x28,[x8, #0x20]
008c4c04	mov x0,x19
008c4c08	mov w1,#0xffffffff
008c4c0c	ldr x8,[x19, #0x50]
008c4c10	ldr x10,[x8, #0x20]
008c4c14	add x10,x10,#0x4
008c4c18	str x10,[x8, #0x20]
008c4c1c	blr x9
008c4c20	ldrb w9,[x19, #0x3]
008c4c24	ldr x8,[x19, #0x50]
008c4c28	cbnz w9,0x008c8788
008c4c2c	ldr x25,[x19, #0x70]
008c4c30	b 0x008c4900
008c4c34	mov x0,x19
008c4c38	mov x1,x23
008c4c3c	str x28,[x8, #0x20]
008c4c40	bl 0x008cda50
008c4c44	ldr x8,[x19, #0x50]
008c4c48	add x25,x25,#0x10
008c4c4c	b 0x008c4940
008c4c50	ldr x8,[x19, #0x60]
008c4c54	ldr x8,[x8, #0x688]
008c4c58	cbnz x8,0x008c4e80
008c4c5c	stp x24,x27,[sp, #0x10]
008c4c60	ldr x10,[x19, #0x68]
008c4c64	add x20,x28,#0x8
008c4c68	ldp w26,w24,[x28]
008c4c6c	lsr x8,x26,#0x8
008c4c70	ubfx x9,x26,#0x10,#0x8
008c4c74	add x25,x25,w8, UXTB  #0x4
008c4c78	lsr x8,x26,#0x10
008c4c7c	cmp w9,#0x0
008c4c80	add x21,x25,#0x10
008c4c84	ldr w11,[x25, #0xc]
008c4c88	add x8,x21,w8, UXTB  #0x4
008c4c8c	sub x8,x8,#0x10
008c4c90	csel x27,x10,x8,eq
008c4c94	cmp w11,#0x7
008c4c98	b.ne 0x008c4eb4
008c4c9c	ldr x8,[x19, #0x50]
008c4ca0	ldr x22,[x25]
008c4ca4	str x20,[x8, #0x20]
008c4ca8	ldr x8,[x19, #0x50]
008c4cac	ldr x9,[x19, #0x18]
008c4cb0	cmp x8,x9
008c4cb4	b.eq 0x008c4cc4
008c4cb8	add x23,x8,#0x30
008c4cbc	str x23,[x19, #0x50]
008c4cc0	b 0x008c4cd0
008c4cc4	mov x0,x19
008c4cc8	bl 0x008b4200
008c4ccc	mov x23,x0
008c4cd0	ldrb w8,[x22, #0x6]
008c4cd4	str x25,[x23, #0x8]
008c4cd8	cbz w8,0x008c4ce4
008c4cdc	mov x8,xzr
008c4ce0	b 0x008c4d18
008c4ce4	adrp x8,0xd1f000
008c4ce8	ldrb w9,[x8, #0xdf0]
008c4cec	ldr x8,[x22, #0x18]
008c4cf0	cmp w9,#0x1
008c4cf4	b.ne 0x008c4d18
008c4cf8	ldr x9,[x8, #0xd0]
008c4cfc	cbz x9,0x008c4d18
008c4d00	str x9,[x22, #0x18]
008c4d04	mov x8,x9
008c4d08	ldr x9,[x9, #0xd0]
008c4d0c	cbnz x9,0x008c4d00
008c4d10	ldrb w9,[x8, #0x5]
008c4d14	strb w9,[x22, #0x4]
008c4d18	ldrb w9,[x22, #0x4]
008c4d1c	str x8,[x23]
008c4d20	str xzr,[x23, #0x20]
008c4d24	add x8,x27,x9, LSL #0x4
008c4d28	lsr w9,w26,#0x18
008c4d2c	ldr x10,[x19, #0x48]
008c4d30	str x21,[x23, #0x10]
008c4d34	str x8,[x23, #0x18]
008c4d38	ldrb w8,[x22, #0x4]
008c4d3c	sub w25,w9,#0x1
008c4d40	sub x9,x10,x27
008c4d44	stp w25,wzr,[x23, #0x28]
008c4d48	cmp x9,w8, UXTW  #0x4
008c4d4c	stp x27,x21,[x19, #0x68]
008c4d50	b.gt 0x008c4d74
008c4d54	ldr w9,[x19, #0x40]
008c4d58	mov x0,x19
008c4d5c	mov w2,#0x1
008c4d60	lsl w10,w9,#0x1
008c4d64	add w11,w9,w8
008c4d68	cmp w9,w8
008c4d6c	csel w1,w11,w10,lt
008c4d70	bl 0x008b3fdc
008c4d74	ldrb w8,[x22, #0x6]
008c4d78	cbnz w8,0x008c4ee0
008c4d7c	adrp x8,0xd1f000
008c4d80	add x8,x8,#0x4f8
008c4d84	ldr x20,[x22, #0x18]
008c4d88	ldrb w8,[x8]
008c4d8c	cmp w8,#0x1
008c4d90	b.ne 0x008c4da0
008c4d94	ldr w8,[x20, #0x48]
008c4d98	add w8,w8,#0x1
008c4d9c	str w8,[x20, #0x48]
008c4da0	cmn w24,#0x1
008c4da4	adrp x26,0xc4d000
008c4da8	add x26,x26,#0xa78
008c4dac	b.eq 0x008c4dd0
008c4db0	ldr x1,[sp, #0x10]
008c4db4	mov x0,x19
008c4db8	mov x2,x22
008c4dbc	mov w3,w24
008c4dc0	bl 0x008b51c8
008c4dc4	tbnz w0,#0x0,0x008c4dd0
008c4dc8	mov w8,#0xffffffff
008c4dcc	str w8,[x28, #0x4]
008c4dd0	ldp x10,x25,[x19, #0x68]
008c4dd4	ldrb w8,[x20, #0x7]
008c4dd8	add x8,x25,x8, LSL #0x4
008c4ddc	cmp x10,x8
008c4de0	b.cs 0x008c4e6c
008c4de4	add x9,x10,#0x10
008c4de8	mvn x11,x10
008c4dec	cmp x8,x9
008c4df0	csel x9,x8,x9,hi
008c4df4	add x9,x9,x11
008c4df8	cmp x9,#0x10
008c4dfc	b.cc 0x008c4e34
008c4e00	lsr x9,x9,#0x4
008c4e04	add x11,x9,#0x1
008c4e08	and x12,x11,#0x1ffffffffffffffe
008c4e0c	add x9,x10,x12, LSL #0x4
008c4e10	add x10,x10,#0x1c
008c4e14	mov x13,x12
008c4e18	subs x13,x13,#0x2
008c4e1c	stur wzr,[x10, #-0x10]
008c4e20	str wzr,[x10], #0x20
008c4e24	b.ne 0x008c4e18
008c4e28	cmp x11,x12
008c4e2c	mov x10,x9
008c4e30	b.eq 0x008c4e48
008c4e34	add x9,x10,#0x10
008c4e38	str wzr,[x10, #0xc]
008c4e3c	cmp x9,x8
008c4e40	mov x10,x9
008c4e44	b.cc 0x008c4e34
008c4e48	ldrb w8,[x20, #0x3]
008c4e4c	cbz w8,0x008c4e78
008c4e50	ldr x28,[x20, #0x18]
008c4e54	str x9,[x19, #0x68]
008c4e58	mov x24,x22
008c4e5c	ldr x27,[x20, #0x28]
008c4e60	ldrb w8,[x28]
008c4e64	ldr x8,[x26, x8, LSL #0x3]
008c4e68	br x8
008c4e6c	mov x9,x10
008c4e70	ldrb w8,[x20, #0x3]
008c4e74	cbnz w8,0x008c4e50
008c4e78	ldr x9,[x23, #0x18]
008c4e7c	b 0x008c4e50
008c4e80	ldr x9,[x19, #0x50]
008c4e84	mov x0,x19
008c4e88	mov w1,#0xffffffff
008c4e8c	str x28,[x9, #0x20]
008c4e90	ldr x9,[x19, #0x50]
008c4e94	ldr x10,[x9, #0x20]
008c4e98	add x10,x10,#0x4
008c4e9c	str x10,[x9, #0x20]
008c4ea0	blr x8
008c4ea4	ldrb w8,[x19, #0x3]
008c4ea8	cbnz w8,0x008c8784
008c4eac	ldr x25,[x19, #0x70]
008c4eb0	b 0x008c4c5c
008c4eb4	cmn w24,#0x1
008c4eb8	b.eq 0x008c4ec4
008c4ebc	mov w8,#0xffffffff
008c4ec0	str w8,[x28, #0x4]
008c4ec4	ldr x8,[x19, #0x50]
008c4ec8	mov x0,x19
008c4ecc	mov x1,x25
008c4ed0	str x20,[x8, #0x20]
008c4ed4	bl 0x008cda50
008c4ed8	add x27,x27,#0x10
008c4edc	b 0x008c4c9c
008c4ee0	cmn w24,#0x1
008c4ee4	b.eq 0x008c4ef0
008c4ee8	mov w8,#0xffffffff
008c4eec	str w8,[x28, #0x4]
008c4ef0	ldr x8,[x22, #0x28]
008c4ef4	mov x0,x19
008c4ef8	blr x8
008c4efc	tbnz w0,#0x1f,0x008c8794
008c4f00	ldr x8,[x19, #0x50]
008c4f04	ldr x10,[x8, #0x8]
008c4f08	cbz w25,0x008c4fa8
008c4f0c	ldr x27,[sp, #0x18]
008c4f10	cbz w0,0x008c4f3c
008c4f14	ldr x9,[x19, #0x68]
008c4f18	sub x11,x9,w0, UXTW  #0x4
008c4f1c	add x11,x11,#0x10
008c4f20	ldur q0,[x11, #-0x10]
008c4f24	subs w25,w25,#0x1
008c4f28	str q0,[x10], #0x10
008c4f2c	b.eq 0x008c4f3c
008c4f30	cmp x11,x9
008c4f34	add x11,x11,#0x10
008c4f38	b.cc 0x008c4f20
008c4f3c	cmp w25,#0x1
008c4f40	b.lt 0x008c4fb4
008c4f44	ldr x24,[sp, #0x10]
008c4f48	b.ne 0x008c4f54
008c4f4c	mov x9,x10
008c4f50	b 0x008c4f84
008c4f54	mov w11,w25
008c4f58	and x12,x11,#0x7ffffffe
008c4f5c	add x9,x10,x12, LSL #0x4
008c4f60	sub w25,w25,w12
008c4f64	add x10,x10,#0x1c
008c4f68	mov x13,x12
008c4f6c	subs x13,x13,#0x2
008c4f70	stur wzr,[x10, #-0x10]
008c4f74	str wzr,[x10], #0x20
008c4f78	b.ne 0x008c4f6c
008c4f7c	cmp x12,x11
008c4f80	b.eq 0x008c4fbc
008c4f84	add w10,w25,#0x1
008c4f88	mov x11,x9
008c4f8c	sub w10,w10,#0x1
008c4f90	add x9,x11,#0x10
008c4f94	str wzr,[x11, #0xc]
008c4f98	cmp w10,#0x1
008c4f9c	mov x11,x9
008c4fa0	b.hi 0x008c4f8c
008c4fa4	b 0x008c4fbc
008c4fa8	ldr x27,[sp, #0x18]
008c4fac	cmp w25,#0x1
008c4fb0	b.ge 0x008c4f44
008c4fb4	ldr x24,[sp, #0x10]
008c4fb8	mov x9,x10
008c4fbc	ldur x25,[x8, #-0x20]
008c4fc0	lsr w11,w26,#0x18
008c4fc4	sub x10,x8,#0x30
008c4fc8	str x10,[x19, #0x50]
008c4fcc	str x25,[x19, #0x70]
008c4fd0	cbz w11,0x008c4fd8
008c4fd4	ldur x9,[x8, #-0x18]
008c4fd8	ldrb w8,[x20]
008c4fdc	str x9,[x19, #0x68]
008c4fe0	adrp x26,0xc4d000
008c4fe4	add x26,x26,#0xa78
008c4fe8	b 0x008c3a18
008c4fec	ldr x8,[x19, #0x60]
008c4ff0	ldr x9,[x8, #0x688]
008c4ff4	ldr x8,[x19, #0x50]
008c4ff8	cbnz x9,0x008c5134
008c4ffc	ldr w10,[x28]
008c5000	lsr x11,x10,#0x8
008c5004	ubfx x9,x10,#0x10,#0x8
008c5008	add x13,x25,w11, UXTB  #0x4
008c500c	cbz w9,0x008c501c
008c5010	add x9,x13,x9, LSL #0x4
008c5014	sub x11,x9,#0x10
008c5018	b 0x008c5020
008c501c	ldr x11,[x19, #0x68]
008c5020	ldr w9,[x8, #0x28]
008c5024	ldr x12,[x8, #0x8]
008c5028	cbz w9,0x008c5074
008c502c	cmp x13,x11
008c5030	b.cs 0x008c5074
008c5034	ubfx x10,x10,#0x8,#0x8
008c5038	add x10,x25,x10, LSL #0x4
008c503c	add x13,x10,#0x10
008c5040	mov w10,w9
008c5044	ldur q0,[x13, #-0x10]
008c5048	subs w10,w10,#0x1
008c504c	str q0,[x12], #0x10
008c5050	b.eq 0x008c5060
008c5054	cmp x13,x11
008c5058	add x13,x13,#0x10
008c505c	b.cc 0x008c5044
008c5060	cmp w10,#0x1
008c5064	b.lt 0x008c5080
008c5068	b.ne 0x008c5088
008c506c	mov x11,x12
008c5070	b 0x008c50b8
008c5074	mov w10,w9
008c5078	cmp w10,#0x1
008c507c	b.ge 0x008c5068
008c5080	mov x11,x12
008c5084	b 0x008c50d8
008c5088	mov w13,w10
008c508c	and x14,x13,#0x7ffffffe
008c5090	add x11,x12,x14, LSL #0x4
008c5094	sub w10,w10,w14
008c5098	add x12,x12,#0x1c
008c509c	mov x15,x14
008c50a0	subs x15,x15,#0x2
008c50a4	stur wzr,[x12, #-0x10]
008c50a8	str wzr,[x12], #0x20
008c50ac	b.ne 0x008c50a0
008c50b0	cmp x14,x13
008c50b4	b.eq 0x008c50d8
008c50b8	add w10,w10,#0x1
008c50bc	mov x12,x11
008c50c0	sub w10,w10,#0x1
008c50c4	add x11,x12,#0x10
008c50c8	str wzr,[x12, #0xc]
008c50cc	cmp w10,#0x1
008c50d0	mov x12,x11
008c50d4	b.hi 0x008c50c0
008c50d8	ldur x25,[x8, #-0x20]
008c50dc	sub x10,x8,#0x30
008c50e0	cmn w9,#0x1
008c50e4	str x10,[x19, #0x50]
008c50e8	str x25,[x19, #0x70]
008c50ec	b.eq 0x008c50f4
008c50f0	ldur x11,[x8, #-0x18]
008c50f4	str x11,[x19, #0x68]
008c50f8	ldrb w9,[x8, #0x2c]
008c50fc	tbnz w9,#0x0,0x008c8794
008c5100	ldurb w9,[x8, #-0x4]
008c5104	ldur x1,[x8, #-0x30]
008c5108	tbnz w9,#0x2,0x008c5168
008c510c	ldur x28,[x8, #-0x10]
008c5110	ldur x8,[x8, #-0x28]
008c5114	adrp x26,0xc4d000
008c5118	add x26,x26,#0xa78
008c511c	ldr x27,[x1, #0x28]
008c5120	ldr x19,[sp, #0x20]
008c5124	ldrb w9,[x28]
008c5128	ldr x24,[x8]
008c512c	ldr x8,[x26, x9, LSL #0x3]
008c5130	br x8
008c5134	str x28,[x8, #0x20]
008c5138	mov x0,x19
008c513c	mov w1,#0xffffffff
008c5140	ldr x8,[x19, #0x50]
008c5144	ldr x10,[x8, #0x20]
008c5148	add x10,x10,#0x4
008c514c	str x10,[x8, #0x20]
008c5150	blr x9
008c5154	ldrb w9,[x19, #0x3]
008c5158	ldr x8,[x19, #0x50]
008c515c	cbnz w9,0x008c8788
008c5160	ldr x25,[x19, #0x70]
008c5164	b 0x008c4ffc
008c5168	ldr x19,[sp, #0x20]
008c516c	ldr x8,[x19, #0x60]
008c5170	mov x0,x19
008c5174	ldr x8,[x8, #0x6f0]
008c5178	blr x8
008c517c	cmp w0,#0x1
008c5180	b.eq 0x008c3820
008c5184	b 0x008c8794
008c5188	ldrsh x8,[x28, #0x2]
008c518c	add x28,x28,x8, LSL #0x2
008c5190	b 0x008c86bc
008c5194	ldr w8,[x28], #0x4
008c5198	lsr x9,x8,#0x8
008c519c	add x10,x25,w9, UXTB  #0x4
008c51a0	ldr w9,[x10, #0xc]
008c51a4	cbz w9,0x008c51bc
008c51a8	cmp w9,#0x1
008c51ac	b.ne 0x008c51b8
008c51b0	ldr w9,[x10]
008c51b4	cbz w9,0x008c51cc
008c51b8	sbfx x9,x8,#0x10,#0x10
008c51bc	add x28,x28,x9, LSL #0x2
008c51c0	ldrb w8,[x28]
008c51c4	ldr x8,[x26, x8, LSL #0x3]
008c51c8	br x8
008c51cc	mov x9,xzr
008c51d0	b 0x008c51bc
008c51d4	ldr w8,[x28], #0x4
008c51d8	lsr x9,x8,#0x8
008c51dc	add x9,x25,w9, UXTB  #0x4
008c51e0	ldr w10,[x9, #0xc]
008c51e4	cbz w10,0x008c5200
008c51e8	cmp w10,#0x1
008c51ec	b.ne 0x008c51f8
008c51f0	ldr w9,[x9]
008c51f4	cbz w9,0x008c5200
008c51f8	mov x8,xzr
008c51fc	b 0x008c5204
008c5200	sbfx x8,x8,#0x10,#0x10
008c5204	add x28,x28,x8, LSL #0x2
008c5208	ldrb w8,[x28]
008c520c	ldr x8,[x26, x8, LSL #0x3]
008c5210	br x8
008c5214	ldr w20,[x28]
008c5218	mov x23,x28
008c521c	ldr w8,[x23, #0x4]!
008c5220	lsr x9,x20,#0x8
008c5224	add x2,x25,x8, LSL #0x4
008c5228	add x1,x25,w9, UXTB  #0x4
008c522c	ldr w9,[x2, #0xc]
008c5230	ldr w8,[x1, #0xc]
008c5234	cmp w8,w9
008c5238	b.ne 0x008c3b20
008c523c	cmp w8,#0x6
008c5240	b.gt 0x008c526c
008c5244	cmp w8,#0x2
008c5248	b.le 0x008c528c
008c524c	cmp w8,#0x4
008c5250	b.gt 0x008c5310
008c5254	cmp w8,#0x3
008c5258	b.ne 0x008c536c
008c525c	ldr d0,[x1]
008c5260	ldr d1,[x2]
008c5264	fcmp d0,d1
008c5268	b 0x008c5398
008c526c	cmp w8,#0x8
008c5270	b.le 0x008c52b0
008c5274	sub w9,w8,#0x9
008c5278	cmp w9,#0x2
008c527c	b.cc 0x008c5318
008c5280	cmp w8,#0xb
008c5284	b.ne 0x008c5494
008c5288	b 0x008c5318
008c528c	cbz w8,0x008c5330
008c5290	cmp w8,#0x1
008c5294	b.ne 0x008c5344
008c5298	ldr w8,[x1]
008c529c	ldr w9,[x2]
008c52a0	asr w10,w20,#0x10
008c52a4	cmp w8,w9
008c52a8	csinc w8,w10,wzr,eq
008c52ac	b 0x008c5334
008c52b0	cmp w8,#0x7
008c52b4	b.eq 0x008c5318
008c52b8	ldr x8,[x1]
008c52bc	ldr x9,[x2]
008c52c0	ldr x0,[x8, #0x8]
008c52c4	ldr x10,[x9, #0x8]
008c52c8	cmp x0,x10
008c52cc	b.ne 0x008c5494
008c52d0	cbz x0,0x008c5320
008c52d4	ldrsb w10,[x0, #0x6]
008c52d8	tbnz w10,#0x1f,0x008c5320
008c52dc	ldrb w8,[x0, #0x7]
008c52e0	tbnz w8,#0x1,0x008c53fc
008c52e4	ldr x8,[x19, #0x60]
008c52e8	mov x21,x1
008c52ec	mov w1,#0x7
008c52f0	mov x22,x2
008c52f4	ldr x8,[x8, #0x370]
008c52f8	mov x2,x8
008c52fc	bl 0x008bdfe0
008c5300	mov x1,x21
008c5304	mov x2,x22
008c5308	cbnz x0,0x008c5404
008c530c	b 0x008c5318
008c5310	cmp w8,#0x5
008c5314	b.ne 0x008c53a4
008c5318	ldr x8,[x1]
008c531c	ldr x9,[x2]
008c5320	sbfx x10,x20,#0x10,#0x10
008c5324	cmp x8,x9
008c5328	csinc x8,x10,xzr,eq
008c532c	b 0x008c5484
008c5330	asr w8,w20,#0x10
008c5334	add x28,x23,w8, SXTW  #0x2
008c5338	ldrb w8,[x28]
008c533c	ldr x8,[x26, x8, LSL #0x3]
008c5340	br x8
008c5344	ldr x8,[x1]
008c5348	ldr x9,[x2]
008c534c	cmp x8,x9
008c5350	b.ne 0x008c5480
008c5354	ldr w8,[x1, #0x8]
008c5358	ldr w9,[x2, #0x8]
008c535c	cmp w8,w9
008c5360	b.ne 0x008c5480
008c5364	sbfx x8,x20,#0x10,#0x10
008c5368	b 0x008c5484
008c536c	ldr s0,[x1]
008c5370	ldr s1,[x2]
008c5374	fcmp s0,s1
008c5378	b.ne 0x008c5480
008c537c	ldr s0,[x1, #0x4]
008c5380	ldr s1,[x2, #0x4]
008c5384	fcmp s0,s1
008c5388	b.ne 0x008c5480
008c538c	ldr s0,[x1, #0x8]
008c5390	ldr s1,[x2, #0x8]
008c5394	fcmp s0,s1
008c5398	sbfx x8,x20,#0x10,#0x10
008c539c	csinc x8,x8,xzr,eq
008c53a0	b 0x008c5484
008c53a4	ldr x8,[x1]
008c53a8	ldr x9,[x2]
008c53ac	ldr x0,[x8, #0x10]
008c53b0	ldr x10,[x9, #0x10]
008c53b4	cmp x0,x10
008c53b8	b.ne 0x008c5494
008c53bc	cbz x0,0x008c5320
008c53c0	ldrsb w10,[x0, #0x6]
008c53c4	tbnz w10,#0x1f,0x008c5320
008c53c8	ldrb w8,[x0, #0x7]
008c53cc	tbnz w8,#0x1,0x008c5494
008c53d0	ldr x8,[x19, #0x60]
008c53d4	mov x21,x1
008c53d8	mov w1,#0x7
008c53dc	mov x22,x2
008c53e0	ldr x8,[x8, #0x370]
008c53e4	mov x2,x8
008c53e8	bl 0x008bdfe0
008c53ec	mov x1,x21
008c53f0	mov x2,x22
008c53f4	cbnz x0,0x008c5494
008c53f8	b 0x008c5318
008c53fc	ldr x8,[x0, #0x20]
008c5400	sub x0,x8,#0x80
008c5404	ldr w8,[x0, #0xc]
008c5408	cmp w8,#0x7
008c540c	b.ne 0x008c5494
008c5410	ldr x8,[x0]
008c5414	ldrb w8,[x8, #0x6]
008c5418	cbz w8,0x008c5494
008c541c	ldr x8,[x19, #0x68]
008c5420	ldr q0,[x0]
008c5424	mov x0,x19
008c5428	str q0,[x8]
008c542c	sub x9,x8,x25
008c5430	ldr q0,[x1]
008c5434	lsr x22,x9,#0x4
008c5438	mov w1,#0x2
008c543c	str q0,[x8, #0x10]
008c5440	ldr q0,[x2]
008c5444	mov w2,w22
008c5448	str q0,[x8, #0x20]
008c544c	add x8,x8,#0x30
008c5450	ldr x10,[x19, #0x50]
008c5454	str x8,[x19, #0x68]
008c5458	str x23,[x10, #0x20]
008c545c	bl 0x008cd928
008c5460	ldr x25,[x19, #0x70]
008c5464	add x8,x25,w22, SXTW  #0x4
008c5468	ldr w9,[x8, #0xc]
008c546c	cbz w9,0x008c5480
008c5470	cmp w9,#0x1
008c5474	b.ne 0x008c5364
008c5478	ldr w8,[x8]
008c547c	cbnz w8,0x008c5364
008c5480	mov w8,#0x1
008c5484	add x28,x23,x8, LSL #0x2
008c5488	ldrb w8,[x28]
008c548c	ldr x8,[x26, x8, LSL #0x3]
008c5490	br x8
008c5494	ldr x8,[x19, #0x50]
008c5498	mov x0,x19
008c549c	str x23,[x8, #0x20]
008c54a0	bl 0x008cbdc8
008c54a4	asr w8,w20,#0x10
008c54a8	cmp w0,#0x1
008c54ac	csinc w8,w8,wzr,eq
008c54b0	add x28,x23,w8, SXTW  #0x2
008c54b4	b 0x008c450c
008c54b8	ldr w20,[x28]
008c54bc	mov x23,x28
008c54c0	ldr w8,[x23, #0x4]!
008c54c4	lsr x9,x20,#0x8
008c54c8	add x2,x25,x8, LSL #0x4
008c54cc	add x1,x25,w9, UXTB  #0x4
008c54d0	ldr w9,[x2, #0xc]
008c54d4	ldr w8,[x1, #0xc]
008c54d8	cmp w8,w9
008c54dc	b.ne 0x008c5514
008c54e0	cmp w8,#0x6
008c54e4	b.gt 0x008c5520
008c54e8	cmp w8,#0x2
008c54ec	b.le 0x008c5548
008c54f0	cmp w8,#0x4
008c54f4	b.gt 0x008c55d0
008c54f8	cmp w8,#0x3
008c54fc	b.ne 0x008c5620
008c5500	ldr d0,[x1]
008c5504	ldr d1,[x2]
008c5508	sbfx x8,x20,#0x10,#0x10
008c550c	fcmp d0,d1
008c5510	b 0x008c5650
008c5514	asr w8,w20,#0x10
008c5518	add x28,x23,w8, SXTW  #0x2
008c551c	b 0x008c6924
008c5520	cmp w8,#0x8
008c5524	b.le 0x008c5570
008c5528	sub w9,w8,#0x9
008c552c	cmp w9,#0x2
008c5530	b.cc 0x008c55d8
008c5534	cmp w8,#0xb
008c5538	b.ne 0x008c5674
008c553c	ldr x8,[x1]
008c5540	ldr x9,[x2]
008c5544	b 0x008c55e0
008c5548	cbz w8,0x008c7638
008c554c	cmp w8,#0x1
008c5550	b.ne 0x008c55f4
008c5554	ldr w8,[x1]
008c5558	ldr w9,[x2]
008c555c	asr w10,w20,#0x10
008c5560	cmp w8,w9
008c5564	csinc w8,w10,wzr,ne
008c5568	add x28,x23,w8, SXTW  #0x2
008c556c	b 0x008c6924
008c5570	cmp w8,#0x7
008c5574	b.eq 0x008c55d8
008c5578	ldr x8,[x1]
008c557c	ldr x9,[x2]
008c5580	ldr x0,[x8, #0x8]
008c5584	ldr x10,[x9, #0x8]
008c5588	cmp x0,x10
008c558c	b.ne 0x008c5674
008c5590	cbz x0,0x008c5544
008c5594	ldrsb w10,[x0, #0x6]
008c5598	tbnz w10,#0x1f,0x008c5544
008c559c	ldrb w8,[x0, #0x7]
008c55a0	tbnz w8,#0x1,0x008c56d8
008c55a4	ldr x8,[x19, #0x60]
008c55a8	mov x21,x1
008c55ac	mov w1,#0x7
008c55b0	mov x22,x2
008c55b4	ldr x8,[x8, #0x370]
008c55b8	mov x2,x8
008c55bc	bl 0x008bdfe0
008c55c0	mov x1,x21
008c55c4	mov x2,x22
008c55c8	cbnz x0,0x008c56e0
008c55cc	b 0x008c553c
008c55d0	cmp w8,#0x5
008c55d4	b.ne 0x008c565c
008c55d8	ldr x8,[x1]
008c55dc	ldr x9,[x2]
008c55e0	sbfx x10,x20,#0x10,#0x10
008c55e4	cmp x8,x9
008c55e8	csinc x8,x10,xzr,ne
008c55ec	add x28,x23,x8, LSL #0x2
008c55f0	b 0x008c6924
008c55f4	ldr x8,[x1]
008c55f8	ldr x9,[x2]
008c55fc	cmp x8,x9
008c5600	b.ne 0x008c575c
008c5604	ldr w8,[x1, #0x8]
008c5608	ldr w9,[x2, #0x8]
008c560c	cmp w8,w9
008c5610	b.ne 0x008c575c
008c5614	mov w8,#0x1
008c5618	add x28,x23,x8, LSL #0x2
008c561c	b 0x008c6924
008c5620	ldr s0,[x1]
008c5624	ldr s1,[x2]
008c5628	fcmp s0,s1
008c562c	b.ne 0x008c575c
008c5630	ldr s0,[x1, #0x4]
008c5634	ldr s1,[x2, #0x4]
008c5638	fcmp s0,s1
008c563c	b.ne 0x008c575c
008c5640	ldr s0,[x1, #0x8]
008c5644	ldr s1,[x2, #0x8]
008c5648	sbfx x8,x20,#0x10,#0x10
008c564c	fcmp s0,s1
008c5650	csinc x8,x8,xzr,ne
008c5654	add x28,x23,x8, LSL #0x2
008c5658	b 0x008c6924
008c565c	ldr x8,[x1]
008c5660	ldr x9,[x2]
008c5664	ldr x0,[x8, #0x10]
008c5668	ldr x10,[x9, #0x10]
008c566c	cmp x0,x10
008c5670	b.eq 0x008c5698
008c5674	ldr x8,[x19, #0x50]
008c5678	mov x0,x19
008c567c	str x23,[x8, #0x20]
008c5680	bl 0x008cbdc8
008c5684	asr w8,w20,#0x10
008c5688	cmp w0,#0x0
008c568c	csinc w8,w8,wzr,eq
008c5690	add x28,x23,w8, SXTW  #0x2
008c5694	b 0x008c6620
008c5698	cbz x0,0x008c5544
008c569c	ldrsb w10,[x0, #0x6]
008c56a0	tbnz w10,#0x1f,0x008c5544
008c56a4	ldrb w8,[x0, #0x7]
008c56a8	tbnz w8,#0x1,0x008c5674
008c56ac	ldr x8,[x19, #0x60]
008c56b0	mov x21,x1
008c56b4	mov w1,#0x7
008c56b8	mov x22,x2
008c56bc	ldr x8,[x8, #0x370]
008c56c0	mov x2,x8
008c56c4	bl 0x008bdfe0
008c56c8	mov x1,x21
008c56cc	mov x2,x22
008c56d0	cbnz x0,0x008c5674
008c56d4	b 0x008c553c
008c56d8	ldr x8,[x0, #0x20]
008c56dc	sub x0,x8,#0x80
008c56e0	ldr w8,[x0, #0xc]
008c56e4	cmp w8,#0x7
008c56e8	b.ne 0x008c5674
008c56ec	ldr x8,[x0]
008c56f0	ldrb w8,[x8, #0x6]
008c56f4	cbz w8,0x008c5674
008c56f8	ldr x8,[x19, #0x68]
008c56fc	ldr q0,[x0]
008c5700	mov x0,x19
008c5704	str q0,[x8]
008c5708	sub x9,x8,x25
008c570c	ldr q0,[x1]
008c5710	lsr x22,x9,#0x4
008c5714	mov w1,#0x2
008c5718	str q0,[x8, #0x10]
008c571c	ldr q0,[x2]
008c5720	mov w2,w22
008c5724	str q0,[x8, #0x20]
008c5728	add x8,x8,#0x30
008c572c	ldr x10,[x19, #0x50]
008c5730	str x8,[x19, #0x68]
008c5734	str x23,[x10, #0x20]
008c5738	bl 0x008cd928
008c573c	ldr x25,[x19, #0x70]
008c5740	add x8,x25,w22, SXTW  #0x4
008c5744	ldr w9,[x8, #0xc]
008c5748	cbz w9,0x008c575c
008c574c	cmp w9,#0x1
008c5750	b.ne 0x008c5614
008c5754	ldr w8,[x8]
008c5758	cbnz w8,0x008c5614
008c575c	sbfx x8,x20,#0x10,#0x10
008c5760	add x28,x23,x8, LSL #0x2
008c5764	b 0x008c6924
008c5768	ldr w20,[x28]
008c576c	ldr w9,[x28, #0x4]!
008c5770	lsr x8,x20,#0x8
008c5774	add x2,x25,x9, LSL #0x4
008c5778	add x1,x25,w8, UXTB  #0x4
008c577c	ldr w8,[x1, #0xc]
008c5780	cmp w8,#0x3
008c5784	b.ne 0x008c57ac
008c5788	ldr w8,[x2, #0xc]
008c578c	cmp w8,#0x3
008c5790	b.ne 0x008c57dc
008c5794	ldr d0,[x1]
008c5798	ldr d1,[x2]
008c579c	sbfx x8,x20,#0x10,#0x10
008c57a0	fcmp d0,d1
008c57a4	csinc x8,x8,xzr,ls
008c57a8	b 0x008c5204
008c57ac	cmp w8,#0x5
008c57b0	b.ne 0x008c57dc
008c57b4	ldr w8,[x2, #0xc]
008c57b8	cmp w8,#0x5
008c57bc	b.ne 0x008c57dc
008c57c0	ldr x0,[x1]
008c57c4	ldr x1,[x2]
008c57c8	bl 0x008cba50
008c57cc	asr w8,w20,#0x10
008c57d0	cmp w0,#0x1
008c57d4	csinc w8,w8,wzr,lt
008c57d8	b 0x008c75e0
008c57dc	ldr x8,[x19, #0x50]
008c57e0	mov x0,x19
008c57e4	str x28,[x8, #0x20]
008c57e8	bl 0x008cbbf8
008c57ec	asr w8,w20,#0x10
008c57f0	cmp w0,#0x1
008c57f4	csinc w8,w8,wzr,eq
008c57f8	add x28,x28,w8, SXTW  #0x2
008c57fc	b 0x008c450c
008c5800	ldr w20,[x28]
008c5804	ldr w9,[x28, #0x4]!
008c5808	lsr x8,x20,#0x8
008c580c	add x2,x25,x9, LSL #0x4
008c5810	add x1,x25,w8, UXTB  #0x4
008c5814	ldr w8,[x1, #0xc]
008c5818	cmp w8,#0x3
008c581c	b.ne 0x008c5848
008c5820	ldr w8,[x2, #0xc]
008c5824	cmp w8,#0x3
008c5828	b.ne 0x008c5874
008c582c	ldr d0,[x1]
008c5830	ldr d1,[x2]
008c5834	sbfx x8,x20,#0x10,#0x10
008c5838	fcmp d0,d1
008c583c	csinc x8,x8,xzr,hi
008c5840	add x28,x28,x8, LSL #0x2
008c5844	b 0x008c6924
008c5848	cmp w8,#0x5
008c584c	b.ne 0x008c5874
008c5850	ldr w8,[x2, #0xc]
008c5854	cmp w8,#0x5
008c5858	b.ne 0x008c5874
008c585c	ldr x0,[x1]
008c5860	ldr x1,[x2]
008c5864	bl 0x008cba50
008c5868	asr w8,w20,#0x10
008c586c	cmp w0,#0x1
008c5870	b 0x008c5888
008c5874	ldr x8,[x19, #0x50]
008c5878	mov x0,x19
008c587c	str x28,[x8, #0x20]
008c5880	bl 0x008cbbf8
008c5884	b 0x008c5894
008c5888	csinc w8,w8,wzr,ge
008c588c	add x28,x28,w8, SXTW  #0x2
008c5890	b 0x008c6924
008c5894	asr w8,w20,#0x10
008c5898	cmp w0,#0x0
008c589c	csinc w8,w8,wzr,eq
008c58a0	add x28,x28,w8, SXTW  #0x2
008c58a4	b 0x008c6620
008c58a8	ldr w20,[x28]
008c58ac	ldr w9,[x28, #0x4]!
008c58b0	lsr x8,x20,#0x8
008c58b4	add x2,x25,x9, LSL #0x4
008c58b8	add x1,x25,w8, UXTB  #0x4
008c58bc	ldr w8,[x1, #0xc]
008c58c0	cmp w8,#0x3
008c58c4	b.ne 0x008c58f0
008c58c8	ldr w8,[x2, #0xc]
008c58cc	cmp w8,#0x3
008c58d0	b.ne 0x008c591c
008c58d4	ldr d0,[x1]
008c58d8	ldr d1,[x2]
008c58dc	sbfx x8,x20,#0x10,#0x10
008c58e0	fcmp d0,d1
008c58e4	csinc x8,x8,xzr,mi
008c58e8	add x28,x28,x8, LSL #0x2
008c58ec	b 0x008c6924
008c58f0	cmp w8,#0x5
008c58f4	b.ne 0x008c591c
008c58f8	ldr w8,[x2, #0xc]
008c58fc	cmp w8,#0x5
008c5900	b.ne 0x008c591c
008c5904	ldr x0,[x1]
008c5908	ldr x1,[x2]
008c590c	bl 0x008cba50
008c5910	asr w8,w20,#0x10
008c5914	cmp w0,#0x0
008c5918	b 0x008c7a7c
008c591c	ldr x8,[x19, #0x50]
008c5920	mov x0,x19
008c5924	str x28,[x8, #0x20]
008c5928	bl 0x008cbab8
008c592c	asr w8,w20,#0x10
008c5930	cmp w0,#0x1
008c5934	b 0x008c589c
008c5938	ldr w20,[x28]
008c593c	ldr w9,[x28, #0x4]!
008c5940	lsr x8,x20,#0x8
008c5944	add x2,x25,x9, LSL #0x4
008c5948	add x1,x25,w8, UXTB  #0x4
008c594c	ldr w8,[x1, #0xc]
008c5950	cmp w8,#0x3
008c5954	b.ne 0x008c5980
008c5958	ldr w8,[x2, #0xc]
008c595c	cmp w8,#0x3
008c5960	b.ne 0x008c59ac
008c5964	ldr d0,[x1]
008c5968	ldr d1,[x2]
008c596c	sbfx x8,x20,#0x10,#0x10
008c5970	fcmp d0,d1
008c5974	csinc x8,x8,xzr,pl
008c5978	add x28,x28,x8, LSL #0x2
008c597c	b 0x008c6924
008c5980	cmp w8,#0x5
008c5984	b.ne 0x008c59ac
008c5988	ldr w8,[x2, #0xc]
008c598c	cmp w8,#0x5
008c5990	b.ne 0x008c59ac
008c5994	ldr x0,[x1]
008c5998	ldr x1,[x2]
008c599c	bl 0x008cba50
008c59a0	asr w8,w20,#0x10
008c59a4	cmp w0,#0x0
008c59a8	b 0x008c5888
008c59ac	ldr x8,[x19, #0x50]
008c59b0	mov x0,x19
008c59b4	str x28,[x8, #0x20]
008c59b8	bl 0x008cbab8
008c59bc	b 0x008c5894
008c59c0	ldr w20,[x28], #0x4
008c59c4	lsr x8,x20,#0x10
008c59c8	lsr x9,x20,#0x8
008c59cc	lsr x10,x20,#0x14
008c59d0	add x2,x25,w8, UXTB  #0x4
008c59d4	add x1,x25,w9, UXTB  #0x4
008c59d8	and x9,x10,#0xff0
008c59dc	add x3,x25,x9
008c59e0	ldr w8,[x2, #0xc]
008c59e4	cmp w8,#0x3
008c59e8	b.ne 0x008c5a08
008c59ec	ldr w8,[x3, #0xc]
008c59f0	cmp w8,#0x3
008c59f4	b.ne 0x008c5a88
008c59f8	ldr d0,[x2]
008c59fc	ldr d1,[x3]
008c5a00	fadd d0,d0,d1
008c5a04	b 0x008c619c
008c5a08	cmp w8,#0x4
008c5a0c	b.ne 0x008c5a3c
008c5a10	ldr w8,[x3, #0xc]
008c5a14	cmp w8,#0x4
008c5a18	b.ne 0x008c5a88
008c5a1c	ldr d0,[x2]
008c5a20	ldr d1,[x3]
008c5a24	ldr s2,[x2, #0x8]
008c5a28	ldr s3,[x3, #0x8]
008c5a2c	str w8,[x1, #0xc]
008c5a30	fadd v0.2S,v0.2S,v1.2S
008c5a34	fadd s1,s2,s3
008c5a38	b 0x008c5a94
008c5a3c	cmp w8,#0x8
008c5a40	b.ne 0x008c5a88
008c5a44	mov x0,x19
008c5a48	mov x21,x1
008c5a4c	mov x1,x2
008c5a50	mov x22,x2
008c5a54	mov w2,#0x8
008c5a58	mov x23,x3
008c5a5c	bl 0x008be028
008c5a60	mov x3,x23
008c5a64	mov x2,x22
008c5a68	mov x1,x21
008c5a6c	cbz x0,0x008c5a88
008c5a70	ldr w8,[x0, #0xc]
008c5a74	cmp w8,#0x7
008c5a78	b.ne 0x008c5a88
008c5a7c	ldr x8,[x0]
008c5a80	ldrb w8,[x8, #0x6]
008c5a84	cbnz w8,0x008c5ab4
008c5a88	ldr x8,[x19, #0x50]
008c5a8c	str x28,[x8, #0x20]
008c5a90	b 0x008c5aa8
008c5a94	ldrb w8,[x28]
008c5a98	str d0,[x1]
008c5a9c	str s1,[x1, #0x8]
008c5aa0	ldr x8,[x26, x8, LSL #0x3]
008c5aa4	br x8
008c5aa8	mov x0,x19
008c5aac	bl 0x008cc36c
008c5ab0	b 0x008c6620
008c5ab4	ldr x8,[x19, #0x68]
008c5ab8	ldr q0,[x0]
008c5abc	str q0,[x8]
008c5ac0	ldr q0,[x2]
008c5ac4	str q0,[x8, #0x10]
008c5ac8	ldr q0,[x3]
008c5acc	str q0,[x8, #0x20]
008c5ad0	add x8,x8,#0x30
008c5ad4	ubfx x2,x20,#0x8,#0x8
008c5ad8	ldr x9,[x19, #0x50]
008c5adc	mov x0,x19
008c5ae0	mov w1,#0x2
008c5ae4	str x8,[x19, #0x68]
008c5ae8	str x28,[x9, #0x20]
008c5aec	bl 0x008cd928
008c5af0	b 0x008c6620
008c5af4	ldr w20,[x28], #0x4
008c5af8	lsr x8,x20,#0x10
008c5afc	lsr x9,x20,#0x8
008c5b00	lsr x10,x20,#0x14
008c5b04	add x2,x25,w8, UXTB  #0x4
008c5b08	add x1,x25,w9, UXTB  #0x4
008c5b0c	and x9,x10,#0xff0
008c5b10	add x3,x25,x9
008c5b14	ldr w8,[x2, #0xc]
008c5b18	cmp w8,#0x3
008c5b1c	b.ne 0x008c5b3c
008c5b20	ldr w8,[x3, #0xc]
008c5b24	cmp w8,#0x3
008c5b28	b.ne 0x008c5bbc
008c5b2c	ldr d0,[x2]
008c5b30	ldr d1,[x3]
008c5b34	fsub d0,d0,d1
008c5b38	b 0x008c619c
008c5b3c	cmp w8,#0x4
008c5b40	b.ne 0x008c5b70
008c5b44	ldr w8,[x3, #0xc]
008c5b48	cmp w8,#0x4
008c5b4c	b.ne 0x008c5bbc
008c5b50	ldr d0,[x2]
008c5b54	ldr d1,[x3]
008c5b58	ldr s2,[x2, #0x8]
008c5b5c	ldr s3,[x3, #0x8]
008c5b60	str w8,[x1, #0xc]
008c5b64	fsub v0.2S,v0.2S,v1.2S
008c5b68	fsub s1,s2,s3
008c5b6c	b 0x008c5a94
008c5b70	cmp w8,#0x8
008c5b74	b.ne 0x008c5bbc
008c5b78	mov x0,x19
008c5b7c	mov x21,x1
008c5b80	mov x1,x2
008c5b84	mov x22,x2
008c5b88	mov w2,#0x9
008c5b8c	mov x23,x3
008c5b90	bl 0x008be028
008c5b94	mov x3,x23
008c5b98	mov x2,x22
008c5b9c	mov x1,x21
008c5ba0	cbz x0,0x008c5bbc
008c5ba4	ldr w8,[x0, #0xc]
008c5ba8	cmp w8,#0x7
008c5bac	b.ne 0x008c5bbc
008c5bb0	ldr x8,[x0]
008c5bb4	ldrb w8,[x8, #0x6]
008c5bb8	cbnz w8,0x008c5ab4
008c5bbc	ldr x8,[x19, #0x50]
008c5bc0	str x28,[x8, #0x20]
008c5bc4	mov x0,x19
008c5bc8	bl 0x008cc574
008c5bcc	b 0x008c6620
008c5bd0	ldr w20,[x28], #0x4
008c5bd4	mov x21,x24
008c5bd8	lsr x8,x20,#0x10
008c5bdc	lsr x9,x20,#0x8
008c5be0	lsr x10,x20,#0x14
008c5be4	add x23,x25,w8, UXTB  #0x4
008c5be8	add x22,x25,w9, UXTB  #0x4
008c5bec	and x9,x10,#0xff0
008c5bf0	add x24,x25,x9
008c5bf4	ldr w8,[x23, #0xc]
008c5bf8	cmp w8,#0x3
008c5bfc	b.ne 0x008c5c1c
008c5c00	ldr w8,[x24, #0xc]
008c5c04	cmp w8,#0x3
008c5c08	b.ne 0x008c5c50
008c5c0c	ldr d0,[x23]
008c5c10	ldr d1,[x24]
008c5c14	fmul d0,d0,d1
008c5c18	b 0x008c5cf4
008c5c1c	cmp w8,#0x4
008c5c20	mov x1,x23
008c5c24	b.ne 0x008c5c7c
008c5c28	ldr w8,[x24, #0xc]
008c5c2c	cmp w8,#0x4
008c5c30	b.eq 0x008c5ccc
008c5c34	cmp w8,#0x3
008c5c38	b.ne 0x008c5cac
008c5c3c	ldr d0,[x24]
008c5c40	ldr d1,[x23]
008c5c44	mov w8,#0x4
008c5c48	ldr s2,[x23, #0x8]
008c5c4c	b 0x008c5c68
008c5c50	cmp w8,#0x4
008c5c54	mov x1,x24
008c5c58	b.ne 0x008c5c7c
008c5c5c	ldr d0,[x23]
008c5c60	ldr d1,[x24]
008c5c64	ldr s2,[x24, #0x8]
008c5c68	fcvt s0,d0
008c5c6c	fmul v1.2S,v1.2S,v0.S[0x0]
008c5c70	str w8,[x22, #0xc]
008c5c74	fmul s0,s2,s0
008c5c78	b 0x008c5e14
008c5c7c	cmp w8,#0x8
008c5c80	b.ne 0x008c5cac
008c5c84	mov x0,x19
008c5c88	mov w2,#0xa
008c5c8c	bl 0x008be028
008c5c90	cbz x0,0x008c5cac
008c5c94	ldr w8,[x0, #0xc]
008c5c98	cmp w8,#0x7
008c5c9c	b.ne 0x008c5cac
008c5ca0	ldr x8,[x0]
008c5ca4	ldrb w8,[x8, #0x6]
008c5ca8	cbnz w8,0x008c5d10
008c5cac	ldr x8,[x19, #0x50]
008c5cb0	mov x0,x19
008c5cb4	mov x1,x22
008c5cb8	mov x2,x23
008c5cbc	mov x3,x24
008c5cc0	str x28,[x8, #0x20]
008c5cc4	bl 0x008cc77c
008c5cc8	b 0x008c5d4c
008c5ccc	ldr d0,[x23]
008c5cd0	ldr d1,[x24]
008c5cd4	ldr s2,[x23, #0x8]
008c5cd8	ldr s3,[x24, #0x8]
008c5cdc	str w8,[x22, #0xc]
008c5ce0	fmul v0.2S,v0.2S,v1.2S
008c5ce4	ldrb w8,[x28]
008c5ce8	fmul s1,s2,s3
008c5cec	ldr x8,[x26, x8, LSL #0x3]
008c5cf0	b 0x008c5d00
008c5cf4	str d0,[x22]
008c5cf8	str w8,[x22, #0xc]
008c5cfc	b 0x008c6d54
008c5d00	str d0,[x22]
008c5d04	str s1,[x22, #0x8]
008c5d08	mov x24,x21
008c5d0c	br x8
008c5d10	ldr x8,[x19, #0x68]
008c5d14	ldr q0,[x0]
008c5d18	ubfx x2,x20,#0x8,#0x8
008c5d1c	mov x0,x19
008c5d20	mov w1,#0x2
008c5d24	str q0,[x8]
008c5d28	ldr q0,[x23]
008c5d2c	str q0,[x8, #0x10]
008c5d30	ldr q0,[x24]
008c5d34	str q0,[x8, #0x20]
008c5d38	add x8,x8,#0x30
008c5d3c	ldr x9,[x19, #0x50]
008c5d40	str x8,[x19, #0x68]
008c5d44	str x28,[x9, #0x20]
008c5d48	bl 0x008cd928
008c5d4c	ldrb w8,[x28]
008c5d50	ldr x25,[x19, #0x70]
008c5d54	b 0x008c6d58
008c5d58	ldr w20,[x28], #0x4
008c5d5c	mov x21,x24
008c5d60	lsr x8,x20,#0x10
008c5d64	lsr x9,x20,#0x8
008c5d68	lsr x10,x20,#0x14
008c5d6c	add x23,x25,w8, UXTB  #0x4
008c5d70	add x22,x25,w9, UXTB  #0x4
008c5d74	and x9,x10,#0xff0
008c5d78	add x24,x25,x9
008c5d7c	ldr w8,[x23, #0xc]
008c5d80	cmp w8,#0x3
008c5d84	b.ne 0x008c5da4
008c5d88	ldr w8,[x24, #0xc]
008c5d8c	cmp w8,#0x3
008c5d90	b.ne 0x008c5de8
008c5d94	ldr d0,[x23]
008c5d98	ldr d1,[x24]
008c5d9c	fdiv d0,d0,d1
008c5da0	b 0x008c5cf4
008c5da4	cmp w8,#0x4
008c5da8	mov x1,x23
008c5dac	b.ne 0x008c5e2c
008c5db0	ldr w8,[x24, #0xc]
008c5db4	cmp w8,#0x4
008c5db8	b.eq 0x008c5e7c
008c5dbc	cmp w8,#0x3
008c5dc0	b.ne 0x008c5e5c
008c5dc4	ldr d0,[x24]
008c5dc8	ldr d2,[x23]
008c5dcc	mov w8,#0x4
008c5dd0	fcvt s0,d0
008c5dd4	dup v1.2S,v0.S[0x0]
008c5dd8	fdiv v1.2S,v2.2S,v1.2S
008c5ddc	ldr s2,[x23, #0x8]
008c5de0	fdiv s0,s2,s0
008c5de4	b 0x008c5e10
008c5de8	cmp w8,#0x4
008c5dec	mov x1,x24
008c5df0	b.ne 0x008c5e2c
008c5df4	ldr d0,[x23]
008c5df8	ldr d2,[x24]
008c5dfc	fcvt s0,d0
008c5e00	dup v1.2S,v0.S[0x0]
008c5e04	fdiv v1.2S,v1.2S,v2.2S
008c5e08	ldr s2,[x24, #0x8]
008c5e0c	fdiv s0,s0,s2
008c5e10	str w8,[x22, #0xc]
008c5e14	ldrb w8,[x28]
008c5e18	str d1,[x22]
008c5e1c	mov x24,x21
008c5e20	str s0,[x22, #0x8]
008c5e24	ldr x8,[x26, x8, LSL #0x3]
008c5e28	br x8
008c5e2c	cmp w8,#0x8
008c5e30	b.ne 0x008c5e5c
008c5e34	mov x0,x19
008c5e38	mov w2,#0xb
008c5e3c	bl 0x008be028
008c5e40	cbz x0,0x008c5e5c
008c5e44	ldr w8,[x0, #0xc]
008c5e48	cmp w8,#0x7
008c5e4c	b.ne 0x008c5e5c
008c5e50	ldr x8,[x0]
008c5e54	ldrb w8,[x8, #0x6]
008c5e58	cbnz w8,0x008c5d10
008c5e5c	ldr x8,[x19, #0x50]
008c5e60	mov x0,x19
008c5e64	mov x1,x22
008c5e68	mov x2,x23
008c5e6c	mov x3,x24
008c5e70	str x28,[x8, #0x20]
008c5e74	bl 0x008cca4c
008c5e78	b 0x008c5d4c
008c5e7c	ldr d0,[x23]
008c5e80	ldr d1,[x24]
008c5e84	str w8,[x22, #0xc]
008c5e88	ldrb w8,[x28]
008c5e8c	ldr s2,[x24, #0x8]
008c5e90	fdiv v0.2S,v0.2S,v1.2S
008c5e94	ldr s1,[x23, #0x8]
008c5e98	ldr x8,[x26, x8, LSL #0x3]
008c5e9c	fdiv s1,s1,s2
008c5ea0	b 0x008c5d00
008c5ea4	ldr w20,[x28], #0x4
008c5ea8	mov x19,x24
008c5eac	lsr x8,x20,#0x10
008c5eb0	lsr x9,x20,#0x8
008c5eb4	lsr x10,x20,#0x14
008c5eb8	add x23,x25,w8, UXTB  #0x4
008c5ebc	add x22,x25,w9, UXTB  #0x4
008c5ec0	and x9,x10,#0xff0
008c5ec4	add x24,x25,x9
008c5ec8	ldr w8,[x23, #0xc]
008c5ecc	cmp w8,#0x3
008c5ed0	b.ne 0x008c5ee8
008c5ed4	ldr w8,[x24, #0xc]
008c5ed8	cmp w8,#0x3
008c5edc	b.eq 0x008c5fc4
008c5ee0	mov x1,x24
008c5ee4	b 0x008c5f04
008c5ee8	cmp w8,#0x4
008c5eec	mov x1,x23
008c5ef0	b.ne 0x008c5f04
008c5ef4	ldr w8,[x24, #0xc]
008c5ef8	cmp w8,#0x3
008c5efc	b.eq 0x008c5fe4
008c5f00	b 0x008c5f8c
008c5f04	cmp w8,#0x8
008c5f08	b.ne 0x008c5f8c
008c5f0c	ldr x0,[sp, #0x20]
008c5f10	mov w2,#0xc
008c5f14	bl 0x008be028
008c5f18	cbz x0,0x008c5f8c
008c5f1c	ldr w8,[x0, #0xc]
008c5f20	cmp w8,#0x7
008c5f24	b.ne 0x008c5f8c
008c5f28	ldr x8,[x0]
008c5f2c	ldrb w8,[x8, #0x6]
008c5f30	cbz w8,0x008c5f8c
008c5f34	ldr x21,[sp, #0x20]
008c5f38	ldr q0,[x0]
008c5f3c	ubfx x2,x20,#0x8,#0x8
008c5f40	mov w1,#0x2
008c5f44	ldr x8,[x21, #0x68]
008c5f48	mov x0,x21
008c5f4c	str q0,[x8]
008c5f50	ldr q0,[x23]
008c5f54	str q0,[x8, #0x10]
008c5f58	ldr q0,[x24]
008c5f5c	str q0,[x8, #0x20]
008c5f60	add x8,x8,#0x30
008c5f64	ldr x9,[x21, #0x50]
008c5f68	str x8,[x21, #0x68]
008c5f6c	str x28,[x9, #0x20]
008c5f70	bl 0x008cd928
008c5f74	ldrb w8,[x28]
008c5f78	ldr x25,[x21, #0x70]
008c5f7c	mov x24,x19
008c5f80	mov x19,x21
008c5f84	ldr x8,[x26, x8, LSL #0x3]
008c5f88	br x8
008c5f8c	ldr x20,[sp, #0x20]
008c5f90	mov x1,x22
008c5f94	mov x2,x23
008c5f98	mov x3,x24
008c5f9c	ldr x8,[x20, #0x50]
008c5fa0	mov x0,x20
008c5fa4	str x28,[x8, #0x20]
008c5fa8	bl 0x008ccd18
008c5fac	ldrb w8,[x28]
008c5fb0	ldr x25,[x20, #0x70]
008c5fb4	mov x24,x19
008c5fb8	mov x19,x20
008c5fbc	ldr x8,[x26, x8, LSL #0x3]
008c5fc0	br x8
008c5fc4	ldr d0,[x23]
008c5fc8	ldr d1,[x24]
008c5fcc	str w8,[x22, #0xc]
008c5fd0	fdiv d0,d0,d1
008c5fd4	frintm d0,d0
008c5fd8	str d0,[x22]
008c5fdc	ldrb w8,[x28]
008c5fe0	b 0x008c86a0
008c5fe4	ldr d0,[x24]
008c5fe8	ldr d1,[x23]
008c5fec	mov w8,#0x4
008c5ff0	str w8,[x22, #0xc]
008c5ff4	fcvt s0,d0
008c5ff8	fcvtl v1.2D,v1.2S
008c5ffc	ldrb w8,[x28]
008c6000	ldr x8,[x26, x8, LSL #0x3]
008c6004	fcvt d0,s0
008c6008	dup v2.2D,v0.D[0x0]
008c600c	fdiv v1.2D,v1.2D,v2.2D
008c6010	ldr s2,[x23, #0x8]
008c6014	fcvt d2,s2
008c6018	fdiv d0,d2,d0
008c601c	frintm v1.2D,v1.2D
008c6020	fcvtn v1.2S,v1.2D
008c6024	str d1,[x22]
008c6028	frintm d0,d0
008c602c	fcvt s0,d0
008c6030	str s0,[x22, #0x8]
008c6034	b 0x008c86a4
008c6038	ldr w8,[x28], #0x4
008c603c	lsr x9,x8,#0x10
008c6040	add x2,x25,w9, UXTB  #0x4
008c6044	lsr x9,x8,#0x8
008c6048	lsr x8,x8,#0x14
008c604c	ldr w10,[x2, #0xc]
008c6050	add x1,x25,w9, UXTB  #0x4
008c6054	and x8,x8,#0xff0
008c6058	add x3,x25,x8
008c605c	cmp w10,#0x3
008c6060	b.ne 0x008c6088
008c6064	ldr w8,[x3, #0xc]
008c6068	cmp w8,#0x3
008c606c	b.ne 0x008c6088
008c6070	ldr d0,[x2]
008c6074	ldr d1,[x3]
008c6078	fdiv d2,d0,d1
008c607c	frintm d2,d2
008c6080	fmsub d0,d2,d1,d0
008c6084	b 0x008c619c
008c6088	ldr x8,[x19, #0x50]
008c608c	str x28,[x8, #0x20]
008c6090	mov x0,x19
008c6094	bl 0x008cd058
008c6098	b 0x008c6620
008c609c	ldr w8,[x28], #0x4
008c60a0	lsr x9,x8,#0x10
008c60a4	add x2,x25,w9, UXTB  #0x4
008c60a8	lsr x9,x8,#0x8
008c60ac	lsr x8,x8,#0x14
008c60b0	ldr w10,[x2, #0xc]
008c60b4	add x1,x25,w9, UXTB  #0x4
008c60b8	and x8,x8,#0xff0
008c60bc	add x3,x25,x8
008c60c0	cmp w10,#0x3
008c60c4	b.ne 0x008c60f4
008c60c8	ldr w8,[x3, #0xc]
008c60cc	cmp w8,#0x3
008c60d0	b.ne 0x008c60f4
008c60d4	ldr d0,[x2]
008c60d8	ldr d1,[x3]
008c60dc	mov x20,x1
008c60e0	bl 0x00c30770
008c60e4	mov w8,#0x3
008c60e8	str d0,[x20]
008c60ec	str w8,[x20, #0xc]
008c60f0	b 0x008c6924
008c60f4	ldr x8,[x19, #0x50]
008c60f8	str x28,[x8, #0x20]
008c60fc	mov x0,x19
008c6100	bl 0x008cd244
008c6104	b 0x008c6620
008c6108	ldr w8,[x28], #0x4
008c610c	lsr x9,x8,#0x10
008c6110	add x2,x25,w9, UXTB  #0x4
008c6114	lsr x9,x8,#0x8
008c6118	lsr x8,x8,#0x14
008c611c	ldr w10,[x2, #0xc]
008c6120	add x1,x25,w9, UXTB  #0x4
008c6124	and x8,x8,#0xff0
008c6128	cmp w10,#0x3
008c612c	b.ne 0x008c6140
008c6130	ldr d0,[x2]
008c6134	ldr d1,[x27,x8]
008c6138	fadd d0,d0,d1
008c613c	b 0x008c6198
008c6140	ldr x9,[x19, #0x50]
008c6144	add x3,x27,x8
008c6148	str x28,[x9, #0x20]
008c614c	b 0x008c5aa8
008c6150	ldr w8,[x28], #0x4
008c6154	lsr x9,x8,#0x10
008c6158	add x2,x25,w9, UXTB  #0x4
008c615c	lsr x9,x8,#0x8
008c6160	lsr x8,x8,#0x14
008c6164	ldr w10,[x2, #0xc]
008c6168	add x1,x25,w9, UXTB  #0x4
008c616c	and x8,x8,#0xff0
008c6170	cmp w10,#0x3
008c6174	b.ne 0x008c6184
008c6178	ldr d0,[x2]
008c617c	ldr d1,[x27,x8]
008c6180	b 0x008c6194
008c6184	ldr x9,[x19, #0x50]
008c6188	add x3,x27,x8
008c618c	str x28,[x9, #0x20]
008c6190	b 0x008c5bc4
008c6194	fsub d0,d0,d1
008c6198	mov w8,#0x3
008c619c	str d0,[x1]
008c61a0	str w8,[x1, #0xc]
008c61a4	b 0x008c6924
008c61a8	ldr w20,[x28], #0x4
008c61ac	lsr x8,x20,#0x10
008c61b0	lsr x9,x20,#0x8
008c61b4	lsr x10,x20,#0x14
008c61b8	add x23,x25,w8, UXTB  #0x4
008c61bc	add x22,x25,w9, UXTB  #0x4
008c61c0	and x21,x10,#0xff0
008c61c4	ldr w8,[x23, #0xc]
008c61c8	cmp w8,#0x3
008c61cc	b.ne 0x008c61e0
008c61d0	ldr d0,[x23]
008c61d4	ldr d1,[x27,x21]
008c61d8	fmul d0,d0,d1
008c61dc	b 0x008c6760
008c61e0	cmp w8,#0x4
008c61e4	b.ne 0x008c6208
008c61e8	ldr d0,[x27,x21]
008c61ec	ldr d1,[x23]
008c61f0	ldr s2,[x23, #0x8]
008c61f4	str w8,[x22, #0xc]
008c61f8	fcvt s0,d0
008c61fc	fmul v1.2S,v1.2S,v0.S[0x0]
008c6200	fmul s0,s2,s0
008c6204	b 0x008c625c
008c6208	cmp w8,#0x8
008c620c	b.ne 0x008c623c
008c6210	mov x0,x19
008c6214	mov x1,x23
008c6218	mov w2,#0xa
008c621c	bl 0x008be028
008c6220	cbz x0,0x008c623c
008c6224	ldr w8,[x0, #0xc]
008c6228	cmp w8,#0x7
008c622c	b.ne 0x008c623c
008c6230	ldr x8,[x0]
008c6234	ldrb w8,[x8, #0x6]
008c6238	cbnz w8,0x008c6270
008c623c	ldr x8,[x19, #0x50]
008c6240	add x3,x27,x21
008c6244	mov x0,x19
008c6248	mov x1,x22
008c624c	mov x2,x23
008c6250	str x28,[x8, #0x20]
008c6254	bl 0x008cc77c
008c6258	b 0x008c6620
008c625c	ldrb w8,[x28]
008c6260	str d1,[x22]
008c6264	str s0,[x22, #0x8]
008c6268	ldr x8,[x26, x8, LSL #0x3]
008c626c	br x8
008c6270	ldr x8,[x19, #0x68]
008c6274	ldr q0,[x0]
008c6278	str q0,[x8]
008c627c	ldr q0,[x23]
008c6280	str q0,[x8, #0x10]
008c6284	ldr q0,[x27,x21]
008c6288	b 0x008c5acc
008c628c	ldr w20,[x28], #0x4
008c6290	lsr x8,x20,#0x10
008c6294	lsr x9,x20,#0x8
008c6298	lsr x10,x20,#0x14
008c629c	add x23,x25,w8, UXTB  #0x4
008c62a0	add x22,x25,w9, UXTB  #0x4
008c62a4	and x21,x10,#0xff0
008c62a8	ldr w8,[x23, #0xc]
008c62ac	cmp w8,#0x3
008c62b0	b.ne 0x008c62c4
008c62b4	ldr d0,[x23]
008c62b8	ldr d1,[x27,x21]
008c62bc	fdiv d0,d0,d1
008c62c0	b 0x008c6760
008c62c4	cmp w8,#0x4
008c62c8	b.ne 0x008c62f0
008c62cc	ldr d0,[x27,x21]
008c62d0	ldr d2,[x23]
008c62d4	str w8,[x22, #0xc]
008c62d8	fcvt s0,d0
008c62dc	dup v1.2S,v0.S[0x0]
008c62e0	fdiv v1.2S,v2.2S,v1.2S
008c62e4	ldr s2,[x23, #0x8]
008c62e8	fdiv s0,s2,s0
008c62ec	b 0x008c625c
008c62f0	cmp w8,#0x8
008c62f4	b.ne 0x008c6324
008c62f8	mov x0,x19
008c62fc	mov x1,x23
008c6300	mov w2,#0xb
008c6304	bl 0x008be028
008c6308	cbz x0,0x008c6324
008c630c	ldr w8,[x0, #0xc]
008c6310	cmp w8,#0x7
008c6314	b.ne 0x008c6324
008c6318	ldr x8,[x0]
008c631c	ldrb w8,[x8, #0x6]
008c6320	cbnz w8,0x008c6270
008c6324	ldr x8,[x19, #0x50]
008c6328	add x3,x27,x21
008c632c	mov x0,x19
008c6330	mov x1,x22
008c6334	mov x2,x23
008c6338	b 0x008c7850
008c633c	ldr w20,[x28], #0x4
008c6340	lsr x8,x20,#0x10
008c6344	lsr x9,x20,#0x8
008c6348	lsr x10,x20,#0x14
008c634c	add x23,x25,w8, UXTB  #0x4
008c6350	add x22,x25,w9, UXTB  #0x4
008c6354	and x21,x10,#0xff0
008c6358	ldr w8,[x23, #0xc]
008c635c	cmp w8,#0x3
008c6360	b.ne 0x008c6378
008c6364	ldr d0,[x23]
008c6368	ldr d1,[x27,x21]
008c636c	fdiv d0,d0,d1
008c6370	frintm d0,d0
008c6374	b 0x008c6760
008c6378	cmp w8,#0x4
008c637c	b.ne 0x008c63c0
008c6380	ldr d0,[x27,x21]
008c6384	ldr d1,[x23]
008c6388	str w8,[x22, #0xc]
008c638c	fcvt s0,d0
008c6390	fcvtl v1.2D,v1.2S
008c6394	fcvt d0,s0
008c6398	dup v2.2D,v0.D[0x0]
008c639c	fdiv v1.2D,v1.2D,v2.2D
008c63a0	ldr s2,[x23, #0x8]
008c63a4	fcvt d2,s2
008c63a8	fdiv d0,d2,d0
008c63ac	frintm v1.2D,v1.2D
008c63b0	fcvtn v1.2S,v1.2D
008c63b4	frintm d0,d0
008c63b8	fcvt s0,d0
008c63bc	b 0x008c625c
008c63c0	cmp w8,#0x8
008c63c4	b.ne 0x008c63f4
008c63c8	mov x0,x19
008c63cc	mov x1,x23
008c63d0	mov w2,#0xc
008c63d4	bl 0x008be028
008c63d8	cbz x0,0x008c63f4
008c63dc	ldr w8,[x0, #0xc]
008c63e0	cmp w8,#0x7
008c63e4	b.ne 0x008c63f4
008c63e8	ldr x8,[x0]
008c63ec	ldrb w8,[x8, #0x6]
008c63f0	cbnz w8,0x008c6270
008c63f4	ldr x8,[x19, #0x50]
008c63f8	add x3,x27,x21
008c63fc	mov x0,x19
008c6400	mov x1,x22
008c6404	mov x2,x23
008c6408	str x28,[x8, #0x20]
008c640c	bl 0x008ccd18
008c6410	b 0x008c6620
008c6414	ldr w8,[x28], #0x4
008c6418	lsr x9,x8,#0x10
008c641c	add x2,x25,w9, UXTB  #0x4
008c6420	lsr x9,x8,#0x8
008c6424	lsr x8,x8,#0x14
008c6428	ldr w10,[x2, #0xc]
008c642c	add x1,x25,w9, UXTB  #0x4
008c6430	and x8,x8,#0xff0
008c6434	cmp w10,#0x3
008c6438	b.ne 0x008c6454
008c643c	ldr d0,[x2]
008c6440	ldr d1,[x27,x8]
008c6444	fdiv d2,d0,d1
008c6448	frintm d2,d2
008c644c	fmsub d0,d2,d1,d0
008c6450	b 0x008c6198
008c6454	ldr x9,[x19, #0x50]
008c6458	add x3,x27,x8
008c645c	str x28,[x9, #0x20]
008c6460	b 0x008c6090
008c6464	ldr w8,[x28], #0x4
008c6468	lsr x9,x8,#0x10
008c646c	add x2,x25,w9, UXTB  #0x4
008c6470	lsr x9,x8,#0x8
008c6474	lsr x8,x8,#0x14
008c6478	ldr w10,[x2, #0xc]
008c647c	add x1,x25,w9, UXTB  #0x4
008c6480	and x8,x8,#0xff0
008c6484	cmp w10,#0x3
008c6488	b.ne 0x008c64a8
008c648c	fmov d0,0x4000000000000000
008c6490	ldr d1,[x27,x8]
008c6494	fcmp d1,d0
008c6498	ldr d0,[x2]
008c649c	b.ne 0x008c64b8
008c64a0	fmul d0,d0,d0
008c64a4	b 0x008c6198
008c64a8	ldr x9,[x19, #0x50]
008c64ac	add x3,x27,x8
008c64b0	str x28,[x9, #0x20]
008c64b4	b 0x008c60fc
008c64b8	fmov d2,0x3fe0000000000000
008c64bc	fcmp d1,d2
008c64c0	b.ne 0x008c64cc
008c64c4	fsqrt d0,d0
008c64c8	b 0x008c6198
008c64cc	fmov d2,0x4008000000000000
008c64d0	fcmp d1,d2
008c64d4	b.ne 0x008c64e4
008c64d8	fmul d1,d0,d0
008c64dc	fmul d0,d0,d1
008c64e0	b 0x008c6198
008c64e4	mov x20,x1
008c64e8	bl 0x00c30770
008c64ec	mov x1,x20
008c64f0	b 0x008c6198
008c64f4	ldr w8,[x28], #0x4
008c64f8	lsr x9,x8,#0x10
008c64fc	add x9,x25,w9, UXTB  #0x4
008c6500	ldr w10,[x9, #0xc]
008c6504	cbz w10,0x008c6524
008c6508	cmp w10,#0x1
008c650c	b.ne 0x008c6518
008c6510	ldr w10,[x9]
008c6514	cbz w10,0x008c6524
008c6518	lsr x9,x8,#0x14
008c651c	and x9,x9,#0xff0
008c6520	add x9,x25,x9
008c6524	lsr x8,x8,#0x8
008c6528	ldr q0,[x9]
008c652c	add x8,x25,w8, UXTB  #0x4
008c6530	str q0,[x8]
008c6534	b 0x008c6924
008c6538	ldr w8,[x28], #0x4
008c653c	lsr x9,x8,#0x10
008c6540	add x10,x25,w9, UXTB  #0x4
008c6544	lsr x9,x8,#0x14
008c6548	ldr w11,[x10, #0xc]
008c654c	and x9,x9,#0xff0
008c6550	add x9,x25,x9
008c6554	cbz w11,0x008c6524
008c6558	cmp w11,#0x1
008c655c	b.ne 0x008c6568
008c6560	ldr w11,[x10]
008c6564	cbz w11,0x008c6524
008c6568	mov x9,x10
008c656c	b 0x008c6524
008c6570	ldr w8,[x28], #0x4
008c6574	lsr x9,x8,#0x10
008c6578	add x9,x25,w9, UXTB  #0x4
008c657c	ldr w10,[x9, #0xc]
008c6580	cbz w10,0x008c6524
008c6584	cmp w10,#0x1
008c6588	b.ne 0x008c6594
008c658c	ldr w10,[x9]
008c6590	cbz w10,0x008c6524
008c6594	lsr x9,x8,#0x14
008c6598	and x9,x9,#0xff0
008c659c	add x9,x27,x9
008c65a0	b 0x008c6524
008c65a4	ldr w8,[x28], #0x4
008c65a8	lsr x9,x8,#0x10
008c65ac	add x10,x25,w9, UXTB  #0x4
008c65b0	lsr x9,x8,#0x14
008c65b4	ldr w11,[x10, #0xc]
008c65b8	and x9,x9,#0xff0
008c65bc	add x9,x27,x9
008c65c0	cbnz w11,0x008c6558
008c65c4	b 0x008c6524
008c65c8	ldr w20,[x28], #0x4
008c65cc	ldr x8,[x19, #0x50]
008c65d0	mov x0,x19
008c65d4	ubfx x21,x20,#0x10,#0x8
008c65d8	lsr w2,w20,#0x18
008c65dc	str x28,[x8, #0x20]
008c65e0	sub w8,w2,w21
008c65e4	add w1,w8,#0x1
008c65e8	bl 0x008cc074
008c65ec	ldr x8,[x19, #0x70]
008c65f0	ubfx x9,x20,#0x8,#0x8
008c65f4	ldr q0,[x8,x21, lsl #4]
008c65f8	str q0,[x8,x9, lsl #4]
008c65fc	ldr x8,[x19, #0x50]
008c6600	str x28,[x8, #0x20]
008c6604	ldr x8,[x19, #0x60]
008c6608	ldp x8,x9,[x8, #0x8]
008c660c	cmp x9,x8
008c6610	b.cc 0x008c6620
008c6614	mov x0,x19
008c6618	mov w1,#0x1
008c661c	bl 0x008b52c4
008c6620	ldrb w8,[x28]
008c6624	ldr x25,[x19, #0x70]
008c6628	ldr x8,[x26, x8, LSL #0x3]
008c662c	br x8
008c6630	ldr w8,[x28], #0x4
008c6634	lsr x9,x8,#0x10
008c6638	add x10,x25,w9, UXTB  #0x4
008c663c	mov w9,#0x1
008c6640	ldr w11,[x10, #0xc]
008c6644	cbz w11,0x008c6660
008c6648	cmp w11,#0x1
008c664c	b.ne 0x008c6668
008c6650	ldr w10,[x10]
008c6654	cmp w10,#0x0
008c6658	cset w10,eq
008c665c	b 0x008c666c
008c6660	mov w10,#0x1
008c6664	b 0x008c666c
008c6668	mov w10,wzr
008c666c	lsr x8,x8,#0x8
008c6670	add x8,x25,w8, UXTB  #0x4
008c6674	str w10,[x8]
008c6678	str w9,[x8, #0xc]
008c667c	b 0x008c6924
008c6680	ldr w20,[x28], #0x4
008c6684	lsr x8,x20,#0x10
008c6688	lsr x9,x20,#0x8
008c668c	add x23,x25,w8, UXTB  #0x4
008c6690	add x22,x25,w9, UXTB  #0x4
008c6694	ldr w8,[x23, #0xc]
008c6698	cmp w8,#0x3
008c669c	b.eq 0x008c66d0
008c66a0	cmp w8,#0x4
008c66a4	b.ne 0x008c66dc
008c66a8	ldr d0,[x23]
008c66ac	ldr s1,[x23, #0x8]
008c66b0	str w8,[x22, #0xc]
008c66b4	ldrb w8,[x28]
008c66b8	fneg v0.2S,v0.2S
008c66bc	fneg s1,s1
008c66c0	ldr x8,[x26, x8, LSL #0x3]
008c66c4	str d0,[x22]
008c66c8	str s1,[x22, #0x8]
008c66cc	br x8
008c66d0	ldr d0,[x23]
008c66d4	fneg d0,d0
008c66d8	b 0x008c6760
008c66dc	cmp w8,#0x8
008c66e0	b.ne 0x008c6740
008c66e4	mov x0,x19
008c66e8	mov x1,x23
008c66ec	mov w2,#0xf
008c66f0	bl 0x008be028
008c66f4	cbz x0,0x008c6740
008c66f8	ldr w8,[x0, #0xc]
008c66fc	cmp w8,#0x7
008c6700	b.ne 0x008c6740
008c6704	ldr x8,[x0]
008c6708	ldrb w8,[x8, #0x6]
008c670c	cbz w8,0x008c6740
008c6710	ldr x8,[x19, #0x68]
008c6714	ldr q0,[x0]
008c6718	ubfx x2,x20,#0x8,#0x8
008c671c	mov x0,x19
008c6720	mov w1,#0x1
008c6724	str q0,[x8]
008c6728	ldr q0,[x23]
008c672c	str q0,[x8, #0x10]
008c6730	add x8,x8,#0x20
008c6734	ldr x9,[x19, #0x50]
008c6738	str x8,[x19, #0x68]
008c673c	b 0x008c5ae8
008c6740	ldr x8,[x19, #0x50]
008c6744	mov x0,x19
008c6748	mov x1,x22
008c674c	mov x2,x23
008c6750	mov x3,x23
008c6754	str x28,[x8, #0x20]
008c6758	bl 0x008cd428
008c675c	b 0x008c6620
008c6760	str d0,[x22]
008c6764	str w8,[x22, #0xc]
008c6768	b 0x008c6924
008c676c	ldr w8,[x28], #0x4
008c6770	lsr x9,x8,#0x10
008c6774	add x2,x25,w9, UXTB  #0x4
008c6778	lsr x9,x8,#0x8
008c677c	ldr w8,[x2, #0xc]
008c6780	add x22,x25,w9, UXTB  #0x4
008c6784	cmp w8,#0x6
008c6788	b.ne 0x008c67c8
008c678c	ldr x0,[x2]
008c6790	ldr x8,[x0, #0x10]
008c6794	cbz x8,0x008c67b8
008c6798	ldrb w8,[x8, #0x6]
008c679c	tbnz w8,#0x6,0x008c67b8
008c67a0	ldr x8,[x19, #0x50]
008c67a4	mov x0,x19
008c67a8	mov x1,x22
008c67ac	str x28,[x8, #0x20]
008c67b0	bl 0x008cd618
008c67b4	b 0x008c6620
008c67b8	bl 0x008bcf64
008c67bc	mov w8,#0x3
008c67c0	scvtf d0,w0
008c67c4	b 0x008c6760
008c67c8	cmp w8,#0x5
008c67cc	b.ne 0x008c67a0
008c67d0	ldr x8,[x2]
008c67d4	ldr s0,[x8, #0x14]
008c67d8	mov w8,#0x3
008c67dc	ucvtf d0,d0
008c67e0	b 0x008c6760
008c67e4	ldp w8,w1,[x28], #0x8
008c67e8	mov w9,#0xff
008c67ec	mov w12,#0x1
008c67f0	ldr x13,[x19, #0x50]
008c67f4	mov x0,x19
008c67f8	ands w10,w9,w8, LSR #0x10
008c67fc	lsr x11,x8,#0x8
008c6800	str x28,[x13, #0x20]
008c6804	tst w9,w8, LSR #0x10
008c6808	sub w10,w10,#0x1
008c680c	add x20,x25,w11, UXTB  #0x4
008c6810	lsl w10,w12,w10
008c6814	csel w2,wzr,w10,eq
008c6818	bl 0x008bae54
008c681c	b 0x008c6848
008c6820	ldr w8,[x28], #0x4
008c6824	ldr x10,[x19, #0x50]
008c6828	mov x0,x19
008c682c	asr w9,w8,#0x10
008c6830	str x28,[x10, #0x20]
008c6834	lsr x8,x8,#0x8
008c6838	sbfiz x9,x9,#0x4,#0x20
008c683c	add x20,x25,w8, UXTB  #0x4
008c6840	ldr x1,[x27, x9#0x0]
008c6844	bl 0x008bd16c
008c6848	str x0,[x20]
008c684c	mov w8,#0x6
008c6850	ldr x9,[x19, #0x50]
008c6854	str w8,[x20, #0xc]
008c6858	str x28,[x9, #0x20]
008c685c	b 0x008c6604
008c6860	ldp w8,w21,[x28]
008c6864	lsr x10,x8,#0x10
008c6868	lsr w9,w8,#0x18
008c686c	add x20,x25,w10, UXTB  #0x4
008c6870	cbnz w9,0x008c6890
008c6874	ldr x9,[x19, #0x68]
008c6878	ldr x10,[x19, #0x50]
008c687c	sub x9,x9,x20
008c6880	ldr x10,[x10, #0x18]
008c6884	lsr x23,x9,#0x4
008c6888	str x10,[x19, #0x68]
008c688c	b 0x008c6894
008c6890	sub w23,w9,#0x1
008c6894	lsr x8,x8,#0x8
008c6898	ldr x19,[sp, #0x20]
008c689c	add x8,x25,w8, UXTB  #0x4
008c68a0	ldr w9,[x8, #0xc]
008c68a4	cmp w9,#0x6
008c68a8	b.ne 0x008c8794
008c68ac	ldr x22,[x8]
008c68b0	add w8,w21,w23
008c68b4	add x28,x28,#0x8
008c68b8	sub w2,w8,#0x1
008c68bc	ldr w9,[x22, #0x8]
008c68c0	cmp w2,w9
008c68c4	b.le 0x008c68dc
008c68c8	ldr x8,[x19, #0x50]
008c68cc	mov x0,x19
008c68d0	mov x1,x22
008c68d4	str x28,[x8, #0x20]
008c68d8	bl 0x008ba760
008c68dc	cmp w23,#0x1
008c68e0	b.lt 0x008c6904
008c68e4	ldr x8,[x22, #0x20]
008c68e8	mov w9,w23
008c68ec	sub w10,w21,#0x1
008c68f0	ldr q0,[x20], #0x10
008c68f4	subs x9,x9,#0x1
008c68f8	str q0,[x8,w10, uxtw #4]
008c68fc	add w10,w10,#0x1
008c6900	b.ne 0x008c68f0
008c6904	ldrb w8,[x22, #0x2]
008c6908	adrp x26,0xc4d000
008c690c	add x26,x26,#0xa78
008c6910	tbz w8,#0x2,0x008c6924
008c6914	add x2,x22,#0x18
008c6918	mov x0,x19
008c691c	mov x1,x22
008c6920	bl 0x008b63a4
008c6924	ldrb w8,[x28]
008c6928	ldr x8,[x26, x8, LSL #0x3]
008c692c	br x8
008c6930	ldr x8,[x19, #0x50]
008c6934	ldr x11,[x19, #0x60]
008c6938	ldr x9,[x8]
008c693c	ldr x11,[x11, #0x678]
008c6940	ldr x10,[x9, #0x30]
008c6944	ldr x9,[x9, #0x60]
008c6948	sub x10,x28,x10
008c694c	lsr x10,x10,#0x2
008c6950	ldrb w20,[x9, w10, UXTW ]
008c6954	cbz x11,0x008c6984
008c6958	str x28,[x8, #0x20]
008c695c	mov x0,x19
008c6960	mov x2,xzr
008c6964	ldr x8,[x19, #0x60]
008c6968	ldr x1,[x8, #0x678]
008c696c	bl 0x008be474
008c6970	ldrb w8,[x19, #0x3]
008c6974	cbnz w8,0x008c8794
008c6978	ldr x25,[x19, #0x70]
008c697c	adrp x26,0xc4d000
008c6980	add x26,x26,#0xa78
008c6984	ldr x8,[x26, x20, LSL #0x3]
008c6988	br x8
008c698c	ldr w20,[x28], #0x4
008c6990	lsr x8,x20,#0x8
008c6994	add x22,x25,w8, UXTB  #0x4
008c6998	ldr w8,[x22, #0xc]
008c699c	cmp w8,#0x3
008c69a0	b.ne 0x008c69bc
008c69a4	ldr w8,[x22, #0x1c]
008c69a8	cmp w8,#0x3
008c69ac	b.ne 0x008c69bc
008c69b0	ldr w8,[x22, #0x2c]
008c69b4	cmp w8,#0x3
008c69b8	b.eq 0x008c69d8
008c69bc	ldr x8,[x19, #0x50]
008c69c0	add x2,x22,#0x10
008c69c4	add x3,x22,#0x20
008c69c8	mov x0,x19
008c69cc	mov x1,x22
008c69d0	str x28,[x8, #0x20]
008c69d4	bl 0x008cd7b4
008c69d8	adrp x8,0xd1f000
008c69dc	add x8,x8,#0x4f8
008c69e0	ldr d0,[x22]
008c69e4	ldr d2,[x22, #0x10]
008c69e8	ldr d1,[x22, #0x20]
008c69ec	ldrb w8,[x8]
008c69f0	cmp w8,#0x1
008c69f4	b.ne 0x008c6a50
008c69f8	fcmp d2,#0.0
008c69fc	b.le 0x008c6a68
008c6a00	fcmp d1,d0
008c6a04	b.hi 0x008c6a70
008c6a08	fsub d0,d0,d1
008c6a0c	fmov d1,0x3ff0000000000000
008c6a10	fdiv d0,d0,d2
008c6a14	fadd d0,d0,d1
008c6a18	fcmp d0,#0.0
008c6a1c	b.le 0x008c6924
008c6a20	ldr x8,[x19, #0x50]
008c6a24	mov w10,#0x3fffffff
008c6a28	fcvtzu w11,d0
008c6a2c	ldr x8,[x8]
008c6a30	ldr w9,[x8, #0x48]
008c6a34	sub w10,w10,w9
008c6a38	ucvtf d1,w10
008c6a3c	fcmp d0,d1
008c6a40	csel w10,w11,w10,mi
008c6a44	add w9,w10,w9
008c6a48	str w9,[x8, #0x48]
008c6a4c	b 0x008c6924
008c6a50	fcmp d2,#0.0
008c6a54	b.le 0x008c6a7c
008c6a58	fcmp d1,d0
008c6a5c	b.hi 0x008c6a84
008c6a60	add x28,x28,xzr, LSL #0x2
008c6a64	b 0x008c6924
008c6a68	fcmp d0,d1
008c6a6c	b.ls 0x008c6a08
008c6a70	asr w8,w20,#0x10
008c6a74	add x28,x28,w8, SXTW  #0x2
008c6a78	b 0x008c6924
008c6a7c	fcmp d0,d1
008c6a80	b.ls 0x008c6a60
008c6a84	sbfx x8,x20,#0x10,#0x10
008c6a88	add x28,x28,x8, LSL #0x2
008c6a8c	b 0x008c6924
008c6a90	ldr x9,[x19, #0x60]
008c6a94	ldr x8,[x9, #0x688]
008c6a98	cbnz x8,0x008c6b08
008c6a9c	ldp x9,x8,[x9, #0x8]
008c6aa0	cmp x8,x9
008c6aa4	b.cc 0x008c6ac0
008c6aa8	ldr x8,[x19, #0x50]
008c6aac	mov x0,x19
008c6ab0	mov w1,#0x1
008c6ab4	str x28,[x8, #0x20]
008c6ab8	bl 0x008b52c4
008c6abc	ldr x25,[x19, #0x70]
008c6ac0	ldr w8,[x28], #0x4
008c6ac4	mov w10,#0x3
008c6ac8	lsr x9,x8,#0x8
008c6acc	add x9,x25,w9, UXTB  #0x4
008c6ad0	ldr d1,[x9, #0x10]
008c6ad4	ldr d0,[x9, #0x20]
008c6ad8	str w10,[x9, #0x2c]
008c6adc	fadd d0,d1,d0
008c6ae0	fcmp d1,#0.0
008c6ae4	ldr d1,[x9]
008c6ae8	str d0,[x9, #0x20]
008c6aec	b.le 0x008c6afc
008c6af0	fcmp d0,d1
008c6af4	b.hi 0x008c6924
008c6af8	b 0x008c6b40
008c6afc	fcmp d1,d0
008c6b00	b.hi 0x008c6924
008c6b04	b 0x008c6b40
008c6b08	ldr x9,[x19, #0x50]
008c6b0c	mov x0,x19
008c6b10	mov w1,#0xffffffff
008c6b14	str x28,[x9, #0x20]
008c6b18	ldr x9,[x19, #0x50]
008c6b1c	ldr x10,[x9, #0x20]
008c6b20	add x10,x10,#0x4
008c6b24	str x10,[x9, #0x20]
008c6b28	blr x8
008c6b2c	ldrb w8,[x19, #0x3]
008c6b30	cbnz w8,0x008c8784
008c6b34	ldr x25,[x19, #0x70]
008c6b38	ldr x9,[x19, #0x60]
008c6b3c	b 0x008c6a9c
008c6b40	asr w8,w8,#0x10
008c6b44	add x28,x28,w8, SXTW  #0x2
008c6b48	b 0x008c6924
008c6b4c	mov x21,x24
008c6b50	ldr w24,[x28], #0x4
008c6b54	adrp x9,0xd1f000
008c6b58	lsr x8,x24,#0x8
008c6b5c	ldrb w9,[x9, #0xdd0]
008c6b60	ubfx x20,x24,#0x8,#0x8
008c6b64	add x22,x25,w8, UXTB  #0x4
008c6b68	cmp w9,#0x1
008c6b6c	ldr w8,[x22, #0xc]
008c6b70	b.ne 0x008c6b94
008c6b74	cmp w8,#0x6
008c6b78	b.eq 0x008c6bf8
008c6b7c	cmp w8,#0x7
008c6b80	b.eq 0x008c6d4c
008c6b84	cmp w8,#0x8
008c6b88	b.ne 0x008c6c3c
008c6b8c	mov w9,#0x8
008c6b90	b 0x008c6bfc
008c6b94	cmp w8,#0x6
008c6b98	b.eq 0x008c6bb4
008c6b9c	cmp w8,#0x7
008c6ba0	b.eq 0x008c6d4c
008c6ba4	cmp w8,#0x8
008c6ba8	b.ne 0x008c8888
008c6bac	mov w8,#0x8
008c6bb0	b 0x008c6bb8
008c6bb4	mov w8,#0x10
008c6bb8	ldr x9,[x22]
008c6bbc	ldr x23,[x9, x8#0x0]
008c6bc0	cbz x23,0x008c6c78
008c6bc4	ldrb w8,[x23, #0x6]
008c6bc8	tbnz w8,#0x5,0x008c6bf0
008c6bcc	ldrb w8,[x23, #0x7]
008c6bd0	tbnz w8,#0x1,0x008c6cf8
008c6bd4	ldr x8,[x19, #0x60]
008c6bd8	mov x0,x23
008c6bdc	mov w1,#0x5
008c6be0	ldr x2,[x8, #0x360]
008c6be4	bl 0x008bdfe0
008c6be8	cbnz x0,0x008c6d00
008c6bec	ldrb w8,[x23, #0x6]
008c6bf0	tbz w8,#0x4,0x008c6c58
008c6bf4	b 0x008c6c78
008c6bf8	mov w9,#0x10
008c6bfc	ldr x10,[x22]
008c6c00	ldr x23,[x10, x9#0x0]
008c6c04	cbz x23,0x008c6c7c
008c6c08	ldrb w9,[x23, #0x6]
008c6c0c	tbnz w9,#0x5,0x008c6c50
008c6c10	ldrb w8,[x23, #0x7]
008c6c14	tbnz w8,#0x1,0x008c6cf8
008c6c18	ldr x8,[x19, #0x60]
008c6c1c	mov x0,x23
008c6c20	mov w1,#0x5
008c6c24	ldr x2,[x8, #0x360]
008c6c28	bl 0x008bdfe0
008c6c2c	cbnz x0,0x008c6d00
008c6c30	ldr w8,[x22, #0xc]
008c6c34	mov w9,wzr
008c6c38	b 0x008c6c44
008c6c3c	mov x23,xzr
008c6c40	mov w9,#0x1
008c6c44	cmp w8,#0xc
008c6c48	b.eq 0x008c6d64
008c6c4c	tbnz w9,#0x0,0x008c6c7c
008c6c50	ldrb w9,[x23, #0x6]
008c6c54	tbnz w9,#0x4,0x008c6c7c
008c6c58	ldrb w8,[x23, #0x7]
008c6c5c	tbnz w8,#0x1,0x008c6d4c
008c6c60	ldr x8,[x19, #0x60]
008c6c64	mov x0,x23
008c6c68	mov w1,#0x4
008c6c6c	ldr x2,[x8, #0x358]
008c6c70	bl 0x008bdfe0
008c6c74	cbnz x0,0x008c6d4c
008c6c78	ldr w8,[x22, #0xc]
008c6c7c	cmp w8,#0x6
008c6c80	b.ne 0x008c8888
008c6c84	adrp x8,0xd1f000
008c6c88	add x8,x8,#0x4f8
008c6c8c	ldrb w8,[x8]
008c6c90	cmp w8,#0x1
008c6c94	b.ne 0x008c6cd8
008c6c98	ldr x8,[x22]
008c6c9c	mov w10,#0x1
008c6ca0	ldrb w9,[x8, #0x5]
008c6ca4	ldr w8,[x8, #0x8]
008c6ca8	lsl w9,w10,w9
008c6cac	adds w8,w9,w8
008c6cb0	b.le 0x008c6cd8
008c6cb4	ldr x9,[x19, #0x50]
008c6cb8	mov w11,#0x3fffffff
008c6cbc	ldr x9,[x9]
008c6cc0	ldr w10,[x9, #0x48]
008c6cc4	sub w11,w11,w10
008c6cc8	cmp w8,w11
008c6ccc	csel w8,w8,w11,cc
008c6cd0	add w8,w8,w10
008c6cd4	str w8,[x9, #0x48]
008c6cd8	adrp x8,0x29a000
008c6cdc	ldr q0,[x22]
008c6ce0	str xzr,[x22, #0x20]
008c6ce4	ldr d1,[x8, #0xb78]
008c6ce8	str wzr,[x22, #0xc]
008c6cec	str q0,[x22, #0x10]
008c6cf0	str d1,[x22, #0x28]
008c6cf4	b 0x008c6d4c
008c6cf8	ldr x8,[x23, #0x20]
008c6cfc	sub x0,x8,#0x60
008c6d00	ldr q0,[x22]
008c6d04	add x8,x22,#0x20
008c6d08	mov x1,x22
008c6d0c	mov w2,#0x3
008c6d10	str q0,[x22, #0x10]
008c6d14	ldr q0,[x0]
008c6d18	mov x0,x19
008c6d1c	str q0,[x22]
008c6d20	ldr x9,[x19, #0x50]
008c6d24	str x8,[x19, #0x68]
008c6d28	str x28,[x9, #0x20]
008c6d2c	bl 0x008b465c
008c6d30	ldr x25,[x19, #0x70]
008c6d34	ldr x8,[x19, #0x50]
008c6d38	add x1,x25,x20, LSL #0x4
008c6d3c	ldr x9,[x8, #0x18]
008c6d40	ldr w10,[x1, #0xc]
008c6d44	str x9,[x19, #0x68]
008c6d48	cbz w10,0x008c88d4
008c6d4c	asr w8,w24,#0x10
008c6d50	add x28,x28,w8, SXTW  #0x2
008c6d54	ldrb w8,[x28]
008c6d58	ldr x8,[x26, x8, LSL #0x3]
008c6d5c	mov x24,x21
008c6d60	br x8
008c6d64	mov x0,x19
008c6d68	mov x1,x22
008c6d6c	mov w2,#0x5
008c6d70	bl 0x008be028
008c6d74	ldr w8,[x0, #0xc]
008c6d78	cbnz w8,0x008c6d00
008c6d7c	b 0x008c8888
008c6d80	ldr x9,[x19, #0x60]
008c6d84	ldr x8,[x9, #0x688]
008c6d88	cbnz x8,0x008c6f98
008c6d8c	ldp x9,x8,[x9, #0x8]
008c6d90	cmp x8,x9
008c6d94	b.cc 0x008c6db0
008c6d98	ldr x8,[x19, #0x50]
008c6d9c	mov x0,x19
008c6da0	mov w1,#0x1
008c6da4	str x28,[x8, #0x20]
008c6da8	bl 0x008b52c4
008c6dac	ldr x25,[x19, #0x70]
008c6db0	ldr w22,[x28]
008c6db4	mov x20,x28
008c6db8	ldr w12,[x20, #0x4]!
008c6dbc	lsr x8,x22,#0x8
008c6dc0	ubfx x21,x22,#0x8,#0x8
008c6dc4	add x8,x25,w8, UXTB  #0x4
008c6dc8	ldr w9,[x8, #0xc]
008c6dcc	cbnz w9,0x008c6e64
008c6dd0	ldr w9,[x8, #0x1c]
008c6dd4	cmp w9,#0x6
008c6dd8	b.ne 0x008c6e64
008c6ddc	ldr x9,[x8, #0x10]
008c6de0	ldr x10,[x8, #0x20]
008c6de4	cmp w12,#0x3
008c6de8	ldr w11,[x9, #0x8]
008c6dec	b.ge 0x008c6fd0
008c6df0	tbnz w12,#0x1f,0x008c6f04
008c6df4	cmp w11,w10
008c6df8	b.ls 0x008c6e1c
008c6dfc	ldr x12,[x9, #0x20]
008c6e00	add x12,x12,w10, SXTW  #0x4
008c6e04	ldr w13,[x12, #0xc]
008c6e08	cbnz w13,0x008c6f24
008c6e0c	add w10,w10,#0x1
008c6e10	add x12,x12,#0x10
008c6e14	cmp w11,w10
008c6e18	b.hi 0x008c6e04
008c6e1c	ldrb w12,[x9, #0x5]
008c6e20	sub w11,w10,w11
008c6e24	lsr w13,w11,w12
008c6e28	cbnz w13,0x008c7638
008c6e2c	mov w13,w10
008c6e30	mov x14,#0x100000000
008c6e34	ldr x10,[x9, #0x28]
008c6e38	add x9,x14,x13, LSL #0x20
008c6e3c	sxtw x13,w11
008c6e40	add x13,x10,x13, LSL #0x5
008c6e44	ldr w14,[x13, #0xc]
008c6e48	cbnz w14,0x008c6f54
008c6e4c	add w11,w11,#0x1
008c6e50	mov x14,#0x100000000
008c6e54	lsr w13,w11,w12
008c6e58	add x9,x9,x14
008c6e5c	cbz w13,0x008c6e3c
008c6e60	b 0x008c7638
008c6e64	adrp x9,0xd1f000
008c6e68	add x9,x9,#0x4f8
008c6e6c	ldrb w9,[x9]
008c6e70	cmp w9,#0x1
008c6e74	b.ne 0x008c6e8c
008c6e78	ldr x9,[x19, #0x50]
008c6e7c	ldr x9,[x9]
008c6e80	ldr w10,[x9, #0x48]
008c6e84	add w10,w10,#0x1
008c6e88	str w10,[x9, #0x48]
008c6e8c	ldp q1,q0,[x8, #0x10]
008c6e90	add x9,x8,#0x60
008c6e94	ldr q2,[x8]
008c6e98	add x1,x8,#0x30
008c6e9c	and w2,w12,#0xff
008c6ea0	mov x0,x19
008c6ea4	stp q1,q0,[x8, #0x40]
008c6ea8	str q2,[x8, #0x30]
008c6eac	ldr x10,[x19, #0x50]
008c6eb0	str x9,[x19, #0x68]
008c6eb4	str x20,[x10, #0x20]
008c6eb8	bl 0x008b4310
008c6ebc	tbnz w0,#0x0,0x008c8794
008c6ec0	ldr x25,[x19, #0x70]
008c6ec4	ldr x8,[x19, #0x50]
008c6ec8	asr w11,w22,#0x10
008c6ecc	add x9,x25,x21, LSL #0x4
008c6ed0	ldr x8,[x8, #0x18]
008c6ed4	ldr w10,[x9, #0x3c]
008c6ed8	str x8,[x19, #0x68]
008c6edc	ldr q0,[x9, #0x30]
008c6ee0	cmp w10,#0x0
008c6ee4	csinc w8,w11,wzr,ne
008c6ee8	str q0,[x9, #0x20]
008c6eec	add x28,x20,w8, SXTW  #0x2
008c6ef0	ldrb w8,[x28]
008c6ef4	adrp x26,0xc4d000
008c6ef8	add x26,x26,#0xa78
008c6efc	ldr x8,[x26, x8, LSL #0x3]
008c6f00	br x8
008c6f04	cmp w11,w10
008c6f08	b.ls 0x008c7638
008c6f0c	ldr x12,[x9, #0x20]
008c6f10	lsl x13,x10,#0x20
008c6f14	add x12,x12,x13, ASR #0x1c
008c6f18	ldr w12,[x12, #0xc]
008c6f1c	cbnz w12,0x008c6df4
008c6f20	b 0x008c7638
008c6f24	add w9,w10,#0x1
008c6f28	adrp x10,0x29a000
008c6f2c	scvtf d0,w9
008c6f30	sxtw x9,w9
008c6f34	ldr d1,[x10, #0xb78]
008c6f38	str x9,[x8, #0x20]
008c6f3c	mov w9,#0x3
008c6f40	str w9,[x8, #0x3c]
008c6f44	asr w9,w22,#0x10
008c6f48	stp d1,d0,[x8, #0x28]
008c6f4c	ldr q0,[x12]
008c6f50	b 0x008c6f8c
008c6f54	adrp x10,0x29a000
008c6f58	asr x9,x9,#0x20
008c6f5c	ldr d0,[x10, #0xb78]
008c6f60	str x9,[x8, #0x20]
008c6f64	str d0,[x8, #0x28]
008c6f68	ldr x9,[x13, #0x10]
008c6f6c	str x9,[x8, #0x30]
008c6f70	ldr w9,[x13, #0x18]
008c6f74	str w9,[x8, #0x38]
008c6f78	ldr w9,[x13, #0x1c]
008c6f7c	and w9,w9,#0xf
008c6f80	str w9,[x8, #0x3c]
008c6f84	asr w9,w22,#0x10
008c6f88	ldr q0,[x13]
008c6f8c	add x28,x20,w9, SXTW  #0x2
008c6f90	str q0,[x8, #0x40]
008c6f94	b 0x008c6924
008c6f98	ldr x9,[x19, #0x50]
008c6f9c	mov x0,x19
008c6fa0	mov w1,#0xffffffff
008c6fa4	str x28,[x9, #0x20]
008c6fa8	ldr x9,[x19, #0x50]
008c6fac	ldr x10,[x9, #0x20]
008c6fb0	add x10,x10,#0x4
008c6fb4	str x10,[x9, #0x20]
008c6fb8	blr x8
008c6fbc	ldrb w8,[x19, #0x3]
008c6fc0	cbnz w8,0x008c8784
008c6fc4	ldr x25,[x19, #0x70]
008c6fc8	ldr x9,[x19, #0x60]
008c6fcc	b 0x008c6d8c
008c6fd0	sub x14,x12,#0x2
008c6fd4	cmp x14,#0x2
008c6fd8	b.cs 0x008c6fe4
008c6fdc	mov w13,#0x2
008c6fe0	b 0x008c7010
008c6fe4	add x16,x8,#0x3c
008c6fe8	and x15,x14,#-0x2
008c6fec	add x13,x15,#0x2
008c6ff0	add x16,x16,#0x30
008c6ff4	mov x17,x15
008c6ff8	subs x17,x17,#0x2
008c6ffc	stur wzr,[x16, #-0x10]
008c7000	str wzr,[x16], #0x20
008c7004	b.ne 0x008c6ff8
008c7008	cmp x14,x15
008c700c	b.eq 0x008c6df0
008c7010	lsl x14,x13,#0x4
008c7014	sub x13,x12,x13
008c7018	add x14,x14,x21, LSL #0x4
008c701c	add x14,x25,x14
008c7020	add x14,x14,#0x3c
008c7024	subs x13,x13,#0x1
008c7028	str wzr,[x14], #0x10
008c702c	b.ne 0x008c7024
008c7030	b 0x008c6df0
008c7034	ldr w8,[x28], #0x4
008c7038	ldr x9,[x24, #0x10]
008c703c	lsr x10,x8,#0x8
008c7040	ldrb w9,[x9, #0x3]
008c7044	add x1,x25,w10, UXTB  #0x4
008c7048	cbz w9,0x008c70fc
008c704c	ldr w9,[x1, #0x1c]
008c7050	cmp w9,#0x6
008c7054	b.ne 0x008c70fc
008c7058	ldr w9,[x1, #0x2c]
008c705c	cmp w9,#0x3
008c7060	b.ne 0x008c70fc
008c7064	ldr d0,[x1, #0x20]
008c7068	fcmp d0,#0.0
008c706c	b.ne 0x008c70fc
008c7070	adrp x9,0xd1f000
008c7074	add x9,x9,#0x4f8
008c7078	ldrb w9,[x9]
008c707c	cmp w9,#0x1
008c7080	b.ne 0x008c70b8
008c7084	ldr x9,[x1, #0x10]
008c7088	ldr w9,[x9, #0x8]
008c708c	cmp w9,#0x1
008c7090	b.lt 0x008c70b8
008c7094	ldr x10,[x19, #0x50]
008c7098	mov w12,#0x3fffffff
008c709c	ldr x10,[x10]
008c70a0	ldr w11,[x10, #0x48]
008c70a4	sub w12,w12,w11
008c70a8	cmp w9,w12
008c70ac	csel w9,w9,w12,cc
008c70b0	add w9,w9,w11
008c70b4	str w9,[x10, #0x48]
008c70b8	adrp x9,0x29a000
008c70bc	str wzr,[x1, #0xc]
008c70c0	ldr d0,[x9, #0xb78]
008c70c4	str xzr,[x1, #0x20]
008c70c8	str d0,[x1, #0x28]
008c70cc	b 0x008c6b40
008c70d0	ldr w8,[x28], #0x4
008c70d4	ldr x9,[x24, #0x10]
008c70d8	lsr x10,x8,#0x8
008c70dc	ldrb w9,[x9, #0x3]
008c70e0	add x1,x25,w10, UXTB  #0x4
008c70e4	cbz w9,0x008c70fc
008c70e8	ldr w9,[x1, #0x1c]
008c70ec	cmp w9,#0x6
008c70f0	b.ne 0x008c70fc
008c70f4	ldr w9,[x1, #0x2c]
008c70f8	cbz w9,0x008c710c
008c70fc	ldr w9,[x1, #0xc]
008c7100	cmp w9,#0x7
008c7104	b.eq 0x008c6b40
008c7108	b 0x008c87c8
008c710c	adrp x9,0xd1f000
008c7110	add x9,x9,#0x4f8
008c7114	ldrb w9,[x9]
008c7118	cmp w9,#0x1
008c711c	b.ne 0x008c70b8
008c7120	ldr x9,[x1, #0x10]
008c7124	mov w11,#0x1
008c7128	ldrb w10,[x9, #0x5]
008c712c	ldr w9,[x9, #0x8]
008c7130	lsl w10,w11,w10
008c7134	add w9,w10,w9
008c7138	cmp w9,#0x1
008c713c	b.ge 0x008c7094
008c7140	b 0x008c70b8
008c7144	ldr x8,[x19, #0x50]
008c7148	ldr x1,[x8]
008c714c	ldr x9,[x1, #0x50]
008c7150	cbnz x9,0x008c7188
008c7154	mov x0,x19
008c7158	str x28,[x8, #0x20]
008c715c	mov x21,x1
008c7160	bl 0x008c9034
008c7164	ldr x8,[x21, #0x30]
008c7168	ldr x9,[x19, #0x50]
008c716c	ldr x25,[x19, #0x70]
008c7170	str x8,[x9, #0x20]
008c7174	ldr x28,[x21, #0x18]
008c7178	ldr x27,[x21, #0x28]
008c717c	ldrb w8,[x28]
008c7180	ldr x8,[x26, x8, LSL #0x3]
008c7184	br x8
008c7188	ldr x9,[x1, #0x30]
008c718c	mov x0,x19
008c7190	str x9,[x8, #0x20]
008c7194	ldr w9,[x8, #0x2c]
008c7198	ldr x10,[x19, #0x60]
008c719c	orr w9,w9,#0x4
008c71a0	ldr x10,[x10, #0x6f0]
008c71a4	str w9,[x8, #0x2c]
008c71a8	blr x10
008c71ac	b 0x008c517c
008c71b0	ldr x8,[x19, #0x50]
008c71b4	ldr w20,[x28], #0x4
008c71b8	ldp x10,x9,[x8]
008c71bc	sub x11,x25,x9
008c71c0	ldrb w10,[x10, #0x7]
008c71c4	ubfx w9,w20,#0x10,#0x8
008c71c8	lsr x11,x11,#0x4
008c71cc	mvn w10,w10
008c71d0	add w22,w11,w10
008c71d4	cbnz w9,0x008c7244
008c71d8	str x28,[x8, #0x20]
008c71dc	lsl w10,w22,#0x4
008c71e0	ldr x8,[x19, #0x48]
008c71e4	ldr x9,[x19, #0x68]
008c71e8	sub x8,x8,x9
008c71ec	cmp x8,w10, SXTW 
008c71f0	b.gt 0x008c7200
008c71f4	mov x0,x19
008c71f8	mov w1,w22
008c71fc	bl 0x008b41e4
008c7200	ldr x25,[x19, #0x70]
008c7204	lsr x8,x20,#0x8
008c7208	cmp w22,#0x1
008c720c	add x8,x25,w8, UXTB  #0x4
008c7210	b.lt 0x008c7230
008c7214	sub x9,x25,w22, UXTW  #0x4
008c7218	mov x10,x22
008c721c	mov x11,x8
008c7220	ldr q0,[x9], #0x10
008c7224	subs x10,x10,#0x1
008c7228	str q0,[x11], #0x10
008c722c	b.ne 0x008c7220
008c7230	add x8,x8,w22, SXTW  #0x4
008c7234	ldrb w9,[x28]
008c7238	str x8,[x19, #0x68]
008c723c	ldr x8,[x26, x9, LSL #0x3]
008c7240	br x8
008c7244	sub w8,w9,#0x1
008c7248	cmp w8,w22
008c724c	csel w11,w8,w22,lt
008c7250	cmp w11,#0x1
008c7254	b.lt 0x008c7278
008c7258	lsr x9,x20,#0x8
008c725c	sub x10,x25,w22, SXTW  #0x4
008c7260	ubfiz x11,x11,#0x4,#0x20
008c7264	add x9,x25,w9, UXTB  #0x4
008c7268	ldr q0,[x10], #0x10
008c726c	subs x11,x11,#0x10
008c7270	str q0,[x9], #0x10
008c7274	b.ne 0x008c7268
008c7278	cmp w22,w8
008c727c	b.ge 0x008c6924
008c7280	sxtw x13,w22
008c7284	ubfx w8,w20,#0x10,#0x8
008c7288	mvn x9,x13
008c728c	mov x11,x13
008c7290	add x10,x9,x8
008c7294	ubfx x9,x20,#0x8,#0x8
008c7298	cmp x10,#0x2
008c729c	b.cc 0x008c72d4
008c72a0	lsl x11,x13,#0x4
008c72a4	and x12,x10,#-0x2
008c72a8	add x11,x11,x9, LSL #0x4
008c72ac	add x14,x25,x11
008c72b0	add x11,x12,x13
008c72b4	add x13,x14,#0x1c
008c72b8	mov x14,x12
008c72bc	subs x14,x14,#0x2
008c72c0	stur wzr,[x13, #-0x10]
008c72c4	str wzr,[x13], #0x20
008c72c8	b.ne 0x008c72bc
008c72cc	cmp x10,x12
008c72d0	b.eq 0x008c6924
008c72d4	lsl x10,x11,#0x4
008c72d8	add x9,x10,x9, LSL #0x4
008c72dc	mvn x10,x11
008c72e0	add x8,x10,x8
008c72e4	add x9,x25,x9
008c72e8	add x9,x9,#0xc
008c72ec	subs x8,x8,#0x1
008c72f0	str wzr,[x9], #0x10
008c72f4	b.ne 0x008c72ec
008c72f8	b 0x008c6924
008c72fc	ldr w21,[x28], #0x4
008c7300	ldr x9,[x19, #0x50]
008c7304	asr w8,w21,#0x10
008c7308	sbfiz x8,x8,#0x4,#0x20
008c730c	ldr x20,[x27, x8#0x0]
008c7310	str x28,[x9, #0x20]
008c7314	ldr x2,[x24, #0x10]
008c7318	ldr x8,[x20, #0x10]
008c731c	mov x22,x20
008c7320	cmp x8,x2
008c7324	b.eq 0x008c737c
008c7328	ldrb w8,[x20, #0x6]
008c732c	cbz w8,0x008c7338
008c7330	mov x3,xzr
008c7334	b 0x008c736c
008c7338	adrp x8,0xd1f000
008c733c	ldr x3,[x20, #0x18]
008c7340	ldrb w8,[x8, #0xdf0]
008c7344	cmp w8,#0x1
008c7348	b.ne 0x008c736c
008c734c	ldr x8,[x3, #0xd0]
008c7350	cbz x8,0x008c736c
008c7354	str x8,[x20, #0x18]
008c7358	mov x3,x8
008c735c	ldr x8,[x8, #0xd0]
008c7360	cbnz x8,0x008c7354
008c7364	ldrb w8,[x3, #0x5]
008c7368	strb w8,[x20, #0x4]
008c736c	ldrb w1,[x20, #0x5]
008c7370	mov x0,x19
008c7374	bl 0x008b4d5c
008c7378	mov x22,x0
008c737c	lsr x8,x21,#0x8
008c7380	mov x19,x24
008c7384	mov w9,#0x7
008c7388	add x24,x25,w8, UXTB  #0x4
008c738c	str x22,[x24]
008c7390	ldrb w8,[x20, #0x5]
008c7394	str w9,[x24, #0xc]
008c7398	cbz w8,0x008c74b8
008c739c	mov w21,wzr
008c73a0	add x26,x19,#0x20
008c73a4	str x27,[sp, #0x18]
008c73a8	b 0x008c73cc
008c73ac	add x0,x27,#0x20
008c73b0	mov x1,x23
008c73b4	bl 0x008b9214
008c73b8	cbz w0,0x008c7434
008c73bc	ldrb w8,[x20, #0x5]
008c73c0	add w21,w21,#0x1
008c73c4	cmp w21,w8
008c73c8	b.ge 0x008c74a8
008c73cc	ldr w8,[x28, w21, SXTW #0x2]
008c73d0	sxtw x10,w21
008c73d4	lsr x9,x8,#0xc
008c73d8	tst w8,#0xff00
008c73dc	add x27,x22,x10, LSL #0x4
008c73e0	and x9,x9,#0xff0
008c73e4	add x11,x25,x9
008c73e8	add x9,x26,x9
008c73ec	csel x23,x11,x9,eq
008c73f0	cmp x22,x20
008c73f4	b.eq 0x008c73ac
008c73f8	ldr q0,[x23]
008c73fc	str q0,[x27, #0x20]
008c7400	ldr w8,[x23, #0xc]
008c7404	cmp w8,#0x5
008c7408	b.lt 0x008c73bc
008c740c	ldrb w8,[x22, #0x2]
008c7410	tbz w8,#0x2,0x008c73bc
008c7414	ldr x2,[x23]
008c7418	ldrb w8,[x2, #0x2]
008c741c	tst w8,#0x3
008c7420	b.eq 0x008c73bc
008c7424	ldr x0,[sp, #0x20]
008c7428	mov x1,x22
008c742c	bl 0x008b6188
008c7430	b 0x008c73bc
008c7434	ldrb w8,[x20, #0x3]
008c7438	cbnz w8,0x008c73f8
008c743c	ldrb w8,[x20, #0x6]
008c7440	ldr x2,[x19, #0x10]
008c7444	cbz w8,0x008c7450
008c7448	mov x3,xzr
008c744c	b 0x008c7484
008c7450	adrp x8,0xd1f000
008c7454	ldr x3,[x20, #0x18]
008c7458	ldrb w8,[x8, #0xdf0]
008c745c	cmp w8,#0x1
008c7460	b.ne 0x008c7484
008c7464	ldr x8,[x3, #0xd0]
008c7468	cbz x8,0x008c7484
008c746c	str x8,[x20, #0x18]
008c7470	mov x3,x8
008c7474	ldr x8,[x8, #0xd0]
008c7478	cbnz x8,0x008c746c
008c747c	ldrb w8,[x3, #0x5]
008c7480	strb w8,[x20, #0x4]
008c7484	ldrb w1,[x20, #0x5]
008c7488	ldr x0,[sp, #0x20]
008c748c	bl 0x008b4d5c
008c7490	mov w8,#0x7
008c7494	mov x22,x0
008c7498	str x0,[x24]
008c749c	str w8,[x24, #0xc]
008c74a0	mov w21,#0xffffffff
008c74a4	b 0x008c73bc
008c74a8	ldr x27,[sp, #0x18]
008c74ac	adrp x26,0xc4d000
008c74b0	add x26,x26,#0xa78
008c74b4	b 0x008c74bc
008c74b8	mov x8,xzr
008c74bc	mov x24,x19
008c74c0	ldr x19,[sp, #0x20]
008c74c4	cmp x20,x22
008c74c8	strb wzr,[x22, #0x3]
008c74cc	b.eq 0x008c74fc
008c74d0	ldr x8,[x19, #0x50]
008c74d4	str x28,[x8, #0x20]
008c74d8	ldr x8,[x19, #0x60]
008c74dc	ldp x8,x9,[x8, #0x8]
008c74e0	cmp x9,x8
008c74e4	b.cc 0x008c74f4
008c74e8	mov x0,x19
008c74ec	mov w1,#0x1
008c74f0	bl 0x008b52c4
008c74f4	ldr x25,[x19, #0x70]
008c74f8	ldrb w8,[x20, #0x5]
008c74fc	add x28,x28,x8, LSL #0x2
008c7500	b 0x008c6924
008c7504	ldr x8,[x19, #0x50]
008c7508	add x20,x28,#0x4
008c750c	ldrb w21,[x28, #0x1]
008c7510	str x20,[x8, #0x20]
008c7514	ldrb w8,[x24, #0x4]
008c7518	ldr x9,[x19, #0x48]
008c751c	ldr x25,[x19, #0x68]
008c7520	add w1,w21,w8
008c7524	sub x9,x9,x25
008c7528	lsl w8,w1,#0x4
008c752c	cmp x9,x8
008c7530	b.gt 0x008c7540
008c7534	mov x0,x19
008c7538	bl 0x008b41e4
008c753c	ldr x25,[x19, #0x68]
008c7540	cbz w21,0x008c7564
008c7544	ldr x8,[x19, #0x70]
008c7548	mov x9,x25
008c754c	ldr q0,[x8]
008c7550	subs x21,x21,#0x1
008c7554	str q0,[x9], #0x10
008c7558	str wzr,[x8, #0xc]
008c755c	add x8,x8,#0x10
008c7560	b.ne 0x008c754c
008c7564	ldrb w8,[x24, #0x4]
008c7568	ldr x9,[x19, #0x50]
008c756c	str x25,[x19, #0x70]
008c7570	add x8,x25,x8, LSL #0x4
008c7574	stp x25,x8,[x9, #0x10]
008c7578	ldrb w9,[x20]
008c757c	b 0x008c7758
008c7580	ldr x9,[x19, #0x60]
008c7584	ldr x8,[x9, #0x688]
008c7588	cbnz x8,0x008c75f0
008c758c	ldp x9,x8,[x9, #0x8]
008c7590	cmp x8,x9
008c7594	b.cc 0x008c75b0
008c7598	ldr x8,[x19, #0x50]
008c759c	mov x0,x19
008c75a0	mov w1,#0x1
008c75a4	str x28,[x8, #0x20]
008c75a8	bl 0x008b52c4
008c75ac	ldr x25,[x19, #0x70]
008c75b0	adrp x8,0xd1f000
008c75b4	add x8,x8,#0x4f8
008c75b8	ldrb w9,[x8]
008c75bc	ldr w8,[x28], #0x4
008c75c0	cmp w9,#0x1
008c75c4	b.ne 0x008c75dc
008c75c8	ldr x9,[x19, #0x50]
008c75cc	ldr x9,[x9]
008c75d0	ldr w10,[x9, #0x48]
008c75d4	add w10,w10,#0x1
008c75d8	str w10,[x9, #0x48]
008c75dc	asr w8,w8,#0x10
008c75e0	add x28,x28,w8, SXTW  #0x2
008c75e4	ldrb w8,[x28]
008c75e8	ldr x8,[x26, x8, LSL #0x3]
008c75ec	br x8
008c75f0	ldr x9,[x19, #0x50]
008c75f4	mov x0,x19
008c75f8	mov w1,#0xffffffff
008c75fc	str x28,[x9, #0x20]
008c7600	ldr x9,[x19, #0x50]
008c7604	ldr x10,[x9, #0x20]
008c7608	add x10,x10,#0x4
008c760c	str x10,[x9, #0x20]
008c7610	blr x8
008c7614	ldrb w8,[x19, #0x3]
008c7618	cbnz w8,0x008c8784
008c761c	ldr x25,[x19, #0x70]
008c7620	ldr x9,[x19, #0x60]
008c7624	b 0x008c758c
008c7628	ldr w8,[x28, #0x4]
008c762c	ldrb w9,[x28, #0x1]
008c7630	ldr q0,[x27,x8, lsl #4]
008c7634	str q0,[x25,x9, lsl #4]
008c7638	ldrb w8,[x28, #0x8]!
008c763c	ldr x8,[x26, x8, LSL #0x3]
008c7640	br x8
008c7644	ldr x9,[x19, #0x60]
008c7648	ldr x8,[x9, #0x688]
008c764c	cbnz x8,0x008c768c
008c7650	ldp x9,x8,[x9, #0x8]
008c7654	cmp x8,x9
008c7658	b.cc 0x008c7674
008c765c	ldr x8,[x19, #0x50]
008c7660	mov x0,x19
008c7664	mov w1,#0x1
008c7668	str x28,[x8, #0x20]
008c766c	bl 0x008b52c4
008c7670	ldr x25,[x19, #0x70]
008c7674	ldr w8,[x28]
008c7678	asr w8,w8,#0x8
008c767c	add x28,x28,w8, SXTW  #0x2
008c7680	ldrb w8,[x28, #0x4]!
008c7684	ldr x8,[x26, x8, LSL #0x3]
008c7688	br x8
008c768c	ldr x9,[x19, #0x50]
008c7690	mov x0,x19
008c7694	mov w1,#0xffffffff
008c7698	str x28,[x9, #0x20]
008c769c	ldr x9,[x19, #0x50]
008c76a0	ldr x10,[x9, #0x20]
008c76a4	add x10,x10,#0x4
008c76a8	str x10,[x9, #0x20]
008c76ac	blr x8
008c76b0	ldrb w8,[x19, #0x3]
008c76b4	cbnz w8,0x008c8784
008c76b8	ldr x25,[x19, #0x70]
008c76bc	ldr x9,[x19, #0x60]
008c76c0	b 0x008c7650
008c76c4	ldr w9,[x28], #0x4
008c76c8	lsr x8,x9,#0x16
008c76cc	and x8,x8,#0x3fc
008c76d0	add x20,x28,x8
008c76d4	ldr w21,[x20]
008c76d8	lsr x10,x21,#0x8
008c76dc	ubfx w8,w21,#0x10,#0x8
008c76e0	add x22,x25,w10, UXTB  #0x4
008c76e4	cbnz w8,0x008c76f4
008c76e8	ldr x8,[x19, #0x68]
008c76ec	sub x8,x8,x22
008c76f0	lsr x8,x8,#0x4
008c76f4	ldr x10,[x24, #0x10]
008c76f8	ldrb w10,[x10, #0x3]
008c76fc	cbz w10,0x008c6924
008c7700	adrp x10,0xcb4000
008c7704	ubfx x9,x9,#0x8,#0x8
008c7708	lsr w11,w21,#0x18
008c770c	ldr x10,[x10, #0xbc0]
008c7710	ldr x12,[x19, #0x50]
008c7714	sub w5,w8,#0x1
008c7718	sub w3,w11,#0x1
008c771c	add x2,x22,#0x10
008c7720	add x4,x22,#0x20
008c7724	ldr x9,[x10, x9, LSL #0x3]
008c7728	mov x0,x19
008c772c	mov x1,x22
008c7730	str x28,[x12, #0x20]
008c7734	blr x9
008c7738	tbnz w0,#0x1f,0x008c6924
008c773c	lsr w8,w21,#0x18
008c7740	cbnz w8,0x008c774c
008c7744	add x8,x22,w0, UXTW  #0x4
008c7748	b 0x008c7754
008c774c	ldr x8,[x19, #0x50]
008c7750	ldr x8,[x8, #0x18]
008c7754	ldrb w9,[x20, #0x4]!
008c7758	str x8,[x19, #0x68]
008c775c	ldr x8,[x26, x9, LSL #0x3]
008c7760	mov x28,x20
008c7764	br x8
008c7768	ldr w9,[x28]
008c776c	mov w10,#0x7fffff
008c7770	mov x11,x28
008c7774	asr w8,w9,#0x8
008c7778	cmp w8,w10
008c777c	ldrb w10,[x11, #0x4]!
008c7780	cinc w8,w8,lt
008c7784	bfm w9,w8,#0x18,#0x17
008c7788	ldr x8,[x26, x10, LSL #0x3]
008c778c	str w9,[x28]
008c7790	mov x28,x11
008c7794	br x8
008c7798	ldr w8,[x28], #0x4
008c779c	lsr x9,x8,#0x14
008c77a0	and x9,x9,#0xff0
008c77a4	add x3,x25,x9
008c77a8	lsr x9,x8,#0x8
008c77ac	lsr x8,x8,#0x10
008c77b0	ldr w10,[x3, #0xc]
008c77b4	add x1,x25,w9, UXTB  #0x4
008c77b8	add x2,x27,w8, UXTB  #0x4
008c77bc	cmp w10,#0x3
008c77c0	b.ne 0x008c5bbc
008c77c4	ldr d0,[x2]
008c77c8	ldr d1,[x3]
008c77cc	b 0x008c6194
008c77d0	ldr w8,[x28], #0x4
008c77d4	lsr x9,x8,#0x14
008c77d8	lsr x10,x8,#0x10
008c77dc	and x9,x9,#0xff0
008c77e0	add x2,x27,w10, UXTB  #0x4
008c77e4	add x3,x25,x9
008c77e8	lsr x9,x8,#0x8
008c77ec	ldr w8,[x3, #0xc]
008c77f0	add x1,x25,w9, UXTB  #0x4
008c77f4	cmp w8,#0x3
008c77f8	b.eq 0x008c7838
008c77fc	cmp w8,#0x4
008c7800	b.ne 0x008c7848
008c7804	ldr d0,[x2]
008c7808	ldr d2,[x3]
008c780c	str w8,[x1, #0xc]
008c7810	ldrb w8,[x28]
008c7814	fcvt s0,d0
008c7818	ldr x8,[x26, x8, LSL #0x3]
008c781c	dup v1.2S,v0.S[0x0]
008c7820	fdiv v1.2S,v1.2S,v2.2S
008c7824	ldr s2,[x3, #0x8]
008c7828	fdiv s0,s0,s2
008c782c	str d1,[x1]
008c7830	str s0,[x1, #0x8]
008c7834	br x8
008c7838	ldr d0,[x2]
008c783c	ldr d1,[x3]
008c7840	fdiv d0,d0,d1
008c7844	b 0x008c619c
008c7848	ldr x8,[x19, #0x50]
008c784c	mov x0,x19
008c7850	str x28,[x8, #0x20]
008c7854	bl 0x008cca4c
008c7858	b 0x008c6620
008c785c	ldr x8,[x24, #0x10]
008c7860	ldrb w9,[x8, #0x3]
008c7864	ldr w8,[x28], #0x4
008c7868	cbz w9,0x008c6924
008c786c	lsr x9,x8,#0x16
008c7870	adrp x12,0xcb4000
008c7874	ubfx x10,x8,#0x8,#0x8
008c7878	ubfx w8,w8,#0x10,#0x8
008c787c	mov x0,x19
008c7880	mov x4,xzr
008c7884	and x9,x9,#0x3fc
008c7888	mov w5,#0x1
008c788c	add x20,x28,x9
008c7890	add x2,x25,w8, UXTW  #0x4
008c7894	ldr w9,[x20]
008c7898	ldr x12,[x12, #0xbc0]
008c789c	lsr x11,x9,#0x8
008c78a0	lsr w21,w9,#0x18
008c78a4	ldr x9,[x19, #0x50]
008c78a8	ldr x10,[x12, x10, LSL #0x3]
008c78ac	add x22,x25,w11, UXTB  #0x4
008c78b0	sub w3,w21,#0x1
008c78b4	str x28,[x9, #0x20]
008c78b8	mov x1,x22
008c78bc	blr x10
008c78c0	tbnz w0,#0x1f,0x008c6924
008c78c4	cbnz w21,0x008c78d0
008c78c8	add x8,x22,w0, UXTW  #0x4
008c78cc	str x8,[x19, #0x68]
008c78d0	ldrb w8,[x20, #0x4]!
008c78d4	b 0x008c3a18
008c78d8	ldr x8,[x24, #0x10]
008c78dc	mov x20,x28
008c78e0	ldrb w9,[x8, #0x3]
008c78e4	ldr w8,[x20], #0x8
008c78e8	cbz w9,0x008c3a14
008c78ec	lsr x9,x8,#0x16
008c78f0	adrp x10,0xcb4000
008c78f4	ubfx x12,x8,#0x8,#0x8
008c78f8	ubfx w8,w8,#0x10,#0x8
008c78fc	mov x0,x19
008c7900	mov w5,#0x2
008c7904	and x9,x9,#0x3fc
008c7908	add x21,x20,x9
008c790c	add x2,x25,w8, UXTW  #0x4
008c7910	ldur w9,[x21, #-0x4]
008c7914	ldr x10,[x10, #0xbc0]
008c7918	ldr w13,[x28, #0x4]
008c791c	ldr x14,[x19, #0x50]
008c7920	lsr x11,x9,#0x8
008c7924	lsr w23,w9,#0x18
008c7928	ldr x9,[x10, x12, LSL #0x3]
008c792c	add x4,x25,x13, LSL #0x4
008c7930	str x20,[x14, #0x20]
008c7934	add x22,x25,w11, UXTB  #0x4
008c7938	sub w3,w23,#0x1
008c793c	mov x1,x22
008c7940	blr x9
008c7944	tbnz w0,#0x1f,0x008c3a14
008c7948	cbnz w23,0x008c7954
008c794c	add x8,x22,w0, UXTW  #0x4
008c7950	str x8,[x19, #0x68]
008c7954	ldrb w8,[x21]
008c7958	mov x28,x21
008c795c	ldr x8,[x26, x8, LSL #0x3]
008c7960	br x8
008c7964	ldr x8,[x24, #0x10]
008c7968	mov x20,x28
008c796c	ldrb w9,[x8, #0x3]
008c7970	ldr w8,[x20], #0x8
008c7974	cbz w9,0x008c3a14
008c7978	lsr x9,x8,#0x16
008c797c	adrp x10,0xcb4000
008c7980	ubfx x12,x8,#0x8,#0x8
008c7984	ubfx w8,w8,#0x10,#0x8
008c7988	mov x0,x19
008c798c	mov w5,#0x2
008c7990	and x9,x9,#0x3fc
008c7994	add x21,x20,x9
008c7998	add x2,x25,w8, UXTW  #0x4
008c799c	ldur w9,[x21, #-0x4]
008c79a0	ldr x10,[x10, #0xbc0]
008c79a4	ldr w13,[x28, #0x4]
008c79a8	ldr x14,[x19, #0x50]
008c79ac	lsr x11,x9,#0x8
008c79b0	lsr w23,w9,#0x18
008c79b4	ldr x9,[x10, x12, LSL #0x3]
008c79b8	add x4,x27,x13, LSL #0x4
008c79bc	b 0x008c7930
008c79c0	ldr x8,[x24, #0x10]
008c79c4	mov x20,x28
008c79c8	ldrb w9,[x8, #0x3]
008c79cc	ldr w8,[x20], #0x8
008c79d0	cbz w9,0x008c3a14
008c79d4	lsr x9,x8,#0x16
008c79d8	adrp x11,0xcb4000
008c79dc	ubfx x10,x8,#0x8,#0x8
008c79e0	ldr x11,[x11, #0xbc0]
008c79e4	ldr w12,[x28, #0x4]
008c79e8	ldr x13,[x19, #0x50]
008c79ec	and x9,x9,#0x3fc
008c79f0	ubfx w8,w8,#0x10,#0x8
008c79f4	mov x0,x19
008c79f8	add x28,x20,x9
008c79fc	ldr x10,[x11, x10, LSL #0x3]
008c7a00	and x11,x12,#0xff
008c7a04	ldur w9,[x28, #-0x4]
008c7a08	str x20,[x13, #0x20]
008c7a0c	add x2,x25,w8, UXTW  #0x4
008c7a10	ldr x4,[x19, #0x68]
008c7a14	ldr q0,[x25,x11, lsl #4]
008c7a18	ubfx x11,x12,#0x8,#0x8
008c7a1c	lsr x12,x9,#0x8
008c7a20	lsr w21,w9,#0x18
008c7a24	mov w5,#0x3
008c7a28	str q0,[x4]
008c7a2c	add x22,x25,w12, UXTB  #0x4
008c7a30	ldr q0,[x25,x11, lsl #4]
008c7a34	sub w3,w21,#0x1
008c7a38	mov x1,x22
008c7a3c	str q0,[x4, #0x10]
008c7a40	blr x10
008c7a44	tbnz w0,#0x1f,0x008c3a14
008c7a48	cbnz w21,0x008c6924
008c7a4c	add x8,x22,w0, UXTW  #0x4
008c7a50	str x8,[x19, #0x68]
008c7a54	b 0x008c6924
008c7a58	ldr w8,[x28]
008c7a5c	ldr w9,[x28, #0x4]!
008c7a60	lsr x10,x8,#0x8
008c7a64	asr w8,w8,#0x10
008c7a68	add x10,x25,w10, UXTB  #0x4
008c7a6c	ldr w10,[x10, #0xc]
008c7a70	sub w10,w10,#0x1
008c7a74	eor w9,w10,w9
008c7a78	cmp w9,#0x0
008c7a7c	csinc w8,w8,wzr,lt
008c7a80	add x28,x28,w8, SXTW  #0x2
008c7a84	b 0x008c6924
008c7a88	ldr w8,[x28]
008c7a8c	lsr x9,x8,#0x8
008c7a90	add x10,x25,w9, UXTB  #0x4
008c7a94	ldr w9,[x28, #0x4]!
008c7a98	ldr w11,[x10, #0xc]
008c7a9c	cmp w11,#0x1
008c7aa0	b.ne 0x008c7ab8
008c7aa4	ldr w10,[x10]
008c7aa8	and w11,w9,#0x1
008c7aac	cmp w10,w11
008c7ab0	cset w10,eq
008c7ab4	b 0x008c7abc
008c7ab8	mov w10,wzr
008c7abc	asr w8,w8,#0x10
008c7ac0	cmp w10,w9, LSR #0x1f
008c7ac4	csinc w8,w8,wzr,ne
008c7ac8	add x28,x28,w8, SXTW  #0x2
008c7acc	b 0x008c6924
008c7ad0	ldr w8,[x28]
008c7ad4	ldr w12,[x28, #0x4]!
008c7ad8	lsr x9,x8,#0x8
008c7adc	and x10,x12,#0xffffff
008c7ae0	add x10,x27,x10, LSL #0x4
008c7ae4	add x9,x25,w9, UXTB  #0x4
008c7ae8	ldr w11,[x9, #0xc]
008c7aec	cmp w11,#0x3
008c7af0	tbnz w12,#0x1f,0x008c7b0c
008c7af4	b.ne 0x008c7b20
008c7af8	ldr d0,[x9]
008c7afc	ldr d1,[x10]
008c7b00	fcmp d0,d1
008c7b04	b.eq 0x008c7b2c
008c7b08	b 0x008c7b20
008c7b0c	b.ne 0x008c7b2c
008c7b10	ldr d0,[x9]
008c7b14	ldr d1,[x10]
008c7b18	fcmp d0,d1
008c7b1c	b.ne 0x008c7b2c
008c7b20	mov w8,#0x1
008c7b24	add x28,x28,x8, LSL #0x2
008c7b28	b 0x008c6924
008c7b2c	sbfx x8,x8,#0x10,#0x10
008c7b30	add x28,x28,x8, LSL #0x2
008c7b34	b 0x008c6924
008c7b38	ldr w8,[x28]
008c7b3c	lsr x9,x8,#0x8
008c7b40	add x10,x25,w9, UXTB  #0x4
008c7b44	ldr w9,[x28, #0x4]!
008c7b48	ldr w11,[x10, #0xc]
008c7b4c	cmp w11,#0x5
008c7b50	b.ne 0x008c7b70
008c7b54	and x11,x9,#0xffffff
008c7b58	ldr x10,[x10]
008c7b5c	lsl x11,x11,#0x4
008c7b60	ldr x11,[x27, x11#0x0]
008c7b64	cmp x10,x11
008c7b68	cset w10,eq
008c7b6c	b 0x008c7b74
008c7b70	mov w10,wzr
008c7b74	asr w8,w8,#0x10
008c7b78	cmp w10,w9, LSR #0x1f
008c7b7c	b 0x008c7ac4
008c7b80	ldp w20,w26,[x28]
008c7b84	str x27,[sp, #0x18]
008c7b88	lsr x8,x20,#0x10
008c7b8c	and x11,x26,#0xffff
008c7b90	add x8,x25,w8, UXTB  #0x4
008c7b94	ldr w9,[x8, #0xc]
008c7b98	cmp w9,#0x8
008c7b9c	b.ne 0x008c7cdc
008c7ba0	ldr x27,[x8]
008c7ba4	mov w9,#0x48
008c7ba8	ldr x10,[x19, #0x60]
008c7bac	ldrb w22,[x27, #0x3]
008c7bb0	nop
008c7bb4	umaddl x9,w22,w9,x10
008c7bb8	ldr x21,[x9, #0x960]
008c7bbc	cbz x21,0x008c7cdc
008c7bc0	add x9,x9,#0x930
008c7bc4	ldr w10,[x9, #0xc]
008c7bc8	cbz w10,0x008c7cdc
008c7bcc	ldr x23,[x19, #0x68]
008c7bd0	ldr q0,[x9]
008c7bd4	stp x11,x24,[sp, #0x8]
008c7bd8	add x24,x28,#0x8
008c7bdc	str q0,[x23]
008c7be0	ldr q0,[x8]
008c7be4	ldr x8,[sp, #0x18]
008c7be8	add x25,x8,w26, UXTH  #0x4
008c7bec	str q0,[x23, #0x10]
008c7bf0	ldr q0,[x25]
008c7bf4	str q0,[x23, #0x20]
008c7bf8	ldr x8,[x19, #0x68]
008c7bfc	ldr x9,[x19, #0x50]
008c7c00	add x8,x8,#0x30
008c7c04	str x8,[x19, #0x68]
008c7c08	str x24,[x9, #0x20]
008c7c0c	ldrh w8,[x19, #0x28]
008c7c10	add w8,w8,#0x1
008c7c14	and w9,w8,#0xffff
008c7c18	strh w8,[x19, #0x28]
008c7c1c	cmp w9,#0xc8
008c7c20	b.cc 0x008c7c2c
008c7c24	mov x0,x19
008c7c28	bl 0x008b42d8
008c7c2c	mov x0,x19
008c7c30	mov w1,#0x1
008c7c34	mov x2,x23
008c7c38	bl 0x008be620
008c7c3c	ldr x8,[x25]
008c7c40	lsr w23,w26,#0x10
008c7c44	add x1,x27,#0x10
008c7c48	add x3,sp,#0x34
008c7c4c	mov x0,x19
008c7c50	mov w4,w22
008c7c54	ldrsh w2,[x8, #0x6]
008c7c58	strh w23,[sp, #0x34]
008c7c5c	blr x21
008c7c60	ldrh w8,[sp, #0x34]
008c7c64	cmp w23,w8
008c7c68	b.eq 0x008c7c84
008c7c6c	ldrb w9,[x28]
008c7c70	cmp w9,#0x53
008c7c74	b.ne 0x008c7c84
008c7c78	ldr x9,[sp, #0x8]
008c7c7c	orr w8,w9,w8, LSL #0x10
008c7c80	str w8,[x28, #0x4]
008c7c84	ldr x19,[sp, #0x20]
008c7c88	adrp x26,0xc4d000
008c7c8c	add x26,x26,#0xa78
008c7c90	mov x28,x24
008c7c94	ldr x8,[x19, #0x50]
008c7c98	ldrh w9,[x19, #0x28]
008c7c9c	ldur x25,[x8, #-0x20]
008c7ca0	sub w9,w9,#0x1
008c7ca4	sub x10,x8,#0x30
008c7ca8	strh w9,[x19, #0x28]
008c7cac	ldr x9,[x19, #0x68]
008c7cb0	str x10,[x19, #0x50]
008c7cb4	ubfx x10,x20,#0x8,#0x8
008c7cb8	str x25,[x19, #0x70]
008c7cbc	ldur q0,[x9, #-0x10]
008c7cc0	str q0,[x25,x10, lsl #4]
008c7cc4	ldur x8,[x8, #-0x18]
008c7cc8	ldrb w9,[x24]
008c7ccc	str x8,[x19, #0x68]
008c7cd0	ldr x8,[x26, x9, LSL #0x3]
008c7cd4	ldp x24,x27,[sp, #0x10]
008c7cd8	br x8
008c7cdc	and w8,w20,#0xffffff00
008c7ce0	orr w8,w8,#0xf
008c7ce4	stp w8,w11,[x28]
008c7ce8	adrp x8,0x8c3000
008c7cec	add x8,x8,#0xb5c
008c7cf0	ldr x27,[sp, #0x18]
008c7cf4	adrp x26,0xc4d000
008c7cf8	add x26,x26,#0xa78
008c7cfc	br x8
008c7d00	ldp w8,w21,[x28]
008c7d04	stp x24,x27,[sp, #0x10]
008c7d08	lsr x9,x8,#0x10
008c7d0c	and x12,x21,#0xffff
008c7d10	add x9,x25,w9, UXTB  #0x4
008c7d14	ldr w10,[x9, #0xc]
008c7d18	cmp w10,#0x8
008c7d1c	b.ne 0x008c7d50
008c7d20	ldr x24,[x9]
008c7d24	ldr x11,[sp, #0x20]
008c7d28	mov w10,#0x48
008c7d2c	ldrb w22,[x24, #0x3]
008c7d30	ldr x11,[x11, #0x60]
008c7d34	nop
008c7d38	umaddl x10,w22,w10,x11
008c7d3c	ldr x27,[x10, #0x968]
008c7d40	cbz x27,0x008c7d50
008c7d44	add x11,x10,#0x930
008c7d48	ldr w11,[x11, #0x1c]
008c7d4c	cbnz w11,0x008c7d70
008c7d50	and w8,w8,#0xffffff00
008c7d54	ldp x24,x27,[sp, #0x10]
008c7d58	orr w8,w8,#0x10
008c7d5c	ldr x19,[sp, #0x20]
008c7d60	stp w8,w12,[x28]
008c7d64	adrp x8,0x8c3000
008c7d68	add x8,x8,#0xfa4
008c7d6c	br x8
008c7d70	ldr x19,[sp, #0x20]
008c7d74	add x10,x10,#0x940
008c7d78	lsr x8,x8,#0x8
008c7d7c	ldr q0,[x10]
008c7d80	add x26,x28,#0x8
008c7d84	str x12,[sp, #0x8]
008c7d88	ldr x23,[x19, #0x68]
008c7d8c	add x8,x25,w8, UXTB  #0x4
008c7d90	str q0,[x23]
008c7d94	ldr q0,[x9]
008c7d98	ldr x9,[sp, #0x18]
008c7d9c	add x20,x9,w21, UXTH  #0x4
008c7da0	str q0,[x23, #0x10]
008c7da4	ldr q0,[x20]
008c7da8	str q0,[x23, #0x20]
008c7dac	ldr q0,[x8]
008c7db0	str q0,[x23, #0x30]
008c7db4	ldr x8,[x19, #0x68]
008c7db8	ldr x9,[x19, #0x50]
008c7dbc	add x8,x8,#0x40
008c7dc0	str x8,[x19, #0x68]
008c7dc4	str x26,[x9, #0x20]
008c7dc8	ldrh w8,[x19, #0x28]
008c7dcc	add w8,w8,#0x1
008c7dd0	and w9,w8,#0xffff
008c7dd4	strh w8,[x19, #0x28]
008c7dd8	cmp w9,#0xc8
008c7ddc	b.cc 0x008c7de8
008c7de0	mov x0,x19
008c7de4	bl 0x008b42d8
008c7de8	mov x0,x19
008c7dec	mov w1,wzr
008c7df0	mov x2,x23
008c7df4	bl 0x008be620
008c7df8	ldr x8,[x20]
008c7dfc	lsr w20,w21,#0x10
008c7e00	add x1,x24,#0x10
008c7e04	add x3,sp,#0x30
008c7e08	mov x0,x19
008c7e0c	mov w4,w22
008c7e10	ldrsh w2,[x8, #0x6]
008c7e14	strh w20,[sp, #0x30]
008c7e18	blr x27
008c7e1c	ldrh w8,[sp, #0x30]
008c7e20	cmp w20,w8
008c7e24	b.eq 0x008c7e40
008c7e28	ldrb w9,[x28]
008c7e2c	cmp w9,#0x54
008c7e30	b.ne 0x008c7e40
008c7e34	ldr x9,[sp, #0x8]
008c7e38	orr w8,w9,w8, LSL #0x10
008c7e3c	str w8,[x28, #0x4]
008c7e40	ldr x19,[sp, #0x20]
008c7e44	ldrb w9,[x26]
008c7e48	adrp x11,0xc4d000
008c7e4c	add x11,x11,#0xa78
008c7e50	mov x28,x26
008c7e54	ldr x8,[x19, #0x50]
008c7e58	mov x26,x11
008c7e5c	ldur q0,[x8, #-0x20]
008c7e60	sub x8,x8,#0x30
008c7e64	str x8,[x19, #0x50]
008c7e68	ldrh w8,[x19, #0x28]
008c7e6c	ext v1.16B,v0.16B,v0.16B,0x8
008c7e70	fmov x25,d0
008c7e74	sub w10,w8,#0x1
008c7e78	strh w10,[x19, #0x28]
008c7e7c	stur q1,[x19, #0x68]
008c7e80	ldr x8,[x11, x9, LSL #0x3]
008c7e84	ldp x24,x27,[sp, #0x10]
008c7e88	br x8
008c7e8c	ldp w8,w26,[x28]
008c7e90	str x27,[sp, #0x18]
008c7e94	lsr x9,x8,#0x10
008c7e98	and x12,x26,#0xffff
008c7e9c	add x9,x25,w9, UXTB  #0x4
008c7ea0	ldr w10,[x9, #0xc]
008c7ea4	cmp w10,#0x8
008c7ea8	b.ne 0x008c80b0
008c7eac	ldr x27,[x9]
008c7eb0	mov w10,#0x48
008c7eb4	ldr x11,[x19, #0x60]
008c7eb8	ldrb w23,[x27, #0x3]
008c7ebc	nop
008c7ec0	umaddl x10,w23,w10,x11
008c7ec4	ldr x21,[x10, #0x970]
008c7ec8	cbz x21,0x008c80b0
008c7ecc	add x11,x10,#0x930
008c7ed0	ldr w11,[x11, #0x2c]
008c7ed4	cbz w11,0x008c80b0
008c7ed8	lsr x8,x8,#0x8
008c7edc	ldr q0,[x9]
008c7ee0	str x24,[sp, #0x10]
008c7ee4	mov w9,#0x10
008c7ee8	str x12,[sp, #0x8]
008c7eec	add x2,x25,w8, UXTB  #0x4
008c7ef0	add x8,x10,#0x950
008c7ef4	ldr x10,[sp, #0x18]
008c7ef8	str q0,[x2, #0x10]
008c7efc	add x25,x10,w26, UXTH  #0x4
008c7f00	ldr q0,[x8]
008c7f04	str q0,[x2]
008c7f08	ldr w24,[x28, #0x8]
008c7f0c	and w8,w24,#0xff
008c7f10	cmp w8,#0x57
008c7f14	mov w8,#0xc
008c7f18	csel x8,x9,x8,eq
008c7f1c	ldr x9,[x19, #0x50]
008c7f20	add x20,x28,x8
008c7f24	ubfx x8,x24,#0x10,#0x8
008c7f28	str x20,[x9, #0x20]
008c7f2c	ldr x9,[x25]
008c7f30	str x9,[x19, #0x8]
008c7f34	cbz w8,0x008c7f48
008c7f38	add x9,x2,#0x10
008c7f3c	add x8,x9,x8, LSL #0x4
008c7f40	sub x8,x8,#0x10
008c7f44	b 0x008c7f4c
008c7f48	ldr x8,[x19, #0x68]
008c7f4c	lsr w9,w24,#0x18
008c7f50	mov x0,x19
008c7f54	str x8,[x19, #0x68]
008c7f58	sub w22,w9,#0x1
008c7f5c	mov w1,w22
008c7f60	bl 0x008be620
008c7f64	ldr x8,[x25]
008c7f68	lsr w25,w26,#0x10
008c7f6c	add x1,x27,#0x10
008c7f70	add x3,sp,#0x2c
008c7f74	mov x0,x19
008c7f78	mov w4,w23
008c7f7c	ldrsh w2,[x8, #0x6]
008c7f80	strh w25,[sp, #0x2c]
008c7f84	blr x21
008c7f88	ldrh w8,[sp, #0x2c]
008c7f8c	cmp w25,w8
008c7f90	b.eq 0x008c7fac
008c7f94	ldrb w9,[x28]
008c7f98	cmp w9,#0x55
008c7f9c	b.ne 0x008c7fac
008c7fa0	ldr x9,[sp, #0x8]
008c7fa4	orr w8,w9,w8, LSL #0x10
008c7fa8	str w8,[x28, #0x4]
008c7fac	ldr x19,[sp, #0x20]
008c7fb0	tbnz w0,#0x1f,0x008c8794
008c7fb4	ldr x8,[x19, #0x50]
008c7fb8	ldr x10,[x8, #0x8]
008c7fbc	cbz w22,0x008c8064
008c7fc0	ldr x27,[sp, #0x18]
008c7fc4	cbz w0,0x008c8068
008c7fc8	ldr x9,[x19, #0x68]
008c7fcc	mov x28,x20
008c7fd0	sub x11,x9,w0, UXTW  #0x4
008c7fd4	add x11,x11,#0x10
008c7fd8	ldur q0,[x11, #-0x10]
008c7fdc	subs w22,w22,#0x1
008c7fe0	str q0,[x10], #0x10
008c7fe4	b.eq 0x008c7ff4
008c7fe8	cmp x11,x9
008c7fec	add x11,x11,#0x10
008c7ff0	b.cc 0x008c7fd8
008c7ff4	cmp w22,#0x1
008c7ff8	b.lt 0x008c8074
008c7ffc	adrp x26,0xc4d000
008c8000	add x26,x26,#0xa78
008c8004	b.ne 0x008c8010
008c8008	mov x9,x10
008c800c	b 0x008c8040
008c8010	mov w11,w22
008c8014	and x12,x11,#0x7ffffffe
008c8018	add x9,x10,x12, LSL #0x4
008c801c	sub w22,w22,w12
008c8020	add x10,x10,#0x1c
008c8024	mov x13,x12
008c8028	subs x13,x13,#0x2
008c802c	stur wzr,[x10, #-0x10]
008c8030	str wzr,[x10], #0x20
008c8034	b.ne 0x008c8028
008c8038	cmp x12,x11
008c803c	b.eq 0x008c8080
008c8040	add w10,w22,#0x1
008c8044	mov x11,x9
008c8048	sub w10,w10,#0x1
008c804c	add x9,x11,#0x10
008c8050	str wzr,[x11, #0xc]
008c8054	cmp w10,#0x1
008c8058	mov x11,x9
008c805c	b.hi 0x008c8048
008c8060	b 0x008c8080
008c8064	ldr x27,[sp, #0x18]
008c8068	mov x28,x20
008c806c	cmp w22,#0x1
008c8070	b.ge 0x008c7ffc
008c8074	mov x9,x10
008c8078	adrp x26,0xc4d000
008c807c	add x26,x26,#0xa78
008c8080	ldur x25,[x8, #-0x20]
008c8084	lsr w11,w24,#0x18
008c8088	sub x10,x8,#0x30
008c808c	str x10,[x19, #0x50]
008c8090	str x25,[x19, #0x70]
008c8094	cbz w11,0x008c809c
008c8098	ldur x9,[x8, #-0x18]
008c809c	ldrb w8,[x28]
008c80a0	str x9,[x19, #0x68]
008c80a4	ldr x24,[sp, #0x10]
008c80a8	ldr x8,[x26, x8, LSL #0x3]
008c80ac	br x8
008c80b0	mov w9,#0x14
008c80b4	bfxil w8,w9,#0x0,#0x8
008c80b8	stp w8,w12,[x28]
008c80bc	adrp x8,0x8c4000
008c80c0	add x8,x8,#0x51c
008c80c4	b 0x008c7cf0
008c80c8	ldp w8,w2,[x28], #0x8
008c80cc	ldr x11,[x19, #0x50]
008c80d0	lsr x9,x8,#0x8
008c80d4	lsr x10,x8,#0x14
008c80d8	tst w8,#0xff0000
008c80dc	str x28,[x11, #0x20]
008c80e0	add x9,x25,w9, UXTB  #0x4
008c80e4	and x8,x10,#0xff0
008c80e8	b.eq 0x008c8100
008c80ec	ldr x1,[x9]
008c80f0	add x3,x25,x8
008c80f4	mov x0,x19
008c80f8	bl 0x008b2c3c
008c80fc	b 0x008c6924
008c8100	lsl x10,x2,#0x4
008c8104	ldr x1,[x9]
008c8108	add x3,x25,x8
008c810c	mov x0,x19
008c8110	ldr x2,[x27, x10#0x0]
008c8114	bl 0x008b2a58
008c8118	b 0x008c6924
008c811c	ldr w8,[x28]
008c8120	lsr x9,x8,#0x8
008c8124	add x10,x25,w9, UXTB  #0x4
008c8128	ldr w9,[x10, #0xc]
008c812c	cmp w9,#0x7
008c8130	add x9,x28,#0x8
008c8134	b.ne 0x008c8174
008c8138	ldr x10,[x10]
008c813c	ldrb w11,[x10, #0x6]
008c8140	cbnz w11,0x008c8158
008c8144	ldr x10,[x10, #0x18]
008c8148	ldr w11,[x28, #0x4]
008c814c	ldr w10,[x10, #0xcc]
008c8150	cmp w10,w11
008c8154	b.eq 0x008c8164
008c8158	asr w8,w8,#0x10
008c815c	add x8,x9,w8, SXTW  #0x2
008c8160	sub x9,x8,#0x4
008c8164	ldrb w8,[x9]
008c8168	mov x28,x9
008c816c	ldr x8,[x26, x8, LSL #0x3]
008c8170	br x8
008c8174	asr w8,w8,#0x10
008c8178	add x28,x9,w8, SXTW  #0x2
008c817c	ldrb w8,[x28, #-0x4]!
008c8180	ldr x8,[x26, x8, LSL #0x3]
008c8184	br x8
008c8188	ldr x8,[x19, #0x60]
008c818c	ldr w21,[x28], #0x4
008c8190	ldr x8,[x8, #0x688]
008c8194	cbnz x8,0x008c8340
008c8198	lsr x8,x21,#0x16
008c819c	and x8,x8,#0x3fc
008c81a0	add x26,x28,x8
008c81a4	ldr w20,[x26]
008c81a8	lsr x9,x20,#0x8
008c81ac	ubfx w8,w20,#0x10,#0x8
008c81b0	add x23,x25,w9, UXTB  #0x4
008c81b4	cbnz w8,0x008c81c4
008c81b8	ldr x8,[x19, #0x68]
008c81bc	sub x8,x8,x23
008c81c0	lsr x8,x8,#0x4
008c81c4	ldr x9,[x24, #0x10]
008c81c8	ldrb w9,[x9, #0x3]
008c81cc	cbz w9,0x008c6ef0
008c81d0	ldrh w9,[x19, #0x28]
008c81d4	ldrh w10,[x19, #0x2a]
008c81d8	cmp w9,w10
008c81dc	b.hi 0x008c6ef0
008c81e0	str x27,[sp, #0x18]
008c81e4	adrp x10,0xcb4000
008c81e8	ubfx w9,w21,#0x8,#0x8
008c81ec	ldr x10,[x10, #0xbc8]
008c81f0	mov x27,x19
008c81f4	mov x19,x24
008c81f8	sub w24,w8,#0x1
008c81fc	mov x0,x27
008c8200	mov x1,x23
008c8204	ldr x9,[x10, w9, UXTW #0x3]
008c8208	mov w2,w24
008c820c	blr x9
008c8210	tbnz w0,#0x1f,0x008c8250
008c8214	ldr x8,[x27, #0x50]
008c8218	add x28,x26,#0x4
008c821c	add x21,x23,#0x10
008c8220	mov w22,w0
008c8224	str x28,[x8, #0x20]
008c8228	add x8,x21,w24, SXTW  #0x4
008c822c	ldr x9,[x27, #0x50]
008c8230	ldr x10,[x27, #0x18]
008c8234	str x8,[x27, #0x68]
008c8238	ldr x24,[x23]
008c823c	cmp x9,x10
008c8240	b.eq 0x008c8270
008c8244	add x0,x9,#0x30
008c8248	str x0,[x27, #0x50]
008c824c	b 0x008c827c
008c8250	ldrb w8,[x28]
008c8254	adrp x26,0xc4d000
008c8258	add x26,x26,#0xa78
008c825c	ldr x8,[x26, x8, LSL #0x3]
008c8260	mov x24,x19
008c8264	mov x19,x27
008c8268	ldr x27,[sp, #0x18]
008c826c	br x8
008c8270	mov x0,x27
008c8274	bl 0x008b4200
008c8278	ldr x8,[x27, #0x68]
008c827c	ldrb w9,[x24, #0x4]
008c8280	str w22,[x0, #0x20]
008c8284	mov w12,#0x12
008c8288	ldr x10,[x27, #0x48]
008c828c	ldr x11,[x27, #0x68]
008c8290	adrp x26,0xc4d000
008c8294	add x26,x26,#0xa78
008c8298	stp xzr,x23,[x0]
008c829c	add x9,x8,x9, LSL #0x4
008c82a0	lsr w23,w20,#0x18
008c82a4	ldrb w8,[x24, #0x4]
008c82a8	sub x10,x10,x11
008c82ac	stp x21,x9,[x0, #0x10]
008c82b0	sub w21,w23,#0x1
008c82b4	cmp x10,w8, UXTW  #0x4
008c82b8	stp w21,w12,[x0, #0x28]
008c82bc	b.gt 0x008c82e0
008c82c0	ldr w9,[x27, #0x40]
008c82c4	mov x0,x27
008c82c8	mov w2,#0x1
008c82cc	lsl w10,w9,#0x1
008c82d0	add w11,w9,w8
008c82d4	cmp w9,w8
008c82d8	csel w1,w11,w10,lt
008c82dc	bl 0x008b3fdc
008c82e0	ldr x8,[x27, #0x50]
008c82e4	lsr w9,w20,#0x19
008c82e8	mov x0,x27
008c82ec	ldr x8,[x8, #0x10]
008c82f0	cmp w9,#0x0
008c82f4	add x1,x8,w22, UXTW  #0x4
008c82f8	sub w8,w23,#0x2
008c82fc	csel w2,w8,w21,ne
008c8300	bl 0x008c8994
008c8304	cbnz w0,0x008c8374
008c8308	ldr x8,[x27, #0x50]
008c830c	ldr x25,[x27, #0x70]
008c8310	mov x19,x27
008c8314	ldp x10,x11,[x8]
008c8318	ldr w9,[x8, #0x2c]
008c831c	orr w9,w9,#0x1
008c8320	ldr x28,[x10, #0x18]
008c8324	str w9,[x8, #0x2c]
008c8328	ldr x9,[x10, #0x28]
008c832c	ldr x24,[x11]
008c8330	ldrb w8,[x28]
008c8334	mov x27,x9
008c8338	ldr x8,[x26, x8, LSL #0x3]
008c833c	br x8
008c8340	ldr x9,[x19, #0x50]
008c8344	mov x0,x19
008c8348	mov w1,#0xffffffff
008c834c	str x28,[x9, #0x20]
008c8350	ldr x9,[x19, #0x50]
008c8354	ldr x10,[x9, #0x20]
008c8358	add x10,x10,#0x4
008c835c	str x10,[x9, #0x20]
008c8360	blr x8
008c8364	ldrb w8,[x19, #0x3]
008c8368	cbnz w8,0x008c8784
008c836c	ldr x25,[x19, #0x70]
008c8370	b 0x008c8198
008c8374	cmp w0,#0x1
008c8378	b.ne 0x008c8794
008c837c	mov x0,x27
008c8380	bl 0x008c8d44
008c8384	ldrb w8,[x28]
008c8388	ldr x25,[x27, #0x70]
008c838c	b 0x008c825c
008c8390	ldp w8,w10,[x28], #0x8
008c8394	ldr x9,[x19, #0x50]
008c8398	lsr x11,x8,#0x8
008c839c	str x28,[x9, #0x20]
008c83a0	ubfx w9,w8,#0x18,#0x1
008c83a4	ldr q0,[x27,x10, lsl #4]
008c83a8	mov w10,#0xff0000
008c83ac	add x20,x25,w11, UXTB  #0x4
008c83b0	bics wzr,w10,w8
008c83b4	str q0,[x20]
008c83b8	ldr x1,[x20]
008c83bc	strb w9,[x1, #0x69]
008c83c0	b.eq 0x008c6924
008c83c4	lsr x8,x8,#0x10
008c83c8	add x8,x25,w8, UXTB  #0x4
008c83cc	ldr w9,[x8, #0xc]
008c83d0	cmp w9,#0xb
008c83d4	b.ne 0x008c875c
008c83d8	ldr x2,[x8]
008c83dc	mov x0,x19
008c83e0	bl 0x008b25f4
008c83e4	mov w8,#0xb
008c83e8	str x0,[x20]
008c83ec	str w8,[x20, #0xc]
008c83f0	b 0x008c6924
008c83f4	ldp w8,w3,[x28]
008c83f8	ldr x10,[x19, #0x50]
008c83fc	add x20,x28,#0x8
008c8400	mov x0,x19
008c8404	lsr x9,x8,#0x8
008c8408	lsr x8,x8,#0x10
008c840c	str x20,[x10, #0x20]
008c8410	add x1,x25,w9, UXTB  #0x4
008c8414	add x2,x25,w8, UXTB  #0x4
008c8418	bl 0x008b30a8
008c841c	ldrb w8,[x28, #0x8]
008c8420	b 0x008c3a18
008c8424	ldr w8,[x28], #0x4
008c8428	lsr x9,x8,#0x8
008c842c	add x9,x25,w9, UXTB  #0x4
008c8430	ldr w10,[x9, #0xc]
008c8434	cmp w10,#0xc
008c8438	b.ne 0x008c6924
008c843c	lsr x8,x8,#0x16
008c8440	ldr q0,[x9]
008c8444	and x8,x8,#0x3fc
008c8448	add x8,x28,x8
008c844c	ldr w11,[x8]
008c8450	lsr x10,x11,#0x8
008c8454	lsr w12,w11,#0x18
008c8458	add x13,x25,w10, UXTB  #0x4
008c845c	lsr w10,w11,#0x18
008c8460	cmp w12,#0x3
008c8464	add x9,x13,#0x10
008c8468	str q0,[x13]
008c846c	b.cc 0x008c84d4
008c8470	subs w12,w10,#0x3
008c8474	b.eq 0x008c84b4
008c8478	ubfx x11,x11,#0x8,#0x8
008c847c	add x13,x12,#0x1
008c8480	and x14,x13,#0x1fffffffe
008c8484	orr w12,w13,#0x1
008c8488	add x15,x25,x11, LSL #0x4
008c848c	add x11,x9,x14, LSL #0x4
008c8490	mov x16,x14
008c8494	add x15,x15,#0x2c
008c8498	subs x16,x16,#0x2
008c849c	stur wzr,[x15, #-0x10]
008c84a0	str wzr,[x15], #0x20
008c84a4	b.ne 0x008c8498
008c84a8	cmp x13,x14
008c84ac	b.ne 0x008c84bc
008c84b0	b 0x008c84d4
008c84b4	mov w12,#0x1
008c84b8	mov x11,x9
008c84bc	mvn w12,w12
008c84c0	add x11,x11,#0xc
008c84c4	add w12,w12,w10
008c84c8	subs w12,w12,#0x1
008c84cc	str wzr,[x11], #0x10
008c84d0	b.ne 0x008c84c8
008c84d4	cbz w10,0x008c84e0
008c84d8	ldr x9,[x19, #0x50]
008c84dc	ldr x9,[x9, #0x18]
008c84e0	str x9,[x19, #0x68]
008c84e4	add x28,x8,#0x4
008c84e8	b 0x008c6924
008c84ec	ldp w8,w20,[x28], #0x8
008c84f0	ldr x10,[x19, #0x50]
008c84f4	lsr x9,x8,#0x10
008c84f8	str x28,[x10, #0x20]
008c84fc	add x22,x25,w9, UXTB  #0x4
008c8500	ldr w9,[x22, #0xc]
008c8504	sub w10,w9,#0xd
008c8508	cmn w10,#0x3
008c850c	b.ls 0x008c86c8
008c8510	lsr x10,x8,#0x14
008c8514	and x10,x10,#0xff0
008c8518	add x11,x24,x10
008c851c	ldr w10,[x11, #0x2c]
008c8520	add x1,x11,#0x20
008c8524	cmp w10,#0xf
008c8528	b.ne 0x008c8538
008c852c	ldr x10,[x1]
008c8530	ldr x1,[x10, #0x8]
008c8534	ldr w10,[x1, #0xc]
008c8538	cmp w10,#0xb
008c853c	b.ne 0x008c86f0
008c8540	lsr x8,x8,#0x8
008c8544	mov x19,x24
008c8548	ldr x23,[x1]
008c854c	ldr x24,[x22]
008c8550	cmp w9,#0xc
008c8554	add x21,x25,w8, UXTB  #0x4
008c8558	b.ne 0x008c858c
008c855c	mov x0,x24
008c8560	mov x1,x23
008c8564	bl 0x008b3380
008c8568	tbz w0,#0x0,0x008c88b0
008c856c	tbnz w20,#0x8,0x008c85a0
008c8570	ldr w8,[x23, #0x64]
008c8574	tbz w20,#0x9,0x008c8580
008c8578	ldr q0,[x22]
008c857c	str q0,[x21, #0x10]
008c8580	add w9,w8,w20, UXTB 
008c8584	add x8,x24,#0x20
008c8588	b 0x008c85b4
008c858c	mov x0,x24
008c8590	mov x1,x23
008c8594	bl 0x008b33a4
008c8598	tbz w0,#0x0,0x008c8714
008c859c	tbz w20,#0x8,0x008c8738
008c85a0	tbz w20,#0x9,0x008c85ac
008c85a4	ldr q0,[x22]
008c85a8	str q0,[x21, #0x10]
008c85ac	add x8,x23,#0x30
008c85b0	and w9,w20,#0xff
008c85b4	ldr x8,[x8]
008c85b8	mov x24,x19
008c85bc	ldr x19,[sp, #0x20]
008c85c0	ldr q0,[x8,w9, uxtw #4]
008c85c4	str q0,[x21]
008c85c8	ldrb w8,[x28]
008c85cc	ldr x8,[x26, x8, LSL #0x3]
008c85d0	br x8
008c85d4	ldr w21,[x28]
008c85d8	mov x9,x19
008c85dc	add x20,x28,#0x8
008c85e0	ldr x9,[x9, #0x50]
008c85e4	mov x19,x24
008c85e8	ldrb w24,[x28, #0x4]
008c85ec	lsr x8,x21,#0x10
008c85f0	str x20,[x9, #0x20]
008c85f4	add x1,x25,w8, UXTB  #0x4
008c85f8	ldr w8,[x1, #0xc]
008c85fc	cmp w8,#0xc
008c8600	b.ne 0x008c8818
008c8604	lsr x8,x21,#0x14
008c8608	and x8,x8,#0xff0
008c860c	add x8,x19,x8
008c8610	ldr w9,[x8, #0x2c]
008c8614	add x8,x8,#0x20
008c8618	cmp w9,#0xf
008c861c	b.ne 0x008c862c
008c8620	ldr x8,[x8]
008c8624	ldr x8,[x8, #0x8]
008c8628	ldr w9,[x8, #0xc]
008c862c	cmp w9,#0xb
008c8630	b.ne 0x008c883c
008c8634	ldr x22,[x1]
008c8638	ldr x23,[x8]
008c863c	mov x0,x22
008c8640	mov x1,x23
008c8644	bl 0x008b3380
008c8648	tbz w0,#0x0,0x008c87f4
008c864c	lsr x8,x21,#0x8
008c8650	ldr w9,[x23, #0x64]
008c8654	ldr x10,[x22, #0x20]
008c8658	add x8,x25,w8, UXTB  #0x4
008c865c	add w9,w9,w24
008c8660	ldr q0,[x8]
008c8664	str q0,[x10,w9, uxtw #4]
008c8668	ldr w9,[x8, #0xc]
008c866c	cmp w9,#0x5
008c8670	b.lt 0x008c8698
008c8674	ldrb w9,[x22, #0x2]
008c8678	tbz w9,#0x2,0x008c8698
008c867c	ldr x2,[x8]
008c8680	ldrb w8,[x2, #0x2]
008c8684	tst w8,#0x3
008c8688	b.eq 0x008c8698
008c868c	ldr x0,[sp, #0x20]
008c8690	mov x1,x22
008c8694	bl 0x008b6188
008c8698	ldrb w8,[x20]
008c869c	mov x28,x20
008c86a0	ldr x8,[x26, x8, LSL #0x3]
008c86a4	mov x24,x19
008c86a8	ldr x19,[sp, #0x20]
008c86ac	br x8
008c86b0	ldrb w8,[x28, #0x1]
008c86b4	add x8,x25,x8, LSL #0x4
008c86b8	str wzr,[x8, #0xc]
008c86bc	ldrb w8,[x28, #0x4]!
008c86c0	ldr x8,[x26, x8, LSL #0x3]
008c86c4	br x8
008c86c8	ldr x8,[sp]
008c86cc	ldr x8,[x8, #0x28]
008c86d0	ldur x9,[x29, #-0x8]
008c86d4	cmp x8,x9
008c86d8	b.ne 0x008c8944
008c86dc	adrp x2,0x2db000
008c86e0	add x2,x2,#0x8c
008c86e4	mov x0,x19
008c86e8	mov x1,x22
008c86ec	bl 0x008b399c
008c86f0	ldr x8,[sp]
008c86f4	ldr x8,[x8, #0x28]
008c86f8	ldur x9,[x29, #-0x8]
008c86fc	ldr x0,[sp, #0x20]
008c8700	cmp x8,x9
008c8704	b.ne 0x008c8944
008c8708	adrp x2,0x2b5000
008c870c	add x2,x2,#0x27b
008c8710	bl 0x008b399c
008c8714	ldr x8,[sp]
008c8718	ldr x8,[x8, #0x28]
008c871c	ldur x9,[x29, #-0x8]
008c8720	ldr x0,[sp, #0x20]
008c8724	cmp x8,x9
008c8728	b.ne 0x008c8944
008c872c	adrp x1,0x2d4000
008c8730	add x1,x1,#0xe6e
008c8734	bl 0x008b39cc
008c8738	ldr x8,[sp]
008c873c	ldr x8,[x8, #0x28]
008c8740	ldur x9,[x29, #-0x8]
008c8744	ldr x0,[sp, #0x20]
008c8748	cmp x8,x9
008c874c	b.ne 0x008c8944
008c8750	adrp x1,0x2b3000
008c8754	add x1,x1,#0x4b5
008c8758	bl 0x008b39cc
008c875c	ldr x9,[sp]
008c8760	ldr x9,[x9, #0x28]
008c8764	ldur x10,[x29, #-0x8]
008c8768	cmp x9,x10
008c876c	b.ne 0x008c8944
008c8770	adrp x2,0x2ba000
008c8774	add x2,x2,#0xf84
008c8778	mov x0,x19
008c877c	mov x1,x8
008c8780	bl 0x008b399c
008c8784	ldr x8,[x19, #0x50]
008c8788	ldr x9,[x8, #0x20]
008c878c	sub x9,x9,#0x4
008c8790	str x9,[x8, #0x20]
008c8794	ldr x8,[sp]
008c8798	ldr x8,[x8, #0x28]
008c879c	ldur x9,[x29, #-0x8]
008c87a0	cmp x8,x9
008c87a4	b.ne 0x008c8944
008c87a8	ldp x20,x19,[sp, #0xd0]
008c87ac	ldp x22,x21,[sp, #0xc0]
008c87b0	ldp x24,x23,[sp, #0xb0]
008c87b4	ldp x26,x25,[sp, #0xa0]
008c87b8	ldp x28,x27,[sp, #0x90]
008c87bc	ldp x29,x30,[sp, #0x80]
008c87c0	add sp,sp,#0xe0
008c87c4	ret
008c87c8	ldr x8,[x19, #0x50]
008c87cc	str x28,[x8, #0x20]
008c87d0	ldr x8,[sp]
008c87d4	ldr x8,[x8, #0x28]
008c87d8	ldur x9,[x29, #-0x8]
008c87dc	cmp x8,x9
008c87e0	b.ne 0x008c8944
008c87e4	adrp x2,0x2c4000
008c87e8	add x2,x2,#0xd59
008c87ec	mov x0,x19
008c87f0	bl 0x008b399c
008c87f4	ldr x8,[sp]
008c87f8	ldr x8,[x8, #0x28]
008c87fc	ldur x9,[x29, #-0x8]
008c8800	ldr x0,[sp, #0x20]
008c8804	cmp x8,x9
008c8808	b.ne 0x008c8944
008c880c	adrp x1,0x2b6000
008c8810	add x1,x1,#0xdb9
008c8814	bl 0x008b39cc
008c8818	ldr x8,[sp]
008c881c	ldr x8,[x8, #0x28]
008c8820	ldur x9,[x29, #-0x8]
008c8824	ldr x0,[sp, #0x20]
008c8828	cmp x8,x9
008c882c	b.ne 0x008c8944
008c8830	adrp x2,0x2c8000
008c8834	add x2,x2,#0xcab
008c8838	bl 0x008b399c
008c883c	ldr x9,[sp]
008c8840	ldr x9,[x9, #0x28]
008c8844	ldur x10,[x29, #-0x8]
008c8848	ldr x0,[sp, #0x20]
008c884c	cmp x9,x10
008c8850	b.ne 0x008c8944
008c8854	adrp x2,0x2c8000
008c8858	add x2,x2,#0xcab
008c885c	mov x1,x8
008c8860	bl 0x008b399c
008c8864	ldr x9,[sp]
008c8868	ldr x2,[x22]
008c886c	ldr x9,[x9, #0x28]
008c8870	ldur x10,[x29, #-0x8]
008c8874	cmp x9,x10
008c8878	b.ne 0x008c8944
008c887c	add x1,x8,#0x10
008c8880	mov x0,x19
008c8884	bl 0x008b3cbc
008c8888	ldr x8,[x19, #0x50]
008c888c	str x28,[x8, #0x20]
008c8890	ldr x8,[sp]
008c8894	ldr x8,[x8, #0x28]
008c8898	ldur x9,[x29, #-0x8]
008c889c	cmp x8,x9
008c88a0	b.ne 0x008c8944
008c88a4	adrp x2,0x2c4000
008c88a8	add x2,x2,#0xd59
008c88ac	b 0x008c86e4
008c88b0	ldr x8,[sp]
008c88b4	ldr x8,[x8, #0x28]
008c88b8	ldur x9,[x29, #-0x8]
008c88bc	ldr x0,[sp, #0x20]
008c88c0	cmp x8,x9
008c88c4	b.ne 0x008c8944
008c88c8	adrp x1,0x2ad000
008c88cc	add x1,x1,#0x23
008c88d0	bl 0x008b39cc
008c88d4	str x28,[x8, #0x20]
008c88d8	ldr x8,[sp]
008c88dc	ldr x8,[x8, #0x28]
008c88e0	ldur x9,[x29, #-0x8]
008c88e4	cmp x8,x9
008c88e8	b.ne 0x008c8944
008c88ec	adrp x2,0x2c8000
008c88f0	add x2,x2,#0xca6
008c88f4	mov x0,x19
008c88f8	bl 0x008b399c
008c88fc	ldr x8,[sp]
008c8900	ldr x8,[x8, #0x28]
008c8904	ldur x9,[x29, #-0x8]
008c8908	ldr x0,[sp, #0x20]
008c890c	cmp x8,x9
008c8910	b.ne 0x008c8944
008c8914	ldr x1,[sp, #0x18]
008c8918	mov x2,x23
008c891c	bl 0x008b3c58
008c8920	ldr x8,[sp]
008c8924	ldr x8,[x8, #0x28]
008c8928	ldur x9,[x29, #-0x8]
008c892c	ldr x0,[sp, #0x20]
008c8930	cmp x8,x9
008c8934	b.ne 0x008c8944
008c8938	mov x1,x23
008c893c	mov x2,x22
008c8940	bl 0x008b3c58
008c8944	bl 0x00c2fec0
