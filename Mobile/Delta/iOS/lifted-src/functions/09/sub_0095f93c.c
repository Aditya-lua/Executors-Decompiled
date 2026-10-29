/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95f93c..0x95fa14 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95f93c(unsigned int *a0, unsigned long a1)
{
    unsigned long v2;  // x8
    long long v3;  // x1
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if ((unsigned int)v2 == 129)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 1716, "SSL_set_fd");
        v3 = 356;
    }
    else
    {
        if (!(v2 >> 7 & 1))
        {
            v4 = sub_9d3c1c(sub_9d8f78());
            if (v4)
            {
                sub_9d4d58();
                sub_95f514(a0, v4, v4);
                return 1;
            }
        }
        else
        {
            v4 = sub_9d3c1c(sub_9d6834());
            if (v4)
            {
                sub_9d4d58();
                sub_95f514(a0, v4, v4);
                return 1;
            }
        }
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 1723, "SSL_set_fd");
        v3 = 524295;
    }
    sub_a36abc(20, v3, 0);
    return 0;
}
