; std::__ndk1::__time_put::__do_put @ 00bec6ec
00bec6ec	paciasp
00bec6f0	sub sp,sp,#0x30
00bec6f4	stp x29,x30,[sp, #0x10]
00bec6f8	stp x20,x19,[sp, #0x20]
00bec6fc	add x29,sp,#0x10
00bec700	mov x19,x2
00bec704	mov x20,x1
00bec708	mov w8,#0x25
00bec70c	tst w5,#0xff
00bec710	sturb w8,[x29, #-0x4]
00bec714	sturb w4,[x29, #-0x3]
00bec718	sturb w5,[x29, #-0x2]
00bec71c	sturb wzr,[x29, #-0x1]
00bec720	b.eq 0x00bec72c
00bec724	sturb w5,[x29, #-0x3]
00bec728	sturb w4,[x29, #-0x2]
00bec72c	ldr x8,[x19]
00bec730	ldr x4,[x0]
00bec734	sub x2,x29,#0x4
00bec738	mov x0,x20
00bec73c	sub x1,x8,x20
00bec740	bl 0x00c43b60
00bec744	add x8,x20,x0
00bec748	str x8,[x19]
00bec74c	ldp x20,x19,[sp, #0x20]
00bec750	ldp x29,x30,[sp, #0x10]
00bec754	add sp,sp,#0x30
00bec758	autiasp
00bec75c	ret
