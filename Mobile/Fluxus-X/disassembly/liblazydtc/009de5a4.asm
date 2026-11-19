; tls_process_server_certificate @ 009de5a4
009de5a4	sub sp,sp,#0x70
009de5a8	stp x24,x23,[sp, #0x30]
009de5ac	stp x22,x21,[sp, #0x40]
009de5b0	stp x20,x19,[sp, #0x50]
009de5b4	stp x29,x30,[sp, #0x60]
009de5b8	add x29,sp,#0x60
009de5bc	mov x20,x1
009de5c0	mov x19,x0
009de5c4	str xzr,[sp, #0x28]
009de5c8	bl 0x00c34780
009de5cc	ldr x8,[x19, #0x918]
009de5d0	str x0,[x8, #0x2c0]
009de5d4	cbz x0,0x009de7e8
009de5d8	ldr x8,[x19, #0x8]
009de5dc	ldr x9,[x8, #0xc0]
009de5e0	ldrb w9,[x9, #0x60]
009de5e4	tbnz w9,#0x3,0x009de618
009de5e8	ldr w8,[x8]
009de5ec	cmp w8,#0x304
009de5f0	b.lt 0x009de618
009de5f4	cmp w8,#0x10, LSL #12
009de5f8	b.eq 0x009de618
009de5fc	ldr x8,[x20, #0x8]
009de600	cbz x8,0x009de7c0
009de604	ldr x9,[x20]
009de608	sub x8,x8,#0x1
009de60c	ldrb w10,[x9], #0x1
009de610	stp x9,x8,[x20]
009de614	cbnz w10,0x009de7c0
009de618	ldr x10,[x20, #0x8]
009de61c	cmp x10,#0x3
009de620	b.cc 0x009de7c0
009de624	ldr x12,[x20]
009de628	subs x10,x10,#0x3
009de62c	ldrb w11,[x12]
009de630	ldrb w9,[x12, #0x1]
009de634	ldrb w8,[x12, #0x2]
009de638	add x12,x12,#0x3
009de63c	stp x12,x10,[x20]
009de640	b.eq 0x009de7c0
009de644	lsl x11,x11,#0x10
009de648	bfm x11,x9,#0x38,#0x7
009de64c	orr x8,x11,x8
009de650	cmp x10,x8
009de654	b.ne 0x009de7c0
009de658	adrp x22,0x2d7000
009de65c	mov x21,xzr
009de660	add x22,x22,#0xb1a
009de664	subs x8,x8,#0x3
009de668	b.cc 0x009de85c
009de66c	ldr x9,[x20]
009de670	ldrb w10,[x9]
009de674	ldrb w11,[x9, #0x1]
009de678	ldrb w12,[x9, #0x2]
009de67c	add x9,x9,#0x3
009de680	lsl x10,x10,#0x10
009de684	bfm x10,x11,#0x38,#0x7
009de688	orr x23,x10,x12
009de68c	subs x10,x8,x23
009de690	stp x9,x8,[x20]
009de694	b.cc 0x009de85c
009de698	add x24,x9,x23
009de69c	str x9,[sp, #0x20]
009de6a0	stp x24,x10,[x20]
009de6a4	ldr x8,[x19, #0x9a8]
009de6a8	ldr x0,[x8]
009de6ac	ldr x1,[x8, #0x440]
009de6b0	bl 0x00c350a0
009de6b4	str x0,[sp, #0x28]
009de6b8	cbz x0,0x009de878
009de6bc	add x0,sp,#0x28
009de6c0	add x1,sp,#0x20
009de6c4	mov x2,x23
009de6c8	bl 0x00c35ca0
009de6cc	cbz x0,0x009de8e0
009de6d0	ldr x8,[sp, #0x20]
009de6d4	cmp x8,x24
009de6d8	b.ne 0x009de90c
009de6dc	ldr x8,[x19, #0x8]
009de6e0	ldr x9,[x8, #0xc0]
009de6e4	ldrb w9,[x9, #0x60]
009de6e8	tbnz w9,#0x3,0x009de794
009de6ec	ldr w8,[x8]
009de6f0	cmp w8,#0x304
009de6f4	b.lt 0x009de794
009de6f8	cmp w8,#0x10, LSL #12
009de6fc	b.eq 0x009de794
009de700	str xzr,[sp, #0x18]
009de704	ldr x8,[x20, #0x8]
009de708	subs x9,x8,#0x2
009de70c	b.cc 0x009de950
009de710	ldr x10,[x20]
009de714	ldrb w11,[x10]
009de718	ldrb w8,[x10, #0x1]
009de71c	bfm x8,x11,#0x38,#0x7
009de720	subs x9,x9,x8
009de724	b.cc 0x009de950
009de728	add x10,x10,#0x2
009de72c	cmp x21,#0x0
009de730	add x11,x10,x8
009de734	cset w5,eq
009de738	add x1,sp,#0x8
009de73c	mov w2,#0x1000
009de740	add x3,sp,#0x18
009de744	mov x0,x19
009de748	mov x4,xzr
009de74c	stp x11,x9,[x20]
009de750	stp x10,x8,[sp, #0x8]
009de754	bl 0x00c36e50
009de758	cbz w0,0x009de978
009de75c	ldr x8,[x20, #0x8]
009de760	ldr x2,[sp, #0x18]
009de764	ldr x3,[sp, #0x28]
009de768	mov w1,#0x1000
009de76c	cmp x8,#0x0
009de770	cset w5,eq
009de774	mov x0,x19
009de778	mov x4,x21
009de77c	bl 0x00c36e70
009de780	cbz w0,0x009de978
009de784	ldr x0,[sp, #0x18]
009de788	mov w2,#0x72d
009de78c	mov x1,x22
009de790	bl 0x00c32310
009de794	ldr x8,[x19, #0x918]
009de798	ldr x1,[sp, #0x28]
009de79c	ldr x0,[x8, #0x2c0]
009de7a0	bl 0x00c347a0
009de7a4	cbz w0,0x009de934
009de7a8	str xzr,[sp, #0x28]
009de7ac	ldr x8,[x20, #0x8]
009de7b0	add x21,x21,#0x1
009de7b4	mov w0,#0x2
009de7b8	cbnz x8,0x009de664
009de7bc	b 0x009de844
009de7c0	bl 0x00c342a0
009de7c4	adrp x0,0x2d7000
009de7c8	adrp x2,0x29d000
009de7cc	add x0,x0,#0xb1a
009de7d0	add x2,x2,#0xeda
009de7d4	mov w1,#0x6ff
009de7d8	bl 0x00c342b0
009de7dc	mov w1,#0x32
009de7e0	mov w2,#0x9f
009de7e4	b 0x009de810
009de7e8	bl 0x00c342a0
009de7ec	adrp x0,0x2d7000
009de7f0	adrp x2,0x29d000
009de7f4	add x0,x0,#0xb1a
009de7f8	add x2,x2,#0xeda
009de7fc	mov w1,#0x6f6
009de800	bl 0x00c342b0
009de804	mov w2,#0x100
009de808	mov w1,#0x50
009de80c	movk w2,#0xc, LSL #16
009de810	mov x0,x19
009de814	mov x3,xzr
009de818	bl 0x00c34410
009de81c	ldr x0,[sp, #0x28]
009de820	bl 0x00c31a90
009de824	ldr x8,[x19, #0x918]
009de828	adrp x1,0xcb4000
009de82c	ldr x0,[x8, #0x2c0]
009de830	ldr x1,[x1, #0xd88]
009de834	bl 0x00c32600
009de838	ldr x8,[x19, #0x918]
009de83c	mov w0,wzr
009de840	str xzr,[x8, #0x2c0]
009de844	ldp x29,x30,[sp, #0x60]
009de848	ldp x20,x19,[sp, #0x50]
009de84c	ldp x22,x21,[sp, #0x40]
009de850	ldp x24,x23,[sp, #0x30]
009de854	add sp,sp,#0x70
009de858	ret
009de85c	bl 0x00c342a0
009de860	adrp x0,0x2d7000
009de864	adrp x2,0x29d000
009de868	add x0,x0,#0xb1a
009de86c	add x2,x2,#0xeda
009de870	mov w1,#0x705
009de874	b 0x009de924
009de878	bl 0x00c342a0
009de87c	adrp x20,0x2d7000
009de880	adrp x21,0x29d000
009de884	add x20,x20,#0xb1a
009de888	add x21,x21,#0xeda
009de88c	mov w1,#0x70c
009de890	mov x0,x20
009de894	mov x2,x21
009de898	bl 0x00c342b0
009de89c	mov w2,#0x100
009de8a0	mov w1,#0x32
009de8a4	movk w2,#0xc, LSL #16
009de8a8	mov x0,x19
009de8ac	mov x3,xzr
009de8b0	bl 0x00c34410
009de8b4	bl 0x00c342a0
009de8b8	mov w1,#0x70d
009de8bc	mov x0,x20
009de8c0	mov x2,x21
009de8c4	bl 0x00c342b0
009de8c8	mov w1,#0x100
009de8cc	mov w0,#0x14
009de8d0	movk w1,#0xc, LSL #16
009de8d4	mov x2,xzr
009de8d8	bl 0x00c342c0
009de8dc	b 0x009de81c
009de8e0	bl 0x00c342a0
009de8e4	adrp x0,0x2d7000
009de8e8	adrp x2,0x29d000
009de8ec	add x0,x0,#0xb1a
009de8f0	add x2,x2,#0xeda
009de8f4	mov w1,#0x712
009de8f8	bl 0x00c342b0
009de8fc	mov w2,#0xd
009de900	mov w1,#0x2a
009de904	movk w2,#0x8, LSL #16
009de908	b 0x009de810
009de90c	bl 0x00c342a0
009de910	adrp x0,0x2d7000
009de914	adrp x2,0x29d000
009de918	add x0,x0,#0xb1a
009de91c	add x2,x2,#0xeda
009de920	mov w1,#0x717
009de924	bl 0x00c342b0
009de928	mov w1,#0x32
009de92c	mov w2,#0x87
009de930	b 0x009de810
009de934	bl 0x00c342a0
009de938	adrp x0,0x2d7000
009de93c	adrp x2,0x29d000
009de940	add x0,x0,#0xb1a
009de944	add x2,x2,#0xeda
009de948	mov w1,#0x731
009de94c	b 0x009de800
009de950	bl 0x00c342a0
009de954	adrp x0,0x2d7000
009de958	adrp x2,0x29d000
009de95c	add x0,x0,#0xb1a
009de960	add x2,x2,#0xeda
009de964	mov w1,#0x720
009de968	bl 0x00c342b0
009de96c	mov w1,#0x32
009de970	mov w2,#0x10f
009de974	b 0x009de810
009de978	ldr x0,[sp, #0x18]
009de97c	adrp x1,0x2d7000
009de980	add x1,x1,#0xb1a
009de984	mov w2,#0x729
009de988	bl 0x00c32310
009de98c	b 0x009de81c
