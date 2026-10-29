/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb554bc..0xb55578 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b554bc(long long *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(int)a0[2])
    {
        sub_9d3c28(a0[3]);
        a0[3] = 0;
        sub_b55578(a0);
        return 1;
    }
    else if ((int)a0[2] == 1)
    {
        if (a0[3])
            sub_a6d93c(a0 + 3);
        sub_a6c2e4(a0[1], "providers/implementations/storemgmt/file_store.c", 116);
        if ((int)a0[2] != 1)
        {
            sub_a2d974(a0[4]);
            sub_a6c2e4(a0[6], "providers/implementations/storemgmt/file_store.c", 0x77);
            sub_a6c2e4(a0[5], "providers/implementations/storemgmt/file_store.c", 120);
        }
        sub_a6c2e4(a0, "providers/implementations/storemgmt/file_store.c", 122);
        return 1;
    }
    else
    {
        return 1;
    }
}
