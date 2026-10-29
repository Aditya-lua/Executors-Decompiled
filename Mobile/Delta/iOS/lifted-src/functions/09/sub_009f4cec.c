/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4cec..0x9f4e20 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4cec_1 {
    char padding_0[56];
    struct st_9f4cec_0 *field_38;
    struct st_9f4cec_0 *field_40;
} st_9f4cec_1;

typedef struct st_9f4cec_0 {
    struct st_9f4cec_1 *field_0;
} st_9f4cec_0;

extern st_9f4cec_1 *g_9f4f54;

int sub_9f4cec(st_9f4cec_1 **a0, unsigned long a1, unsigned long a2, st_9f4cec_1 **a3)
{
    st_9f4cec_1 **v2;  // x0
    st_9f4cec_1 **v3;  // x23
    st_9f4cec_0 **v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a3)
    {
        v2 = sub_9f4c48();
        if (v2)
        {
            v3 = &g_9f4f54;
            if (a0)
            {
                v4 = *a0;
                if (v4[7])
                    v3 = v4[7];
            }
            v3();
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_lib.c", 340, "NCONF_get_number_e");
        sub_a36abc(14, 0xc0102, 0);
        v2 = 0;
    }
    return (unsigned int)v2;
}
