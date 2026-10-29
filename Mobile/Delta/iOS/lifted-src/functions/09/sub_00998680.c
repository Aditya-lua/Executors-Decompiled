/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998680..0x9987e4 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998680_0 {
    char padding_0[28];
    long long field_1c;
    unsigned int field_20;
} st_998680_0;


long long sub_998680(st_998680_0 *a0, long long a1)
{
    long long v2;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "options") && !sub_a707f4())
    {
        v2 = 1208;
    }
    else if (sub_a6fbc4(a1, "mode") && !sub_a6ffd0())
    {
        v2 = 1214;
    }
    else if (*(int *)&(a0->padding_0)[1])
    {
        if (!sub_a6fbc4(a1, "block_padding") || sub_a70ef8())
        {
            if (!sub_a6fbc4(a1, "hs_padding") || sub_a70ef8())
                goto LABEL_998754;
            v2 = 1235;
        }
        else
        {
            v2 = 1229;
        }
    }
    else
    {
        if (!sub_a6fbc4(a1, "read_buffer_len") || sub_a70ef8())
        {
LABEL_998754:
            if ((int)a0->field_1c != 3 || !sub_a6fbc4(a1, "read_ahead") || sub_a6fc2c())
                return 1;
            v2 = 1250;
        }
        else
        {
            v2 = 1222;
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tls_common.c", v2, "tls_set_options");
    sub_a36abc(20, 316, 0);
    return 0;
}
