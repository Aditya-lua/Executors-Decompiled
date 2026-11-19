; b2i_RSA_PVK_bio_ex @ 00b35fa8
00b35fa8	sub sp,sp,#0x20
00b35fac	stp x29,x30,[sp, #0x10]
00b35fb0	add x29,sp,#0x10
00b35fb4	mov x6,x4
00b35fb8	mov x5,x3
00b35fbc	sub x3,x29,#0x4
00b35fc0	add x4,sp,#0x8
00b35fc4	stur wzr,[x29, #-0x4]
00b35fc8	str wzr,[sp, #0x8]
00b35fcc	bl 0x00b35a9c
00b35fd0	ldp x29,x30,[sp, #0x10]
00b35fd4	add sp,sp,#0x20
00b35fd8	ret
