; tls_construct_client_key_exchange @ 009dc60c
009dc60c	str x28,[sp, #-0x60]!
009dc610	stp x26,x25,[sp, #0x10]
009dc614	stp x24,x23,[sp, #0x20]
009dc618	stp x22,x21,[sp, #0x30]
009dc61c	stp x20,x19,[sp, #0x40]
009dc620	stp x29,x30,[sp, #0x50]
009dc624	add x29,sp,#0x50
009dc628	sub sp,sp,#0x310
009dc62c	ldr x8,[x0, #0x2e0]
009dc630	mov x19,x0
009dc634	mov x20,x1
009dc638	ldr w26,[x8, #0x1c]
009dc63c	mov w8,#0x1c8
009dc640	tst x26,x8
009dc644	b.eq 0x009dc8f0
009dc648	ldr x21,[x19, #0x988]
009dc64c	cbz x21,0x009dc6e8
009dc650	add x0,sp,#0x208
009dc654	mov w2,#0x101
009dc658	mov w1,wzr
009dc65c	bl 0x00c301c0
009dc660	ldr x8,[x19, #0x918]
009dc664	add x2,sp,#0x208
009dc668	mov w3,#0x100
009dc66c	add x4,sp,#0x8
009dc670	ldr x1,[x8, #0x2a0]
009dc674	mov w5,#0x200
009dc678	mov x0,x19
009dc67c	blr x21
009dc680	cmp w0,#0x201
009dc684	b.cc 0x009dc714
009dc688	bl 0x00c342a0
009dc68c	adrp x20,0x2d7000
009dc690	add x20,x20,#0xb1a
009dc694	adrp x2,0x2c9000
009dc698	add x2,x2,#0x55f
009dc69c	mov w1,#0xad8
009dc6a0	mov x0,x20
009dc6a4	bl 0x00c342b0
009dc6a8	mov w2,#0x103
009dc6ac	mov w1,#0x28
009dc6b0	movk w2,#0xc, LSL #16
009dc6b4	mov x0,x19
009dc6b8	mov x3,xzr
009dc6bc	bl 0x00c34410
009dc6c0	add x0,sp,#0x8
009dc6c4	mov w1,#0x200
009dc6c8	bl 0x00c34750
009dc6cc	add x0,sp,#0x208
009dc6d0	mov w1,#0x101
009dc6d4	bl 0x00c34750
009dc6d8	mov w1,#0x200
009dc6dc	mov w3,#0xaff
009dc6e0	mov x0,xzr
009dc6e4	b 0x009dc7f8
009dc6e8	bl 0x00c342a0
009dc6ec	adrp x20,0x2d7000
009dc6f0	add x20,x20,#0xb1a
009dc6f4	adrp x2,0x2c9000
009dc6f8	add x2,x2,#0x55f
009dc6fc	mov w1,#0xacd
009dc700	mov x0,x20
009dc704	bl 0x00c342b0
009dc708	mov w1,#0x50
009dc70c	orr w2,wzr,#0xe0
009dc710	b 0x009dc7c8
009dc714	mov w22,w0
009dc718	cbz w22,0x009dc7a0
009dc71c	add x0,sp,#0x208
009dc720	bl 0x00c2ff50
009dc724	mov x21,x0
009dc728	cmp x0,#0x101
009dc72c	b.cc 0x009dc818
009dc730	bl 0x00c342a0
009dc734	adrp x20,0x2d7000
009dc738	adrp x2,0x2c9000
009dc73c	add x20,x20,#0xb1a
009dc740	add x2,x2,#0x55f
009dc744	mov w1,#0xae2
009dc748	mov x0,x20
009dc74c	bl 0x00c342b0
009dc750	mov w2,#0x103
009dc754	mov w1,#0x50
009dc758	movk w2,#0xc, LSL #16
009dc75c	mov x0,x19
009dc760	mov x3,xzr
009dc764	bl 0x00c34410
009dc768	add x0,sp,#0x8
009dc76c	mov x1,x22
009dc770	bl 0x00c34750
009dc774	add x0,sp,#0x208
009dc778	mov w1,#0x101
009dc77c	bl 0x00c34750
009dc780	mov w3,#0xaff
009dc784	mov x0,xzr
009dc788	mov x1,x22
009dc78c	mov x2,x20
009dc790	bl 0x00c345e0
009dc794	mov w3,#0xb00
009dc798	mov x0,xzr
009dc79c	b 0x009dccc4
009dc7a0	bl 0x00c342a0
009dc7a4	adrp x20,0x2d7000
009dc7a8	add x20,x20,#0xb1a
009dc7ac	adrp x2,0x2c9000
009dc7b0	add x2,x2,#0x55f
009dc7b4	mov w1,#0xadc
009dc7b8	mov x0,x20
009dc7bc	bl 0x00c342b0
009dc7c0	mov w1,#0x28
009dc7c4	mov w2,#0xdf
009dc7c8	mov x0,x19
009dc7cc	mov x3,xzr
009dc7d0	bl 0x00c34410
009dc7d4	add x0,sp,#0x8
009dc7d8	mov x1,xzr
009dc7dc	bl 0x00c34750
009dc7e0	add x0,sp,#0x208
009dc7e4	mov w1,#0x101
009dc7e8	bl 0x00c34750
009dc7ec	mov w3,#0xaff
009dc7f0	mov x0,xzr
009dc7f4	mov x1,xzr
009dc7f8	mov x2,x20
009dc7fc	bl 0x00c345e0
009dc800	mov w3,#0xb00
009dc804	mov x0,xzr
009dc808	mov x1,xzr
009dc80c	mov x2,x20
009dc810	bl 0x00c345e0
009dc814	b 0x009dd2b0
009dc818	adrp x23,0x2d7000
009dc81c	add x23,x23,#0xb1a
009dc820	add x0,sp,#0x8
009dc824	mov w3,#0xae6
009dc828	mov x1,x22
009dc82c	mov x2,x23
009dc830	bl 0x00c345f0
009dc834	mov x24,x0
009dc838	add x0,sp,#0x208
009dc83c	mov w2,#0xae7
009dc840	mov x1,x23
009dc844	bl 0x00c34600
009dc848	mov x23,x0
009dc84c	cbz x24,0x009dcc54
009dc850	cbz x23,0x009dcc54
009dc854	ldr x0,[x19, #0x370]
009dc858	adrp x25,0x2d7000
009dc85c	add x25,x25,#0xb1a
009dc860	mov w2,#0xaed
009dc864	mov x1,x25
009dc868	bl 0x00c32310
009dc86c	ldr x8,[x19, #0x918]
009dc870	str x24,[x19, #0x370]
009dc874	str x22,[x19, #0x378]
009dc878	mov w2,#0xaf1
009dc87c	ldr x0,[x8, #0x2a8]
009dc880	mov x1,x25
009dc884	bl 0x00c32310
009dc888	ldr x8,[x19, #0x918]
009dc88c	add x1,sp,#0x208
009dc890	mov w3,#0x2
009dc894	mov x0,x20
009dc898	mov x2,x21
009dc89c	str x23,[x8, #0x2a8]
009dc8a0	bl 0x00c36f70
009dc8a4	cbz w0,0x009dcddc
009dc8a8	add x0,sp,#0x8
009dc8ac	mov x1,x22
009dc8b0	bl 0x00c34750
009dc8b4	add x0,sp,#0x208
009dc8b8	mov w1,#0x101
009dc8bc	bl 0x00c34750
009dc8c0	adrp x23,0x2d7000
009dc8c4	add x23,x23,#0xb1a
009dc8c8	mov w3,#0xaff
009dc8cc	mov x0,xzr
009dc8d0	mov x1,x22
009dc8d4	mov x2,x23
009dc8d8	bl 0x00c345e0
009dc8dc	mov w3,#0xb00
009dc8e0	mov x0,xzr
009dc8e4	mov x1,x21
009dc8e8	mov x2,x23
009dc8ec	bl 0x00c345e0
009dc8f0	mov w8,#0x41
009dc8f4	tst x26,x8
009dc8f8	b.eq 0x009dca60
009dc8fc	str xzr,[sp, #0x8]
009dc900	ldr x8,[x19, #0x918]
009dc904	ldr x0,[x8, #0x2b8]
009dc908	cbz x0,0x009dcb24
009dc90c	bl 0x00c32cb0
009dc910	adrp x1,0x2db000
009dc914	add x1,x1,#0x996
009dc918	mov x22,x0
009dc91c	bl 0x00c346e0
009dc920	cbz w0,0x009dcb40
009dc924	adrp x1,0x2d7000
009dc928	add x1,x1,#0xb1a
009dc92c	orr w0,wzr,#0x30
009dc930	mov w2,#0xb21
009dc934	bl 0x00c32320
009dc938	cbz x0,0x009dcc08
009dc93c	ldr w8,[x19, #0xa0c]
009dc940	mov x21,x0
009dc944	add x1,x21,#0x2
009dc948	mov w2,#0x2e
009dc94c	lsr w8,w8,#0x8
009dc950	strb w8,[x0]
009dc954	ldr w8,[x19, #0xa0c]
009dc958	mov w3,wzr
009dc95c	strb w8,[x0, #0x1]
009dc960	ldr x8,[x19, #0x9a8]
009dc964	ldr x0,[x8]
009dc968	bl 0x00c347b0
009dc96c	cmp w0,#0x0
009dc970	b.le 0x009dcd04
009dc974	ldr w8,[x19]
009dc978	cmp w8,#0x301
009dc97c	b.lt 0x009dc990
009dc980	mov w1,#0x2
009dc984	mov x0,x20
009dc988	bl 0x00c343b0
009dc98c	cbz w0,0x009dd034
009dc990	ldr x8,[x19, #0x9a8]
009dc994	mov x1,x22
009dc998	ldr x0,[x8]
009dc99c	ldr x2,[x8, #0x440]
009dc9a0	bl 0x00c34640
009dc9a4	mov x22,x0
009dc9a8	cbz x0,0x009dcccc
009dc9ac	mov x0,x22
009dc9b0	bl 0x00c37130
009dc9b4	cmp w0,#0x1
009dc9b8	b.lt 0x009dcccc
009dc9bc	add x2,sp,#0x208
009dc9c0	orr w4,wzr,#0x30
009dc9c4	mov x0,x22
009dc9c8	mov x1,xzr
009dc9cc	mov x3,x21
009dc9d0	bl 0x00c37120
009dc9d4	cmp w0,#0x0
009dc9d8	b.le 0x009dcccc
009dc9dc	ldr x1,[sp, #0x208]
009dc9e0	add x2,sp,#0x8
009dc9e4	mov x0,x20
009dc9e8	bl 0x00c36c40
009dc9ec	cbz w0,0x009dd0d4
009dc9f0	ldr x1,[sp, #0x8]
009dc9f4	add x2,sp,#0x208
009dc9f8	orr w4,wzr,#0x30
009dc9fc	mov x0,x22
009dca00	mov x3,x21
009dca04	bl 0x00c37120
009dca08	cmp w0,#0x0
009dca0c	b.le 0x009dd0d4
009dca10	mov x0,x22
009dca14	bl 0x00c34620
009dca18	ldr w8,[x19]
009dca1c	cmp w8,#0x301
009dca20	b.lt 0x009dca30
009dca24	mov x0,x20
009dca28	bl 0x00c34350
009dca2c	cbz w0,0x009dd5e4
009dca30	ldr x1,[sp, #0x8]
009dca34	ldr x2,[sp, #0x208]
009dca38	orr w4,wzr,#0x30
009dca3c	mov x0,x19
009dca40	mov x3,x21
009dca44	bl 0x00c35df0
009dca48	cbz w0,0x009dd068
009dca4c	str x21,[x19, #0x360]
009dca50	orr w8,wzr,#0x30
009dca54	str x8,[x19, #0x368]
009dca58	mov w0,#0x1
009dca5c	b 0x009dd2f4
009dca60	mov w8,#0x102
009dca64	tst x26,x8
009dca68	b.eq 0x009dcb78
009dca6c	str xzr,[sp, #0x8]
009dca70	str xzr,[sp, #0x208]
009dca74	ldr x22,[x19, #0x4b0]
009dca78	cbz x22,0x009dcc38
009dca7c	mov x0,x19
009dca80	mov x1,x22
009dca84	bl 0x00c349d0
009dca88	cbz x0,0x009dcd34
009dca8c	mov x21,x0
009dca90	mov x0,x19
009dca94	mov x1,x21
009dca98	mov x2,x22
009dca9c	mov w3,wzr
009dcaa0	bl 0x00c34940
009dcaa4	cbz w0,0x009dcdb0
009dcaa8	add x1,sp,#0x208
009dcaac	mov x0,x21
009dcab0	bl 0x00c36f40
009dcab4	cbz x0,0x009dcfb4
009dcab8	mov x22,x0
009dcabc	mov x0,x21
009dcac0	bl 0x00c36440
009dcac4	sxtw x8,w0
009dcac8	subs x23,x8,x22
009dcacc	b.eq 0x009dcaf8
009dcad0	add x2,sp,#0x8
009dcad4	mov w3,#0x2
009dcad8	mov x0,x20
009dcadc	mov x1,x23
009dcae0	bl 0x00c36f60
009dcae4	cbz w0,0x009dd140
009dcae8	ldr x0,[sp, #0x8]
009dcaec	mov w1,wzr
009dcaf0	mov x2,x23
009dcaf4	bl 0x00c301c0
009dcaf8	ldr x1,[sp, #0x208]
009dcafc	mov w3,#0x2
009dcb00	mov x0,x20
009dcb04	mov x2,x22
009dcb08	bl 0x00c36f70
009dcb0c	cbz w0,0x009dd0fc
009dcb10	ldr x0,[sp, #0x208]
009dcb14	adrp x1,0x2d7000
009dcb18	add x1,x1,#0xb1a
009dcb1c	mov w2,#0xb93
009dcb20	b 0x009dcbf4
009dcb24	bl 0x00c342a0
009dcb28	adrp x0,0x2d7000
009dcb2c	adrp x2,0x2a2000
009dcb30	add x0,x0,#0xb1a
009dcb34	add x2,x2,#0xb9
009dcb38	mov w1,#0xb16
009dcb3c	b 0x009dcb58
009dcb40	bl 0x00c342a0
009dcb44	adrp x0,0x2d7000
009dcb48	adrp x2,0x2a2000
009dcb4c	add x0,x0,#0xb1a
009dcb50	add x2,x2,#0xb9
009dcb54	mov w1,#0xb1c
009dcb58	bl 0x00c342b0
009dcb5c	mov w2,#0x103
009dcb60	mov w1,#0x50
009dcb64	movk w2,#0xc, LSL #16
009dcb68	mov x0,x19
009dcb6c	mov x3,xzr
009dcb70	bl 0x00c34410
009dcb74	b 0x009dd2b0
009dcb78	mov w8,#0x84
009dcb7c	tst x26,x8
009dcb80	b.eq 0x009dcd84
009dcb84	str xzr,[sp, #0x8]
009dcb88	ldr x22,[x19, #0x4b0]
009dcb8c	cbz x22,0x009dcdc0
009dcb90	mov x0,x19
009dcb94	mov x1,x22
009dcb98	bl 0x00c349d0
009dcb9c	cbz x0,0x009dcfec
009dcba0	mov x21,x0
009dcba4	mov x0,x19
009dcba8	mov x1,x21
009dcbac	mov x2,x22
009dcbb0	mov w3,wzr
009dcbb4	bl 0x00c34940
009dcbb8	cbz w0,0x009dd0c0
009dcbbc	add x1,sp,#0x8
009dcbc0	mov x0,x21
009dcbc4	bl 0x00c36f40
009dcbc8	cbz x0,0x009dd184
009dcbcc	ldr x1,[sp, #0x8]
009dcbd0	mov x2,x0
009dcbd4	mov w3,#0x1
009dcbd8	mov x0,x20
009dcbdc	bl 0x00c36f70
009dcbe0	cbz w0,0x009dd260
009dcbe4	ldr x0,[sp, #0x8]
009dcbe8	adrp x1,0x2d7000
009dcbec	add x1,x1,#0xb1a
009dcbf0	mov w2,#0xbbf
009dcbf4	bl 0x00c32310
009dcbf8	mov x0,x21
009dcbfc	bl 0x00c32450
009dcc00	mov w0,#0x1
009dcc04	b 0x009dd2f4
009dcc08	bl 0x00c342a0
009dcc0c	adrp x0,0x2d7000
009dcc10	adrp x2,0x2a2000
009dcc14	add x0,x0,#0xb1a
009dcc18	add x2,x2,#0xb9
009dcc1c	mov w1,#0xb23
009dcc20	bl 0x00c342b0
009dcc24	mov w8,#0x103
009dcc28	movk w8,#0xc, LSL #16
009dcc2c	sub w2,w8,#0x3
009dcc30	mov w1,#0x50
009dcc34	b 0x009dcb68
009dcc38	bl 0x00c342a0
009dcc3c	adrp x20,0x2d7000
009dcc40	adrp x2,0x2db000
009dcc44	add x20,x20,#0xb1a
009dcc48	add x2,x2,#0xcce
009dcc4c	mov w1,#0xb64
009dcc50	b 0x009dcd4c
009dcc54	bl 0x00c342a0
009dcc58	adrp x20,0x2d7000
009dcc5c	add x20,x20,#0xb1a
009dcc60	adrp x2,0x2c9000
009dcc64	add x2,x2,#0x55f
009dcc68	mov w1,#0xae9
009dcc6c	mov x0,x20
009dcc70	bl 0x00c342b0
009dcc74	mov w8,#0x103
009dcc78	movk w8,#0xc, LSL #16
009dcc7c	sub w2,w8,#0x3
009dcc80	mov w1,#0x50
009dcc84	mov x0,x19
009dcc88	mov x3,xzr
009dcc8c	bl 0x00c34410
009dcc90	add x0,sp,#0x8
009dcc94	mov x1,x22
009dcc98	bl 0x00c34750
009dcc9c	add x0,sp,#0x208
009dcca0	mov w1,#0x101
009dcca4	bl 0x00c34750
009dcca8	mov w3,#0xaff
009dccac	mov x0,x24
009dccb0	mov x1,x22
009dccb4	mov x2,x20
009dccb8	bl 0x00c345e0
009dccbc	mov w3,#0xb00
009dccc0	mov x0,x23
009dccc4	mov x1,x21
009dccc8	b 0x009dc80c
009dcccc	bl 0x00c342a0
009dccd0	adrp x0,0x2d7000
009dccd4	adrp x2,0x2a2000
009dccd8	add x0,x0,#0xb1a
009dccdc	add x2,x2,#0xb9
009dcce0	mov w1,#0xb37
009dcce4	bl 0x00c342b0
009dcce8	mov w2,#0x6
009dccec	mov w1,#0x50
009dccf0	movk w2,#0x8, LSL #16
009dccf4	mov x0,x19
009dccf8	mov x3,xzr
009dccfc	bl 0x00c34410
009dcd00	b 0x009dd06c
009dcd04	bl 0x00c342a0
009dcd08	adrp x0,0x2d7000
009dcd0c	adrp x2,0x2a2000
009dcd10	add x0,x0,#0xb1a
009dcd14	add x2,x2,#0xb9
009dcd18	mov w1,#0xb2a
009dcd1c	bl 0x00c342b0
009dcd20	mov w8,#0x103
009dcd24	movk w8,#0xc, LSL #16
009dcd28	sub w2,w8,#0x3
009dcd2c	mov w1,#0x50
009dcd30	b 0x009dd05c
009dcd34	bl 0x00c342a0
009dcd38	adrp x20,0x2d7000
009dcd3c	adrp x2,0x2db000
009dcd40	add x20,x20,#0xb1a
009dcd44	add x2,x2,#0xcce
009dcd48	mov w1,#0xb6a
009dcd4c	mov x0,x20
009dcd50	bl 0x00c342b0
009dcd54	mov w2,#0x103
009dcd58	mov w1,#0x50
009dcd5c	movk w2,#0xc, LSL #16
009dcd60	mov x0,x19
009dcd64	mov x3,xzr
009dcd68	bl 0x00c34410
009dcd6c	ldr x0,[sp, #0x208]
009dcd70	mov w2,#0xb93
009dcd74	mov x1,x20
009dcd78	bl 0x00c32310
009dcd7c	mov x0,xzr
009dcd80	b 0x009dd2ac
009dcd84	tbnz w26,#0x4,0x009dcdf8
009dcd88	tbnz w26,#0x9,0x009dd090
009dcd8c	tbnz w26,#0x5,0x009dd1b8
009dcd90	tbnz w26,#0x3,0x009dd234
009dcd94	bl 0x00c342a0
009dcd98	adrp x0,0x2d7000
009dcd9c	adrp x2,0x2a7000
009dcda0	add x0,x0,#0xb1a
009dcda4	add x2,x2,#0xc7c
009dcda8	mov w1,#0xcf3
009dcdac	b 0x009dcb58
009dcdb0	adrp x1,0x2d7000
009dcdb4	add x1,x1,#0xb1a
009dcdb8	mov w2,#0xb93
009dcdbc	b 0x009dd0cc
009dcdc0	bl 0x00c342a0
009dcdc4	adrp x0,0x2d7000
009dcdc8	adrp x2,0x2cb000
009dcdcc	add x0,x0,#0xb1a
009dcdd0	add x2,x2,#0x654
009dcdd4	mov w1,#0xba1
009dcdd8	b 0x009dcb58
009dcddc	bl 0x00c342a0
009dcde0	adrp x20,0x2d7000
009dcde4	adrp x2,0x2c9000
009dcde8	add x20,x20,#0xb1a
009dcdec	add x2,x2,#0x55f
009dcdf0	mov w1,#0xaf6
009dcdf4	b 0x009dc748
009dcdf8	ldr x8,[x19, #0x2e0]
009dcdfc	ldr x9,[x19, #0x918]
009dce00	ldrb w8,[x8, #0x20]
009dce04	ldr x0,[x9, #0x2b8]
009dce08	mov w9,#0x3d6
009dce0c	tst w8,#0x80
009dce10	mov w8,#0x329
009dce14	csel w24,w8,w9,eq
009dce18	cbz x0,0x009dd118
009dce1c	ldr x8,[x19, #0x9a8]
009dce20	ldr x21,[x8]
009dce24	bl 0x00c32cb0
009dce28	ldr x8,[x19, #0x9a8]
009dce2c	mov x1,x0
009dce30	mov x0,x21
009dce34	ldr x2,[x8, #0x440]
009dce38	bl 0x00c34640
009dce3c	cbz x0,0x009dd244
009dce40	adrp x1,0x2d7000
009dce44	mov x21,x0
009dce48	add x1,x1,#0xb1a
009dce4c	mov w0,#0x20
009dce50	mov w2,#0xbee
009dce54	bl 0x00c32320
009dce58	mov x22,x0
009dce5c	cbz x0,0x009dd35c
009dce60	mov x0,x21
009dce64	bl 0x00c37130
009dce68	cmp w0,#0x1
009dce6c	b.lt 0x009dd330
009dce70	ldr x8,[x19, #0x9a8]
009dce74	mov w2,#0x20
009dce78	mov x1,x22
009dce7c	mov w3,wzr
009dce80	ldr x0,[x8]
009dce84	bl 0x00c347b0
009dce88	cmp w0,#0x0
009dce8c	b.le 0x009dd330
009dce90	bl 0x00c31fa0
009dce94	mov x23,x0
009dce98	cbz x0,0x009dd558
009dce9c	mov w0,w24
009dcea0	bl 0x00c324f0
009dcea4	bl 0x00c35310
009dcea8	mov x1,x0
009dceac	mov x0,x23
009dceb0	bl 0x00c32430
009dceb4	cmp w0,#0x1
009dceb8	b.lt 0x009dd558
009dcebc	add x1,x19,#0x160
009dcec0	mov w2,#0x20
009dcec4	mov x0,x23
009dcec8	bl 0x00c31f80
009dcecc	cmp w0,#0x1
009dced0	b.lt 0x009dd558
009dced4	add x1,x19,#0x140
009dced8	mov w2,#0x20
009dcedc	mov x0,x23
009dcee0	bl 0x00c31f80
009dcee4	cmp w0,#0x1
009dcee8	b.lt 0x009dd558
009dceec	add x1,sp,#0x208
009dcef0	sub x2,x29,#0x54
009dcef4	mov x0,x23
009dcef8	bl 0x00c31f60
009dcefc	cmp w0,#0x0
009dcf00	b.le 0x009dd558
009dcf04	mov x0,x23
009dcf08	bl 0x00c31f90
009dcf0c	mov w1,#0xffffffff
009dcf10	mov w2,#0x200
009dcf14	mov w3,#0x8
009dcf18	mov w4,#0x8
009dcf1c	add x5,sp,#0x208
009dcf20	mov x0,x21
009dcf24	bl 0x00c370f0
009dcf28	cmp w0,#0x0
009dcf2c	b.le 0x009dd6f4
009dcf30	orr w8,wzr,#0xff
009dcf34	add x1,sp,#0x8
009dcf38	sub x2,x29,#0x48
009dcf3c	mov w4,#0x20
009dcf40	mov x0,x21
009dcf44	mov x3,x22
009dcf48	stur x8,[x29, #-0x48]
009dcf4c	bl 0x00c37120
009dcf50	cmp w0,#0x0
009dcf54	b.le 0x009dd7a4
009dcf58	orr w1,wzr,#0x30
009dcf5c	mov w2,#0x1
009dcf60	mov x0,x20
009dcf64	bl 0x00c343a0
009dcf68	cbz w0,0x009dd788
009dcf6c	ldur x2,[x29, #-0x48]
009dcf70	cmp x2,#0x80
009dcf74	b.cc 0x009dcf90
009dcf78	mov w1,#0x81
009dcf7c	mov w2,#0x1
009dcf80	mov x0,x20
009dcf84	bl 0x00c343a0
009dcf88	cbz w0,0x009dd788
009dcf8c	ldur x2,[x29, #-0x48]
009dcf90	add x1,sp,#0x8
009dcf94	mov w3,#0x1
009dcf98	mov x0,x20
009dcf9c	bl 0x00c36f70
009dcfa0	cbz w0,0x009dd788
009dcfa4	mov x0,x21
009dcfa8	bl 0x00c34620
009dcfac	str x22,[x19, #0x360]
009dcfb0	b 0x009dd4dc
009dcfb4	bl 0x00c342a0
009dcfb8	adrp x0,0x2d7000
009dcfbc	adrp x2,0x2db000
009dcfc0	add x0,x0,#0xb1a
009dcfc4	add x2,x2,#0xcce
009dcfc8	mov w1,#0xb78
009dcfcc	bl 0x00c342b0
009dcfd0	mov w2,#0x103
009dcfd4	mov w1,#0x50
009dcfd8	movk w2,#0xc, LSL #16
009dcfdc	mov x0,x19
009dcfe0	mov x3,xzr
009dcfe4	bl 0x00c34410
009dcfe8	b 0x009dd2a8
009dcfec	bl 0x00c342a0
009dcff0	adrp x20,0x2d7000
009dcff4	add x20,x20,#0xb1a
009dcff8	adrp x2,0x2cb000
009dcffc	add x2,x2,#0x654
009dd000	mov w1,#0xba7
009dd004	mov x0,x20
009dd008	bl 0x00c342b0
009dd00c	mov w8,#0x103
009dd010	movk w8,#0xc, LSL #16
009dd014	sub w2,w8,#0x3
009dd018	mov w1,#0x50
009dd01c	mov x0,x19
009dd020	mov x3,xzr
009dd024	bl 0x00c34410
009dd028	ldr x0,[sp, #0x8]
009dd02c	mov w2,#0xbbf
009dd030	b 0x009dcd74
009dd034	bl 0x00c342a0
009dd038	adrp x0,0x2d7000
009dd03c	adrp x2,0x2a2000
009dd040	add x0,x0,#0xb1a
009dd044	add x2,x2,#0xb9
009dd048	mov w1,#0xb30
009dd04c	bl 0x00c342b0
009dd050	mov w2,#0x103
009dd054	mov w1,#0x50
009dd058	movk w2,#0xc, LSL #16
009dd05c	mov x0,x19
009dd060	mov x3,xzr
009dd064	bl 0x00c34410
009dd068	mov x22,xzr
009dd06c	adrp x2,0x2d7000
009dd070	add x2,x2,#0xb1a
009dd074	orr w1,wzr,#0x30
009dd078	mov w3,#0xb53
009dd07c	mov x0,x21
009dd080	bl 0x00c345e0
009dd084	mov x0,x22
009dd088	bl 0x00c34620
009dd08c	b 0x009dd2b0
009dd090	str xzr,[sp, #0x8]
009dd094	ldr x8,[x19, #0x2e0]
009dd098	ldr w8,[x8, #0x24]
009dd09c	tbnz w8,#0x16,0x009dd23c
009dd0a0	tbnz w8,#0x17,0x009dd39c
009dd0a4	bl 0x00c342a0
009dd0a8	adrp x0,0x2d7000
009dd0ac	adrp x2,0x2a2000
009dd0b0	add x0,x0,#0xb1a
009dd0b4	add x2,x2,#0xcf
009dd0b8	mov w1,#0xc64
009dd0bc	b 0x009dcb58
009dd0c0	adrp x1,0x2d7000
009dd0c4	add x1,x1,#0xb1a
009dd0c8	mov w2,#0xbbf
009dd0cc	mov x0,xzr
009dd0d0	b 0x009dd2a4
009dd0d4	bl 0x00c342a0
009dd0d8	adrp x0,0x2d7000
009dd0dc	adrp x2,0x2a2000
009dd0e0	add x0,x0,#0xb1a
009dd0e4	add x2,x2,#0xb9
009dd0e8	mov w1,#0xb3c
009dd0ec	bl 0x00c342b0
009dd0f0	mov w1,#0x50
009dd0f4	mov w2,#0x77
009dd0f8	b 0x009dccf4
009dd0fc	bl 0x00c342a0
009dd100	adrp x20,0x2d7000
009dd104	adrp x2,0x2db000
009dd108	add x20,x20,#0xb1a
009dd10c	add x2,x2,#0xcce
009dd110	mov w1,#0xb8d
009dd114	b 0x009dd158
009dd118	bl 0x00c342a0
009dd11c	adrp x0,0x2d7000
009dd120	adrp x2,0x2b7000
009dd124	add x0,x0,#0xb1a
009dd128	add x2,x2,#0x850
009dd12c	mov w1,#0xbdb
009dd130	bl 0x00c342b0
009dd134	mov w1,#0x28
009dd138	mov w2,#0x14a
009dd13c	b 0x009dcb68
009dd140	bl 0x00c342a0
009dd144	adrp x20,0x2d7000
009dd148	adrp x2,0x2db000
009dd14c	add x20,x20,#0xb1a
009dd150	add x2,x2,#0xcce
009dd154	mov w1,#0xb86
009dd158	mov x0,x20
009dd15c	bl 0x00c342b0
009dd160	mov w2,#0x103
009dd164	mov w1,#0x50
009dd168	movk w2,#0xc, LSL #16
009dd16c	mov x0,x19
009dd170	mov x3,xzr
009dd174	bl 0x00c34410
009dd178	ldr x0,[sp, #0x208]
009dd17c	mov w2,#0xb93
009dd180	b 0x009dd2a0
009dd184	bl 0x00c342a0
009dd188	adrp x20,0x2d7000
009dd18c	add x20,x20,#0xb1a
009dd190	adrp x2,0x2cb000
009dd194	add x2,x2,#0x654
009dd198	mov w1,#0xbb4
009dd19c	mov x0,x20
009dd1a0	bl 0x00c342b0
009dd1a4	mov w8,#0x6
009dd1a8	movk w8,#0x8, LSL #16
009dd1ac	add w2,w8,#0xa
009dd1b0	mov w1,#0x50
009dd1b4	b 0x009dd28c
009dd1b8	str xzr,[sp, #0x8]
009dd1bc	ldr x0,[x19, #0xc18]
009dd1c0	cbz x0,0x009dd314
009dd1c4	bl 0x00c322f0
009dd1c8	add w8,w0,#0x7
009dd1cc	add w9,w0,#0xe
009dd1d0	cmp w8,#0x0
009dd1d4	csel w8,w9,w8,lt
009dd1d8	sbfx x1,x8,#0x3,#0x1d
009dd1dc	add x2,sp,#0x8
009dd1e0	mov w3,#0x2
009dd1e4	mov x0,x20
009dd1e8	bl 0x00c36f60
009dd1ec	cbz w0,0x009dd314
009dd1f0	ldr x0,[x19, #0xc18]
009dd1f4	ldr x1,[sp, #0x8]
009dd1f8	bl 0x00c36980
009dd1fc	ldr x8,[x19, #0x918]
009dd200	adrp x20,0x2d7000
009dd204	add x20,x20,#0xb1a
009dd208	mov w2,#0xcc4
009dd20c	ldr x0,[x8, #0x370]
009dd210	mov x1,x20
009dd214	bl 0x00c32310
009dd218	ldr x0,[x19, #0xbf0]
009dd21c	mov w2,#0xcc5
009dd220	mov x1,x20
009dd224	bl 0x00c34600
009dd228	ldr x8,[x19, #0x918]
009dd22c	str x0,[x8, #0x370]
009dd230	cbz x0,0x009dd600
009dd234	mov w0,#0x1
009dd238	b 0x009dd2f4
009dd23c	mov w23,#0x4a4
009dd240	b 0x009dd3a0
009dd244	bl 0x00c342a0
009dd248	adrp x0,0x2d7000
009dd24c	adrp x2,0x2b7000
009dd250	add x0,x0,#0xb1a
009dd254	add x2,x2,#0x850
009dd258	mov w1,#0xbe3
009dd25c	b 0x009dcc20
009dd260	bl 0x00c342a0
009dd264	adrp x20,0x2d7000
009dd268	add x20,x20,#0xb1a
009dd26c	adrp x2,0x2cb000
009dd270	add x2,x2,#0x654
009dd274	mov w1,#0xbb9
009dd278	mov x0,x20
009dd27c	bl 0x00c342b0
009dd280	mov w2,#0x103
009dd284	mov w1,#0x50
009dd288	movk w2,#0xc, LSL #16
009dd28c	mov x0,x19
009dd290	mov x3,xzr
009dd294	bl 0x00c34410
009dd298	ldr x0,[sp, #0x8]
009dd29c	mov w2,#0xbbf
009dd2a0	mov x1,x20
009dd2a4	bl 0x00c32310
009dd2a8	mov x0,x21
009dd2ac	bl 0x00c32450
009dd2b0	ldr x0,[x19, #0x360]
009dd2b4	ldr x1,[x19, #0x368]
009dd2b8	adrp x20,0x2d7000
009dd2bc	add x20,x20,#0xb1a
009dd2c0	mov w3,#0xcf9
009dd2c4	mov x2,x20
009dd2c8	bl 0x00c345e0
009dd2cc	ldr x0,[x19, #0x370]
009dd2d0	ldr x1,[x19, #0x378]
009dd2d4	mov w3,#0xcfd
009dd2d8	mov x2,x20
009dd2dc	str xzr,[x19, #0x368]
009dd2e0	str xzr,[x19, #0x360]
009dd2e4	bl 0x00c345e0
009dd2e8	mov w0,wzr
009dd2ec	str xzr,[x19, #0x378]
009dd2f0	str xzr,[x19, #0x370]
009dd2f4	add sp,sp,#0x310
009dd2f8	ldp x29,x30,[sp, #0x50]
009dd2fc	ldp x20,x19,[sp, #0x40]
009dd300	ldp x22,x21,[sp, #0x30]
009dd304	ldp x24,x23,[sp, #0x20]
009dd308	ldp x26,x25,[sp, #0x10]
009dd30c	ldr x28,[sp], #0x60
009dd310	ret
009dd314	bl 0x00c342a0
009dd318	adrp x0,0x2d7000
009dd31c	adrp x2,0x2cb000
009dd320	add x0,x0,#0xb1a
009dd324	add x2,x2,#0x66c
009dd328	mov w1,#0xcbf
009dd32c	b 0x009dcb58
009dd330	bl 0x00c342a0
009dd334	adrp x0,0x2d7000
009dd338	adrp x2,0x2b7000
009dd33c	add x0,x0,#0xb1a
009dd340	add x2,x2,#0x850
009dd344	mov w1,#0xbf8
009dd348	bl 0x00c342b0
009dd34c	mov w2,#0x103
009dd350	mov w1,#0x50
009dd354	movk w2,#0xc, LSL #16
009dd358	b 0x009dd388
009dd35c	bl 0x00c342a0
009dd360	adrp x0,0x2d7000
009dd364	adrp x2,0x2b7000
009dd368	add x0,x0,#0xb1a
009dd36c	add x2,x2,#0x850
009dd370	mov w1,#0xbf0
009dd374	bl 0x00c342b0
009dd378	mov w8,#0x103
009dd37c	movk w8,#0xc, LSL #16
009dd380	sub w2,w8,#0x3
009dd384	mov w1,#0x50
009dd388	mov x0,x19
009dd38c	mov x3,xzr
009dd390	bl 0x00c34410
009dd394	mov x23,xzr
009dd398	b 0x009dd58c
009dd39c	mov w23,#0x3f5
009dd3a0	add x1,sp,#0x208
009dd3a4	mov x0,x19
009dd3a8	bl 0x009e0c2c
009dd3ac	cmp w0,#0x0
009dd3b0	b.le 0x009dd4e4
009dd3b4	adrp x1,0x2d7000
009dd3b8	add x1,x1,#0xb1a
009dd3bc	mov w0,#0x20
009dd3c0	mov w2,#0xc6f
009dd3c4	bl 0x00c32320
009dd3c8	mov x21,x0
009dd3cc	cbz x0,0x009dd528
009dd3d0	ldr x8,[x19, #0x9a8]
009dd3d4	mov w2,#0x20
009dd3d8	mov x1,x21
009dd3dc	mov w3,wzr
009dd3e0	ldr x0,[x8]
009dd3e4	bl 0x00c347b0
009dd3e8	cmp w0,#0x0
009dd3ec	b.le 0x009dd5b8
009dd3f0	ldr x8,[x19, #0x918]
009dd3f4	ldr x0,[x8, #0x2b8]
009dd3f8	cbz x0,0x009dd61c
009dd3fc	ldr x8,[x19, #0x9a8]
009dd400	ldr x22,[x8]
009dd404	bl 0x00c32cb0
009dd408	ldr x8,[x19, #0x9a8]
009dd40c	mov x1,x0
009dd410	mov x0,x22
009dd414	ldr x2,[x8, #0x440]
009dd418	bl 0x00c34640
009dd41c	mov x22,x0
009dd420	cbz x0,0x009dd654
009dd424	mov x0,x22
009dd428	bl 0x00c37130
009dd42c	cmp w0,#0x0
009dd430	b.le 0x009dd684
009dd434	mov w1,#0xffffffff
009dd438	mov w2,#0x200
009dd43c	mov w3,#0x8
009dd440	mov w4,#0x20
009dd444	add x5,sp,#0x208
009dd448	mov x0,x22
009dd44c	bl 0x00c370f0
009dd450	cmp w0,#0x0
009dd454	b.le 0x009dd6b0
009dd458	mov w1,#0xffffffff
009dd45c	mov w2,#0x200
009dd460	orr w3,wzr,#0xc
009dd464	mov x0,x22
009dd468	mov w4,w23
009dd46c	mov x5,xzr
009dd470	bl 0x00c370f0
009dd474	cmp w0,#0x0
009dd478	b.le 0x009dd6cc
009dd47c	sub x2,x29,#0x48
009dd480	mov w4,#0x20
009dd484	mov x0,x22
009dd488	mov x1,xzr
009dd48c	mov x3,x21
009dd490	bl 0x00c37120
009dd494	cmp w0,#0x0
009dd498	b.le 0x009dd72c
009dd49c	ldur x1,[x29, #-0x48]
009dd4a0	add x2,sp,#0x8
009dd4a4	mov x0,x20
009dd4a8	bl 0x00c36c40
009dd4ac	cbz w0,0x009dd710
009dd4b0	ldr x1,[sp, #0x8]
009dd4b4	sub x2,x29,#0x48
009dd4b8	mov w4,#0x20
009dd4bc	mov x0,x22
009dd4c0	mov x3,x21
009dd4c4	bl 0x00c37120
009dd4c8	cmp w0,#0x0
009dd4cc	b.le 0x009dd710
009dd4d0	mov x0,x22
009dd4d4	bl 0x00c34620
009dd4d8	str x21,[x19, #0x360]
009dd4dc	mov w8,#0x20
009dd4e0	b 0x009dca54
009dd4e4	bl 0x00c342a0
009dd4e8	adrp x0,0x2d7000
009dd4ec	adrp x2,0x2a2000
009dd4f0	add x0,x0,#0xb1a
009dd4f4	add x2,x2,#0xcf
009dd4f8	mov w1,#0xc69
009dd4fc	bl 0x00c342b0
009dd500	mov w2,#0x103
009dd504	mov w1,#0x50
009dd508	movk w2,#0xc, LSL #16
009dd50c	mov x0,x19
009dd510	mov x3,xzr
009dd514	bl 0x00c34410
009dd518	mov x22,xzr
009dd51c	mov x21,xzr
009dd520	mov x20,xzr
009dd524	b 0x009dd764
009dd528	bl 0x00c342a0
009dd52c	adrp x0,0x2d7000
009dd530	adrp x2,0x2a2000
009dd534	add x0,x0,#0xb1a
009dd538	add x2,x2,#0xcf
009dd53c	mov w1,#0xc71
009dd540	bl 0x00c342b0
009dd544	mov w8,#0x103
009dd548	movk w8,#0xc, LSL #16
009dd54c	sub w2,w8,#0x3
009dd550	mov w1,#0x50
009dd554	b 0x009dd640
009dd558	bl 0x00c342a0
009dd55c	adrp x0,0x2d7000
009dd560	adrp x2,0x2b7000
009dd564	add x0,x0,#0xb1a
009dd568	add x2,x2,#0x850
009dd56c	mov w1,#0xc07
009dd570	bl 0x00c342b0
009dd574	mov w2,#0x103
009dd578	mov w1,#0x50
009dd57c	movk w2,#0xc, LSL #16
009dd580	mov x0,x19
009dd584	mov x3,xzr
009dd588	bl 0x00c34410
009dd58c	mov x0,x21
009dd590	bl 0x00c34620
009dd594	adrp x2,0x2d7000
009dd598	add x2,x2,#0xb1a
009dd59c	mov w1,#0x20
009dd5a0	mov w3,#0xc29
009dd5a4	mov x0,x22
009dd5a8	bl 0x00c345e0
009dd5ac	mov x0,x23
009dd5b0	bl 0x00c31f90
009dd5b4	b 0x009dd2b0
009dd5b8	bl 0x00c342a0
009dd5bc	adrp x0,0x2d7000
009dd5c0	adrp x2,0x2a2000
009dd5c4	add x0,x0,#0xb1a
009dd5c8	add x2,x2,#0xcf
009dd5cc	mov w1,#0xc76
009dd5d0	bl 0x00c342b0
009dd5d4	mov w2,#0x103
009dd5d8	mov w1,#0x50
009dd5dc	movk w2,#0xc, LSL #16
009dd5e0	b 0x009dd640
009dd5e4	bl 0x00c342a0
009dd5e8	adrp x0,0x2d7000
009dd5ec	adrp x2,0x2a2000
009dd5f0	add x0,x0,#0xb1a
009dd5f4	add x2,x2,#0xb9
009dd5f8	mov w1,#0xb44
009dd5fc	b 0x009dd04c
009dd600	bl 0x00c342a0
009dd604	adrp x0,0x2d7000
009dd608	adrp x2,0x2cb000
009dd60c	add x0,x0,#0xb1a
009dd610	add x2,x2,#0x66c
009dd614	mov w1,#0xcc7
009dd618	b 0x009dcc20
009dd61c	bl 0x00c342a0
009dd620	adrp x0,0x2d7000
009dd624	adrp x2,0x2a2000
009dd628	add x0,x0,#0xb1a
009dd62c	add x2,x2,#0xcf
009dd630	mov w1,#0xc7e
009dd634	bl 0x00c342b0
009dd638	mov w1,#0x28
009dd63c	mov w2,#0x14a
009dd640	mov x0,x19
009dd644	mov x3,xzr
009dd648	bl 0x00c34410
009dd64c	mov x22,xzr
009dd650	b 0x009dd760
009dd654	bl 0x00c342a0
009dd658	adrp x0,0x2d7000
009dd65c	adrp x2,0x2a2000
009dd660	add x0,x0,#0xb1a
009dd664	add x2,x2,#0xcf
009dd668	mov w1,#0xc86
009dd66c	bl 0x00c342b0
009dd670	mov w8,#0x103
009dd674	movk w8,#0xc, LSL #16
009dd678	sub w2,w8,#0x3
009dd67c	mov w1,#0x50
009dd680	b 0x009dd754
009dd684	bl 0x00c342a0
009dd688	adrp x0,0x2d7000
009dd68c	adrp x2,0x2a2000
009dd690	add x0,x0,#0xb1a
009dd694	add x2,x2,#0xcf
009dd698	mov w1,#0xc8b
009dd69c	bl 0x00c342b0
009dd6a0	mov w2,#0x103
009dd6a4	mov w1,#0x50
009dd6a8	movk w2,#0xc, LSL #16
009dd6ac	b 0x009dd754
009dd6b0	bl 0x00c342a0
009dd6b4	adrp x0,0x2d7000
009dd6b8	adrp x2,0x2a2000
009dd6bc	add x0,x0,#0xb1a
009dd6c0	add x2,x2,#0xcf
009dd6c4	mov w1,#0xc92
009dd6c8	b 0x009dd6e4
009dd6cc	bl 0x00c342a0
009dd6d0	adrp x0,0x2d7000
009dd6d4	adrp x2,0x2a2000
009dd6d8	add x0,x0,#0xb1a
009dd6dc	add x2,x2,#0xcf
009dd6e0	mov w1,#0xc98
009dd6e4	bl 0x00c342b0
009dd6e8	mov w1,#0x50
009dd6ec	mov w2,#0x112
009dd6f0	b 0x009dd754
009dd6f4	bl 0x00c342a0
009dd6f8	adrp x0,0x2d7000
009dd6fc	adrp x2,0x2b7000
009dd700	add x0,x0,#0xb1a
009dd704	add x2,x2,#0x850
009dd708	mov w1,#0xc0e
009dd70c	b 0x009dd7bc
009dd710	bl 0x00c342a0
009dd714	adrp x0,0x2d7000
009dd718	adrp x2,0x2a2000
009dd71c	add x0,x0,#0xb1a
009dd720	add x2,x2,#0xcf
009dd724	mov w1,#0xca3
009dd728	b 0x009dd744
009dd72c	bl 0x00c342a0
009dd730	adrp x0,0x2d7000
009dd734	adrp x2,0x2a2000
009dd738	add x0,x0,#0xb1a
009dd73c	add x2,x2,#0xcf
009dd740	mov w1,#0xc9d
009dd744	bl 0x00c342b0
009dd748	mov w2,#0x6
009dd74c	mov w1,#0x50
009dd750	movk w2,#0x8, LSL #16
009dd754	mov x0,x19
009dd758	mov x3,xzr
009dd75c	bl 0x00c34410
009dd760	mov w20,#0x20
009dd764	mov x0,x22
009dd768	bl 0x00c34620
009dd76c	adrp x2,0x2d7000
009dd770	add x2,x2,#0xb1a
009dd774	mov w3,#0xcaf
009dd778	mov x0,x21
009dd77c	mov x1,x20
009dd780	bl 0x00c345e0
009dd784	b 0x009dd2b0
009dd788	bl 0x00c342a0
009dd78c	adrp x0,0x2d7000
009dd790	adrp x2,0x2b7000
009dd794	add x0,x0,#0xb1a
009dd798	add x2,x2,#0x850
009dd79c	mov w1,#0xc1e
009dd7a0	b 0x009dd348
009dd7a4	bl 0x00c342a0
009dd7a8	adrp x0,0x2d7000
009dd7ac	adrp x2,0x2b7000
009dd7b0	add x0,x0,#0xb1a
009dd7b4	add x2,x2,#0x850
009dd7b8	mov w1,#0xc17
009dd7bc	bl 0x00c342b0
009dd7c0	mov w1,#0x50
009dd7c4	mov w2,#0x112
009dd7c8	b 0x009dd388
