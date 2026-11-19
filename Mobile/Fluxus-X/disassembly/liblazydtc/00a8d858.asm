; BF_decrypt @ 00a8d858
00a8d858	ldp w9,w10,[x0]
00a8d85c	ldp w11,w12,[x1, #0x40]
00a8d860	mov w13,#0x100
00a8d864	add x8,x1,#0x48
00a8d868	mov w14,#0x200
00a8d86c	eor w9,w12,w9
00a8d870	eor w10,w11,w10
00a8d874	lsr w11,w9,#0x18
00a8d878	bfxil w13,w9,#0x10,#0x8
00a8d87c	orr w15,wzr,#0x300
00a8d880	bfxil w14,w9,#0x8,#0x8
00a8d884	ldr w11,[x8, w11, UXTW #0x2]
00a8d888	ldr w13,[x8, w13, UXTW #0x2]
00a8d88c	bfxil w15,w9,#0x0,#0x8
00a8d890	ldr w14,[x8, w14, UXTW #0x2]
00a8d894	ldr w15,[x8, w15, UXTW #0x2]
00a8d898	ldp w12,w16,[x1, #0x38]
00a8d89c	add w11,w13,w11
00a8d8a0	eor w11,w11,w14
00a8d8a4	add w11,w11,w15
00a8d8a8	eor w9,w16,w9
00a8d8ac	mov w16,#0x100
00a8d8b0	eor w10,w10,w11
00a8d8b4	mov w13,#0x200
00a8d8b8	orr w14,wzr,#0x300
00a8d8bc	lsr w11,w10,#0x18
00a8d8c0	bfxil w16,w10,#0x10,#0x8
00a8d8c4	bfxil w13,w10,#0x8,#0x8
00a8d8c8	bfxil w14,w10,#0x0,#0x8
00a8d8cc	eor w10,w12,w10
00a8d8d0	ldr w11,[x8, w11, UXTW #0x2]
00a8d8d4	ldr w12,[x8, w16, UXTW #0x2]
00a8d8d8	ldr w13,[x8, w13, UXTW #0x2]
00a8d8dc	ldr w14,[x8, w14, UXTW #0x2]
00a8d8e0	mov w15,#0x100
00a8d8e4	add w11,w12,w11
00a8d8e8	eor w11,w11,w13
00a8d8ec	add w11,w11,w14
00a8d8f0	ldp w13,w14,[x1, #0x30]
00a8d8f4	eor w9,w9,w11
00a8d8f8	mov w16,#0x200
00a8d8fc	orr w12,wzr,#0x300
00a8d900	lsr w11,w9,#0x18
00a8d904	bfxil w15,w9,#0x10,#0x8
00a8d908	bfxil w16,w9,#0x8,#0x8
00a8d90c	bfxil w12,w9,#0x0,#0x8
00a8d910	eor w9,w14,w9
00a8d914	ldr w11,[x8, w11, UXTW #0x2]
00a8d918	ldr w14,[x8, w15, UXTW #0x2]
00a8d91c	ldr w16,[x8, w16, UXTW #0x2]
00a8d920	ldr w12,[x8, w12, UXTW #0x2]
00a8d924	mov w15,#0x100
00a8d928	add w11,w14,w11
00a8d92c	eor w11,w11,w16
00a8d930	add w11,w11,w12
00a8d934	eor w10,w10,w11
00a8d938	mov w14,#0x200
00a8d93c	orr w16,wzr,#0x300
00a8d940	lsr w11,w10,#0x18
00a8d944	bfxil w15,w10,#0x10,#0x8
00a8d948	bfxil w14,w10,#0x8,#0x8
00a8d94c	bfxil w16,w10,#0x0,#0x8
00a8d950	eor w10,w13,w10
00a8d954	ldr w11,[x8, w11, UXTW #0x2]
00a8d958	ldr w13,[x8, w15, UXTW #0x2]
00a8d95c	ldr w14,[x8, w14, UXTW #0x2]
00a8d960	ldr w16,[x8, w16, UXTW #0x2]
00a8d964	mov w12,#0x100
00a8d968	add w11,w13,w11
00a8d96c	eor w11,w11,w14
00a8d970	add w11,w11,w16
00a8d974	eor w9,w9,w11
00a8d978	mov w15,#0x200
00a8d97c	lsr w11,w9,#0x18
00a8d980	bfxil w12,w9,#0x10,#0x8
00a8d984	orr w13,wzr,#0x300
00a8d988	bfxil w15,w9,#0x8,#0x8
00a8d98c	ldr w11,[x8, w11, UXTW #0x2]
00a8d990	ldr w12,[x8, w12, UXTW #0x2]
00a8d994	bfxil w13,w9,#0x0,#0x8
00a8d998	ldr w15,[x8, w15, UXTW #0x2]
00a8d99c	ldr w13,[x8, w13, UXTW #0x2]
00a8d9a0	ldp w14,w16,[x1, #0x28]
00a8d9a4	add w11,w12,w11
00a8d9a8	eor w11,w11,w15
00a8d9ac	add w11,w11,w13
00a8d9b0	eor w9,w16,w9
00a8d9b4	mov w16,#0x100
00a8d9b8	eor w10,w10,w11
00a8d9bc	mov w12,#0x200
00a8d9c0	orr w15,wzr,#0x300
00a8d9c4	lsr w11,w10,#0x18
00a8d9c8	bfxil w16,w10,#0x10,#0x8
00a8d9cc	bfxil w12,w10,#0x8,#0x8
00a8d9d0	bfxil w15,w10,#0x0,#0x8
00a8d9d4	eor w10,w14,w10
00a8d9d8	ldr w11,[x8, w11, UXTW #0x2]
00a8d9dc	ldr w14,[x8, w16, UXTW #0x2]
00a8d9e0	ldr w12,[x8, w12, UXTW #0x2]
00a8d9e4	ldr w15,[x8, w15, UXTW #0x2]
00a8d9e8	mov w13,#0x100
00a8d9ec	add w11,w14,w11
00a8d9f0	eor w11,w11,w12
00a8d9f4	add w11,w11,w15
00a8d9f8	eor w9,w9,w11
00a8d9fc	mov w16,#0x200
00a8da00	lsr w11,w9,#0x18
00a8da04	bfxil w13,w9,#0x10,#0x8
00a8da08	orr w14,wzr,#0x300
00a8da0c	bfxil w16,w9,#0x8,#0x8
00a8da10	ldr w11,[x8, w11, UXTW #0x2]
00a8da14	ldr w13,[x8, w13, UXTW #0x2]
00a8da18	bfxil w14,w9,#0x0,#0x8
00a8da1c	ldr w16,[x8, w16, UXTW #0x2]
00a8da20	ldr w14,[x8, w14, UXTW #0x2]
00a8da24	ldp w12,w15,[x1, #0x20]
00a8da28	add w11,w13,w11
00a8da2c	eor w11,w11,w16
00a8da30	add w11,w11,w14
00a8da34	eor w9,w15,w9
00a8da38	mov w15,#0x100
00a8da3c	eor w10,w10,w11
00a8da40	mov w13,#0x200
00a8da44	orr w16,wzr,#0x300
00a8da48	lsr w11,w10,#0x18
00a8da4c	bfxil w15,w10,#0x10,#0x8
00a8da50	bfxil w13,w10,#0x8,#0x8
00a8da54	bfxil w16,w10,#0x0,#0x8
00a8da58	eor w10,w12,w10
00a8da5c	ldr w11,[x8, w11, UXTW #0x2]
00a8da60	ldr w12,[x8, w15, UXTW #0x2]
00a8da64	ldr w13,[x8, w13, UXTW #0x2]
00a8da68	ldr w16,[x8, w16, UXTW #0x2]
00a8da6c	mov w14,#0x100
00a8da70	add w11,w12,w11
00a8da74	eor w11,w11,w13
00a8da78	add w11,w11,w16
00a8da7c	eor w9,w9,w11
00a8da80	mov w15,#0x200
00a8da84	lsr w11,w9,#0x18
00a8da88	bfxil w14,w9,#0x10,#0x8
00a8da8c	orr w12,wzr,#0x300
00a8da90	bfxil w15,w9,#0x8,#0x8
00a8da94	ldr w11,[x8, w11, UXTW #0x2]
00a8da98	ldr w14,[x8, w14, UXTW #0x2]
00a8da9c	bfxil w12,w9,#0x0,#0x8
00a8daa0	ldr w15,[x8, w15, UXTW #0x2]
00a8daa4	ldr w12,[x8, w12, UXTW #0x2]
00a8daa8	ldp w13,w16,[x1, #0x18]
00a8daac	add w11,w14,w11
00a8dab0	eor w11,w11,w15
00a8dab4	add w11,w11,w12
00a8dab8	eor w9,w16,w9
00a8dabc	mov w16,#0x100
00a8dac0	eor w10,w10,w11
00a8dac4	mov w14,#0x200
00a8dac8	orr w15,wzr,#0x300
00a8dacc	lsr w11,w10,#0x18
00a8dad0	bfxil w16,w10,#0x10,#0x8
00a8dad4	bfxil w14,w10,#0x8,#0x8
00a8dad8	bfxil w15,w10,#0x0,#0x8
00a8dadc	eor w10,w13,w10
00a8dae0	ldr w11,[x8, w11, UXTW #0x2]
00a8dae4	ldr w13,[x8, w16, UXTW #0x2]
00a8dae8	ldr w14,[x8, w14, UXTW #0x2]
00a8daec	ldr w15,[x8, w15, UXTW #0x2]
00a8daf0	mov w12,#0x100
00a8daf4	add w11,w13,w11
00a8daf8	eor w11,w11,w14
00a8dafc	add w11,w11,w15
00a8db00	eor w9,w9,w11
00a8db04	mov w16,#0x200
00a8db08	lsr w11,w9,#0x18
00a8db0c	bfxil w12,w9,#0x10,#0x8
00a8db10	orr w13,wzr,#0x300
00a8db14	bfxil w16,w9,#0x8,#0x8
00a8db18	ldr w11,[x8, w11, UXTW #0x2]
00a8db1c	ldr w12,[x8, w12, UXTW #0x2]
00a8db20	bfxil w13,w9,#0x0,#0x8
00a8db24	ldr w16,[x8, w16, UXTW #0x2]
00a8db28	ldr w13,[x8, w13, UXTW #0x2]
00a8db2c	ldp w14,w15,[x1, #0x10]
00a8db30	add w11,w12,w11
00a8db34	eor w11,w11,w16
00a8db38	add w11,w11,w13
00a8db3c	eor w9,w15,w9
00a8db40	mov w15,#0x100
00a8db44	eor w10,w10,w11
00a8db48	mov w12,#0x200
00a8db4c	orr w16,wzr,#0x300
00a8db50	lsr w11,w10,#0x18
00a8db54	bfxil w15,w10,#0x10,#0x8
00a8db58	bfxil w12,w10,#0x8,#0x8
00a8db5c	bfxil w16,w10,#0x0,#0x8
00a8db60	eor w10,w14,w10
00a8db64	ldr w11,[x8, w11, UXTW #0x2]
00a8db68	ldr w14,[x8, w15, UXTW #0x2]
00a8db6c	ldr w12,[x8, w12, UXTW #0x2]
00a8db70	ldr w16,[x8, w16, UXTW #0x2]
00a8db74	mov w13,#0x100
00a8db78	add w11,w14,w11
00a8db7c	eor w11,w11,w12
00a8db80	add w11,w11,w16
00a8db84	eor w9,w9,w11
00a8db88	mov w15,#0x200
00a8db8c	lsr w11,w9,#0x18
00a8db90	bfxil w13,w9,#0x10,#0x8
00a8db94	orr w14,wzr,#0x300
00a8db98	bfxil w15,w9,#0x8,#0x8
00a8db9c	ldr w11,[x8, w11, UXTW #0x2]
00a8dba0	ldr w13,[x8, w13, UXTW #0x2]
00a8dba4	bfxil w14,w9,#0x0,#0x8
00a8dba8	ldr w15,[x8, w15, UXTW #0x2]
00a8dbac	ldr w14,[x8, w14, UXTW #0x2]
00a8dbb0	add w11,w13,w11
00a8dbb4	ldp w12,w16,[x1, #0x8]
00a8dbb8	eor w11,w11,w15
00a8dbbc	add w11,w11,w14
00a8dbc0	mov w13,#0x100
00a8dbc4	eor w10,w10,w11
00a8dbc8	mov w15,#0x200
00a8dbcc	orr w14,wzr,#0x300
00a8dbd0	lsr w11,w10,#0x18
00a8dbd4	bfxil w13,w10,#0x10,#0x8
00a8dbd8	bfxil w15,w10,#0x8,#0x8
00a8dbdc	bfxil w14,w10,#0x0,#0x8
00a8dbe0	eor w10,w12,w10
00a8dbe4	ldr w11,[x8, w11, UXTW #0x2]
00a8dbe8	ldr w12,[x8, w13, UXTW #0x2]
00a8dbec	ldr w15,[x8, w15, UXTW #0x2]
00a8dbf0	ldr w14,[x8, w14, UXTW #0x2]
00a8dbf4	eor w9,w16,w9
00a8dbf8	add w11,w12,w11
00a8dbfc	eor w11,w11,w15
00a8dc00	add w11,w11,w14
00a8dc04	mov w13,#0x100
00a8dc08	eor w9,w9,w11
00a8dc0c	mov w12,#0x200
00a8dc10	lsr w11,w9,#0x18
00a8dc14	bfxil w13,w9,#0x10,#0x8
00a8dc18	orr w15,wzr,#0x300
00a8dc1c	bfxil w12,w9,#0x8,#0x8
00a8dc20	ldr w11,[x8, w11, UXTW #0x2]
00a8dc24	ldr w13,[x8, w13, UXTW #0x2]
00a8dc28	bfxil w15,w9,#0x0,#0x8
00a8dc2c	ldr w12,[x8, w12, UXTW #0x2]
00a8dc30	ldr w15,[x8, w15, UXTW #0x2]
00a8dc34	ldp w14,w16,[x1]
00a8dc38	add w11,w13,w11
00a8dc3c	eor w11,w11,w12
00a8dc40	add w11,w11,w15
00a8dc44	eor w9,w16,w9
00a8dc48	mov w16,#0x100
00a8dc4c	eor w10,w10,w11
00a8dc50	mov w13,#0x200
00a8dc54	lsr w11,w10,#0x18
00a8dc58	bfxil w16,w10,#0x10,#0x8
00a8dc5c	orr w12,wzr,#0x300
00a8dc60	bfxil w13,w10,#0x8,#0x8
00a8dc64	ldr w11,[x8, w11, UXTW #0x2]
00a8dc68	ldr w15,[x8, w16, UXTW #0x2]
00a8dc6c	bfxil w12,w10,#0x0,#0x8
00a8dc70	ldr w13,[x8, w13, UXTW #0x2]
00a8dc74	ldr w8,[x8, w12, UXTW #0x2]
00a8dc78	add w11,w15,w11
00a8dc7c	eor w10,w14,w10
00a8dc80	eor w11,w11,w13
00a8dc84	add w8,w11,w8
00a8dc88	eor w8,w9,w8
00a8dc8c	stp w10,w8,[x0]
00a8dc90	ret
