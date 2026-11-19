; FUN_00aa27d0 @ 00aa27d0
00aa27d0	stp x20,x19,[sp, #-0x20]!
00aa27d4	stp x29,x30,[sp, #0x10]
00aa27d8	mov x19,x0
00aa27dc	ldr x0,[x0]
00aa27e0	adrp x20,0x2aa000
00aa27e4	add x20,x20,#0x4b5
00aa27e8	mov w2,#0xfb
00aa27ec	mov x1,x20
00aa27f0	add x29,sp,#0x10
00aa27f4	bl 0x00c32310
00aa27f8	ldr x0,[x19, #0x8]
00aa27fc	orr w2,wzr,#0xfc
00aa2800	mov x1,x20
00aa2804	bl 0x00c32310
00aa2808	ldp x29,x30,[sp, #0x10]
00aa280c	mov w2,#0xfd
00aa2810	mov x0,x19
00aa2814	mov x1,x20
00aa2818	ldp x20,x19,[sp], #0x20
00aa281c	b 0x00c32310
