/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaebcf4..0xaebe8c (408 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aebcf4_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
} st_aebcf4_0;

extern long long g_ae75b0;

unsigned long long sub_aebcf4(long long a0, long long a1, long long a2)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x20
    unsigned long long v4;  // x24
    st_aebcf4_0 *v5;  // x28
    unsigned long long v6;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ad69e4(a2);
    v3 = sub_ad61e0(0, v2);
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_san.c", 388, "v2i_subject_alt");
        sub_a36abc(0x22, 0x8000f, 0);
        return v3;
    }
    else if ((int)v2 >= 1)
    {
        v4 = 0;
        while (1)
        {
            v5 = sub_ad69f8(a2, v4);
            if (!sub_aefce4(v5->field_8, "email") && v5->field_10 && !_strcmp(v5->field_10, "copy"))
            {
                if (!sub_aecd38(a1, v3, 0))
                    break;
            }
            else
            {
                if (sub_aefce4(v5->field_8, "email") || !v5->field_10 || _strcmp(v5->field_10, "move"))
                {
                    v6 = sub_aec7c8(0, a0, a1, v5, 0);
                    if (!v6)
                        break;
                    sub_ad68a0(v3, v6);
                }
                else if (!sub_aecd38(a1, v3, 1))
                {
                    break;
                }
            }
            v4 = (unsigned int)v4 + 1;
            if ((unsigned int)v2 == (unsigned int)v4)
                return v3;
        }
        sub_ad6958(v3, &g_ae75b0);
        return 0;
    }
    else
    {
        return v3;
    }
}
