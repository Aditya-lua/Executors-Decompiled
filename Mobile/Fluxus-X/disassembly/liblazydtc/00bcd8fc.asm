; std::__ndk1::random_device::entropy @ 00bcd8fc
00bcd8fc	paciasp
00bcd900	sub sp,sp,#0x20
00bcd904	stp x29,x30,[sp, #0x10]
00bcd908	add x29,sp,#0x10
00bcd90c	ldr w0,[x0]
00bcd910	mov w1,#0x5200
00bcd914	sub x2,x29,#0x4
00bcd918	movk w1,#0x8004, LSL #16
00bcd91c	bl 0x00c31e90
00bcd920	movi d0,#0x0
00bcd924	tbnz w0,#0x1f,0x00bcd940
00bcd928	ldur w8,[x29, #-0x4]
00bcd92c	tbnz w8,#0x1f,0x00bcd940
00bcd930	cmp w8,#0x20
00bcd934	mov w9,#0x20
00bcd938	csel w8,w8,w9,cc
00bcd93c	ucvtf d0,w8
00bcd940	ldp x29,x30,[sp, #0x10]
00bcd944	add sp,sp,#0x20
00bcd948	autiasp
00bcd94c	ret
