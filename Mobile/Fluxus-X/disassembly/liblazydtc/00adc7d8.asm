; SEED_encrypt @ 00adc7d8
00adc7d8	ldp w12,w13,[x0, #0x8]
00adc7dc	ldp w14,w15,[x2]
00adc7e0	adrp x8,0x774000
00adc7e4	add x8,x8,#0xae8
00adc7e8	rev w12,w12
00adc7ec	eor w14,w14,w12
00adc7f0	rev w13,w13
00adc7f4	eor w15,w14,w15
00adc7f8	eor w15,w15,w13
00adc7fc	add x9,x8,#0x400
00adc800	and w16,w15,#0xff
00adc804	ubfx w17,w15,#0x8,#0x8
00adc808	add x10,x8,#0x800
00adc80c	ubfx w18,w15,#0x10,#0x8
00adc810	ldr w16,[x8, w16, UXTW #0x2]
00adc814	ldr w17,[x9, w17, UXTW #0x2]
00adc818	add x11,x8,#0xc00
00adc81c	lsr w15,w15,#0x18
00adc820	ldr w18,[x10, w18, UXTW #0x2]
00adc824	ldr w15,[x11, w15, UXTW #0x2]
00adc828	eor w16,w17,w16
00adc82c	ldp w3,w0,[x0]
00adc830	eor w16,w16,w18
00adc834	eor w15,w16,w15
00adc838	add w14,w15,w14
00adc83c	and w16,w14,#0xff
00adc840	ubfx w17,w14,#0x8,#0x8
00adc844	ubfx w18,w14,#0x10,#0x8
00adc848	ldr w16,[x8, w16, UXTW #0x2]
00adc84c	ldr w17,[x9, w17, UXTW #0x2]
00adc850	lsr w14,w14,#0x18
00adc854	ldr w18,[x10, w18, UXTW #0x2]
00adc858	ldr w14,[x11, w14, UXTW #0x2]
00adc85c	eor w16,w17,w16
00adc860	rev w3,w3
00adc864	eor w16,w16,w18
00adc868	eor w14,w16,w14
00adc86c	add w15,w14,w15
00adc870	and w16,w15,#0xff
00adc874	ubfx w17,w15,#0x8,#0x8
00adc878	ubfx w18,w15,#0x10,#0x8
00adc87c	ldr w16,[x8, w16, UXTW #0x2]
00adc880	ldr w17,[x9, w17, UXTW #0x2]
00adc884	ldr w18,[x10, w18, UXTW #0x2]
00adc888	lsr w15,w15,#0x18
00adc88c	ldr w15,[x11, w15, UXTW #0x2]
00adc890	eor w16,w17,w16
00adc894	eor w16,w16,w18
00adc898	ldp w17,w18,[x2, #0x8]
00adc89c	eor w15,w16,w15
00adc8a0	rev w0,w0
00adc8a4	add w14,w15,w14
00adc8a8	eor w15,w15,w0
00adc8ac	eor w14,w14,w3
00adc8b0	eor w16,w15,w18
00adc8b4	eor w17,w14,w17
00adc8b8	eor w16,w16,w17
00adc8bc	and w18,w16,#0xff
00adc8c0	ubfx w0,w16,#0x8,#0x8
00adc8c4	ubfx w3,w16,#0x10,#0x8
00adc8c8	ldr w18,[x8, w18, UXTW #0x2]
00adc8cc	ldr w0,[x9, w0, UXTW #0x2]
00adc8d0	lsr w16,w16,#0x18
00adc8d4	ldr w3,[x10, w3, UXTW #0x2]
00adc8d8	ldr w16,[x11, w16, UXTW #0x2]
00adc8dc	eor w18,w0,w18
00adc8e0	eor w18,w18,w3
00adc8e4	eor w16,w18,w16
00adc8e8	add w17,w16,w17
00adc8ec	and w18,w17,#0xff
00adc8f0	ubfx w0,w17,#0x8,#0x8
00adc8f4	ubfx w3,w17,#0x10,#0x8
00adc8f8	ldr w18,[x8, w18, UXTW #0x2]
00adc8fc	ldr w0,[x9, w0, UXTW #0x2]
00adc900	lsr w17,w17,#0x18
00adc904	ldr w3,[x10, w3, UXTW #0x2]
00adc908	ldr w17,[x11, w17, UXTW #0x2]
00adc90c	eor w18,w0,w18
00adc910	eor w18,w18,w3
00adc914	eor w17,w18,w17
00adc918	add w16,w17,w16
00adc91c	and w18,w16,#0xff
00adc920	ubfx w0,w16,#0x8,#0x8
00adc924	ubfx w3,w16,#0x10,#0x8
00adc928	ldr w18,[x8, w18, UXTW #0x2]
00adc92c	ldr w0,[x9, w0, UXTW #0x2]
00adc930	ldr w3,[x10, w3, UXTW #0x2]
00adc934	lsr w16,w16,#0x18
00adc938	ldr w16,[x11, w16, UXTW #0x2]
00adc93c	eor w18,w0,w18
00adc940	eor w18,w18,w3
00adc944	ldp w0,w3,[x2, #0x10]
00adc948	eor w16,w18,w16
00adc94c	add w17,w16,w17
00adc950	eor w13,w16,w13
00adc954	eor w12,w17,w12
00adc958	eor w16,w13,w3
00adc95c	eor w17,w12,w0
00adc960	eor w16,w16,w17
00adc964	and w18,w16,#0xff
00adc968	ubfx w0,w16,#0x8,#0x8
00adc96c	ubfx w3,w16,#0x10,#0x8
00adc970	ldr w18,[x8, w18, UXTW #0x2]
00adc974	ldr w0,[x9, w0, UXTW #0x2]
00adc978	lsr w16,w16,#0x18
00adc97c	ldr w3,[x10, w3, UXTW #0x2]
00adc980	ldr w16,[x11, w16, UXTW #0x2]
00adc984	eor w18,w0,w18
00adc988	eor w18,w18,w3
00adc98c	eor w16,w18,w16
00adc990	add w17,w16,w17
00adc994	and w18,w17,#0xff
00adc998	ubfx w0,w17,#0x8,#0x8
00adc99c	ubfx w3,w17,#0x10,#0x8
00adc9a0	ldr w18,[x8, w18, UXTW #0x2]
00adc9a4	ldr w0,[x9, w0, UXTW #0x2]
00adc9a8	lsr w17,w17,#0x18
00adc9ac	ldr w3,[x10, w3, UXTW #0x2]
00adc9b0	ldr w17,[x11, w17, UXTW #0x2]
00adc9b4	eor w18,w0,w18
00adc9b8	eor w18,w18,w3
00adc9bc	eor w17,w18,w17
00adc9c0	add w16,w17,w16
00adc9c4	and w18,w16,#0xff
00adc9c8	ubfx w0,w16,#0x8,#0x8
00adc9cc	ubfx w3,w16,#0x10,#0x8
00adc9d0	ldr w18,[x8, w18, UXTW #0x2]
00adc9d4	ldr w0,[x9, w0, UXTW #0x2]
00adc9d8	ldr w3,[x10, w3, UXTW #0x2]
00adc9dc	lsr w16,w16,#0x18
00adc9e0	ldr w16,[x11, w16, UXTW #0x2]
00adc9e4	eor w18,w0,w18
00adc9e8	eor w18,w18,w3
00adc9ec	ldp w0,w3,[x2, #0x18]
00adc9f0	eor w16,w18,w16
00adc9f4	add w17,w16,w17
00adc9f8	eor w15,w16,w15
00adc9fc	eor w14,w17,w14
00adca00	eor w16,w15,w3
00adca04	eor w17,w14,w0
00adca08	eor w16,w16,w17
00adca0c	and w18,w16,#0xff
00adca10	ubfx w0,w16,#0x8,#0x8
00adca14	ubfx w3,w16,#0x10,#0x8
00adca18	ldr w18,[x8, w18, UXTW #0x2]
00adca1c	ldr w0,[x9, w0, UXTW #0x2]
00adca20	lsr w16,w16,#0x18
00adca24	ldr w3,[x10, w3, UXTW #0x2]
00adca28	ldr w16,[x11, w16, UXTW #0x2]
00adca2c	eor w18,w0,w18
00adca30	eor w18,w18,w3
00adca34	eor w16,w18,w16
00adca38	add w17,w16,w17
00adca3c	and w18,w17,#0xff
00adca40	ubfx w0,w17,#0x8,#0x8
00adca44	ubfx w3,w17,#0x10,#0x8
00adca48	ldr w18,[x8, w18, UXTW #0x2]
00adca4c	ldr w0,[x9, w0, UXTW #0x2]
00adca50	lsr w17,w17,#0x18
00adca54	ldr w3,[x10, w3, UXTW #0x2]
00adca58	ldr w17,[x11, w17, UXTW #0x2]
00adca5c	eor w18,w0,w18
00adca60	eor w18,w18,w3
00adca64	eor w17,w18,w17
00adca68	add w16,w17,w16
00adca6c	and w18,w16,#0xff
00adca70	ubfx w0,w16,#0x8,#0x8
00adca74	ubfx w3,w16,#0x10,#0x8
00adca78	ldr w18,[x8, w18, UXTW #0x2]
00adca7c	ldr w0,[x9, w0, UXTW #0x2]
00adca80	ldr w3,[x10, w3, UXTW #0x2]
00adca84	lsr w16,w16,#0x18
00adca88	ldr w16,[x11, w16, UXTW #0x2]
00adca8c	eor w18,w0,w18
00adca90	eor w18,w18,w3
00adca94	ldp w0,w3,[x2, #0x20]
00adca98	eor w16,w18,w16
00adca9c	add w17,w16,w17
00adcaa0	eor w13,w16,w13
00adcaa4	eor w12,w17,w12
00adcaa8	eor w16,w13,w3
00adcaac	eor w17,w12,w0
00adcab0	eor w16,w16,w17
00adcab4	and w18,w16,#0xff
00adcab8	ubfx w0,w16,#0x8,#0x8
00adcabc	ubfx w3,w16,#0x10,#0x8
00adcac0	ldr w18,[x8, w18, UXTW #0x2]
00adcac4	ldr w0,[x9, w0, UXTW #0x2]
00adcac8	lsr w16,w16,#0x18
00adcacc	ldr w3,[x10, w3, UXTW #0x2]
00adcad0	ldr w16,[x11, w16, UXTW #0x2]
00adcad4	eor w18,w0,w18
00adcad8	eor w18,w18,w3
00adcadc	eor w16,w18,w16
00adcae0	add w17,w16,w17
00adcae4	and w18,w17,#0xff
00adcae8	ubfx w0,w17,#0x8,#0x8
00adcaec	ubfx w3,w17,#0x10,#0x8
00adcaf0	ldr w18,[x8, w18, UXTW #0x2]
00adcaf4	ldr w0,[x9, w0, UXTW #0x2]
00adcaf8	lsr w17,w17,#0x18
00adcafc	ldr w3,[x10, w3, UXTW #0x2]
00adcb00	ldr w17,[x11, w17, UXTW #0x2]
00adcb04	eor w18,w0,w18
00adcb08	eor w18,w18,w3
00adcb0c	eor w17,w18,w17
00adcb10	add w16,w17,w16
00adcb14	and w18,w16,#0xff
00adcb18	ubfx w0,w16,#0x8,#0x8
00adcb1c	ubfx w3,w16,#0x10,#0x8
00adcb20	ldr w18,[x8, w18, UXTW #0x2]
00adcb24	ldr w0,[x9, w0, UXTW #0x2]
00adcb28	ldr w3,[x10, w3, UXTW #0x2]
00adcb2c	lsr w16,w16,#0x18
00adcb30	ldr w16,[x11, w16, UXTW #0x2]
00adcb34	eor w18,w0,w18
00adcb38	eor w18,w18,w3
00adcb3c	ldp w0,w3,[x2, #0x28]
00adcb40	eor w16,w18,w16
00adcb44	add w17,w16,w17
00adcb48	eor w15,w16,w15
00adcb4c	eor w14,w17,w14
00adcb50	eor w16,w15,w3
00adcb54	eor w17,w14,w0
00adcb58	eor w16,w16,w17
00adcb5c	and w18,w16,#0xff
00adcb60	ubfx w0,w16,#0x8,#0x8
00adcb64	ubfx w3,w16,#0x10,#0x8
00adcb68	ldr w18,[x8, w18, UXTW #0x2]
00adcb6c	ldr w0,[x9, w0, UXTW #0x2]
00adcb70	lsr w16,w16,#0x18
00adcb74	ldr w3,[x10, w3, UXTW #0x2]
00adcb78	ldr w16,[x11, w16, UXTW #0x2]
00adcb7c	eor w18,w0,w18
00adcb80	eor w18,w18,w3
00adcb84	eor w16,w18,w16
00adcb88	add w17,w16,w17
00adcb8c	and w18,w17,#0xff
00adcb90	ubfx w0,w17,#0x8,#0x8
00adcb94	ubfx w3,w17,#0x10,#0x8
00adcb98	ldr w18,[x8, w18, UXTW #0x2]
00adcb9c	ldr w0,[x9, w0, UXTW #0x2]
00adcba0	lsr w17,w17,#0x18
00adcba4	ldr w3,[x10, w3, UXTW #0x2]
00adcba8	ldr w17,[x11, w17, UXTW #0x2]
00adcbac	eor w18,w0,w18
00adcbb0	eor w18,w18,w3
00adcbb4	eor w17,w18,w17
00adcbb8	add w16,w17,w16
00adcbbc	and w18,w16,#0xff
00adcbc0	ubfx w0,w16,#0x8,#0x8
00adcbc4	ubfx w3,w16,#0x10,#0x8
00adcbc8	ldr w18,[x8, w18, UXTW #0x2]
00adcbcc	ldr w0,[x9, w0, UXTW #0x2]
00adcbd0	ldr w3,[x10, w3, UXTW #0x2]
00adcbd4	lsr w16,w16,#0x18
00adcbd8	ldr w16,[x11, w16, UXTW #0x2]
00adcbdc	eor w18,w0,w18
00adcbe0	eor w18,w18,w3
00adcbe4	ldp w0,w3,[x2, #0x30]
00adcbe8	eor w16,w18,w16
00adcbec	add w17,w16,w17
00adcbf0	eor w13,w16,w13
00adcbf4	eor w12,w17,w12
00adcbf8	eor w16,w13,w3
00adcbfc	eor w17,w12,w0
00adcc00	eor w16,w16,w17
00adcc04	and w18,w16,#0xff
00adcc08	ubfx w0,w16,#0x8,#0x8
00adcc0c	ubfx w3,w16,#0x10,#0x8
00adcc10	ldr w18,[x8, w18, UXTW #0x2]
00adcc14	ldr w0,[x9, w0, UXTW #0x2]
00adcc18	lsr w16,w16,#0x18
00adcc1c	ldr w3,[x10, w3, UXTW #0x2]
00adcc20	ldr w16,[x11, w16, UXTW #0x2]
00adcc24	eor w18,w0,w18
00adcc28	eor w18,w18,w3
00adcc2c	eor w16,w18,w16
00adcc30	add w17,w16,w17
00adcc34	and w18,w17,#0xff
00adcc38	ubfx w0,w17,#0x8,#0x8
00adcc3c	ubfx w3,w17,#0x10,#0x8
00adcc40	ldr w18,[x8, w18, UXTW #0x2]
00adcc44	ldr w0,[x9, w0, UXTW #0x2]
00adcc48	lsr w17,w17,#0x18
00adcc4c	ldr w3,[x10, w3, UXTW #0x2]
00adcc50	ldr w17,[x11, w17, UXTW #0x2]
00adcc54	eor w18,w0,w18
00adcc58	eor w18,w18,w3
00adcc5c	eor w17,w18,w17
00adcc60	add w16,w17,w16
00adcc64	and w18,w16,#0xff
00adcc68	ubfx w0,w16,#0x8,#0x8
00adcc6c	ubfx w3,w16,#0x10,#0x8
00adcc70	ldr w18,[x8, w18, UXTW #0x2]
00adcc74	ldr w0,[x9, w0, UXTW #0x2]
00adcc78	ldr w3,[x10, w3, UXTW #0x2]
00adcc7c	lsr w16,w16,#0x18
00adcc80	ldr w16,[x11, w16, UXTW #0x2]
00adcc84	eor w18,w0,w18
00adcc88	eor w18,w18,w3
00adcc8c	ldp w0,w3,[x2, #0x38]
00adcc90	eor w16,w18,w16
00adcc94	add w17,w16,w17
00adcc98	eor w15,w16,w15
00adcc9c	eor w14,w17,w14
00adcca0	eor w16,w15,w3
00adcca4	eor w17,w14,w0
00adcca8	eor w16,w16,w17
00adccac	and w18,w16,#0xff
00adccb0	ubfx w0,w16,#0x8,#0x8
00adccb4	ubfx w3,w16,#0x10,#0x8
00adccb8	ldr w18,[x8, w18, UXTW #0x2]
00adccbc	ldr w0,[x9, w0, UXTW #0x2]
00adccc0	lsr w16,w16,#0x18
00adccc4	ldr w3,[x10, w3, UXTW #0x2]
00adccc8	ldr w16,[x11, w16, UXTW #0x2]
00adcccc	eor w18,w0,w18
00adccd0	eor w18,w18,w3
00adccd4	eor w16,w18,w16
00adccd8	add w17,w16,w17
00adccdc	and w18,w17,#0xff
00adcce0	ubfx w0,w17,#0x8,#0x8
00adcce4	ubfx w3,w17,#0x10,#0x8
00adcce8	ldr w18,[x8, w18, UXTW #0x2]
00adccec	ldr w0,[x9, w0, UXTW #0x2]
00adccf0	lsr w17,w17,#0x18
00adccf4	ldr w3,[x10, w3, UXTW #0x2]
00adccf8	ldr w17,[x11, w17, UXTW #0x2]
00adccfc	eor w18,w0,w18
00adcd00	eor w18,w18,w3
00adcd04	eor w17,w18,w17
00adcd08	add w16,w17,w16
00adcd0c	and w18,w16,#0xff
00adcd10	ubfx w0,w16,#0x8,#0x8
00adcd14	ubfx w3,w16,#0x10,#0x8
00adcd18	ldr w18,[x8, w18, UXTW #0x2]
00adcd1c	ldr w0,[x9, w0, UXTW #0x2]
00adcd20	ldr w3,[x10, w3, UXTW #0x2]
00adcd24	lsr w16,w16,#0x18
00adcd28	ldr w16,[x11, w16, UXTW #0x2]
00adcd2c	eor w18,w0,w18
00adcd30	eor w18,w18,w3
00adcd34	ldp w0,w3,[x2, #0x40]
00adcd38	eor w16,w18,w16
00adcd3c	add w17,w16,w17
00adcd40	eor w13,w16,w13
00adcd44	eor w12,w17,w12
00adcd48	eor w16,w13,w3
00adcd4c	eor w17,w12,w0
00adcd50	eor w16,w16,w17
00adcd54	and w18,w16,#0xff
00adcd58	ubfx w0,w16,#0x8,#0x8
00adcd5c	ubfx w3,w16,#0x10,#0x8
00adcd60	ldr w18,[x8, w18, UXTW #0x2]
00adcd64	ldr w0,[x9, w0, UXTW #0x2]
00adcd68	lsr w16,w16,#0x18
00adcd6c	ldr w3,[x10, w3, UXTW #0x2]
00adcd70	ldr w16,[x11, w16, UXTW #0x2]
00adcd74	eor w18,w0,w18
00adcd78	eor w18,w18,w3
00adcd7c	eor w16,w18,w16
00adcd80	add w17,w16,w17
00adcd84	and w18,w17,#0xff
00adcd88	ubfx w0,w17,#0x8,#0x8
00adcd8c	ubfx w3,w17,#0x10,#0x8
00adcd90	ldr w18,[x8, w18, UXTW #0x2]
00adcd94	ldr w0,[x9, w0, UXTW #0x2]
00adcd98	lsr w17,w17,#0x18
00adcd9c	ldr w3,[x10, w3, UXTW #0x2]
00adcda0	ldr w17,[x11, w17, UXTW #0x2]
00adcda4	eor w18,w0,w18
00adcda8	eor w18,w18,w3
00adcdac	eor w17,w18,w17
00adcdb0	add w16,w17,w16
00adcdb4	and w18,w16,#0xff
00adcdb8	ubfx w0,w16,#0x8,#0x8
00adcdbc	ubfx w3,w16,#0x10,#0x8
00adcdc0	ldr w18,[x8, w18, UXTW #0x2]
00adcdc4	ldr w0,[x9, w0, UXTW #0x2]
00adcdc8	ldr w3,[x10, w3, UXTW #0x2]
00adcdcc	lsr w16,w16,#0x18
00adcdd0	ldr w16,[x11, w16, UXTW #0x2]
00adcdd4	eor w18,w0,w18
00adcdd8	eor w18,w18,w3
00adcddc	ldp w0,w3,[x2, #0x48]
00adcde0	eor w16,w18,w16
00adcde4	add w17,w16,w17
00adcde8	eor w15,w16,w15
00adcdec	eor w14,w17,w14
00adcdf0	eor w16,w15,w3
00adcdf4	eor w17,w14,w0
00adcdf8	eor w16,w16,w17
00adcdfc	and w18,w16,#0xff
00adce00	ubfx w0,w16,#0x8,#0x8
00adce04	ubfx w3,w16,#0x10,#0x8
00adce08	ldr w18,[x8, w18, UXTW #0x2]
00adce0c	ldr w0,[x9, w0, UXTW #0x2]
00adce10	lsr w16,w16,#0x18
00adce14	ldr w3,[x10, w3, UXTW #0x2]
00adce18	ldr w16,[x11, w16, UXTW #0x2]
00adce1c	eor w18,w0,w18
00adce20	eor w18,w18,w3
00adce24	eor w16,w18,w16
00adce28	add w17,w16,w17
00adce2c	and w18,w17,#0xff
00adce30	ubfx w0,w17,#0x8,#0x8
00adce34	ubfx w3,w17,#0x10,#0x8
00adce38	ldr w18,[x8, w18, UXTW #0x2]
00adce3c	ldr w0,[x9, w0, UXTW #0x2]
00adce40	lsr w17,w17,#0x18
00adce44	ldr w3,[x10, w3, UXTW #0x2]
00adce48	ldr w17,[x11, w17, UXTW #0x2]
00adce4c	eor w18,w0,w18
00adce50	eor w18,w18,w3
00adce54	eor w17,w18,w17
00adce58	add w16,w17,w16
00adce5c	and w18,w16,#0xff
00adce60	ubfx w0,w16,#0x8,#0x8
00adce64	ubfx w3,w16,#0x10,#0x8
00adce68	ldr w18,[x8, w18, UXTW #0x2]
00adce6c	ldr w0,[x9, w0, UXTW #0x2]
00adce70	ldr w3,[x10, w3, UXTW #0x2]
00adce74	lsr w16,w16,#0x18
00adce78	ldr w16,[x11, w16, UXTW #0x2]
00adce7c	eor w18,w0,w18
00adce80	eor w18,w18,w3
00adce84	ldp w0,w3,[x2, #0x50]
00adce88	eor w16,w18,w16
00adce8c	add w17,w16,w17
00adce90	eor w13,w16,w13
00adce94	eor w12,w17,w12
00adce98	eor w16,w13,w3
00adce9c	eor w17,w12,w0
00adcea0	eor w16,w16,w17
00adcea4	and w18,w16,#0xff
00adcea8	ubfx w0,w16,#0x8,#0x8
00adceac	ubfx w3,w16,#0x10,#0x8
00adceb0	ldr w18,[x8, w18, UXTW #0x2]
00adceb4	ldr w0,[x9, w0, UXTW #0x2]
00adceb8	lsr w16,w16,#0x18
00adcebc	ldr w3,[x10, w3, UXTW #0x2]
00adcec0	ldr w16,[x11, w16, UXTW #0x2]
00adcec4	eor w18,w0,w18
00adcec8	eor w18,w18,w3
00adcecc	eor w16,w18,w16
00adced0	add w17,w16,w17
00adced4	and w18,w17,#0xff
00adced8	ubfx w0,w17,#0x8,#0x8
00adcedc	ubfx w3,w17,#0x10,#0x8
00adcee0	ldr w18,[x8, w18, UXTW #0x2]
00adcee4	ldr w0,[x9, w0, UXTW #0x2]
00adcee8	lsr w17,w17,#0x18
00adceec	ldr w3,[x10, w3, UXTW #0x2]
00adcef0	ldr w17,[x11, w17, UXTW #0x2]
00adcef4	eor w18,w0,w18
00adcef8	eor w18,w18,w3
00adcefc	eor w17,w18,w17
00adcf00	add w16,w17,w16
00adcf04	and w18,w16,#0xff
00adcf08	ubfx w0,w16,#0x8,#0x8
00adcf0c	ubfx w3,w16,#0x10,#0x8
00adcf10	ldr w18,[x8, w18, UXTW #0x2]
00adcf14	ldr w0,[x9, w0, UXTW #0x2]
00adcf18	ldr w3,[x10, w3, UXTW #0x2]
00adcf1c	lsr w16,w16,#0x18
00adcf20	ldr w16,[x11, w16, UXTW #0x2]
00adcf24	eor w18,w0,w18
00adcf28	eor w18,w18,w3
00adcf2c	ldp w0,w3,[x2, #0x58]
00adcf30	eor w16,w18,w16
00adcf34	add w17,w16,w17
00adcf38	eor w15,w16,w15
00adcf3c	eor w14,w17,w14
00adcf40	eor w16,w15,w3
00adcf44	eor w17,w14,w0
00adcf48	eor w16,w16,w17
00adcf4c	and w18,w16,#0xff
00adcf50	ubfx w0,w16,#0x8,#0x8
00adcf54	ubfx w3,w16,#0x10,#0x8
00adcf58	ldr w18,[x8, w18, UXTW #0x2]
00adcf5c	ldr w0,[x9, w0, UXTW #0x2]
00adcf60	lsr w16,w16,#0x18
00adcf64	ldr w3,[x10, w3, UXTW #0x2]
00adcf68	ldr w16,[x11, w16, UXTW #0x2]
00adcf6c	eor w18,w0,w18
00adcf70	eor w18,w18,w3
00adcf74	eor w16,w18,w16
00adcf78	add w17,w16,w17
00adcf7c	and w18,w17,#0xff
00adcf80	ubfx w0,w17,#0x8,#0x8
00adcf84	ubfx w3,w17,#0x10,#0x8
00adcf88	ldr w18,[x8, w18, UXTW #0x2]
00adcf8c	ldr w0,[x9, w0, UXTW #0x2]
00adcf90	lsr w17,w17,#0x18
00adcf94	ldr w3,[x10, w3, UXTW #0x2]
00adcf98	ldr w17,[x11, w17, UXTW #0x2]
00adcf9c	eor w18,w0,w18
00adcfa0	eor w18,w18,w3
00adcfa4	eor w17,w18,w17
00adcfa8	add w16,w17,w16
00adcfac	and w18,w16,#0xff
00adcfb0	ubfx w0,w16,#0x8,#0x8
00adcfb4	ubfx w3,w16,#0x10,#0x8
00adcfb8	ldr w18,[x8, w18, UXTW #0x2]
00adcfbc	ldr w0,[x9, w0, UXTW #0x2]
00adcfc0	ldr w3,[x10, w3, UXTW #0x2]
00adcfc4	lsr w16,w16,#0x18
00adcfc8	ldr w16,[x11, w16, UXTW #0x2]
00adcfcc	eor w18,w0,w18
00adcfd0	eor w18,w18,w3
00adcfd4	ldp w0,w3,[x2, #0x60]
00adcfd8	eor w16,w18,w16
00adcfdc	add w17,w16,w17
00adcfe0	eor w13,w16,w13
00adcfe4	eor w12,w17,w12
00adcfe8	eor w16,w13,w3
00adcfec	eor w17,w12,w0
00adcff0	eor w16,w16,w17
00adcff4	and w18,w16,#0xff
00adcff8	ubfx w0,w16,#0x8,#0x8
00adcffc	ubfx w3,w16,#0x10,#0x8
00add000	ldr w18,[x8, w18, UXTW #0x2]
00add004	ldr w0,[x9, w0, UXTW #0x2]
00add008	lsr w16,w16,#0x18
00add00c	ldr w3,[x10, w3, UXTW #0x2]
00add010	ldr w16,[x11, w16, UXTW #0x2]
00add014	eor w18,w0,w18
00add018	eor w18,w18,w3
00add01c	eor w16,w18,w16
00add020	add w17,w16,w17
00add024	and w18,w17,#0xff
00add028	ubfx w0,w17,#0x8,#0x8
00add02c	ubfx w3,w17,#0x10,#0x8
00add030	ldr w18,[x8, w18, UXTW #0x2]
00add034	ldr w0,[x9, w0, UXTW #0x2]
00add038	lsr w17,w17,#0x18
00add03c	ldr w3,[x10, w3, UXTW #0x2]
00add040	ldr w17,[x11, w17, UXTW #0x2]
00add044	eor w18,w0,w18
00add048	eor w18,w18,w3
00add04c	eor w17,w18,w17
00add050	add w16,w17,w16
00add054	and w18,w16,#0xff
00add058	ubfx w0,w16,#0x8,#0x8
00add05c	ubfx w3,w16,#0x10,#0x8
00add060	ldr w18,[x8, w18, UXTW #0x2]
00add064	ldr w0,[x9, w0, UXTW #0x2]
00add068	ldr w3,[x10, w3, UXTW #0x2]
00add06c	lsr w16,w16,#0x18
00add070	ldr w16,[x11, w16, UXTW #0x2]
00add074	eor w18,w0,w18
00add078	eor w18,w18,w3
00add07c	ldp w0,w3,[x2, #0x68]
00add080	eor w16,w18,w16
00add084	add w17,w16,w17
00add088	eor w16,w16,w15
00add08c	eor w15,w17,w14
00add090	eor w14,w16,w3
00add094	eor w17,w15,w0
00add098	eor w14,w14,w17
00add09c	and w18,w14,#0xff
00add0a0	ubfx w0,w14,#0x8,#0x8
00add0a4	ubfx w3,w14,#0x10,#0x8
00add0a8	ldr w18,[x8, w18, UXTW #0x2]
00add0ac	ldr w0,[x9, w0, UXTW #0x2]
00add0b0	lsr w14,w14,#0x18
00add0b4	ldr w3,[x10, w3, UXTW #0x2]
00add0b8	ldr w14,[x11, w14, UXTW #0x2]
00add0bc	eor w18,w0,w18
00add0c0	eor w18,w18,w3
00add0c4	eor w14,w18,w14
00add0c8	add w17,w14,w17
00add0cc	and w18,w17,#0xff
00add0d0	ubfx w0,w17,#0x8,#0x8
00add0d4	ubfx w3,w17,#0x10,#0x8
00add0d8	ldr w18,[x8, w18, UXTW #0x2]
00add0dc	ldr w0,[x9, w0, UXTW #0x2]
00add0e0	lsr w17,w17,#0x18
00add0e4	ldr w3,[x10, w3, UXTW #0x2]
00add0e8	ldr w17,[x11, w17, UXTW #0x2]
00add0ec	eor w18,w0,w18
00add0f0	eor w18,w18,w3
00add0f4	eor w17,w18,w17
00add0f8	add w14,w17,w14
00add0fc	and w18,w14,#0xff
00add100	ubfx w0,w14,#0x8,#0x8
00add104	ubfx w3,w14,#0x10,#0x8
00add108	ldr w18,[x8, w18, UXTW #0x2]
00add10c	ldr w0,[x9, w0, UXTW #0x2]
00add110	ldr w3,[x10, w3, UXTW #0x2]
00add114	lsr w14,w14,#0x18
00add118	ldr w14,[x11, w14, UXTW #0x2]
00add11c	eor w18,w0,w18
00add120	eor w18,w18,w3
00add124	ldp w0,w3,[x2, #0x70]
00add128	eor w14,w18,w14
00add12c	add w17,w14,w17
00add130	eor w13,w14,w13
00add134	eor w12,w17,w12
00add138	eor w14,w13,w3
00add13c	eor w17,w12,w0
00add140	eor w14,w14,w17
00add144	and w18,w14,#0xff
00add148	ubfx w0,w14,#0x8,#0x8
00add14c	ubfx w3,w14,#0x10,#0x8
00add150	ldr w18,[x8, w18, UXTW #0x2]
00add154	ldr w0,[x9, w0, UXTW #0x2]
00add158	lsr w14,w14,#0x18
00add15c	ldr w3,[x10, w3, UXTW #0x2]
00add160	ldr w14,[x11, w14, UXTW #0x2]
00add164	eor w18,w0,w18
00add168	eor w18,w18,w3
00add16c	eor w14,w18,w14
00add170	add w17,w14,w17
00add174	and w18,w17,#0xff
00add178	ubfx w0,w17,#0x8,#0x8
00add17c	ubfx w3,w17,#0x10,#0x8
00add180	ldr w18,[x8, w18, UXTW #0x2]
00add184	ldr w0,[x9, w0, UXTW #0x2]
00add188	lsr w17,w17,#0x18
00add18c	ldr w3,[x10, w3, UXTW #0x2]
00add190	ldr w17,[x11, w17, UXTW #0x2]
00add194	eor w18,w0,w18
00add198	eor w18,w18,w3
00add19c	eor w18,w18,w17
00add1a0	add w14,w18,w14
00add1a4	and w17,w14,#0xff
00add1a8	ubfx w0,w14,#0x8,#0x8
00add1ac	ldr w17,[x8, w17, UXTW #0x2]
00add1b0	ldr w0,[x9, w0, UXTW #0x2]
00add1b4	ubfx w3,w14,#0x10,#0x8
00add1b8	ldr w3,[x10, w3, UXTW #0x2]
00add1bc	lsr w14,w14,#0x18
00add1c0	ldr w14,[x11, w14, UXTW #0x2]
00add1c4	eor w17,w0,w17
00add1c8	eor w0,w17,w3
00add1cc	ldp w17,w2,[x2, #0x78]
00add1d0	eor w14,w0,w14
00add1d4	add w18,w14,w18
00add1d8	eor w14,w14,w16
00add1dc	eor w15,w18,w15
00add1e0	eor w16,w14,w2
00add1e4	lsr w18,w14,#0x18
00add1e8	lsr w0,w14,#0x10
00add1ec	eor w17,w15,w17
00add1f0	lsr w2,w14,#0x8
00add1f4	strb w18,[x1, #0xc]
00add1f8	lsr w18,w15,#0x18
00add1fc	strb w0,[x1, #0xd]
00add200	lsr w0,w15,#0x10
00add204	eor w16,w16,w17
00add208	strb w2,[x1, #0xe]
00add20c	strb w18,[x1, #0x8]
00add210	strb w0,[x1, #0x9]
00add214	and w18,w16,#0xff
00add218	ubfx w0,w16,#0x8,#0x8
00add21c	ubfx w2,w16,#0x10,#0x8
00add220	ldr w18,[x8, w18, UXTW #0x2]
00add224	ldr w0,[x9, w0, UXTW #0x2]
00add228	lsr w16,w16,#0x18
00add22c	ldr w2,[x10, w2, UXTW #0x2]
00add230	ldr w16,[x11, w16, UXTW #0x2]
00add234	eor w18,w0,w18
00add238	strb w15,[x1, #0xb]
00add23c	eor w18,w18,w2
00add240	eor w16,w18,w16
00add244	add w17,w16,w17
00add248	and w18,w17,#0xff
00add24c	ubfx w0,w17,#0x8,#0x8
00add250	ubfx w2,w17,#0x10,#0x8
00add254	ldr w18,[x8, w18, UXTW #0x2]
00add258	ldr w0,[x9, w0, UXTW #0x2]
00add25c	lsr w17,w17,#0x18
00add260	ldr w2,[x10, w2, UXTW #0x2]
00add264	ldr w17,[x11, w17, UXTW #0x2]
00add268	eor w18,w0,w18
00add26c	lsr w15,w15,#0x8
00add270	eor w18,w18,w2
00add274	eor w17,w18,w17
00add278	add w16,w17,w16
00add27c	and w18,w16,#0xff
00add280	ubfx w0,w16,#0x8,#0x8
00add284	ubfx w2,w16,#0x10,#0x8
00add288	ldr w8,[x8, w18, UXTW #0x2]
00add28c	ldr w9,[x9, w0, UXTW #0x2]
00add290	lsr w16,w16,#0x18
00add294	ldr w10,[x10, w2, UXTW #0x2]
00add298	ldr w11,[x11, w16, UXTW #0x2]
00add29c	eor w8,w9,w8
00add2a0	strb w15,[x1, #0xa]
00add2a4	eor w8,w8,w10
00add2a8	eor w8,w8,w11
00add2ac	add w9,w8,w17
00add2b0	eor w8,w8,w13
00add2b4	eor w9,w9,w12
00add2b8	lsr w10,w8,#0x18
00add2bc	lsr w11,w8,#0x10
00add2c0	lsr w12,w8,#0x8
00add2c4	strb w8,[x1, #0x7]
00add2c8	lsr w8,w9,#0x18
00add2cc	lsr w13,w9,#0x10
00add2d0	lsr w15,w9,#0x8
00add2d4	strb w9,[x1, #0x3]
00add2d8	strb w10,[x1, #0x4]
00add2dc	strb w11,[x1, #0x5]
00add2e0	strb w12,[x1, #0x6]
00add2e4	strb w8,[x1]
00add2e8	strb w13,[x1, #0x1]
00add2ec	strb w15,[x1, #0x2]
00add2f0	strb w14,[x1, #0xf]
00add2f4	ret
