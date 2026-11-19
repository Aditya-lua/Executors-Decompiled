; tls_process_certificate_request @ 009df5ec
009df5ec	sub sp,sp,#0x60
009df5f0	add x8,x0,#0x3b8
009df5f4	add x9,x0,#0x3c8
009df5f8	movi v0.2D,#0x0
009df5fc	stp x24,x23,[sp, #0x20]
009df600	stp x22,x21,[sp, #0x30]
009df604	stp x20,x19,[sp, #0x40]
009df608	stp x29,x30,[sp, #0x50]
009df60c	str q0,[x9]
009df610	str q0,[x8]
009df614	ldr x8,[x0, #0x8]
009df618	str wzr,[x0, #0x3d8]
009df61c	mov x19,x0
009df620	mov x20,x1
009df624	ldr x9,[x8, #0xc0]
009df628	add x29,sp,#0x50
009df62c	ldrb w9,[x9, #0x60]
009df630	tbnz w9,#0x3,0x009df6cc
009df634	ldr w8,[x8]
009df638	cmp w8,#0x304
009df63c	b.lt 0x009df6cc
009df640	cmp w8,#0x10, LSL #12
009df644	b.eq 0x009df6cc
009df648	str xzr,[sp, #0x8]
009df64c	ldrb w8,[x19, #0x44]
009df650	tbnz w8,#0x0,0x009df7cc
009df654	ldr x0,[x19, #0x2f8]
009df658	adrp x21,0x2d7000
009df65c	add x21,x21,#0xb1a
009df660	mov w2,#0x935
009df664	mov x1,x21
009df668	add x22,x19,#0x2f8
009df66c	bl 0x00c32310
009df670	movi v0.2D,#0x0
009df674	str q0,[x22]
009df678	ldr x0,[x19, #0xbb0]
009df67c	mov w2,#0x938
009df680	mov x1,x21
009df684	bl 0x00c32310
009df688	movi v0.2D,#0x0
009df68c	str q0,[x19, #0xbb0]
009df690	mov x23,x20
009df694	ldr x8,[x23, #0x8]!
009df698	cbz x8,0x009df6b0
009df69c	ldr x22,[x20]
009df6a0	sub x8,x8,#0x1
009df6a4	ldrb w21,[x22], #0x1
009df6a8	subs x8,x8,x21
009df6ac	b.cs 0x009df844
009df6b0	bl 0x00c342a0
009df6b4	adrp x0,0x2d7000
009df6b8	adrp x2,0x2d5000
009df6bc	add x0,x0,#0xb1a
009df6c0	add x2,x2,#0xa31
009df6c4	mov w1,#0x93e
009df6c8	b 0x009df704
009df6cc	mov x23,x20
009df6d0	ldr x8,[x23, #0x8]!
009df6d4	cbz x8,0x009df6ec
009df6d8	ldr x22,[x20]
009df6dc	sub x8,x8,#0x1
009df6e0	ldrb w21,[x22], #0x1
009df6e4	subs x8,x8,x21
009df6e8	b.cs 0x009df738
009df6ec	bl 0x00c342a0
009df6f0	adrp x0,0x2d7000
009df6f4	adrp x2,0x2d5000
009df6f8	add x0,x0,#0xb1a
009df6fc	add x2,x2,#0xa31
009df700	mov w1,#0x959
009df704	bl 0x00c342b0
009df708	mov w1,#0x32
009df70c	mov w2,#0x9f
009df710	mov x0,x19
009df714	mov x3,xzr
009df718	bl 0x00c34410
009df71c	mov w0,wzr
009df720	ldp x29,x30,[sp, #0x50]
009df724	ldp x20,x19,[sp, #0x40]
009df728	ldp x22,x21,[sp, #0x30]
009df72c	ldp x24,x23,[sp, #0x20]
009df730	add sp,sp,#0x60
009df734	ret
009df738	add x9,x22,x21
009df73c	stp x9,x8,[x20]
009df740	ldr x0,[x19, #0x2f8]
009df744	adrp x1,0x2d1000
009df748	add x1,x1,#0x573
009df74c	mov w2,#0x1c6
009df750	bl 0x00c32310
009df754	str xzr,[x19, #0x300]
009df758	str xzr,[x19, #0x2f8]
009df75c	cbz w21,0x009df788
009df760	adrp x2,0x2d1000
009df764	add x2,x2,#0x573
009df768	mov w3,#0x1cf
009df76c	mov x0,x22
009df770	mov x1,x21
009df774	add x24,x19,#0x2f8
009df778	bl 0x00c345f0
009df77c	str x0,[x24]
009df780	cbz x0,0x009df814
009df784	str x21,[x19, #0x300]
009df788	ldr x8,[x19, #0x8]
009df78c	ldr x8,[x8, #0xc0]
009df790	ldrb w8,[x8, #0x60]
009df794	tbnz w8,#0x1,0x009df7d4
009df798	mov x0,x19
009df79c	mov x1,x20
009df7a0	bl 0x00c36f00
009df7a4	cbz w0,0x009df720
009df7a8	ldr x8,[x23]
009df7ac	cbz x8,0x009df8dc
009df7b0	bl 0x00c342a0
009df7b4	adrp x0,0x2d7000
009df7b8	adrp x2,0x2d5000
009df7bc	add x0,x0,#0xb1a
009df7c0	add x2,x2,#0xa31
009df7c4	mov w1,#0x981
009df7c8	b 0x009df704
009df7cc	mov w0,#0x1
009df7d0	b 0x009df720
009df7d4	ldr x8,[x23]
009df7d8	subs x10,x8,#0x2
009df7dc	b.cc 0x009df7f8
009df7e0	ldr x9,[x20]
009df7e4	ldrb w11,[x9]
009df7e8	ldrb w8,[x9, #0x1]
009df7ec	bfm x8,x11,#0x38,#0x7
009df7f0	subs x10,x10,x8
009df7f4	b.cs 0x009df91c
009df7f8	bl 0x00c342a0
009df7fc	adrp x0,0x2d7000
009df800	adrp x2,0x2d5000
009df804	add x0,x0,#0xb1a
009df808	add x2,x2,#0xa31
009df80c	mov w1,#0x966
009df810	b 0x009df704
009df814	bl 0x00c342a0
009df818	adrp x0,0x2d7000
009df81c	adrp x2,0x2d5000
009df820	add x0,x0,#0xb1a
009df824	add x2,x2,#0xa31
009df828	mov w1,#0x95e
009df82c	bl 0x00c342b0
009df830	mov w8,#0x100
009df834	movk w8,#0xc, LSL #16
009df838	add w2,w8,#0x3
009df83c	mov w1,#0x50
009df840	b 0x009df710
009df844	add x9,x22,x21
009df848	add x24,x19,#0xbb0
009df84c	stp x9,x8,[x20]
009df850	ldr x0,[x24]
009df854	adrp x1,0x2d1000
009df858	add x1,x1,#0x573
009df85c	mov w2,#0x1c6
009df860	bl 0x00c32310
009df864	stp xzr,xzr,[x24]
009df868	cbz w21,0x009df890
009df86c	adrp x2,0x2d1000
009df870	add x2,x2,#0x573
009df874	mov w3,#0x1cf
009df878	mov x0,x22
009df87c	mov x1,x21
009df880	bl 0x00c345f0
009df884	str x0,[x24]
009df888	cbz x0,0x009df6b0
009df88c	str x21,[x19, #0xbb8]
009df890	ldr x8,[x23]
009df894	subs x10,x8,#0x2
009df898	b.cc 0x009df8b4
009df89c	ldr x9,[x20]
009df8a0	ldrb w11,[x9]
009df8a4	ldrb w8,[x9, #0x1]
009df8a8	bfm x8,x11,#0x38,#0x7
009df8ac	subs x10,x10,x8
009df8b0	b.cs 0x009df9a0
009df8b4	bl 0x00c342a0
009df8b8	adrp x0,0x2d7000
009df8bc	adrp x2,0x2d5000
009df8c0	add x0,x0,#0xb1a
009df8c4	add x2,x2,#0xa31
009df8c8	mov w1,#0x943
009df8cc	bl 0x00c342b0
009df8d0	mov w1,#0x32
009df8d4	mov w2,#0x10f
009df8d8	b 0x009df710
009df8dc	ldr x8,[x19, #0x8]
009df8e0	mov w9,#0x1
009df8e4	str w9,[x19, #0x2f0]
009df8e8	ldr x9,[x8, #0xc0]
009df8ec	ldrb w9,[x9, #0x60]
009df8f0	tbnz w9,#0x3,0x009df914
009df8f4	ldr w8,[x8]
009df8f8	cmp w8,#0x304
009df8fc	b.lt 0x009df914
009df900	cmp w8,#0x10, LSL #12
009df904	b.eq 0x009df914
009df908	ldr w8,[x19, #0xba8]
009df90c	cmp w8,#0x4
009df910	b.ne 0x009dfa4c
009df914	mov w0,#0x2
009df918	b 0x009df720
009df91c	add x9,x9,#0x2
009df920	add x11,x9,x8
009df924	add x1,sp,#0x10
009df928	mov x0,x19
009df92c	mov w2,wzr
009df930	stp x11,x10,[x20]
009df934	stp x9,x8,[sp, #0x10]
009df938	bl 0x00c36770
009df93c	cbz w0,0x009df978
009df940	mov x0,x19
009df944	bl 0x00c36760
009df948	cbnz w0,0x009df798
009df94c	bl 0x00c342a0
009df950	adrp x0,0x2d7000
009df954	adrp x2,0x2d5000
009df958	add x0,x0,#0xb1a
009df95c	add x2,x2,#0xa31
009df960	mov w1,#0x974
009df964	bl 0x00c342b0
009df968	mov w2,#0x100
009df96c	mov w1,#0x50
009df970	movk w2,#0xc, LSL #16
009df974	b 0x009df710
009df978	bl 0x00c342a0
009df97c	adrp x0,0x2d7000
009df980	adrp x2,0x2d5000
009df984	add x0,x0,#0xb1a
009df988	add x2,x2,#0xa31
009df98c	mov w1,#0x970
009df990	bl 0x00c342b0
009df994	mov w1,#0x50
009df998	mov w2,#0x168
009df99c	b 0x009df710
009df9a0	add x9,x9,#0x2
009df9a4	add x11,x9,x8
009df9a8	add x1,sp,#0x10
009df9ac	mov w2,#0x4000
009df9b0	add x3,sp,#0x8
009df9b4	mov w5,#0x1
009df9b8	mov x0,x19
009df9bc	mov x4,xzr
009df9c0	stp x11,x10,[x20]
009df9c4	stp x9,x8,[sp, #0x10]
009df9c8	bl 0x00c36e50
009df9cc	cbz w0,0x009dfa34
009df9d0	ldr x2,[sp, #0x8]
009df9d4	mov w1,#0x4000
009df9d8	mov w5,#0x1
009df9dc	mov x0,x19
009df9e0	mov x3,xzr
009df9e4	mov x4,xzr
009df9e8	bl 0x00c36e70
009df9ec	cbz w0,0x009dfa34
009df9f0	ldr x0,[sp, #0x8]
009df9f4	adrp x1,0x2d7000
009df9f8	add x1,x1,#0xb1a
009df9fc	mov w2,#0x94f
009dfa00	bl 0x00c32310
009dfa04	mov x0,x19
009dfa08	bl 0x00c36760
009dfa0c	cbnz w0,0x009df7a8
009dfa10	bl 0x00c342a0
009dfa14	adrp x0,0x2d7000
009dfa18	adrp x2,0x2d5000
009dfa1c	add x0,x0,#0xb1a
009dfa20	add x2,x2,#0xa31
009dfa24	mov w1,#0x951
009dfa28	bl 0x00c342b0
009dfa2c	mov w1,#0x50
009dfa30	b 0x009df8d4
009dfa34	ldr x0,[sp, #0x8]
009dfa38	adrp x1,0x2d7000
009dfa3c	add x1,x1,#0xb1a
009dfa40	mov w2,#0x94c
009dfa44	bl 0x00c32310
009dfa48	b 0x009df71c
009dfa4c	orr w0,wzr,#0x3
009dfa50	b 0x009df720
