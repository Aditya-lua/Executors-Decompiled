; FUN_00a46738 @ 00a46738
00a46738	stp x22,x21,[sp, #-0x30]!
00a4673c	stp x20,x19,[sp, #0x10]
00a46740	stp x29,x30,[sp, #0x20]
00a46744	ldr w8,[x1, #0x28]
00a46748	ldr w9,[x1]
00a4674c	mov x19,x0
00a46750	mov x21,x1
00a46754	add x22,x0,#0x28
00a46758	add w8,w9,w8
00a4675c	str w8,[x0]
00a46760	ldr w8,[x1, #0x2c]
00a46764	ldr w9,[x1, #0x4]
00a46768	add x29,sp,#0x20
00a4676c	mov x20,x2
00a46770	add w8,w9,w8
00a46774	str w8,[x0, #0x4]
00a46778	ldr w8,[x1, #0x30]
00a4677c	ldr w9,[x1, #0x8]
00a46780	add w8,w9,w8
00a46784	str w8,[x0, #0x8]
00a46788	ldr w8,[x1, #0x34]
00a4678c	ldr w9,[x1, #0xc]
00a46790	add w8,w9,w8
00a46794	str w8,[x0, #0xc]
00a46798	ldr w8,[x1, #0x38]
00a4679c	ldr w9,[x1, #0x10]
00a467a0	add w8,w9,w8
00a467a4	str w8,[x0, #0x10]
00a467a8	ldr w8,[x1, #0x3c]
00a467ac	ldr w9,[x1, #0x14]
00a467b0	add w8,w9,w8
00a467b4	str w8,[x0, #0x14]
00a467b8	ldr w8,[x1, #0x40]
00a467bc	ldr w9,[x1, #0x18]
00a467c0	add w8,w9,w8
00a467c4	str w8,[x0, #0x18]
00a467c8	ldr w8,[x1, #0x44]
00a467cc	ldr w9,[x1, #0x1c]
00a467d0	add w8,w9,w8
00a467d4	str w8,[x0, #0x1c]
00a467d8	ldr w8,[x1, #0x48]
00a467dc	ldr w9,[x1, #0x20]
00a467e0	add w8,w9,w8
00a467e4	str w8,[x0, #0x20]
00a467e8	ldr w8,[x1, #0x4c]
00a467ec	ldr w9,[x1, #0x24]
00a467f0	add w8,w9,w8
00a467f4	str w8,[x0, #0x24]
00a467f8	ldr w8,[x1, #0x28]
00a467fc	ldr w9,[x1]
00a46800	sub w8,w8,w9
00a46804	str w8,[x0, #0x28]
00a46808	ldr w8,[x1, #0x2c]
00a4680c	ldr w9,[x1, #0x4]
00a46810	sub w8,w8,w9
00a46814	str w8,[x0, #0x2c]
00a46818	ldr w8,[x1, #0x30]
00a4681c	ldr w9,[x1, #0x8]
00a46820	sub w8,w8,w9
00a46824	str w8,[x0, #0x30]
00a46828	ldr w8,[x1, #0x34]
00a4682c	ldr w9,[x1, #0xc]
00a46830	sub w8,w8,w9
00a46834	str w8,[x0, #0x34]
00a46838	ldr w8,[x1, #0x38]
00a4683c	ldr w9,[x1, #0x10]
00a46840	sub w8,w8,w9
00a46844	str w8,[x0, #0x38]
00a46848	ldr w8,[x1, #0x3c]
00a4684c	ldr w9,[x1, #0x14]
00a46850	sub w8,w8,w9
00a46854	str w8,[x0, #0x3c]
00a46858	ldr w8,[x1, #0x40]
00a4685c	ldr w9,[x1, #0x18]
00a46860	sub w8,w8,w9
00a46864	str w8,[x0, #0x40]
00a46868	ldr w8,[x1, #0x44]
00a4686c	ldr w9,[x1, #0x1c]
00a46870	sub w8,w8,w9
00a46874	str w8,[x0, #0x44]
00a46878	ldr w8,[x1, #0x48]
00a4687c	ldr w9,[x1, #0x20]
00a46880	sub w8,w8,w9
00a46884	str w8,[x0, #0x48]
00a46888	ldr w8,[x1, #0x4c]
00a4688c	ldr w9,[x1, #0x24]
00a46890	mov x1,x19
00a46894	sub w8,w8,w9
00a46898	str w8,[x0, #0x4c]
00a4689c	add x0,x0,#0x50
00a468a0	bl 0x00a44e38
00a468a4	add x2,x20,#0x28
00a468a8	mov x0,x22
00a468ac	mov x1,x22
00a468b0	bl 0x00a44e38
00a468b4	add x0,x19,#0x78
00a468b8	add x1,x20,#0x78
00a468bc	add x2,x21,#0x78
00a468c0	bl 0x00a44e38
00a468c4	add x1,x21,#0x50
00a468c8	add x2,x20,#0x50
00a468cc	mov x0,x19
00a468d0	bl 0x00a44e38
00a468d4	ldp w8,w9,[x19, #0x50]
00a468d8	ldp w10,w11,[x19, #0x28]
00a468dc	ldp w12,w13,[x19, #0x58]
00a468e0	ldp w14,w15,[x19, #0x30]
00a468e4	ldp w16,w17,[x19, #0x60]
00a468e8	ldp w18,w0,[x19, #0x38]
00a468ec	ldp w1,w2,[x19, #0x68]
00a468f0	ldp w3,w4,[x19, #0x40]
00a468f4	ldp w5,w6,[x19, #0x70]
00a468f8	ldp w7,w20,[x19, #0x48]
00a468fc	sub w21,w8,w10
00a46900	sub w22,w9,w11
00a46904	add w8,w10,w8
00a46908	sub w10,w12,w14
00a4690c	add w9,w11,w9
00a46910	sub w11,w13,w15
00a46914	add w12,w14,w12
00a46918	sub w14,w16,w18
00a4691c	add w13,w15,w13
00a46920	sub w15,w17,w0
00a46924	add w16,w18,w16
00a46928	sub w18,w1,w3
00a4692c	add w17,w0,w17
00a46930	sub w0,w2,w4
00a46934	add w1,w3,w1
00a46938	sub w3,w5,w7
00a4693c	add w2,w4,w2
00a46940	sub w4,w6,w20
00a46944	add w5,w7,w5
00a46948	add w6,w20,w6
00a4694c	ldp w7,w20,[x19]
00a46950	stp w21,w22,[x19]
00a46954	ldp w21,w22,[x19, #0x8]
00a46958	stp w10,w11,[x19, #0x8]
00a4695c	ldp w10,w11,[x19, #0x10]
00a46960	stp w14,w15,[x19, #0x10]
00a46964	ldp w14,w15,[x19, #0x18]
00a46968	stp w18,w0,[x19, #0x18]
00a4696c	ldp w18,w0,[x19, #0x20]
00a46970	stp w3,w4,[x19, #0x20]
00a46974	stp w8,w9,[x19, #0x28]
00a46978	ldp w8,w3,[x19, #0x78]
00a4697c	stp w12,w13,[x19, #0x30]
00a46980	ldp w9,w12,[x19, #0x80]
00a46984	stp w16,w17,[x19, #0x38]
00a46988	ldp w13,w16,[x19, #0x88]
00a4698c	stp w1,w2,[x19, #0x40]
00a46990	ldp w17,w1,[x19, #0x90]
00a46994	ldp w2,w4,[x19, #0x98]
00a46998	stp w5,w6,[x19, #0x48]
00a4699c	lsl w5,w7,#0x1
00a469a0	lsl w7,w20,#0x1
00a469a4	lsl w20,w21,#0x1
00a469a8	lsl w21,w22,#0x1
00a469ac	lsl w10,w10,#0x1
00a469b0	lsl w11,w11,#0x1
00a469b4	lsl w14,w14,#0x1
00a469b8	lsl w15,w15,#0x1
00a469bc	lsl w18,w18,#0x1
00a469c0	lsl w0,w0,#0x1
00a469c4	add w6,w8,w5
00a469c8	sub w8,w5,w8
00a469cc	add w5,w3,w7
00a469d0	sub w3,w7,w3
00a469d4	add w7,w9,w20
00a469d8	sub w9,w20,w9
00a469dc	add w20,w12,w21
00a469e0	sub w12,w21,w12
00a469e4	add w21,w13,w10
00a469e8	sub w10,w10,w13
00a469ec	add w13,w16,w11
00a469f0	sub w11,w11,w16
00a469f4	add w16,w17,w14
00a469f8	sub w14,w14,w17
00a469fc	add w17,w1,w15
00a46a00	sub w15,w15,w1
00a46a04	add w1,w2,w18
00a46a08	sub w18,w18,w2
00a46a0c	add w2,w4,w0
00a46a10	sub w0,w0,w4
00a46a14	stp w6,w5,[x19, #0x50]
00a46a18	stp w7,w20,[x19, #0x58]
00a46a1c	stp w21,w13,[x19, #0x60]
00a46a20	stp w16,w17,[x19, #0x68]
00a46a24	stp w1,w2,[x19, #0x70]
00a46a28	stp w8,w3,[x19, #0x78]
00a46a2c	stp w9,w12,[x19, #0x80]
00a46a30	stp w10,w11,[x19, #0x88]
00a46a34	stp w14,w15,[x19, #0x90]
00a46a38	stp w18,w0,[x19, #0x98]
00a46a3c	ldp x29,x30,[sp, #0x20]
00a46a40	ldp x20,x19,[sp, #0x10]
00a46a44	ldp x22,x21,[sp], #0x30
00a46a48	ret
