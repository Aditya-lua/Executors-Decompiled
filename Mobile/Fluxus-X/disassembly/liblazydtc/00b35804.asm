; b2i_PrivateKey_bio @ 00b35804
00b35804	sub sp,sp,#0x20
00b35808	stp x29,x30,[sp, #0x10]
00b3580c	add x29,sp,#0x10
00b35810	sub x1,x29,#0x4
00b35814	stur wzr,[x29, #-0x4]
00b35818	bl 0x00b3501c
00b3581c	ldp x29,x30,[sp, #0x10]
00b35820	add sp,sp,#0x20
00b35824	ret
