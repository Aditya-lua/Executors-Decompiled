; dtls1_process_record @ 009cf51c
009cf51c	sub sp,sp,#0xa0
009cf520	stp x24,x23,[sp, #0x60]
009cf524	stp x22,x21,[sp, #0x70]
009cf528	stp x20,x19,[sp, #0x80]
009cf52c	stp x29,x30,[sp, #0x90]
009cf530	stp xzr,xzr,[sp]
009cf534	ldr x9,[x0, #0x1ca8]
009cf538	ldr x8,[x0, #0x12b0]
009cf53c	ldr x23,[x0, #0x918]
009cf540	mov w10,#0x4541
009cf544	mov x19,x0
009cf548	add x9,x9,#0xd
009cf54c	cmp x8,x10
009cf550	str x25,[sp, #0x50]
009cf554	add x29,sp,#0x90
009cf558	str x9,[x0, #0x12d0]
009cf55c	b.cc 0x009cf598
009cf560	bl 0x00c342a0
009cf564	adrp x0,0x2cf000
009cf568	adrp x2,0x2af000
009cf56c	add x0,x0,#0x7d6
009cf570	add x2,x2,#0xb94
009cf574	mov w1,#0x60c
009cf578	bl 0x00c342b0
009cf57c	mov w1,#0x16
009cf580	mov w2,#0x96
009cf584	mov x0,x19
009cf588	mov x3,xzr
009cf58c	bl 0x00c34410
009cf590	mov w20,wzr
009cf594	b 0x009cf8e8
009cf598	ldr x0,[x19, #0x860]
009cf59c	mov x20,x1
009cf5a0	str x9,[x19, #0x12c8]
009cf5a4	str x8,[x19, #0x12b8]
009cf5a8	cbz x0,0x009cf5c8
009cf5ac	bl 0x00c34c00
009cf5b0	cbz x0,0x009cf5c8
009cf5b4	bl 0x00c34c20
009cf5b8	cmp w0,#0x40
009cf5bc	b.hi 0x009cf618
009cf5c0	sxtw x21,w0
009cf5c4	b 0x009cf5cc
009cf5c8	mov x21,xzr
009cf5cc	ldrb w8,[x19, #0xa9]
009cf5d0	mov w9,#0x12a8
009cf5d4	add x22,x19,x9
009cf5d8	tbz w8,#0x0,0x009cf6b8
009cf5dc	ldr x8,[x19, #0x860]
009cf5e0	cbz x8,0x009cf6b8
009cf5e4	ldr x8,[x19, #0x12b8]
009cf5e8	cmp x8,x21
009cf5ec	b.cs 0x009cf644
009cf5f0	bl 0x00c342a0
009cf5f4	adrp x0,0x2cf000
009cf5f8	adrp x2,0x2af000
009cf5fc	add x0,x0,#0x7d6
009cf600	add x2,x2,#0xb94
009cf604	mov w1,#0x625
009cf608	bl 0x00c342b0
009cf60c	mov w1,#0x32
009cf610	mov w2,#0xa0
009cf614	b 0x009cf584
009cf618	bl 0x00c342a0
009cf61c	adrp x0,0x2cf000
009cf620	adrp x2,0x2af000
009cf624	add x0,x0,#0x7d6
009cf628	add x2,x2,#0xb94
009cf62c	mov w1,#0x61a
009cf630	bl 0x00c342b0
009cf634	mov w2,#0x6
009cf638	mov w1,#0x50
009cf63c	movk w2,#0x8, LSL #16
009cf640	b 0x009cf584
009cf644	ldr x8,[x19, #0x12b0]
009cf648	ldr x9,[x19, #0x8]
009cf64c	ldr x25,[x19, #0x12c8]
009cf650	add x2,sp,#0x10
009cf654	sub x24,x8,x21
009cf658	str x24,[x19, #0x12b0]
009cf65c	ldr x8,[x9, #0xc0]
009cf660	mov x0,x19
009cf664	mov x1,x22
009cf668	mov w3,wzr
009cf66c	ldr x8,[x8, #0x8]
009cf670	blr x8
009cf674	cbz w0,0x009cf68c
009cf678	add x1,x25,x24
009cf67c	add x0,sp,#0x10
009cf680	mov x2,x21
009cf684	bl 0x00c362f0
009cf688	cbz w0,0x009cf6b4
009cf68c	bl 0x00c342a0
009cf690	adrp x0,0x2cf000
009cf694	adrp x2,0x2af000
009cf698	add x0,x0,#0x7d6
009cf69c	add x2,x2,#0xb94
009cf6a0	mov w1,#0x62d
009cf6a4	bl 0x00c342b0
009cf6a8	mov w1,#0x14
009cf6ac	mov w2,#0x119
009cf6b0	b 0x009cf584
009cf6b4	mov x21,xzr
009cf6b8	bl 0x00c35250
009cf6bc	ldr x8,[x19, #0x8]
009cf6c0	mov w2,#0x1
009cf6c4	mov x4,sp
009cf6c8	mov x0,x19
009cf6cc	ldr x8,[x8, #0xc0]
009cf6d0	mov x1,x22
009cf6d4	mov w3,wzr
009cf6d8	mov x5,x21
009cf6dc	ldr x8,[x8]
009cf6e0	blr x8
009cf6e4	cbz w0,0x009cf79c
009cf6e8	bl 0x00c35ed0
009cf6ec	cbz x23,0x009cf75c
009cf6f0	ldrb w8,[x19, #0xa9]
009cf6f4	tbnz w8,#0x0,0x009cf75c
009cf6f8	ldr x8,[x19, #0x848]
009cf6fc	cbz x8,0x009cf75c
009cf700	ldr x0,[x19, #0x860]
009cf704	bl 0x00c34c00
009cf708	cbz x0,0x009cf75c
009cf70c	ldr x8,[x19, #0x8]
009cf710	add x2,sp,#0x10
009cf714	mov x0,x19
009cf718	mov x1,x22
009cf71c	ldr x8,[x8, #0xc0]
009cf720	mov w3,wzr
009cf724	ldr x8,[x8, #0x8]
009cf728	blr x8
009cf72c	cbz w0,0x009cf7b0
009cf730	ldr x1,[sp]
009cf734	cbz x1,0x009cf7b0
009cf738	add x0,sp,#0x10
009cf73c	mov x2,x21
009cf740	bl 0x00c362f0
009cf744	cbnz w0,0x009cf7b0
009cf748	ldr x8,[x19, #0x12b0]
009cf74c	mov w9,#0x4400
009cf750	add x9,x21,x9
009cf754	cmp x8,x9
009cf758	b.hi 0x009cf7b0
009cf75c	ldr x0,[x19, #0x870]
009cf760	cbz x0,0x009cf818
009cf764	ldr x4,[x19, #0x12b0]
009cf768	mov w8,#0x4401
009cf76c	cmp x4,x8
009cf770	b.cc 0x009cf7c8
009cf774	bl 0x00c342a0
009cf778	adrp x0,0x2cf000
009cf77c	adrp x2,0x2af000
009cf780	add x0,x0,#0x7d6
009cf784	add x2,x2,#0xb94
009cf788	mov w1,#0x670
009cf78c	bl 0x00c342b0
009cf790	mov w1,#0x16
009cf794	mov w2,#0x8c
009cf798	b 0x009cf8bc
009cf79c	bl 0x00c35240
009cf7a0	mov x0,x19
009cf7a4	bl 0x00c35ce0
009cf7a8	mov w20,wzr
009cf7ac	cbnz w0,0x009cf8cc
009cf7b0	mov w20,wzr
009cf7b4	str xzr,[x19, #0x12b0]
009cf7b8	str xzr,[x19, #0x1cb0]
009cf7bc	ldr w8,[sp, #0x8]
009cf7c0	cbnz w8,0x009cf8d4
009cf7c4	b 0x009cf8e8
009cf7c8	ldr x1,[x19, #0x12d8]
009cf7cc	cbnz x1,0x009cf7f8
009cf7d0	adrp x1,0x2cf000
009cf7d4	add x1,x1,#0x7d6
009cf7d8	mov w0,#0x4540
009cf7dc	mov w2,#0x325
009cf7e0	bl 0x00c32320
009cf7e4	str x0,[x19, #0x12d8]
009cf7e8	cbz x0,0x009cf898
009cf7ec	mov x1,x0
009cf7f0	ldr x0,[x19, #0x870]
009cf7f4	ldr x4,[x19, #0x12b0]
009cf7f8	ldr x3,[x19, #0x12c8]
009cf7fc	mov w2,#0x4000
009cf800	bl 0x00c36d30
009cf804	tbnz w0,#0x1f,0x009cf898
009cf808	ldr x8,[x19, #0x12d8]
009cf80c	sxtw x9,w0
009cf810	str x9,[x19, #0x12b0]
009cf814	str x8,[x19, #0x12c8]
009cf818	ldr x8,[x19, #0x918]
009cf81c	cbz x8,0x009cf83c
009cf820	ldrb w8,[x8, #0x368]
009cf824	sub w8,w8,#0x1
009cf828	cmp w8,#0x3
009cf82c	b.hi 0x009cf83c
009cf830	mov w9,#0x200
009cf834	lsl w8,w9,w8
009cf838	b 0x009cf840
009cf83c	mov w8,#0x4000
009cf840	ldr x9,[x19, #0x12b0]
009cf844	cmp x9,x8
009cf848	b.ls 0x009cf874
009cf84c	bl 0x00c342a0
009cf850	adrp x0,0x2cf000
009cf854	adrp x2,0x2af000
009cf858	add x0,x0,#0x7d6
009cf85c	add x2,x2,#0xb94
009cf860	mov w1,#0x67f
009cf864	bl 0x00c342b0
009cf868	mov w1,#0x16
009cf86c	mov w2,#0x92
009cf870	b 0x009cf8bc
009cf874	mov x0,x19
009cf878	mov x1,x20
009cf87c	str xzr,[x19, #0x12c0]
009cf880	str xzr,[x19, #0x1cb0]
009cf884	bl 0x00c36ad0
009cf888	mov w20,#0x1
009cf88c	ldr w8,[sp, #0x8]
009cf890	cbnz w8,0x009cf8d4
009cf894	b 0x009cf8e8
009cf898	bl 0x00c342a0
009cf89c	adrp x0,0x2cf000
009cf8a0	adrp x2,0x2af000
009cf8a4	add x0,x0,#0x7d6
009cf8a8	add x2,x2,#0xb94
009cf8ac	mov w1,#0x674
009cf8b0	bl 0x00c342b0
009cf8b4	orr w1,wzr,#0x1e
009cf8b8	mov w2,#0x6b
009cf8bc	mov x0,x19
009cf8c0	mov x3,xzr
009cf8c4	bl 0x00c34410
009cf8c8	mov w20,wzr
009cf8cc	ldr w8,[sp, #0x8]
009cf8d0	cbz w8,0x009cf8e8
009cf8d4	ldr x0,[sp]
009cf8d8	adrp x1,0x2cf000
009cf8dc	add x1,x1,#0x7d6
009cf8e0	mov w2,#0x696
009cf8e4	bl 0x00c32310
009cf8e8	mov w0,w20
009cf8ec	ldp x29,x30,[sp, #0x90]
009cf8f0	ldp x20,x19,[sp, #0x80]
009cf8f4	ldp x22,x21,[sp, #0x70]
009cf8f8	ldp x24,x23,[sp, #0x60]
009cf8fc	ldr x25,[sp, #0x50]
009cf900	add sp,sp,#0xa0
009cf904	ret
