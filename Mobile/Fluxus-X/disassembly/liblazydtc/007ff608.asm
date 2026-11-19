; Java_com_lazyexec_exe_MainActivity_nativeInit @ 007ff608
007ff608	stp x29,x30,[sp, #-0x20]!
007ff60c	stp x20,x19,[sp, #0x10]
007ff610	mov x29,sp
007ff614	ldr x8,[x0]
007ff618	adrp x1,0xcca000
007ff61c	add x1,x1,#0xbb8
007ff620	mov x19,x0
007ff624	mov x20,x2
007ff628	ldr x8,[x8, #0x6d8]
007ff62c	blr x8
007ff630	ldr x8,[x19]
007ff634	mov x0,x19
007ff638	mov x1,x20
007ff63c	ldr x8,[x8, #0xa8]
007ff640	blr x8
007ff644	adrp x8,0xcca000
007ff648	str x0,[x8, #0xbc0]
007ff64c	ldp x20,x19,[sp, #0x10]
007ff650	ldp x29,x30,[sp], #0x20
007ff654	ret
