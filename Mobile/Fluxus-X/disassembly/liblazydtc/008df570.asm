; FUN_008df570 @ 008df570
008df570	stp x29,x30,[sp, #-0x30]!
008df574	str x21,[sp, #0x10]
008df578	stp x20,x19,[sp, #0x20]
008df57c	mov x29,sp
008df580	mov w1,wzr
008df584	mov w2,#0x888
008df588	mov x19,x0
008df58c	bl 0x00c301c0
008df590	mov w0,#0x10
008df594	bl 0x00c2fed0
008df598	adrp x8,0x29c000
008df59c	mov w1,#0x10
008df5a0	ldr q0,[x8, #0xb70]
008df5a4	str q0,[x0]
008df5a8	ldr q0,[x0]
008df5ac	str q0,[x19]
008df5b0	bl 0x00c2fe80
008df5b4	mov w0,#0x10000
008df5b8	bl 0x00c2fed0
008df5bc	mov w1,wzr
008df5c0	mov w2,#0x10000
008df5c4	mov x20,x0
008df5c8	add x21,x0,#0xf, LSL #12
008df5cc	bl 0x00c301c0
008df5d0	adrp x8,0x364000
008df5d4	add x8,x8,#0xedc
008df5d8	mov x9,#-0xffc0
008df5dc	mov w10,#0xffc0
008df5e0	mov w11,#0xffe0
008df5e4	sub x12,x8,#0x8
008df5e8	add x13,x8,#0x18
008df5ec	ld2 {v0.2D,v1.2D},[x12]
008df5f0	add x12,x20,x9
008df5f4	adds x9,x9,#0x40
008df5f8	ld4 {v2.4S,v3.4S,v4.4S,v5.4S},[x8], #0x40
008df5fc	ld2 {v6.2D,v7.2D},[x13]
008df600	add x13,x12,x10
008df604	add x12,x12,x11
008df608	uxtl v1.2D,v2.2S
008df60c	uxtl2 v7.2D,v2.4S
008df610	st2 {v0.2D,v1.2D},[x13]
008df614	st2 {v6.2D,v7.2D},[x12]
008df618	b.ne 0x008df5e4
008df61c	mov x8,#0x87d5
008df620	mov w9,#0x387c
008df624	ldur x0,[x19, #0x10]
008df628	movk x8,#0xed7e, LSL #16
008df62c	movk w9,#0x4536, LSL #16
008df630	movk x8,#0x9926, LSL #32
008df634	str x9,[x21, #0xfc8]
008df638	movk x8,#0x1e1, LSL #48
008df63c	str x8,[x21, #0xfc0]
008df640	mov x8,#0x238a
008df644	movk x8,#0x8a63, LSL #16
008df648	movk x8,#0xcc88, LSL #32
008df64c	movk x8,#0xa1e, LSL #48
008df650	str x8,[x21, #0xfd0]
008df654	mov w8,#0x5f48
008df658	movk w8,#0x410e, LSL #16
008df65c	str x8,[x21, #0xfd8]
008df660	mov x8,#0x1f3
008df664	movk x8,#0x86af, LSL #16
008df668	movk x8,#0x74f4, LSL #32
008df66c	movk x8,#0xd60d, LSL #48
008df670	str x8,[x21, #0xfe0]
008df674	mov w8,#0xe7b5
008df678	movk w8,#0x9e76, LSL #16
008df67c	str x8,[x21, #0xfe8]
008df680	mov x8,#0xa5ac
008df684	movk x8,#0xe1b2, LSL #16
008df688	movk x8,#0x215a, LSL #32
008df68c	movk x8,#0xddf2, LSL #48
008df690	str x8,[x21, #0xff0]
008df694	mov w8,#0x8081
008df698	movk w8,#0x9a4e, LSL #16
008df69c	str x8,[x21, #0xff8]
008df6a0	add x21,x20,#0x10, LSL #12
008df6a4	cbz x0,0x008df6c0
008df6a8	ldr x8,[x19, #0x20]
008df6ac	str x0,[x19, #0x18]
008df6b0	sub x1,x8,x0
008df6b4	bl 0x00c2fe80
008df6b8	stp xzr,xzr,[x19, #0x10]
008df6bc	stur xzr,[x19, #0x20]
008df6c0	stp x20,x21,[x19, #0x10]
008df6c4	str x21,[x19, #0x20]
008df6c8	mov w0,#0x10000
008df6cc	bl 0x00c2fed0
008df6d0	mov w1,wzr
008df6d4	mov w2,#0x10000
008df6d8	mov x20,x0
008df6dc	add x21,x0,#0xf, LSL #12
008df6e0	bl 0x00c301c0
008df6e4	adrp x8,0x374000
008df6e8	add x8,x8,#0xedc
008df6ec	mov x9,#-0xffc0
008df6f0	mov w10,#0xffc0
008df6f4	mov w11,#0xffe0
008df6f8	sub x12,x8,#0x8
008df6fc	add x13,x8,#0x18
008df700	ld2 {v0.2D,v1.2D},[x12]
008df704	add x12,x20,x9
008df708	adds x9,x9,#0x40
008df70c	ld4 {v2.4S,v3.4S,v4.4S,v5.4S},[x8], #0x40
008df710	ld2 {v6.2D,v7.2D},[x13]
008df714	add x13,x12,x10
008df718	add x12,x12,x11
008df71c	uxtl v1.2D,v2.2S
008df720	uxtl2 v7.2D,v2.4S
008df724	st2 {v0.2D,v1.2D},[x13]
008df728	st2 {v6.2D,v7.2D},[x12]
008df72c	b.ne 0x008df6f8
008df730	mov x8,#0x1ec2
008df734	mov w9,#0xf61e
008df738	ldur x0,[x19, #0x28]
008df73c	movk x8,#0x6fc, LSL #16
008df740	movk w9,#0x8052, LSL #16
008df744	movk x8,#0x9732, LSL #32
008df748	str x9,[x21, #0xfc8]
008df74c	movk x8,#0x76bc, LSL #48
008df750	str x8,[x21, #0xfc0]
008df754	mov x8,#0xa24b
008df758	movk x8,#0xba7d, LSL #16
008df75c	movk x8,#0x6a6, LSL #32
008df760	movk x8,#0x8f8a, LSL #48
008df764	str x8,[x21, #0xfd0]
008df768	mov w8,#0x2d08
008df76c	movk w8,#0x3671, LSL #16
008df770	str x8,[x21, #0xfd8]
008df774	mov x8,#0xda0a
008df778	movk x8,#0xfd48, LSL #16
008df77c	movk x8,#0x2f0f, LSL #32
008df780	movk x8,#0xd9c2, LSL #48
008df784	str x8,[x21, #0xfe0]
008df788	mov w8,#0x28f7
008df78c	movk w8,#0xf13, LSL #16
008df790	str x8,[x21, #0xfe8]
008df794	mov x8,#0xa3f6
008df798	movk x8,#0x2b52, LSL #16
008df79c	movk x8,#0x968d, LSL #32
008df7a0	movk x8,#0x24a6, LSL #48
008df7a4	str x8,[x21, #0xff0]
008df7a8	mov w8,#0x392f
008df7ac	movk w8,#0xdfe8, LSL #16
008df7b0	str x8,[x21, #0xff8]
008df7b4	add x21,x20,#0x10, LSL #12
008df7b8	cbz x0,0x008df7d4
008df7bc	ldr x8,[x19, #0x38]
008df7c0	str x0,[x19, #0x30]
008df7c4	sub x1,x8,x0
008df7c8	bl 0x00c2fe80
008df7cc	stp xzr,xzr,[x19, #0x28]
008df7d0	stur xzr,[x19, #0x38]
008df7d4	stp x20,x21,[x19, #0x28]
008df7d8	str x21,[x19, #0x38]
008df7dc	mov w0,#0x3c0000
008df7e0	bl 0x00c2fed0
008df7e4	mov w1,wzr
008df7e8	mov w2,#0x3c0000
008df7ec	mov x20,x0
008df7f0	add x21,x0,#0x3bf, LSL #12
008df7f4	bl 0x00c301c0
008df7f8	mov w10,#0xffc0
008df7fc	mov x8,xzr
008df800	adrp x9,0x384000
008df804	add x9,x9,#0xedc
008df808	movk w10,#0x3b, LSL #16
008df80c	sub x11,x9,#0x8
008df810	add x12,x9,#0x18
008df814	ld2 {v0.2D,v1.2D},[x11]
008df818	add x11,x20,x8
008df81c	add x8,x8,#0x40
008df820	ld4 {v2.4S,v3.4S,v4.4S,v5.4S},[x9], #0x40
008df824	cmp x8,x10
008df828	ld2 {v6.2D,v7.2D},[x12]
008df82c	uxtl v1.2D,v2.2S
008df830	uxtl2 v7.2D,v2.4S
008df834	st2 {v0.2D,v1.2D},[x11], #0x20
008df838	st2 {v6.2D,v7.2D},[x11]
008df83c	b.ne 0x008df80c
008df840	mov x8,#0xd6b7
008df844	mov w9,#0xe59
008df848	ldur x0,[x19, #0x40]
008df84c	movk x8,#0x651b, LSL #16
008df850	movk w9,#0x51a2, LSL #16
008df854	movk x8,#0xbbca, LSL #32
008df858	str x9,[x21, #0xfc8]
008df85c	movk x8,#0x6ab0, LSL #48
008df860	str x8,[x21, #0xfc0]
008df864	mov x8,#0x546f
008df868	movk x8,#0x6a04, LSL #16
008df86c	movk x8,#0xa3e2, LSL #32
008df870	movk x8,#0xddbf, LSL #48
008df874	str x8,[x21, #0xfd0]
008df878	mov w8,#0xde0d
008df87c	movk w8,#0xa785, LSL #16
008df880	str x8,[x21, #0xfd8]
008df884	mov x8,#0x4e29
008df888	movk x8,#0xed17, LSL #16
008df88c	movk x8,#0xf76a, LSL #32
008df890	movk x8,#0x508a, LSL #48
008df894	str x8,[x21, #0xfe0]
008df898	mov w8,#0xaade
008df89c	movk w8,#0x8090, LSL #16
008df8a0	str x8,[x21, #0xfe8]
008df8a4	mov x8,#0xccf1
008df8a8	movk x8,#0xe208, LSL #16
008df8ac	movk x8,#0xef42, LSL #32
008df8b0	movk x8,#0xe785, LSL #48
008df8b4	str x8,[x21, #0xff0]
008df8b8	mov w8,#0x7a8a
008df8bc	movk w8,#0x76b7, LSL #16
008df8c0	str x8,[x21, #0xff8]
008df8c4	add x21,x20,#0x3c0, LSL #12
008df8c8	cbz x0,0x008df8e4
008df8cc	ldr x8,[x19, #0x50]
008df8d0	str x0,[x19, #0x48]
008df8d4	sub x1,x8,x0
008df8d8	bl 0x00c2fe80
008df8dc	stp xzr,xzr,[x19, #0x40]
008df8e0	stur xzr,[x19, #0x50]
008df8e4	stp x20,x21,[x19, #0x40]
008df8e8	str x21,[x19, #0x50]
008df8ec	mov x0,x19
008df8f0	bl 0x008de870
008df8f4	ldp x20,x19,[sp, #0x20]
008df8f8	ldr x21,[sp, #0x10]
008df8fc	ldp x29,x30,[sp], #0x30
008df900	ret
