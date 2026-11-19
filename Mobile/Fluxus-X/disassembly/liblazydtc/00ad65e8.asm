; FUN_00ad65e8 @ 00ad65e8
00ad65e8	stp x20,x19,[sp, #-0x20]!
00ad65ec	stp x29,x30,[sp, #0x10]
00ad65f0	ldr x19,[x0, #0x98]
00ad65f4	add x29,sp,#0x10
00ad65f8	cbz x19,0x00ad6644
00ad65fc	ldr x0,[x19, #0x8]
00ad6600	bl 0x00c36290
00ad6604	ldr x0,[x19, #0x38]
00ad6608	adrp x20,0x2ae000
00ad660c	add x20,x20,#0x623
00ad6610	orr w2,wzr,#0x7f
00ad6614	mov x1,x20
00ad6618	bl 0x00c32310
00ad661c	ldr x0,[x19, #0x40]
00ad6620	mov w2,#0x80
00ad6624	mov x1,x20
00ad6628	bl 0x00c32310
00ad662c	ldp x29,x30,[sp, #0x10]
00ad6630	mov w2,#0x81
00ad6634	mov x0,x19
00ad6638	mov x1,x20
00ad663c	ldp x20,x19,[sp], #0x20
00ad6640	b 0x00c32310
00ad6644	ldp x29,x30,[sp, #0x10]
00ad6648	ldp x20,x19,[sp], #0x20
00ad664c	ret
