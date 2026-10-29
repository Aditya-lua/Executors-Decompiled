/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b211c..0x9b2270 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b211c_0 {
    char padding_0[2481];
    char field_9b1;
} st_9b211c_0;


unsigned long long sub_9b211c(st_9b211c_0 *a0, unsigned long long a1, long long a2)
{
    unsigned long long v3;  // x22
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    char v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_c6876c(a2, 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 2791, "construct_ca_names");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    if (a1 && !(a0->field_9b1 >> 1 & 1) && (int)sub_ad69e4(a1) >= 1)
    {
        v3 = 0;
        do
        {
            v4 = sub_ad69f8(a1, v3);
            if (!v4 || !(v5 = sub_afa378(), !(v5 >> 31 & 1) && sub_a6e86c(a2, v5 & 0xffffffff, &v0, 2) && sub_afa378(v4, &v0) == (unsigned int)v5))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_lib.c", 2808, "construct_ca_names");
                sub_9a58a4(a0, 80, 0xc0103, 0);
                return 0;
            }
        } while ((v3 = (unsigned int)v3 + 1, (int)v3 < (int)sub_ad69e4(a1)));
    }
    if (!sub_a6e970(a2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 0xaff, "construct_ca_names");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        return 0;
    }
    return 1;
}
