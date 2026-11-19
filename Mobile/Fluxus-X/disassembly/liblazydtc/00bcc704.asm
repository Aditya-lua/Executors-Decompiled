; std::__ndk1::future<void>::~future @ 00bcc704
00bcc704	paciasp
00bcc708	stp x29,x30,[sp, #-0x20]!
00bcc70c	str x19,[sp, #0x10]
00bcc710	mov x29,sp
00bcc714	ldr x19,[x0]
00bcc718	cbz x19,0x00bcc72c
00bcc71c	add x1,x19,#0x8
00bcc720	mov x0,#-0x1
00bcc724	bl 0x00c2bd10
00bcc728	cbz x0,0x00bcc73c
00bcc72c	ldr x19,[sp, #0x10]
00bcc730	ldp x29,x30,[sp], #0x20
00bcc734	autiasp
00bcc738	ret
00bcc73c	ldr x8,[x19]
00bcc740	ldr x16,[x8, #0x10]
00bcc744	mov x0,x19
00bcc748	ldr x19,[sp, #0x10]
00bcc74c	ldp x29,x30,[sp], #0x20
00bcc750	autiasp
00bcc754	br x16
