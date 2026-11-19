; ASYNC_cleanup_thread @ 009f97f8
009f97f8	stp x29,x30,[sp, #-0x10]!
009f97fc	mov w0,#0x100
009f9800	mov x1,xzr
009f9804	mov x29,sp
009f9808	bl 0x00c35500
009f980c	cbz w0,0x009f981c
009f9810	mov x0,xzr
009f9814	ldp x29,x30,[sp], #0x10
009f9818	b 0x009f9704
009f981c	ldp x29,x30,[sp], #0x10
009f9820	ret
