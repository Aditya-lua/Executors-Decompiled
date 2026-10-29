/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x959480..0x9595b0 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_959480(long long a0, long long a1, long long a2)
{
    unsigned long v3;  // x19
    unsigned long v4;  // x0
    unsigned long v5;  // x22
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_9d3c1c(sub_9d82cc());
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_cert.c", 842, "add_file_cert_subjects_to_stack");
        sub_a36abc(20, 0x80020, 0);
    }
    else if (1 <= (int)sub_9d46fc(v3, 108, 3, a1))
    {
        while (1)
        {
            if (!sub_a9e448(v3, &v0, 0, 0))
            {
                sub_a35af4();
                sub_9d3c28(v3);
                sub_afc404(v0);
                return 1;
            }
            if (!sub_ab1c50(v0) || !(v4 = sub_afa39c(), v4))
                break;
            v5 = v4;
            if (sub_a66b6c(a2, v5))
            {
                sub_afa390(v5);
            }
            else if (sub_ad68a0(a0, v5))
            {
                sub_a66794(a2, v5);
            }
            else
            {
                sub_afa390(v5);
                break;
            }
        }
    }
    sub_9d3c28(v3);
    sub_afc404(v0);
    return 0;
}
