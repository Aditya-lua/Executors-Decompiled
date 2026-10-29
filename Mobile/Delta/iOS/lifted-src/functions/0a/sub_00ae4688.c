/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae4688..0xae4804 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae4688_0 {
    char field_0;
    char field_1;
    unsigned long long field_2;
} st_ae4688_0;

typedef struct st_ae4688_1 {
    char padding_0[8];
    struct st_ae4688_0 *field_8;
    unsigned long long field_10;
} st_ae4688_1;

extern long long g_eb6280;

unsigned long long sub_ae4688(unsigned long a0, unsigned long a1, long long a2)
{
    unsigned long long v6;  // x19
    unsigned long long v7;  // x21
    st_ae4688_1 *v8;  // x23
    st_ae4688_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x60]
    st_ae4688_0 *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_9cde20(&g_eb6280);
    if (!v6)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_bcons.c", 64, "v2i_BASIC_CONSTRAINTS");
        sub_a36abc(0x22, 0x8000d, 0);
        return v6;
    }
    else if ((int)sub_ad69e4(a2) >= 1)
    {
        v7 = 0;
        while (1)
        {
            v8 = sub_ad69f8(a2, v7);
            v9 = v8->field_8;
            if (v9->field_0 != 67 || v9->field_1 != 65 || (&v9->field_1)[1])
            {
                if (_strcmp(v9, "pathlen"))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_bcons.c", 76, "v2i_BASIC_CONSTRAINTS");
                    sub_a36abc(0x22, 106, 0);
                    v2 = ", value=";
                    v3 = v8->field_10;
                    v0 = "name=";
                    v1 = v8->field_8;
                    sub_a364a0(4);
                    break;
                }
                else if (!sub_aef870(v8, v6 + 8))
                {
                    break;
                }
            }
            else
            {
                if (!sub_aef6fc(v8, v6))
                    break;
            }
            v7 = (unsigned int)v7 + 1;
            if ((int)v7 >= (int)sub_ad69e4(a2))
                return v6;
        }
        sub_9cd960(v6, &g_eb6280);
        return 0;
    }
    else
    {
        return v6;
    }
}
