; b2i_RSA_PVK_bio @ 00b35fdc
00b35fdc	sub sp,sp,#0x20
00b35fe0	stp x29,x30,[sp, #0x10]
00b35fe4	add x29,sp,#0x10
00b35fe8	sub x3,x29,#0x4
00b35fec	add x4,sp,#0x8
00b35ff0	mov x5,xzr
00b35ff4	mov x6,xzr
00b35ff8	stur wzr,[x29, #-0x4]
00b35ffc	str wzr,[sp, #0x8]
00b36000	bl 0x00b35a9c
00b36004	ldp x29,x30,[sp, #0x10]
00b36008	add sp,sp,#0x20
00b3600c	ret
