; EC_KEY_copy @ 00a2e7b8
00a2e7b8	stp x20,x19,[sp, #-0x20]!
00a2e7bc	stp x29,x30,[sp, #0x10]
00a2e7c0	add x29,sp,#0x10
00a2e7c4	cbz x0,0x00a2e950
00a2e7c8	mov x20,x1
00a2e7cc	cbz x1,0x00a2e950
00a2e7d0	ldr x9,[x20]
00a2e7d4	ldr x8,[x0]
00a2e7d8	mov x19,x0
00a2e7dc	cmp x9,x8
00a2e7e0	b.eq 0x00a2e820
00a2e7e4	ldr x8,[x8, #0x18]
00a2e7e8	cbz x8,0x00a2e7f4
00a2e7ec	mov x0,x19
00a2e7f0	blr x8
00a2e7f4	ldr x8,[x19, #0x18]
00a2e7f8	cbz x8,0x00a2e810
00a2e7fc	ldr x8,[x8]
00a2e800	ldr x8,[x8, #0x168]
00a2e804	cbz x8,0x00a2e810
00a2e808	mov x0,x19
00a2e80c	blr x8
00a2e810	ldr x0,[x19, #0x8]
00a2e814	bl 0x00c32360
00a2e818	cbz w0,0x00a2e980
00a2e81c	str xzr,[x19, #0x8]
00a2e820	ldr x8,[x20, #0x58]
00a2e824	str x8,[x19, #0x58]
00a2e828	ldr x8,[x20, #0x18]
00a2e82c	cbz x8,0x00a2e8d0
00a2e830	ldr x0,[x19, #0x18]
00a2e834	bl 0x00c3a770
00a2e838	ldr x8,[x20, #0x18]
00a2e83c	ldp x0,x1,[x20, #0x58]
00a2e840	ldr x2,[x8]
00a2e844	bl 0x00c3ad00
00a2e848	str x0,[x19, #0x18]
00a2e84c	cbz x0,0x00a2e980
00a2e850	ldr x1,[x20, #0x18]
00a2e854	bl 0x00c3ac10
00a2e858	cbz w0,0x00a2e980
00a2e85c	ldr x8,[x20, #0x20]
00a2e860	cbz x8,0x00a2e888
00a2e864	ldr x0,[x19, #0x20]
00a2e868	bl 0x00c3ab60
00a2e86c	ldr x0,[x20, #0x18]
00a2e870	bl 0x00c3ab70
00a2e874	str x0,[x19, #0x20]
00a2e878	cbz x0,0x00a2e980
00a2e87c	ldr x1,[x20, #0x20]
00a2e880	bl 0x00c3acc0
00a2e884	cbz w0,0x00a2e980
00a2e888	ldr x1,[x20, #0x28]
00a2e88c	cbz x1,0x00a2e8d0
00a2e890	ldr x0,[x19, #0x28]
00a2e894	cbnz x0,0x00a2e8a8
00a2e898	bl 0x00c37710
00a2e89c	str x0,[x19, #0x28]
00a2e8a0	cbz x0,0x00a2e980
00a2e8a4	ldr x1,[x20, #0x28]
00a2e8a8	bl 0x00c36990
00a2e8ac	cbz x0,0x00a2e980
00a2e8b0	ldr x8,[x20, #0x18]
00a2e8b4	ldr x8,[x8]
00a2e8b8	ldr x8,[x8, #0x160]
00a2e8bc	cbz x8,0x00a2e8d0
00a2e8c0	mov x0,x19
00a2e8c4	mov x1,x20
00a2e8c8	blr x8
00a2e8cc	cbz w0,0x00a2e980
00a2e8d0	ldr x8,[x20, #0x30]
00a2e8d4	add x1,x19,#0x40
00a2e8d8	add x2,x20,#0x40
00a2e8dc	mov w0,#0x8
00a2e8e0	str x8,[x19, #0x30]
00a2e8e4	ldr w8,[x20, #0x10]
00a2e8e8	str w8,[x19, #0x10]
00a2e8ec	ldr w8,[x20, #0x3c]
00a2e8f0	str w8,[x19, #0x3c]
00a2e8f4	bl 0x00c356b0
00a2e8f8	cbz w0,0x00a2e980
00a2e8fc	ldr x8,[x20]
00a2e900	ldr x9,[x19]
00a2e904	cmp x8,x9
00a2e908	b.eq 0x00a2e928
00a2e90c	ldr x0,[x20, #0x8]
00a2e910	cbz x0,0x00a2e920
00a2e914	bl 0x00c323b0
00a2e918	cbz w0,0x00a2e980
00a2e91c	ldp x8,x0,[x20]
00a2e920	stp x8,x0,[x19]
00a2e924	ldr x8,[x20]
00a2e928	ldr x8,[x8, #0x20]
00a2e92c	cbz x8,0x00a2e940
00a2e930	mov x0,x19
00a2e934	mov x1,x20
00a2e938	blr x8
00a2e93c	cbz w0,0x00a2e980
00a2e940	ldr x8,[x19, #0x68]
00a2e944	add x8,x8,#0x1
00a2e948	str x8,[x19, #0x68]
00a2e94c	b 0x00a2e984
00a2e950	bl 0x00c342a0
00a2e954	adrp x0,0x2b4000
00a2e958	adrp x2,0x2bb000
00a2e95c	add x0,x0,#0x15e
00a2e960	add x2,x2,#0xb43
00a2e964	mov w1,#0x6c
00a2e968	bl 0x00c342b0
00a2e96c	mov w1,#0x102
00a2e970	mov w0,#0x10
00a2e974	movk w1,#0xc, LSL #16
00a2e978	mov x2,xzr
00a2e97c	bl 0x00c342c0
00a2e980	mov x19,xzr
00a2e984	ldp x29,x30,[sp, #0x10]
00a2e988	mov x0,x19
00a2e98c	ldp x20,x19,[sp], #0x20
00a2e990	ret
