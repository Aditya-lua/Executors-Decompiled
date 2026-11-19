; b2i_PublicKey_bio @ 00b35828
00b35828	sub sp,sp,#0x20
00b3582c	stp x29,x30,[sp, #0x10]
00b35830	add x29,sp,#0x10
00b35834	mov w8,#0x1
00b35838	sub x1,x29,#0x4
00b3583c	stur w8,[x29, #-0x4]
00b35840	bl 0x00b3501c
00b35844	ldp x29,x30,[sp, #0x10]
00b35848	add sp,sp,#0x20
00b3584c	ret
