; ZSTD_copyDDictParameters @ 00bb391c
00bb391c	ldp x10,x11,[x1, #0x8]
00bb3920	add x8,x1,#0x6, LSL #12
00bb3924	mov w9,#0x683c
00bb3928	ldr w12,[x8, #0xab4]
00bb392c	ldr w13,[x8, #0xab8]
00bb3930	add x9,x0,x9
00bb3934	str x10,[x0, #0x74c8]
00bb3938	str x10,[x0, #0x74d0]
00bb393c	add x10,x10,x11
00bb3940	str w12,[x9, #0xdbc]
00bb3944	str x10,[x0, #0x74d8]
00bb3948	str x10,[x0, #0x74c0]
00bb394c	cbz w13,0x00bb3998
00bb3950	movi v0.2S,#0x1
00bb3954	mov w12,#0x1828
00bb3958	add x11,x1,#0x18
00bb395c	str d0,[x0, #0x7530]
00bb3960	ldr w10,[x8, #0x834]
00bb3964	str w10,[x9]
00bb3968	add x10,x1,x12
00bb396c	ldr w12,[x8, #0x838]
00bb3970	stp x11,x10,[x0]
00bb3974	mov w10,#0x1020
00bb3978	mov w11,#0x2830
00bb397c	add x10,x1,x10
00bb3980	str w12,[x9, #0x4]
00bb3984	add x11,x1,x11
00bb3988	ldr w8,[x8, #0x83c]
00bb398c	stp x10,x11,[x0, #0x10]
00bb3990	str w8,[x9, #0x8]
00bb3994	ret
00bb3998	movi v0.2D,#0x0
00bb399c	str d0,[x0, #0x7530]
00bb39a0	ret
