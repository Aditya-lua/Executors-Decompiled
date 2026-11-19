; FUN_00b5a910 @ 00b5a910
00b5a910	stp x24,x23,[sp, #-0x40]!
00b5a914	stp x22,x21,[sp, #0x10]
00b5a918	stp x20,x19,[sp, #0x20]
00b5a91c	stp x29,x30,[sp, #0x30]
00b5a920	add x29,sp,#0x30
00b5a924	mov x24,x5
00b5a928	mov x19,x4
00b5a92c	mov x20,x3
00b5a930	mov w21,w2
00b5a934	mov w22,w1
00b5a938	mov x23,x0
00b5a93c	bl 0x00c41000
00b5a940	cbz w0,0x00b5a97c
00b5a944	mov x0,x23
00b5a948	mov x1,x24
00b5a94c	bl 0x00b5a9e4
00b5a950	cbz w0,0x00b5a97c
00b5a954	mov w1,w22
00b5a958	mov w2,w21
00b5a95c	mov x3,x20
00b5a960	mov x4,x19
00b5a964	ldp x29,x30,[sp, #0x30]
00b5a968	ldp x20,x19,[sp, #0x20]
00b5a96c	ldp x22,x21,[sp, #0x10]
00b5a970	mov x0,x23
00b5a974	ldp x24,x23,[sp], #0x40
00b5a978	b 0x00c417d0
00b5a97c	ldp x29,x30,[sp, #0x30]
00b5a980	ldp x20,x19,[sp, #0x20]
00b5a984	ldp x22,x21,[sp, #0x10]
00b5a988	mov w0,wzr
00b5a98c	ldp x24,x23,[sp], #0x40
00b5a990	ret
