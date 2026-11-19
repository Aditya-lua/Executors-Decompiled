; WPACKET_get_length @ 00a9d004
00a9d004	mov x8,x0
00a9d008	mov w0,wzr
00a9d00c	cbz x1,0x00a9d02c
00a9d010	ldr x9,[x8, #0x28]
00a9d014	cbz x9,0x00a9d02c
00a9d018	ldr x8,[x8, #0x18]
00a9d01c	ldr x9,[x9, #0x18]
00a9d020	mov w0,#0x1
00a9d024	sub x8,x8,x9
00a9d028	str x8,[x1]
00a9d02c	ret
