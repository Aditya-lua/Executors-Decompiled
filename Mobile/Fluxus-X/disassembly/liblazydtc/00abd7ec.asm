; ASN1_d2i_bio @ 00abd7ec
00abd7ec	sub sp,sp,#0x40
00abd7f0	stp x21,xzr,[sp, #0x10]
00abd7f4	mov x0,x2
00abd7f8	mov x21,x1
00abd7fc	add x1,sp,#0x18
00abd800	stp x20,x19,[sp, #0x20]
00abd804	stp x29,x30,[sp, #0x30]
00abd808	add x29,sp,#0x30
00abd80c	mov x20,x3
00abd810	bl 0x00abd860
00abd814	ldr x19,[sp, #0x18]
00abd818	tbnz w0,#0x1f,0x00abd83c
00abd81c	ldr x8,[x19, #0x8]
00abd820	sxtw x2,w0
00abd824	add x1,sp,#0x8
00abd828	mov x0,x20
00abd82c	str x8,[sp, #0x8]
00abd830	blr x21
00abd834	mov x20,x0
00abd838	b 0x00abd840
00abd83c	mov x20,xzr
00abd840	mov x0,x19
00abd844	bl 0x00c35660
00abd848	mov x0,x20
00abd84c	ldp x29,x30,[sp, #0x30]
00abd850	ldp x20,x19,[sp, #0x20]
00abd854	ldr x21,[sp, #0x10]
00abd858	add sp,sp,#0x40
00abd85c	ret
