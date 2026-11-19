; X509_REQ_set_subject_name @ 00b1563c
00b1563c	cbz x0,0x00b15654
00b15640	mov w9,#0x1
00b15644	add x8,x0,#0x20
00b15648	str w9,[x0, #0x10]
00b1564c	mov x0,x8
00b15650	b 0x00c3ef30
00b15654	ret
