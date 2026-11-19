; std::__ndk1::time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::get @ 00bea640
00bea640	paciasp
00bea644	sub sp,sp,#0x80
00bea648	stp x29,x30,[sp, #0x20]
00bea64c	stp x28,x27,[sp, #0x30]
00bea650	stp x26,x25,[sp, #0x40]
00bea654	stp x24,x23,[sp, #0x50]
00bea658	stp x22,x21,[sp, #0x60]
00bea65c	stp x20,x19,[sp, #0x70]
00bea660	add x29,sp,#0x20
00bea664	mov x25,x0
00bea668	mov x8,sp
00bea66c	mov x0,x3
00bea670	mov x22,x7
00bea674	mov x26,x6
00bea678	mov x23,x5
00bea67c	mov x19,x4
00bea680	mov x24,x3
00bea684	mov x20,x2
00bea688	mov x21,x1
00bea68c	bl 0x00c30070
00bea690	adrp x28,0xcb5000
00bea694	ldr x28,[x28, #0xb98]
00bea698	ldr x27,[sp]
00bea69c	str x28,[sp, #0x8]
00bea6a0	ldar x8,[x28]
00bea6a4	cmn x8,#0x1
00bea6a8	b.eq 0x00bea6d4
00bea6ac	add x8,sp,#0x8
00bea6b0	sub x9,x29,#0x8
00bea6b4	stur x8,[x29, #-0x8]
00bea6b8	str x9,[sp, #0x10]
00bea6bc	adrp x0,0xcb5000
00bea6c0	nop
00bea6c4	adr x2,0xc0bab0
00bea6c8	ldr x0,[x0, #0xb98]
00bea6cc	add x1,sp,#0x10
00bea6d0	bl 0x00c305d0
00bea6d4	ldp x8,x10,[x27, #0x10]
00bea6d8	ldrsw x9,[x28, #0x8]
00bea6dc	sub x9,x9,#0x1
00bea6e0	sub x10,x10,x8
00bea6e4	cmp x9,x10, ASR #0x3
00bea6e8	b.cs 0x00beab10
00bea6ec	ldr x27,[x8, x9, LSL #0x3]
00bea6f0	cbz x27,0x00beab10
00bea6f4	mov x0,sp
00bea6f8	bl 0x00c30090
00bea6fc	cmp x26,x22
00bea700	str wzr,[x19]
00bea704	b.eq 0x00beaa54
00bea708	cbz x21,0x00bea720
00bea70c	ldp x8,x9,[x21, #0x18]
00bea710	cmp x8,x9
00bea714	b.eq 0x00bea730
00bea718	ldr w0,[x8]
00bea71c	b 0x00bea740
00bea720	mov w28,#0x1
00bea724	cbnz x20,0x00bea750
00bea728	tbz w28,#0x0,0x00bea788
00bea72c	b 0x00beaa4c
00bea730	ldr x8,[x21]
00bea734	mov x0,x21
00bea738	ldr x8,[x8, #0x48]
00bea73c	blr x8
00bea740	cmn w0,#0x1
00bea744	cset w28,eq
00bea748	csel x21,xzr,x21,eq
00bea74c	cbz x20,0x00bea728
00bea750	ldp x8,x9,[x20, #0x18]
00bea754	cmp x8,x9
00bea758	b.eq 0x00bea764
00bea75c	ldr w0,[x8]
00bea760	b 0x00bea774
00bea764	ldr x8,[x20]
00bea768	mov x0,x20
00bea76c	ldr x8,[x8, #0x48]
00bea770	blr x8
00bea774	cmn w0,#0x1
00bea778	cset w8,eq
00bea77c	csel x20,xzr,x20,eq
00bea780	eor w8,w28,w8
00bea784	tbz w8,#0x0,0x00beaa4c
00bea788	ldr x8,[x27]
00bea78c	ldr w1,[x26]
00bea790	mov x0,x27
00bea794	mov w2,wzr
00bea798	ldr x8,[x8, #0x68]
00bea79c	blr x8
00bea7a0	and w8,w0,#0xff
00bea7a4	cmp w8,#0x25
00bea7a8	b.ne 0x00bea81c
00bea7ac	add x8,x26,#0x4
00bea7b0	cmp x8,x22
00bea7b4	b.eq 0x00beaa4c
00bea7b8	ldr x9,[x27]
00bea7bc	ldr w1,[x8]
00bea7c0	mov x0,x27
00bea7c4	mov w2,wzr
00bea7c8	ldr x8,[x9, #0x68]
00bea7cc	blr x8
00bea7d0	and w8,w0,#0xff
00bea7d4	mov w28,w0
00bea7d8	cmp w8,#0x45
00bea7dc	b.eq 0x00bea7e8
00bea7e0	cmp w8,#0x30
00bea7e4	b.ne 0x00bea96c
00bea7e8	add x8,x26,#0x8
00bea7ec	cmp x8,x22
00bea7f0	b.eq 0x00beaa4c
00bea7f4	ldr x9,[x27]
00bea7f8	ldr w1,[x8]
00bea7fc	mov x0,x27
00bea800	mov w2,wzr
00bea804	ldr x8,[x9, #0x68]
00bea808	blr x8
00bea80c	mov w7,w28
00bea810	mov w28,w0
00bea814	mov w8,#0x8
00bea818	b 0x00bea974
00bea81c	ldr x8,[x27]
00bea820	ldr w2,[x26]
00bea824	mov x0,x27
00bea828	mov w1,#0x1
00bea82c	ldr x8,[x8, #0x18]
00bea830	blr x8
00bea834	tbz w0,#0x0,0x00bea958
00bea838	add x28,x26,#0x4
00bea83c	mov x26,x28
00bea840	cmp x28,x22
00bea844	b.eq 0x00bea87c
00bea848	ldr x8,[x27]
00bea84c	mov x28,x26
00bea850	mov x0,x27
00bea854	ldr w2,[x28], #0x4
00bea858	mov w1,#0x1
00bea85c	ldr x8,[x8, #0x18]
00bea860	blr x8
00bea864	tbnz w0,#0x0,0x00bea83c
00bea868	b 0x00bea87c
00bea86c	ldr x8,[x21]
00bea870	mov x0,x21
00bea874	ldr x8,[x8, #0x50]
00bea878	blr x8
00bea87c	cbz x21,0x00bea8f0
00bea880	ldp x8,x9,[x21, #0x18]
00bea884	cmp x8,x9
00bea888	b.eq 0x00bea894
00bea88c	ldr w0,[x8]
00bea890	b 0x00bea8a4
00bea894	ldr x8,[x21]
00bea898	mov x0,x21
00bea89c	ldr x8,[x8, #0x48]
00bea8a0	blr x8
00bea8a4	cmn w0,#0x1
00bea8a8	cset w28,eq
00bea8ac	csel x21,xzr,x21,eq
00bea8b0	cbz x20,0x00bea8f8
00bea8b4	ldp x8,x9,[x20, #0x18]
00bea8b8	cmp x8,x9
00bea8bc	b.eq 0x00bea8c8
00bea8c0	ldr w0,[x8]
00bea8c4	b 0x00bea8d8
00bea8c8	ldr x8,[x20]
00bea8cc	mov x0,x20
00bea8d0	ldr x8,[x8, #0x48]
00bea8d4	blr x8
00bea8d8	cmn w0,#0x1
00bea8dc	cset w8,eq
00bea8e0	csel x20,xzr,x20,eq
00bea8e4	cmp w28,w8
00bea8e8	b.ne 0x00bea8fc
00bea8ec	b 0x00beaa24
00bea8f0	mov w28,#0x1
00bea8f4	cbnz x20,0x00bea8b4
00bea8f8	tbnz w28,#0x0,0x00beaa24
00bea8fc	ldp x8,x9,[x21, #0x18]
00bea900	cmp x8,x9
00bea904	b.eq 0x00bea910
00bea908	ldr w2,[x8]
00bea90c	b 0x00bea924
00bea910	ldr x8,[x21]
00bea914	mov x0,x21
00bea918	ldr x8,[x8, #0x48]
00bea91c	blr x8
00bea920	mov w2,w0
00bea924	ldr x8,[x27]
00bea928	mov x0,x27
00bea92c	mov w1,#0x1
00bea930	ldr x8,[x8, #0x18]
00bea934	blr x8
00bea938	tbz w0,#0x0,0x00beaa24
00bea93c	ldp x8,x9,[x21, #0x18]
00bea940	cmp x8,x9
00bea944	b.eq 0x00bea86c
00bea948	add x8,x8,#0x4
00bea94c	str x8,[x21, #0x18]
00bea950	cbnz x21,0x00bea880
00bea954	b 0x00bea8f0
00bea958	ldp x8,x9,[x21, #0x18]
00bea95c	cmp x8,x9
00bea960	b.eq 0x00bea9b4
00bea964	ldr w1,[x8]
00bea968	b 0x00bea9c8
00bea96c	mov w7,wzr
00bea970	mov w8,#0x4
00bea974	ldr x9,[x25]
00bea978	mov x0,x25
00bea97c	mov x1,x21
00bea980	mov x2,x20
00bea984	mov x3,x24
00bea988	mov x4,x19
00bea98c	ldr x9,[x9, #0x48]
00bea990	mov x5,x23
00bea994	mov w6,w28
00bea998	add x26,x26,x8
00bea99c	blr x9
00bea9a0	mov x21,x0
00bea9a4	add x26,x26,#0x4
00bea9a8	cmp x26,x22
00bea9ac	b.ne 0x00beaa2c
00bea9b0	b 0x00beaa54
00bea9b4	ldr x8,[x21]
00bea9b8	mov x0,x21
00bea9bc	ldr x8,[x8, #0x48]
00bea9c0	blr x8
00bea9c4	mov w1,w0
00bea9c8	ldr x8,[x27]
00bea9cc	mov x0,x27
00bea9d0	ldr x8,[x8, #0x38]
00bea9d4	blr x8
00bea9d8	ldr x8,[x27]
00bea9dc	ldr w1,[x26]
00bea9e0	mov w28,w0
00bea9e4	mov x0,x27
00bea9e8	ldr x8,[x8, #0x38]
00bea9ec	blr x8
00bea9f0	cmp w28,w0
00bea9f4	b.ne 0x00beaa1c
00bea9f8	ldp x8,x9,[x21, #0x18]
00bea9fc	cmp x8,x9
00beaa00	b.eq 0x00beaa38
00beaa04	add x8,x8,#0x4
00beaa08	add x26,x26,#0x4
00beaa0c	str x8,[x21, #0x18]
00beaa10	cmp x26,x22
00beaa14	b.ne 0x00beaa2c
00beaa18	b 0x00beaa54
00beaa1c	mov w8,#0x4
00beaa20	str w8,[x19]
00beaa24	cmp x26,x22
00beaa28	b.eq 0x00beaa54
00beaa2c	ldr w8,[x19]
00beaa30	cbz w8,0x00bea708
00beaa34	b 0x00beaa54
00beaa38	ldr x8,[x21]
00beaa3c	mov x0,x21
00beaa40	ldr x8,[x8, #0x50]
00beaa44	blr x8
00beaa48	b 0x00bea9a4
00beaa4c	mov w8,#0x4
00beaa50	str w8,[x19]
00beaa54	cbz x21,0x00beaa6c
00beaa58	ldp x8,x9,[x21, #0x18]
00beaa5c	cmp x8,x9
00beaa60	b.eq 0x00beaa80
00beaa64	ldr w0,[x8]
00beaa68	b 0x00beaa90
00beaa6c	mov x0,xzr
00beaa70	mov w22,#0x1
00beaa74	cbnz x20,0x00beaaa0
00beaa78	tbnz w22,#0x0,0x00beaae0
00beaa7c	b 0x00beaaec
00beaa80	ldr x8,[x21]
00beaa84	mov x0,x21
00beaa88	ldr x8,[x8, #0x48]
00beaa8c	blr x8
00beaa90	cmn w0,#0x1
00beaa94	cset w22,eq
00beaa98	csel x0,xzr,x21,eq
00beaa9c	cbz x20,0x00beaa78
00beaaa0	ldp x8,x9,[x20, #0x18]
00beaaa4	cmp x8,x9
00beaaa8	b.eq 0x00beaab4
00beaaac	ldr w8,[x8]
00beaab0	b 0x00beaad0
00beaab4	ldr x8,[x20]
00beaab8	mov x21,x0
00beaabc	mov x0,x20
00beaac0	ldr x8,[x8, #0x48]
00beaac4	blr x8
00beaac8	mov w8,w0
00beaacc	mov x0,x21
00beaad0	cmn w8,#0x1
00beaad4	cset w8,eq
00beaad8	eor w8,w22,w8
00beaadc	tbnz w8,#0x0,0x00beaaec
00beaae0	ldr w8,[x19]
00beaae4	orr w8,w8,#0x2
00beaae8	str w8,[x19]
00beaaec	ldp x20,x19,[sp, #0x70]
00beaaf0	ldp x22,x21,[sp, #0x60]
00beaaf4	ldp x24,x23,[sp, #0x50]
00beaaf8	ldp x26,x25,[sp, #0x40]
00beaafc	ldp x28,x27,[sp, #0x30]
00beab00	ldp x29,x30,[sp, #0x20]
00beab04	add sp,sp,#0x80
00beab08	autiasp
00beab0c	ret
00beab10	bl 0x00bd8968
